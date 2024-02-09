package br.com.adrianobarbosa.clines.api.flights;

import br.com.adrianobarbosa.clines.shared.infra.Mapper;
import br.com.adrianobarbosa.clines.shared.domain.Waypoint;
import org.springframework.stereotype.Component;

@Component
public class WaypointViewMapper implements Mapper<Waypoint, WaypointView> {
    @Override
    public WaypointView map(Waypoint source) {
        return new WaypointView(source.getTime(), source.getAirport().getCode(), source.getGate());
    }
}
