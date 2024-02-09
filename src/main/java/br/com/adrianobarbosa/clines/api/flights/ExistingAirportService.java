package br.com.adrianobarbosa.clines.api.flights;


import br.com.adrianobarbosa.clines.shared.domain.Airport;

import java.util.Optional;

public interface ExistingAirportService {
    Optional<Airport> findByCode(String code);

    Optional<Airport> findById(Long id);
}
