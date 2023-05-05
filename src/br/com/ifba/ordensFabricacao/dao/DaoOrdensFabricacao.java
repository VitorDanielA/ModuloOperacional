/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.ordensFabricacao.dao;

import br.com.ifba.infrastructure.basedao.BaseDao;
import br.com.ifba.ordensFabricacao.model.OrdensFabricacao;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Everton
 */
public class DaoOrdensFabricacao extends BaseDao<OrdensFabricacao> implements IDaoOrdensFabricacao{

    @Override
    public List<OrdensFabricacao> findByName(String name) {
        String busca = "SELECT a FROM OrdensFabricacao AS a WHERE a nome=:nome";
        Query query = entityManager.createQuery(busca);
        query.setParameter("nome", name);
        return query.getResultList();
    }
    
}
