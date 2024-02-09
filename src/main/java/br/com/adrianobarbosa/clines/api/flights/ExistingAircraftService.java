package br.com.adrianobarbosa.clines.api.flights;


import br.com.adrianobarbosa.clines.shared.domain.Aircraft;

import java.util.Optional;

public interface ExistingAircraftService {
    Optional<Aircraft> findByCode(String code);
}
