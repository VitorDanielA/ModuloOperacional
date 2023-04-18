/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.material.service;

import br.com.ifba.material.model.Material;
import java.util.List;

/**
 *
 * @author clebinho
 */
public interface IServiceMaterial {
    public abstract Material saveMaterial(Material material);
    public abstract Material updateMaterial(Material material);
    public abstract void deleteMaterial(Material material);
    public abstract List<Material> getAllMaterial();
    public List<Material> findByNameMaterial(String name);
    public Material findByIdMaterial(Long id);
}