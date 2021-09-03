package domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contato_sequence")
    @SequenceGenerator(sequenceName = "contato_sequence", initialValue = 1, allocationSize = 1, name = "contato_sequence")
    private Long id;
    private String email;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "contato_telefone",
        joinColumns = {@JoinColumn(name = "contato_id")},
        inverseJoinColumns = {@JoinColumn(name = "telefone_id")}
    )
    private List<Telefone> telefones;

   // @ManyToOne
   //private Pessoa pessoa;
}
