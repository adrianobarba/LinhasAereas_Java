package br.com.adrianobarbosa.clines.api.promotionalcodes;

import br.com.adrianobarbosa.clines.shared.domain.PromotionalCode;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface PromotionalCodeRepository extends Repository<PromotionalCode, Long> {
    PromotionalCode save(PromotionalCode promotionalCode);

    Optional<PromotionalCode> findByCode(String code);
}
