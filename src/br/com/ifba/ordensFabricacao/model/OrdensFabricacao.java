/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.ordensFabricacao.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.xml.crypto.Data;

/**
 *
 * @author Everton
 */
@Entity
@Table
public class OrdensFabricacao extends PersistenceEntity implements Serializable {
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    private String codigo;
    //private Produtos produtos;
    private int quantidade;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    

   
}
