package br.com.adrianobarbosa.clines.api.users;

import br.com.adrianobarbosa.clines.shared.exceptions.ResourceAlreadyExistsException;
import br.com.adrianobarbosa.clines.shared.exceptions.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import static java.util.stream.Collectors.toList;

import java.util.List;


@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final UserViewMapper viewMapper;
    private final UserFormMapper formMapper;

    public List<UserView> findAll() {
        return repository.findAll().stream().map(viewMapper::map).collect(toList());
    }

    public UserView showUserBy(Long id) {
        return repository.findById(id).map(viewMapper::map)
                .orElseThrow(() -> new ResourceNotFoundException("Cannot find user"));
    }

    public Long createUserBy(UserForm form) {
        repository.findByEmail(form.getEmail()).ifPresent(user -> {
            throw new ResourceAlreadyExistsException("User already exists");
        });

        var user = formMapper.map(form);

        repository.save(user);

        return user.getId();
    }

}
