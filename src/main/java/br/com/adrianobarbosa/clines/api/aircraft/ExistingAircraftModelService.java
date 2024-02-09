package br.com.adrianobarbosa.clines.api.aircraft;


import br.com.adrianobarbosa.clines.shared.domain.AircraftModel;

import java.util.Optional;

public interface ExistingAircraftModelService {
    Optional<AircraftModel> findById(Long id);
}
