package br.com.adrianobarbosa.clines.api.airports;

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
@RequestMapping("airports")
@AllArgsConstructor
public class AirportController {

    private final AirportService service;

    @GetMapping
    List<AirportView> list() {
        return service.listAllAirports();
    }

    @GetMapping("{code}")
    AirportView show(@PathVariable String code) {
        return service.showAirportBy(StringNormalizer.normalize(code));
    }

    @PostMapping
    ResponseEntity<?> register(@RequestBody @Valid AirportForm form) {
        var code = service.createNewAirportBy(form);
        var uri = URI.create("/airports/").resolve(code);

        return created(uri).build();
    }
}
