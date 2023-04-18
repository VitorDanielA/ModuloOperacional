/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.material.dao;

import br.com.ifba.infrastructure.basedao.BaseDao;
import br.com.ifba.material.model.Material;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author clebinho
 */
public class DaoMaterial extends BaseDao<Material> implements IDaoMaterial {
    @Override
    public List<Material> findByName(String name){
        String busca = "SELECT a FROM Material AS a WHERE a.nome=:nome";
        Query query = entityManager.createQuery(busca);
        query.setParameter("nome", name);
        return query.getResultList();
    }
}