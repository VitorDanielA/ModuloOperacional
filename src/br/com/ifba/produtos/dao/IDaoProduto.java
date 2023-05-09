/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.produtos.dao;

import br.com.ifba.infrastructure.basedao.IBaseDao;
import br.com.ifba.produtos.model.Produto;
import java.util.List;

/**
 *
 * @author Ellen Cristina
 */
public interface IDaoProduto extends IBaseDao<Produto>{
    
     public abstract List<Produto> findByName(String name);
     
}
