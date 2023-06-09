/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.infrastructure.service;

import br.com.ifba.entradaMaterial.model.EntradaMaterial;
import br.com.ifba.fornecedor.model.Fornecedor;
import br.com.ifba.material.model.Material;
import br.com.ifba.ordensFabricacao.model.OrdensFabricacao;
import br.com.ifba.produtos.model.Produto;
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
    
    
     // ------------------- Fornecedor -------------------------------//
    
    public abstract Fornecedor saveFornecedor(Fornecedor fornecedor);
    
    public abstract Fornecedor updateFornecedor(Fornecedor fornecedor);
    
    public abstract void deleteFornecedor(Fornecedor fornecedor);
    
    public List<Fornecedor> getAllFornecedor();
    
    public List<Fornecedor> findByNameFornecedor(String name);
    
    public Fornecedor findByIdFornecedor(Long id);
    
    
     // ------------------- Produto -------------------------------//
    
    public abstract Produto saveProduto(Produto produto);
    
    public abstract Produto updateProduto(Produto produto);
    
    public abstract void deleteProduto(Produto produto);
    
    public List<Produto> getAllProduto();
    
    public List<Produto> findByNameProduto(String name);
    
    public Produto findByIdProduto(Long id);
    
    // ------------------- Ordens de Fabricacao -------------------------------//
    
    public abstract OrdensFabricacao saveOrdensFabricacao(OrdensFabricacao ordens);
    
    public abstract OrdensFabricacao updateOrdensFabricacao(OrdensFabricacao ordens);

    public abstract void deleteOrdensFabricacao(OrdensFabricacao ordens);
    
    public List<OrdensFabricacao> getAllOrdensFabricacao();
    
    public List<OrdensFabricacao> findByNameOrdensFabricacao(String name);
    
    public OrdensFabricacao findByIdOrdensFabricacao(Long id);
    
    // -------------------- Entrada de Materiais --------------------------//
    
    public abstract EntradaMaterial saveEntradaMaterial(EntradaMaterial entradaMaterial);
    
    public abstract EntradaMaterial updateEntradaMaterial(EntradaMaterial entradaMaterial);
    
    public abstract void deleteEntradaMaterial(EntradaMaterial entradaMaterial);
    
    public List<EntradaMaterial> getAllEntradaMaterial();
    
    public List<EntradaMaterial> findByNameEntradaMaterial(String name);
    
    public EntradaMaterial findByIdEntradaMaterial(Long id);
}
