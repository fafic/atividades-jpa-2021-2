package domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@DiscriminatorValue("PF")
public class PessoaFisica extends Pessoa{

    private String cpf;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

}
