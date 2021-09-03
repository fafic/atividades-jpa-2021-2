package br.edu.fafic.domain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo_PU");
        EntityManager em = emf.createEntityManager();

        Pessoa pessoa1 = Pessoa.builder()
                .cpf("123456")
                .nome("José")
                .email("jose@gmail.com").build();

        Pessoa pessoa = Pessoa.builder()
                .cpf("1234567")
                .nome("Maria")
                .email("maria@gmail.com").build();

        em.getTransaction().begin();
        //persistindo entidade
        em.merge(pessoa);
        em.merge(pessoa1);
      //  Pessoa pessoa = em.find(Pessoa.class, 2L);
      //  System.out.println("Antes da atualização: " +pessoa.getNome());
      //  pessoa.setNome("Maria Joaquina");
      //  em.remove(pessoa);
       // List pessoas = new ArrayList();
       //named query para buscar todos os registros de pessoa no bd
       // Query query = em.createNamedQuery("findAll");
      //  pessoas = query.getResultList();
       // pessoas.forEach(p -> System.out.println(p.toString()));
        /*Query query = em.createNamedQuery("pessoaByCpf");
        query.setParameter("cpf", "78945");
        Pessoa maria = (Pessoa)query.getSingleResult();
        System.out.println("Pós Atualização:" +maria.getNome());*/
        em.getTransaction().commit();
    }
}
