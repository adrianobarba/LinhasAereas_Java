package br.com.adrianobarbosa.clines.api.aircraftmodels;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AircraftModelView {
    private Long id;
    private String description;
}
