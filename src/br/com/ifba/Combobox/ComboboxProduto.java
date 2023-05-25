/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.Combobox;

import br.com.ifba.material.model.Material;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Ellen Cristina
 */
public class ComboboxProduto extends AbstractListModel implements ComboBoxModel{

    private List<Material> listaMaterial;
    private Material materialSelecionado;
    
    public ComboboxProduto(){
        this.listaMaterial = new ArrayList<>();
    }

    @Override
    public int getSize() {
        return listaMaterial.size();
    }

    @Override
    public Object getElementAt(int index) {
        return this.listaMaterial.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        if(anItem instanceof Material){
        this.materialSelecionado = (Material) anItem;
        fireContentsChanged(this.listaMaterial, 0, this.listaMaterial.size());
        }
    }

    @Override
    public Object getSelectedItem() {
        return this.materialSelecionado;
    }
    public void addMaterial(Material material){
        this.listaMaterial.add(material);
    }
    
    public void reset(){
        this.listaMaterial.clear();
    }
}
