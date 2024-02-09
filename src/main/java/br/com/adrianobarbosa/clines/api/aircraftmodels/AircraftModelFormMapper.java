package br.com.adrianobarbosa.clines.api.aircraftmodels;

import br.com.adrianobarbosa.clines.shared.infra.Mapper;
import br.com.adrianobarbosa.clines.shared.domain.AircraftModel;
import org.springframework.stereotype.Component;

@Component
public class AircraftModelFormMapper implements Mapper<AircraftModelForm, AircraftModel> {

    @Override
    public AircraftModel map(AircraftModelForm source) { return new AircraftModel(source.getDescription()); }
}
