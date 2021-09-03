package dao;

import domain.Pessoa;

import java.util.List;

public class PessoaDAO extends GenericDAO<Pessoa>{

    @Override
    public void saveOrUpdate(Pessoa entity) {
        super.saveOrUpdate(entity);
    }

    @Override
    public Pessoa findById(Class<Pessoa> clazz, Long id) {
        return super.findById(clazz, id);
    }

    @Override
    public void delete(Pessoa entity) {
        super.delete(entity);
    }

    @Override
    public List<Pessoa> findAll(String namedQuery) {
        return super.findAll(namedQuery);
    }
}
