package br.com.ifba.entradaMaterial.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.fornecedor.model.Fornecedor;
import br.com.ifba.material.model.Material;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author clebinho
 */
@Entity
@Table
public class EntradaMaterial extends PersistenceEntity {
    private String data;
    @OneToOne
    private Material material;
    private String notaFiscal;
    @OneToOne
    private Fornecedor fornecedor;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
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