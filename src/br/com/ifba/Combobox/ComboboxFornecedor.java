/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.Combobox;

import java.util.List;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.AbstractListModel;
import br.com.ifba.fornecedor.model.Fornecedor;

/**
 *
 * @author clebinho
 */
public class ComboboxFornecedor extends AbstractListModel implements ComboBoxModel {

    private List<Fornecedor> listaFornecedor;
    private Fornecedor fornecedorSelecionado;
    
    public ComboboxFornecedor(){
        this.listaFornecedor = new ArrayList<>();
    }
    
    @Override
    public int getSize(){
        return listaFornecedor.size();
    }

    @Override
    public Object getElementAt(int index){
        return this.listaFornecedor.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem){
        if(anItem instanceof Fornecedor){
            this.fornecedorSelecionado = (Fornecedor) anItem;
            fireContentsChanged(this.listaFornecedor, 0, this.listaFornecedor.size());
        }
    }

    @Override
    public Object getSelectedItem(){
        return this.fornecedorSelecionado;
    }
    
    public void addFornecedor(Fornecedor fornecedor){
        this.listaFornecedor.add(fornecedor);
    }
    
    public void reset(){
        this.listaFornecedor.clear();
    }
}