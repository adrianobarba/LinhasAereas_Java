package br.com.adrianobarbosa.clines.api.aircraftmodels;

import br.com.adrianobarbosa.clines.api.aircraft.ExistingAircraftModelService;
import br.com.adrianobarbosa.clines.shared.domain.AircraftModel;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface AircraftModelRepository extends Repository<AircraftModel, Long>, ExistingAircraftModelService {
    void save(AircraftModel aircraftModel);
    List<AircraftModel> findAll();
    Optional<AircraftModel> findByDescription(String description);
    Optional<AircraftModel> findById(Long id);
}
