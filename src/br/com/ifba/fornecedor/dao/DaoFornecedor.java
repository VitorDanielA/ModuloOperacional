/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.fornecedor.dao;

import br.com.ifba.fornecedor.model.Fornecedor;
import br.com.ifba.infrastructure.basedao.BaseDao;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Everton
 */
public class DaoFornecedor extends BaseDao<Fornecedor> implements IDaoFornecedor{

    @Override
    public List<Fornecedor> findByName(String name) {
        String busca = "SELECT a FROM Fornecedor AS a WHERE a nome=:nome";
        Query query = entityManager.createQuery(busca);
        query.setParameter("nome", name);
        return query.getResultList();
    }
    
}
