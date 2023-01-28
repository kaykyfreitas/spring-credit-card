package dev.kaykyfreitas.creditcardvalidator;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Getter
@AllArgsConstructor
public enum Card {

    VISA ("Visa", 1, List.of("4539", "4556", "4916", "4532", "4929", "4024", "4485", "4716")),
    MASTER ("Master", 2, List.of("51", "52", "53", "54", "55")),
    AMEX ("Amex", 3, List.of("34", "37")),
    ELO ("Elo", 4, List.of("5067", "4389", "5091", "5090", "5098", "6362")),
    DINERS ("Diners", 5, List.of("300", "301", "302", "303", "36", "38")),
    JCB ("Jcb", 6, List.of("35")),
    DISCOVER ("Discover", 7, List.of("6011")),
    AURA ("Aura", 8, List.of("5078")),
    HIPER ("Hipercard", 9, List.of("6376", "3841", "6370", "6375"));

    private String brand;
    private Integer brandCode;
    private List<String> prefixList;

    public static Card getCardBrand(String cardNumber) {
        List<Card> brandsList = Arrays.stream(Card.values()).map(cardParam -> {
            for(String prefix : cardParam.getPrefixList())
                if (cardNumber.startsWith(prefix)) return cardParam;
            return null;
        }).toList();
        for(Card brand : brandsList)
            if (Objects.nonNull(brand)) return brand;
        return null;
    }

}
