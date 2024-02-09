package br.com.adrianobarbosa.clines.api.locations;

import br.com.adrianobarbosa.clines.shared.infra.Mapper;
import br.com.adrianobarbosa.clines.shared.domain.Location;
import org.springframework.stereotype.Component;

@Component
public class LocationViewMapper implements Mapper<Location, LocationView> {
    @Override
    public LocationView map(Location source) {
        var country = source.getCountry();
        return new LocationView(source.getId(), country.getDescription(), source.getState(), source.getCity());
    }
}
