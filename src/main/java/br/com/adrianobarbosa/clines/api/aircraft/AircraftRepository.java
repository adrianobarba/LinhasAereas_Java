package br.com.adrianobarbosa.clines.api.aircraft;

import br.com.adrianobarbosa.clines.api.flights.ExistingAircraftService;
import br.com.adrianobarbosa.clines.shared.domain.Aircraft;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface AircraftRepository extends Repository<Aircraft, String>, ExistingAircraftService {
    Optional<Aircraft> findByCode(String code);

    List<Aircraft> findAll();

    void save(Aircraft aircraft);
}
