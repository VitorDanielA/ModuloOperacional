/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.Combobox;

import br.com.ifba.produtos.model.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *  
 * @author user
 */
public class ComboboxModel extends AbstractListModel implements ComboBoxModel {

    private List<Produto> listaProduto;
    private Produto produtoSelecionado;

    public ComboboxModel() {
        this.listaProduto = new ArrayList<>();
    }
    
    
    @Override
    public int getSize() {
       return listaProduto.size();
    }

    @Override
    public Object getElementAt(int index) {
        return this.listaProduto.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        
        if(anItem instanceof Produto){
        this.produtoSelecionado = (Produto) anItem;
        fireContentsChanged(this.listaProduto, 0, this.listaProduto.size());
        }
    }

    @Override
    public Object getSelectedItem() {
        return this.produtoSelecionado;
    }

    public void addProduto(Produto produto){
        this.listaProduto.add(produto);
    }
    
    public void reset(){
        this.listaProduto.clear();
    }
}
