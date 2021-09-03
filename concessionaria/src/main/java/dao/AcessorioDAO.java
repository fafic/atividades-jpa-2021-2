package dao;

import domain.Acessorio;

import java.util.List;

public class AcessorioDAO extends GenericDAOImpl<Acessorio>{

    @Override
    public void saveOrUpdate(Acessorio entity) {
        super.saveOrUpdate(entity);
    }

    @Override
    public void delete(Acessorio entity) {
        super.delete(entity);
    }

    @Override
    public Acessorio findById(Class<Acessorio> clazz, Long id) {
        return super.findById(clazz, id);
    }

    @Override
    public List<Acessorio> findAll(String namedQuery) {
        return super.findAll(namedQuery);
    }
}
