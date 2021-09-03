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
        @NamedQuery(name = "veiculosFindAll", query = "select v from Veiculo v"),
        @NamedQuery(name = "accessoriosByVeiculo", query = "select v.acessorios from Veiculo v where v.modelo =:modelo")
})
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private String anoFabricacao;

    @ManyToMany
    @JoinTable(name = "veiculo_acesorio",
            joinColumns = {@JoinColumn(name = "veiculo_id")},
            inverseJoinColumns = {@JoinColumn(name = "acessorio_id")}
    )
    private List<Acessorio> acessorios;

}
