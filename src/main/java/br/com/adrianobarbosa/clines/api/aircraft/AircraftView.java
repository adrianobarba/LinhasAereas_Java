package br.com.adrianobarbosa.clines.api.aircraft;

import br.com.adrianobarbosa.clines.shared.domain.AircraftModel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AircraftView {
    private String code;
    private AircraftModel model;
}
