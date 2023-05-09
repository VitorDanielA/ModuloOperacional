package br.com.ifba.entradaMaterial.service;

import br.com.ifba.infrastructure.exception.BusinessException;
import br.com.ifba.entradaMaterial.dao.IDaoEntradaMaterial;
import br.com.ifba.entradaMaterial.dao.DaoEntradaMaterial;
import br.com.ifba.entradaMaterial.model.EntradaMaterial;
import java.util.List;

/**
 *
 * @author clebinho
 */
public class ServiceEntradaMaterial implements IServiceEntradaMaterial{
    
    //EntradaMaterial Null
    public final static String ENTRADA_MATERIAL_NULL = "Entrada material null";
    
    //EntradaMaterial já existe
    public final static String ENTRADA_MATERIAL_EXISTE = "Entrada material já existe";
    
    //EntradaMaterial não existente
    public final static String ENTRADA_MATERIAL_NAO_EXISTE = "A entrada de material já existe na base de dados";
    
    //EntradaMaterial inválido
    public final static String ENTRADA_MATERIAL_INVALIDO = "Entrada de material inválido";
    
    //Criando objeto da instância
    
    private final IDaoEntradaMaterial daoEntradaMaterial = new DaoEntradaMaterial();

    @Override
    public EntradaMaterial saveEntradaMaterial(EntradaMaterial entradaMaterial) {
        if(entradaMaterial == null){
            throw new BusinessException(ENTRADA_MATERIAL_NULL);
        } else if(daoEntradaMaterial.findById(entradaMaterial.getId()) != null){
            throw new BusinessException(ENTRADA_MATERIAL_EXISTE);
        } else{
            return daoEntradaMaterial.save(entradaMaterial);
        }
    }

    @Override
    public EntradaMaterial updateEntradaMaterial(EntradaMaterial entradaMaterial) {
        if(entradaMaterial == null){
            throw new BusinessException(ENTRADA_MATERIAL_NULL);
        } else if(daoEntradaMaterial.findById(entradaMaterial.getId()) == null){
            throw new BusinessException(ENTRADA_MATERIAL_EXISTE);
        } else{
            return daoEntradaMaterial.update(entradaMaterial);
        }
    }

    @Override
    public void deleteEntradaMaterial(EntradaMaterial entradaMaterial) {
        if(entradaMaterial == null){
            throw new BusinessException(ENTRADA_MATERIAL_NULL);
        } else if(daoEntradaMaterial.findById(entradaMaterial.getId()) != null){
            this.daoEntradaMaterial.delete(entradaMaterial);
            return;
        } 
        
        throw new BusinessException(ENTRADA_MATERIAL_NAO_EXISTE);
    }

    @Override
    public List<EntradaMaterial> getAllEntradaMaterial() {
        return daoEntradaMaterial.findAll();
    }

    @Override
    public List<EntradaMaterial> findByNameEntradaMaterial(String name) {
        if(name == null){
            throw new BusinessException("Nome null");
        } else if(name.isEmpty()){
            throw new BusinessException("Nome vazio");
        } else {
            return daoEntradaMaterial.findByName(name);
        }
    }

    @Override
    public EntradaMaterial findByIdEntradaMaterial(Long id) {
        return daoEntradaMaterial.findById(id);
    }    
}