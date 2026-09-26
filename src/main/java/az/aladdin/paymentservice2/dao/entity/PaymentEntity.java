package az.aladdin.paymentservice2.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@EqualsAndHashCode(of = {"id", "email"})
@Getter
@Setter
@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentEntity {

    @Id
    private Long id;

    @Column(unique = true)
    private String email;

    private BigDecimal amount;

    private String name;
}