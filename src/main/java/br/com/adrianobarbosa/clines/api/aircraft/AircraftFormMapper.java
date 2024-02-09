package br.com.adrianobarbosa.clines.api.aircraft;

import br.com.adrianobarbosa.clines.shared.domain.Aircraft;
import br.com.adrianobarbosa.clines.shared.infra.Mapper;
import br.com.adrianobarbosa.clines.shared.util.StringNormalizer;
import org.springframework.stereotype.Component;


@Component
public class AircraftFormMapper implements Mapper<AircraftForm, Aircraft> {

    @Override
    public Aircraft map(AircraftForm source) {
        return new Aircraft(StringNormalizer.normalize(source.getCode()), source.getModel());
    }
}
