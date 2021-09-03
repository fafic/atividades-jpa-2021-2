package br.edu.fafic.domain;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@NamedQueries({
        @NamedQuery(name="pessoaByCpf", query = "select p from Pessoa p where p.cpf =:cpf"),
        @NamedQuery(name="findAll", query = "select p from Pessoa p")
})
@Table(name = "tbl_pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "pessoa_sequence", sequenceName = "pessoa_sequence", initialValue = 1)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(unique = true)
    private String cpf;
    private String email;



}
