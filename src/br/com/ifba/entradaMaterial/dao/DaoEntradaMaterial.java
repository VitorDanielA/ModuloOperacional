package br.com.ifba.entradaMaterial.dao;

import br.com.ifba.entradaMaterial.model.EntradaMaterial;
import br.com.ifba.infrastructure.basedao.BaseDao;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author clebinho
 */
public class DaoEntradaMaterial extends BaseDao<EntradaMaterial> implements IDaoEntradaMaterial {
    @Override
    public List<EntradaMaterial> findByName(String name) {
        String busca = "SELECT a FROM EntradaMaterial AS a WHERE a nome=:nome";
        Query query = entityManager.createQuery(busca);
        query.setParameter("nome", name);
        return query.getResultList();
    }
}