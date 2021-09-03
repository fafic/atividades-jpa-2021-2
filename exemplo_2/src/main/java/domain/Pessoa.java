package domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@ToString
@Inheritance(strategy = InheritanceType.JOINED )
@DiscriminatorColumn(name = "tipo")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa_sequence")
    @SequenceGenerator(sequenceName = "pessoa_sequence", initialValue = 1, allocationSize = 1, name = "pessoa_sequence")
    private Long id;
    @Column(name = "nome_razao_social")
    private String nomeRazaoSocial;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    @OneToOne(cascade = CascadeType.ALL)
    private Contato contato;

   // @Transient
   //private String teste;




}
