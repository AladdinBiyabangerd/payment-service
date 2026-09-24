package az.aladdin.paymentservice2.service;

import az.aladdin.paymentservice2.dao.entity.PaymentEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class PaymentService {


//    private final PaymentRepository paymentRepository;


    public String pay(String userName, BigDecimal amount) {
        var paymentEntity = PaymentEntity.builder()
                .name(userName)
                .amount(amount)
                .build();

//        var paymentEntity = PaymentEntity.builder()
//                .name(userName)
//                .amount(amount)
//                .build();

      //  PaymentEntity save = paymentRepository.save(paymentEntity);

        return "Username: " + userName + " amount " + amount;
    }
}
