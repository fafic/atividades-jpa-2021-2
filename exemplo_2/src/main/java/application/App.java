package application;

import dao.PessoaDAO;
import domain.*;
import enums.Operadora;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;


public class App {

    public static void main(String[] args) {

        PessoaDAO pessoaDAO = new PessoaDAO();

        PessoaFisica pf = new PessoaFisica();
        pf.setNomeRazaoSocial("Jose");
        pf.setCpf("1234");
        pf.setDataNascimento(LocalDate.of(1995, Month.SEPTEMBER, 15));
        pf.setEndereco(Endereco.builder()
                        .bairro("Centro")
                        .numero("50")
                        .cidade("Cajazeiras")
                        .rua("Major José Marques")
                        .build());

        pf.setContato(Contato.builder().telefones(Arrays.asList(
                                Telefone.builder().numero("999-888")
                                        .operadora(Operadora.CLARO).build(),
                                Telefone.builder().numero("888-555")
                                        .operadora(Operadora.OI).build())).email("jose@gmail").build()


                );

        pessoaDAO.saveOrUpdate(pf);

    }
}
