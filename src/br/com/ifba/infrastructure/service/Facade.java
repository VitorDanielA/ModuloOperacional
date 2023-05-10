/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.infrastructure.service;

import br.com.ifba.entradaMaterial.model.EntradaMaterial;
import br.com.ifba.entradaMaterial.service.ServiceEntradaMaterial;
import br.com.ifba.entradaMaterial.service.IServiceEntradaMaterial;
import br.com.ifba.fornecedor.model.Fornecedor;
import br.com.ifba.fornecedor.service.IServiceFornecedor;
import br.com.ifba.fornecedor.service.ServiceFornecedor;
import br.com.ifba.material.model.Material;
import br.com.ifba.material.service.IServiceMaterial;
import br.com.ifba.material.service.ServiceMaterial;
import br.com.ifba.ordensFabricacao.model.OrdensFabricacao;
import br.com.ifba.ordensFabricacao.service.IServiceOrdensFabricacao;
import br.com.ifba.ordensFabricacao.service.ServiceOrdensFabricacao;
import br.com.ifba.produtos.model.Produto;
import br.com.ifba.produtos.service.IServiceProduto;
import br.com.ifba.produtos.service.ServiceProduto;
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

    // -----------------Fornecedor-------------------//
    
    private final IServiceFornecedor serviceFornecedor = new ServiceFornecedor();
     
    @Override
    public Fornecedor saveFornecedor(Fornecedor fornecedor) {
        return serviceFornecedor.saveFornecedor(fornecedor);
    }

    @Override
    public Fornecedor updateFornecedor(Fornecedor fornecedor) {
        return serviceFornecedor.updateFornecedor(fornecedor);
    }

    @Override
    public void deleteFornecedor(Fornecedor fornecedor) {
        this.serviceFornecedor.deleteFornecedor(fornecedor);
    }

    @Override
    public List<Fornecedor> getAllFornecedor() {
        return serviceFornecedor.getAllFornecedor();
    }
     @Override
    public List<Fornecedor> findByNameFornecedor(String name) {
        return serviceFornecedor.findByNameFornecedor(name);
    }

    @Override
    public Fornecedor findByIdFornecedor(Long id) {
        return serviceFornecedor.findByIdFornecedor(id);
    }
    
    // -----------------Produto-------------------//
    
    private final IServiceProduto serviceProduto = new ServiceProduto();

    @Override
    public Produto saveProduto(Produto produto) {
        return serviceProduto.saveProduto(produto);
    }

    @Override
    public Produto updateProduto(Produto produto) {
        return serviceProduto.updateProduto(produto);
    }

    @Override
    public void deleteProduto(Produto produto) {
        this.serviceProduto.deleteProduto(produto);
    }

    @Override
    public List<Produto> getAllProduto() {
        return serviceProduto.getAllProduto();
    }

    @Override
    public List<Produto> findByNameProduto(String name) {
        return serviceProduto.findByNameProduto(name);
    }

    @Override
    public Produto findByIdProduto(Long id) {
        return serviceProduto.findByIdProduto(id);
    }

     // ------------------- Ordens de Fabricação -------------------------------//
    
    private final IServiceOrdensFabricacao serviceOrdensFabricacao = new ServiceOrdensFabricacao();
    @Override
    public OrdensFabricacao saveOrdensFabricacao(OrdensFabricacao ordens) {
        return serviceOrdensFabricacao.saveOrdensFabricacao(ordens);
    }

    @Override
    public OrdensFabricacao updateOrdensFabricacao(OrdensFabricacao ordens) {
        return serviceOrdensFabricacao.updateOrdensFabricacao(ordens);
    }

    @Override
    public void deleteOrdensFabricacao(OrdensFabricacao ordens) {
        this.serviceOrdensFabricacao.deleteOrdensFabricacao(ordens);
    }

    @Override
    public List<OrdensFabricacao> getAllOrdensFabricacao() {
        return serviceOrdensFabricacao.getAllOrdensFabricacao();
    }

    @Override
    public List<OrdensFabricacao> findByNameOrdensFabricacao(String name) {
        return serviceOrdensFabricacao.findByNameOrdensFabricacao(name);
    }

    @Override
    public OrdensFabricacao findByIdOrdensFabricacao(Long id) {
        return serviceOrdensFabricacao.findByIdOrdensFabricacao(id);
    }
    
    // -----------------Entrada de Materiais -------------------//
    
    private final IServiceEntradaMaterial serviceEntradaMaterial = new ServiceEntradaMaterial();
    
    @Override
    public EntradaMaterial saveEntradaMaterial(EntradaMaterial entradaMaterial){
        return serviceEntradaMaterial.saveEntradaMaterial(entradaMaterial);
    }
    
    @Override
    public EntradaMaterial updateEntradaMaterial(EntradaMaterial entradaMaterial){
        return serviceEntradaMaterial.updateEntradaMaterial(entradaMaterial);
    }
    
    @Override
    public void deleteEntradaMaterial(EntradaMaterial entradaMaterial){
        this.serviceEntradaMaterial.deleteEntradaMaterial(entradaMaterial);
    }
    
    @Override
    public List<EntradaMaterial> getAllEntradaMaterial(){
        return serviceEntradaMaterial.getAllEntradaMaterial();
    }
    
    @Override
    public List<EntradaMaterial> findByNameEntradaMaterial(String name){
        return serviceEntradaMaterial.findByNameEntradaMaterial(name);
    }
    
    @Override
    public EntradaMaterial findByIdEntradaMaterial(Long id){
        return serviceEntradaMaterial.findByIdEntradaMaterial(id);
    }
}