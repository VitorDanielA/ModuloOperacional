/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.produtos.service;

import br.com.ifba.produtos.service.IServiceProduto;
import br.com.ifba.infrastructure.exception.BusinessException;
import br.com.ifba.produtos.dao.DaoProduto;
import br.com.ifba.produtos.dao.IDaoProduto;
import br.com.ifba.produtos.model.Produto;
import java.util.List;

/**
 *
 * @author Ellen Cristina
 */
public class ServiceProduto implements IServiceProduto{
    //Produto null
    public final static String Produto_NULL = "Produto null";
    
    //Produto existente
    public final static String Produto_EXISTE = "Produto já existe";
    
    //Produto não existente
    public final static String Produto_NAO_EXISTE = "O Produto já existe na base de dados";
    
    //Produto inválido
    public final static String Produto_INVALIDO = "Produto inválido";
    
    //Criando objeto de instância
    
    private final IDaoProduto daoProduto = new DaoProduto();

    @Override
    public Produto saveProduto(Produto produto) {
        if(produto == null){
            throw new BusinessException(Produto_NULL);
        } else if(daoProduto.findById(produto.getId()) != null){
            throw new BusinessException(Produto_EXISTE);
        } else{
            return daoProduto.save(produto);
        }
    }

    @Override
    public Produto updateProduto(Produto produto) {
        if(produto == null){
            throw new BusinessException(Produto_NULL);
        } else if(daoProduto.findById(produto.getId()) == null){
            throw new BusinessException(Produto_EXISTE);
        } else{
            return daoProduto.update(produto);
        }
    }

    @Override
    public void deleteProduto(Produto produto) {
        if(produto == null){
            throw new BusinessException(Produto_NULL);
        } else if(daoProduto.findById(produto.getId()) != null){
            this.daoProduto.delete(produto);
            return;
        } 
        
        throw new BusinessException(Produto_NAO_EXISTE);
    }

    @Override
    public List<Produto> getAllProduto() {
         return daoProduto.findAll();
    }

    @Override
    public List<Produto> findByNameProduto(String name) {
        if(name == null){
            throw new BusinessException("Nome null");
        } else if(name.isEmpty()){
            throw new BusinessException("Nome vazio");
        } else {
            return daoProduto.findByName(name);
        }
    }

    @Override
    public Produto findByIdProduto(Long id) {
         return daoProduto.findById(id);
    }
    
}
