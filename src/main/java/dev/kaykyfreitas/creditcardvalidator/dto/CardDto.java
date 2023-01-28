package dev.kaykyfreitas.creditcardvalidator.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CardDto {

    private String cardNumber;

    private String cardBrand;

    private Integer cardBrandCode;

}
