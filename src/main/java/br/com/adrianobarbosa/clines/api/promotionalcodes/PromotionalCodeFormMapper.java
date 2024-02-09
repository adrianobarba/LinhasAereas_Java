package br.com.adrianobarbosa.clines.api.promotionalcodes;

import br.com.adrianobarbosa.clines.shared.domain.PromotionalCode;
import br.com.adrianobarbosa.clines.shared.infra.Mapper;
import org.springframework.stereotype.Component;

@Component
public class PromotionalCodeFormMapper implements Mapper<PromotionalCodeForm, PromotionalCode> {

    @Override
    public PromotionalCode map(PromotionalCodeForm form) {
        return new PromotionalCode(
                form.getCode(),
                form.getStartDate(),
                form.getExpirationDate(),
                form.getDescription(),
                form.getDiscount()
        );
    }
}
