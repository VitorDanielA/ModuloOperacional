/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.produto.service;

import br.com.ifba.produto.model.Produto;
import java.util.List;

/**
 *
 * @author Ellen Cristina
 */
public interface IServiceProduto {
    
    public abstract Produto saveProduto(Produto produto);
    public abstract Produto updateProduto(Produto produto);
    public abstract void deleteProduto(Produto produto);
    public abstract List<Produto> getAllProduto();
    public List<Produto> findByNameProduto(String name);
    public Produto findByIdProduto(Long id);
}
