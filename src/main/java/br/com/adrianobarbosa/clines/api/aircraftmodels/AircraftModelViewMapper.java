package br.com.adrianobarbosa.clines.api.aircraftmodels;

import br.com.adrianobarbosa.clines.shared.infra.Mapper;
import br.com.adrianobarbosa.clines.shared.domain.AircraftModel;
import org.springframework.stereotype.Component;

@Component
public class AircraftModelViewMapper implements Mapper<AircraftModel, AircraftModelView> {

    @Override
    public AircraftModelView map(AircraftModel source) {
        var id = source.getId();
        var description = source.getDescription();
        return new AircraftModelView(id, description);
    }
}
