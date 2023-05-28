/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.material.view;

import br.com.ifba.home.view.TelaPrincipal;
import br.com.ifba.infrastructure.service.FacadeInstance;
import br.com.ifba.material.model.Material;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author felipe
 */
public final class TelaGrafico extends JFrame implements ActionListener{
    
    List<Material> itemLista;
    
    JButton btnVoltar = new JButton("Voltar");
    
    public TelaGrafico(){
        
       // add(btnVoltar);
       setLayout(null);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Tela de Grafico");
        setSize(900,580);
        setLocationRelativeTo(null);
        
        this.itemLista = FacadeInstance.getInstance().getAllMaterial();
        criarGrafico(this.itemLista);
        
        btnVoltar.setBounds(400, 500, 99, 40);
        add(btnVoltar);
        btnVoltar.addActionListener(this);
        
        setVisible(true);
    }
    
  
    public void criarGrafico(List<Material> listaMaterial){
        setLayout(null);
        DefaultCategoryDataset barra = new DefaultCategoryDataset();
        for(Material al: listaMaterial){
            if(Integer.parseInt(al.getEstoqueAtual()) <= Integer.parseInt(al.getEstoqueMinimo())){
            int valor = Integer.parseInt(al.getEstoqueMinimo());
           // listaTabela.addRow(new Object[]{al.getId(), al.getCodigo(), al.getNome(), al.getDescricao(), al.getValor()});
            barra.setValue(valor, al.getNome(), "");
           
            }
        }
            JFreeChart grafico = ChartFactory.createBarChart("Visualização de materiais em falta","Materiais","Quantidade", barra,PlotOrientation.VERTICAL,true,true,false);
            ChartPanel painel = new ChartPanel(grafico);
            painel.setBounds(0, 0, 885, 500);
            add(painel);
    }
    
    public static void main(String[] args){
        
      //  new TelaGrafico();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
    }
}
