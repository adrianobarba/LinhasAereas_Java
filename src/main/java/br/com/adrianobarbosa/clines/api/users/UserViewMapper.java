package br.com.adrianobarbosa.clines.api.users;

import br.com.adrianobarbosa.clines.shared.domain.User;
import br.com.adrianobarbosa.clines.shared.infra.Mapper;
import org.springframework.stereotype.Component;

@Component
public class UserViewMapper implements Mapper<User, UserView>{
    @Override
    public UserView map(User source){
        return new UserView(source.getName(), source.getEmail());
    }
}
