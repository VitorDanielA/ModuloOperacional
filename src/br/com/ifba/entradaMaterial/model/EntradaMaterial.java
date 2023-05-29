package br.com.ifba.entradaMaterial.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.fornecedor.model.Fornecedor;
import br.com.ifba.material.model.Material;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 *
 * @author clebinho
 */
@Entity
@Table
public class EntradaMaterial extends PersistenceEntity {
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    @OneToOne
    private Material material;
    private String quantidade;
    private String notaFiscal;
    @OneToOne
    private Fornecedor fornecedor;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
    
    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }        
}