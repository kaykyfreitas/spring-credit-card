package dev.kaykyfreitas.creditcardvalidator.service;

import dev.kaykyfreitas.creditcardvalidator.Card;
import dev.kaykyfreitas.creditcardvalidator.dto.CardDto;
import dev.kaykyfreitas.creditcardvalidator.exception.AppException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CreditCardService {

    public CardDto getCardBrand(String cardNumber) {

        if(Objects.isNull(cardNumber))
            throw new AppException("The cardNumber can't be null");

        Card card = Card.getCardBrand(cardNumber);

        if(Objects.isNull(card))
            throw new AppException("Card brand not found");

        if(Objects.isNull(card.getBrand()))
            throw new AppException("The card brand can't be null");

        if(Objects.isNull(card.getBrandCode()))
            throw new AppException("The card brand code can't be null");

        CardDto cardDto = new CardDto();

        cardDto.setCardNumber(cardNumber);
        cardDto.setCardBrand(card.getBrand());
        cardDto.setCardBrandCode(card.getBrandCode());

        return cardDto;
    }

}
