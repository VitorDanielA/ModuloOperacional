/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.material.service;

import br.com.ifba.infrastructure.exception.BusinessException;
import br.com.ifba.material.dao.DaoMaterial;
import br.com.ifba.material.dao.IDaoMaterial;
import br.com.ifba.material.model.Material;
import java.util.List;

/**
 *
 * @author clebinho
 */
public class ServiceMaterial implements IServiceMaterial {
    //Material null
    public final static String MATERIAL_NULL = "Material null";
    
    //Material existente
    public final static String MATERIAL_EXISTE = "Material já existe";
    
    //Material não existente
    public final static String MATERIAL_NAO_EXISTE = "O Material já existe na base de dados";
    
    //Material inválido
    public final static String MATERIAL_INVALIDO = "Material inválido";
    
    //Criando objeto de instância
    
    private final IDaoMaterial daoMaterial = new DaoMaterial();
    
    public Material saveMaterial(Material material) {
        if(material == null){
            throw new BusinessException(MATERIAL_NULL);
        } else if(daoMaterial.findById(material.getId()) != null){
            throw new BusinessException(MATERIAL_EXISTE);
        } else{
            return daoMaterial.save(material);
        }
    }

    public Material updateMaterial(Material material) {
        if(material == null){
            throw new BusinessException(MATERIAL_NULL);
        } else if(daoMaterial.findById(material.getId()) == null){
            throw new BusinessException(MATERIAL_EXISTE);
        } else{
            return daoMaterial.update(material);
        }
    }

    public void deleteMaterial(Material material) {
        if(material == null){
            throw new BusinessException(MATERIAL_NULL);
        } else if(daoMaterial.findById(material.getId()) != null){
            this.daoMaterial.delete(material);
            return;
        } 
        
        throw new BusinessException(MATERIAL_NAO_EXISTE);
    }

    public List<Material> getAllMaterial() {
        return daoMaterial.findAll();
    }
    
    public List<Material> findByNameMaterial(String name) {
        if(name == null){
            throw new BusinessException("Nome null");
        } else if(name.isEmpty()){
            throw new BusinessException("Nome vazio");
        } else {
            return daoMaterial.findByName(name);
        }
    }

    public Material findByIdMaterial(Long id) {
        return daoMaterial.findById(id);
    }
}