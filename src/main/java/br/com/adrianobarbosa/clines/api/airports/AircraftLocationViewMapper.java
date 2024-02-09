package br.com.adrianobarbosa.clines.api.airports;

import br.com.adrianobarbosa.clines.shared.infra.Mapper;
import br.com.adrianobarbosa.clines.shared.domain.Location;
import org.springframework.stereotype.Component;

@Component
public class AircraftLocationViewMapper implements Mapper<Location, AircraftLocationView> {
    @Override
    public AircraftLocationView map(Location source) {
        var country = source.getCountry();
        return new AircraftLocationView(country.getDescription(), source.getState(), source.getCity());
    }
}
