package br.com.adrianobarbosa.clines.api.locations;

import br.com.adrianobarbosa.clines.shared.domain.Country;
import br.com.adrianobarbosa.clines.shared.infra.Mapper;
import br.com.adrianobarbosa.clines.shared.domain.Location;
import org.springframework.stereotype.Component;

@Component
public class LocationFormMapper implements Mapper<LocationForm, Location> {

    @Override
    public Location map(LocationForm source) {
        var country = Country.findByDescription(source.getCountry());
        var state = source.getState();
        var city = source.getCity();

        return new Location(country, state, city);
    }
}
