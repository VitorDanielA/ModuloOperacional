/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.dao;

import br.com.ifba.infrastructure.basedao.BaseDao;
import br.com.ifba.usuario.model.Usuario;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author vitor
 */
public class DaoUsuario extends BaseDao<Usuario> implements IDaoUsuario{

    @Override
    public List<Usuario> findByName(String name) {
      String busca = "SELECT a FROM Usuario AS a WHERE a.nome=:nome";
        Query query = entityManager.createQuery(busca);
        query.setParameter("nome", name);
        return query.getResultList();  
    }
    
}
