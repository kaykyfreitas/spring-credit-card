package dev.kaykyfreitas.creditcardvalidator.controller;

import dev.kaykyfreitas.creditcardvalidator.dto.CardDto;
import dev.kaykyfreitas.creditcardvalidator.service.CreditCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/credit-card")
public class CreditCard {

    private final CreditCardService creditCardService;
    @GetMapping("hello")
    public ResponseEntity<String> hello(Principal principal) {
        var message = "Hello, " + principal.getName() + "!";
        return ResponseEntity.ok(message);
    }

    @PostMapping("/getBrand/{cardNumber}")
    public ResponseEntity<CardDto> getBrand(@PathVariable String cardNumber) {
        return ResponseEntity.ok(creditCardService.getCardBrand(cardNumber));
    }

}
