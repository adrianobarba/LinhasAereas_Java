package br.com.adrianobarbosa.clines.api.flights;

import br.com.adrianobarbosa.clines.api.aircraft.AircraftView;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class FlightView {
    private Long id;
    private BigDecimal price;
    private WaypointView departure;
    private WaypointView arrival;
    private AircraftView aircraft;
}
