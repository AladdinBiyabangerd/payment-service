package az.aladdin.paymentservice2.dao.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

import static jakarta.persistence.GenerationType.IDENTITY;

@EqualsAndHashCode(of = {"id","email"})
@Getter
@Setter
@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentEntity {

    private Long id;

    @İd
    @Column(constraint=unique)
    private String email;  // test1@gmail.com

    private BigDecimal amount;

    @Column(name = "user_name")
    private String name;


}
