/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.material.dao;

import br.com.ifba.infrastructure.basedao.IBaseDao;
import br.com.ifba.material.model.Material;
import java.util.List;

/**
 *
 * @author clebinho
 */
public interface IDaoMaterial extends IBaseDao<Material>{
    public abstract List<Material> findByName(String name);
}