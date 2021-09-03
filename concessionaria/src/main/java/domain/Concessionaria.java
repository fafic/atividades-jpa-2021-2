package domain;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@NamedQueries({
        @NamedQuery(name = "findByName", query = "select c from Concessionaria c where c.nome =:nome")
})
public class Concessionaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String telefone;

    @OneToMany
    private List<Veiculo> veiculos;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
}
