/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.ordensFabricacao.service;

import br.com.ifba.infrastructure.exception.BusinessException;
import br.com.ifba.ordensFabricacao.dao.DaoOrdensFabricacao;
import br.com.ifba.ordensFabricacao.dao.IDaoOrdensFabricacao;
import br.com.ifba.ordensFabricacao.model.OrdensFabricacao;
import java.util.List;

/**
 *
 * @author Everton
 */
public class ServiceOrdensFabricacao implements IServiceOrdensFabricacao{

     //Ordem de fabricação Null
    public final static String ORDENS_FABRICACAO_NULL = "Ordem de fabricação  null";
    
    //Ordem de fabricação já existe
    public final static String ORDENS_FABRICACAO_EXISTE = "A Ordem de fabricação já existe";
    
    //Ordem de fabricação não existente
    public final static String ORDENS_FABRICACAO_NAO_EXISTE = "A Ordem de fabricação já existe na base de dados";
    
    //Ordem de fabricação inválido
    public final static String ORDENS_FABRICACAO_INVALIDO = "Ordem de fabricação inválido";
    
    //Criando objeto de instância
    
    private final IDaoOrdensFabricacao daoOrdensFabricacao = new DaoOrdensFabricacao();
  
  
    @Override
    public OrdensFabricacao saveOrdensFabricacao(OrdensFabricacao ordem) {
        if(ordem == null){
            throw new BusinessException(ORDENS_FABRICACAO_NULL);
        } else if(daoOrdensFabricacao.findById(ordem.getId()) != null){
            throw new BusinessException( ORDENS_FABRICACAO_EXISTE );
        } else{
            return daoOrdensFabricacao.save(ordem);
        }
    }

    @Override
    public OrdensFabricacao updateOrdensFabricacao(OrdensFabricacao ordem) {
        if(ordem == null){
            throw new BusinessException(ORDENS_FABRICACAO_NULL);
        } else if(daoOrdensFabricacao.findById(ordem.getId()) == null){
            throw new BusinessException(ORDENS_FABRICACAO_EXISTE);
        } else{
            return daoOrdensFabricacao.update(ordem);
        }
    }

    @Override
    public void deleteOrdensFabricacao(OrdensFabricacao ordem) {
        if(ordem == null){
            throw new BusinessException(ORDENS_FABRICACAO_NULL);
        } else if(daoOrdensFabricacao.findById(ordem.getId()) != null){
            this.daoOrdensFabricacao.delete(ordem);
            return;
        }
         throw new BusinessException(ORDENS_FABRICACAO_NAO_EXISTE);
    }

    @Override
    public List<OrdensFabricacao> getAllOrdensFabricacao(){
         return daoOrdensFabricacao.findAll();
    }

    @Override
    public List<OrdensFabricacao> findByNameOrdensFabricacao(String name) {
         if(name == null){
            throw new BusinessException("Nome null");
        } else if(name.isEmpty()){
            throw new BusinessException("Nome vazio");
        } else {
            return daoOrdensFabricacao.findByName(name);
        }
    }

    @Override
    public OrdensFabricacao findByIdOrdensFabricacao(Long id) {
        return daoOrdensFabricacao.findById(id);
    }
}
