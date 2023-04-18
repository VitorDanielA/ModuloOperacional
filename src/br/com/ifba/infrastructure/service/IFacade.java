/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.infrastructure.service;

import br.com.ifba.material.model.Material;
import br.com.ifba.usuario.model.Usuario;
import java.util.List;

/**
 *
 * @author Vitor
 */
public interface IFacade {

    // ------------------- Usuario -------------------------------//
    public abstract Usuario saveUsuario(Usuario usuario);

    public abstract Usuario updateUsuario(Usuario usuario);

    public abstract void deleteUsuario(Usuario usuario);

    public List<Usuario> getAllUsuarios();

    public List<Usuario> findByName(String name);

    
    // ------------------- Material -------------------------------//
    public abstract Material saveMaterial(Material material);
    
    public abstract Material updateMaterial(Material material);
    
    public abstract void deleteMaterial(Material material);
    
    public List<Material> getAllMaterial();
    
    public List<Material> findByNameMaterial(String name);
    
    public Material findByIdMaterial(Long id);
}
