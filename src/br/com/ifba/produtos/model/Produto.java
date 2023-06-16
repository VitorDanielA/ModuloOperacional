/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.produtos.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.material.model.Material;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Ellen Cristina
 */
@Entity
@Table(name="produto")
public class Produto extends PersistenceEntity{
    //Atributos
    private String codigo;
    private String nome;
    private String descricao;
    private String estoque;
    
//    @ManyToOne
//    private Material material;
    
    //@OneToMany(mappedBy = "produto", fetch = FetchType.EAGER)
    @ManyToOne
    private Material material;
    
    private int quantidade;
    
    //private float valorTotal;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    public float getValorTotal() {
//        return valorTotal;
//    }
//
//    public void setValorTotal(float valorTotal) {
//        this.valorTotal = valorTotal;
//    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return nome;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

//    public List<Material> getMaterial() {
//        return material;
//    }
//
//    public void setMaterial(List<Material> material) {
//        this.material = material;
//    }
    

   

   
    
        
    
    
    
}
