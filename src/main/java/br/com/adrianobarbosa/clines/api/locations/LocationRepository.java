package br.com.adrianobarbosa.clines.api.locations;

import br.com.adrianobarbosa.clines.api.airports.ExistingLocationService;
import br.com.adrianobarbosa.clines.shared.domain.Location;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface LocationRepository extends Repository<Location, Long>, ExistingLocationService {
    void save(Location location);
    List<Location> findAll();
}
