package br.com.adrianobarbosa.clines.api.aircraft;

import br.com.adrianobarbosa.clines.shared.infra.Mapper;
import br.com.adrianobarbosa.clines.shared.domain.Aircraft;
import org.springframework.stereotype.Component;

@Component
public class AircraftViewMapper implements Mapper<Aircraft, AircraftView> {

    @Override
    public AircraftView map(Aircraft source) {
        var model = source.getModel();
        return new AircraftView(source.getCode(), model);
    }
}
