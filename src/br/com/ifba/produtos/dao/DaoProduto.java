/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.produto.dao;

import br.com.ifba.infrastructure.basedao.BaseDao;
import br.com.ifba.produtos.model.Produto;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Ellen Cristina
 */
public class DaoProduto extends BaseDao<Produto> implements IDaoProduto {

    @Override
    public List<Produto> findByName(String name) {
        String busca = "SELECT a FROM Produto AS a WHERE a.nome=:nome";
        Query query = entityManager.createQuery(busca);
        query.setParameter("nome", name);
        return query.getResultList();
    }
}
