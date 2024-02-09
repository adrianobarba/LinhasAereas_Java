package br.com.adrianobarbosa.clines.api.airports;

import br.com.adrianobarbosa.clines.shared.infra.Mapper;
import br.com.adrianobarbosa.clines.shared.util.StringNormalizer;
import br.com.adrianobarbosa.clines.shared.domain.Airport;
import org.springframework.stereotype.Component;


@Component
public class AirportFormMapper implements Mapper<AirportForm, Airport> {
    @Override
    public Airport map(AirportForm source) {
        var code = StringNormalizer.normalize(source.getCode());
        return new Airport(code, source.getLocation());
    }
}
