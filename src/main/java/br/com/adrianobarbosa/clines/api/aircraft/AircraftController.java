package br.com.adrianobarbosa.clines.api.aircraft;

import br.com.adrianobarbosa.clines.shared.util.StringNormalizer;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

import static org.springframework.http.ResponseEntity.created;

@RestController
@RequestMapping("aircraft")
@AllArgsConstructor
public class AircraftController {

    private final AircraftService service;

    @GetMapping("{code}")
    AircraftView show(@PathVariable String code) {
        return service.showAircraftBy(StringNormalizer.normalize(code));
    }

    @GetMapping
    List<AircraftView> list() {
        return service.listAllAircraft();
    }

    @PostMapping
    ResponseEntity<?> createBy(@RequestBody @Valid AircraftForm form) {
        var code = service.createAircraftBy(form);

        var uri = URI.create("/aircraft/").resolve(code);

        return created(uri).build();
    }
}
