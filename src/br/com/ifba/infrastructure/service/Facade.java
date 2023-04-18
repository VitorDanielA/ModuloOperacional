/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.infrastructure.service;


import br.com.ifba.material.model.Material;
import br.com.ifba.material.service.IServiceMaterial;
import br.com.ifba.material.service.ServiceMaterial;
import java.util.List;
import br.com.ifba.usuario.model.Usuario;
import br.com.ifba.usuario.service.IServiceUsuario;
import br.com.ifba.usuario.service.ServiceUsuario;

/**
 *
 * @author Vitor
 */
public class Facade implements IFacade {

    // -----------------Usuario-------------------//

    private final IServiceUsuario serviceUsuario = new ServiceUsuario();

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return serviceUsuario.saveUsuario(usuario);
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        return serviceUsuario.updateUsuario(usuario);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        this.serviceUsuario.deleteUsuario(usuario);
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return serviceUsuario.getAllUsuarios();
    }

    @Override
    public List<Usuario> findByName(String name) {
        return serviceUsuario.findByName(name);
    }

    // -----------------Material-------------------//
    
    private final IServiceMaterial serviceMaterial = new ServiceMaterial();
    
    @Override
    public Material saveMaterial(Material material) {
        return serviceMaterial.saveMaterial(material);
    }

    @Override
    public Material updateMaterial(Material material) {
        return serviceMaterial.updateMaterial(material);
    }

    @Override
    public void deleteMaterial(Material material) {
        this.serviceMaterial.deleteMaterial(material);
    }

    @Override
    public List<Material> getAllMaterial() {
        return serviceMaterial.getAllMaterial();
    }

    @Override
    public List<Material> findByNameMaterial(String name) {
        return serviceMaterial.findByNameMaterial(name);
    }

    @Override
    public Material findByIdMaterial(Long id) {
        return serviceMaterial.findByIdMaterial(id);
    }
}
