package az.aladdin.paymentservice2.controller;

import az.aladdin.paymentservice2.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@RequestMapping("api/v1/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping()
    public String pay(@RequestParam String userName, @RequestParam BigDecimal amount) {
        return paymentService.pay(userName, amount);
    }
}
