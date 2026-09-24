package az.aladdin.paymentservice2.controller;

import az.aladdin.paymentservice2.model.PaymentRequest;
import az.aladdin.paymentservice2.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@RequestMapping("api/v1/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;


    // api/v1/payments?userName=Ali
    @PostMapping()
    public String pay(@RequestHeader("Accept-Language")String lang, @RequestParam String userName, @RequestParam BigDecimal amount) {
        return paymentService.pay(userName, amount);
    }
}
