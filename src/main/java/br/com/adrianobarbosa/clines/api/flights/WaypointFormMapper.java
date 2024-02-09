package br.com.adrianobarbosa.clines.api.flights;

import br.com.adrianobarbosa.clines.shared.infra.Mapper;
import br.com.adrianobarbosa.clines.shared.domain.Waypoint;
import org.springframework.stereotype.Component;

@Component
public class WaypointFormMapper implements Mapper<WaypointForm, Waypoint> {
    @Override
    public Waypoint map(WaypointForm source) {
        return new Waypoint(source.getAirport(), source.getTime(), source.getGate());
    }
}
