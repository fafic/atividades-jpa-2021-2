package domain;

import enums.Operadora;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "telefone_sequence")
    @SequenceGenerator(sequenceName = "telefone_sequence", initialValue = 1, allocationSize = 1, name = "telefone_sequence")
    private Long id;
    private String numero;
    @Enumerated(EnumType.STRING)
    private Operadora operadora;
}
