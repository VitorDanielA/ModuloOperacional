/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.home.view;

import br.com.ifba.entradaMaterial.view.TelaEntradaMaterial;
import br.com.ifba.fornecedor.view.TelaFornecedor;
import br.com.ifba.material.view.TelaGrafico;
import br.com.ifba.material.view.TelaMaterial;
import br.com.ifba.produtos.view.TelaProduto;
import br.com.ifba.usuario.view.TelaCadastro;
import br.com.ifba.usuario.view.TelaUsuario;
import br.com.ifba.ordensFabricacao.view.TelaOrdensFabricacao;

/**
 *
 * @author Ellen Cristina
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuGestaoMateriais = new javax.swing.JMenu();
        menuMateriais = new javax.swing.JMenuItem();
        menuFornecedor = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenu();
        Usuarios = new javax.swing.JMenuItem();
        menuControleEstoque = new javax.swing.JMenu();
        menuMateriaisemFalta = new javax.swing.JMenuItem();
        menuEntradaMateriais = new javax.swing.JMenuItem();
        menuGestaoProdutos = new javax.swing.JMenu();
        menuProdutos = new javax.swing.JMenuItem();
        menuEntradasdeProdutos = new javax.swing.JMenuItem();
        menuSaidadeProdutos = new javax.swing.JMenuItem();
        menuGestaoOrdem = new javax.swing.JMenu();
        menuOrdemdeFabricacao = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        sair = new javax.swing.JMenuItem();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(50, 194, 185));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel4.setText("Módulo Operacional");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Sistema de gerenciamento ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/images/modulo-g.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(335, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGap(317, 317, 317))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(902, 80));

        menuGestaoMateriais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/images/materiais.png"))); // NOI18N
        menuGestaoMateriais.setText("Gestão materiais");
        menuGestaoMateriais.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        menuGestaoMateriais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGestaoMateriaisActionPerformed(evt);
            }
        });

        menuMateriais.setText("Materiais");
        menuMateriais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMateriaisActionPerformed(evt);
            }
        });
        menuGestaoMateriais.add(menuMateriais);

        menuFornecedor.setText("Fornecedores");
        menuFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFornecedorActionPerformed(evt);
            }
        });
        menuGestaoMateriais.add(menuFornecedor);

        jMenuBar1.add(menuGestaoMateriais);

        menuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/images/person.png"))); // NOI18N
        menuUsuario.setText("Usuários  ");
        menuUsuario.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        Usuarios.setText("Usuários");
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });
        menuUsuario.add(Usuarios);

        jMenuBar1.add(menuUsuario);

        menuControleEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/images/estoque.png"))); // NOI18N
        menuControleEstoque.setText("Controle de estoque");
        menuControleEstoque.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        menuMateriaisemFalta.setText("Materiais em falta");
        menuMateriaisemFalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMateriaisemFaltaActionPerformed(evt);
            }
        });
        menuControleEstoque.add(menuMateriaisemFalta);

        menuEntradaMateriais.setText("Entrada de materiais");
        menuEntradaMateriais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEntradaMateriaisActionPerformed(evt);
            }
        });
        menuControleEstoque.add(menuEntradaMateriais);

        jMenuBar1.add(menuControleEstoque);

        menuGestaoProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/images/caracteristicas.png"))); // NOI18N
        menuGestaoProdutos.setText("Gestão de produtos");
        menuGestaoProdutos.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        menuProdutos.setText("Produtos");
        menuProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdutosActionPerformed(evt);
            }
        });
        menuGestaoProdutos.add(menuProdutos);

        menuEntradasdeProdutos.setText("Entradas de produtos");
        menuGestaoProdutos.add(menuEntradasdeProdutos);

        menuSaidadeProdutos.setText("Saídas de produtos");
        menuGestaoProdutos.add(menuSaidadeProdutos);

        jMenuBar1.add(menuGestaoProdutos);

        menuGestaoOrdem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/images/fabricacao.png"))); // NOI18N
        menuGestaoOrdem.setText("Gestão de ordem");
        menuGestaoOrdem.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        menuGestaoOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGestaoOrdemActionPerformed(evt);
            }
        });

        menuOrdemdeFabricacao.setText("Ordem de fabricação");
        menuOrdemdeFabricacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOrdemdeFabricacaoActionPerformed(evt);
            }
        });
        menuGestaoOrdem.add(menuOrdemdeFabricacao);

        jMenuBar1.add(menuGestaoOrdem);

        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/images/sair.png"))); // NOI18N
        menuSair.setText("Sair");
        menuSair.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        menuSair.add(sair);

        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuMateriaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMateriaisActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TelaMaterial material = new TelaMaterial();
        material.setVisible(true);  
    }//GEN-LAST:event_menuMateriaisActionPerformed

    private void menuFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFornecedorActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TelaFornecedor fornecedor = new TelaFornecedor();
        fornecedor.setVisible(true);  
    }//GEN-LAST:event_menuFornecedorActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TelaCadastro cadastro = new TelaCadastro();
        cadastro.setVisible(true);
    }//GEN-LAST:event_sairActionPerformed

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TelaUsuario usuario = new TelaUsuario();
        usuario.setVisible(true);
        
    }//GEN-LAST:event_UsuariosActionPerformed

    private void menuGestaoMateriaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestaoMateriaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuGestaoMateriaisActionPerformed

    private void menuProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdutosActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TelaProduto produto = new TelaProduto();
        produto.setVisible(true);
    }//GEN-LAST:event_menuProdutosActionPerformed

    private void menuGestaoOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestaoOrdemActionPerformed
       
    }//GEN-LAST:event_menuGestaoOrdemActionPerformed

    private void menuOrdemdeFabricacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOrdemdeFabricacaoActionPerformed
        this.setVisible(false);
        TelaOrdensFabricacao OrdensFabricacao = new TelaOrdensFabricacao();
        OrdensFabricacao.setVisible(true);
    }//GEN-LAST:event_menuOrdemdeFabricacaoActionPerformed

    private void menuEntradaMateriaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEntradaMateriaisActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        TelaEntradaMaterial entradaMaterial = new TelaEntradaMaterial();
        entradaMaterial.setVisible(true);
    }//GEN-LAST:event_menuEntradaMateriaisActionPerformed

    private void menuMateriaisemFaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMateriaisemFaltaActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        TelaGrafico grafico =  new TelaGrafico();
        grafico.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuMateriaisemFaltaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Usuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuControleEstoque;
    private javax.swing.JMenuItem menuEntradaMateriais;
    private javax.swing.JMenuItem menuEntradasdeProdutos;
    private javax.swing.JMenuItem menuFornecedor;
    private javax.swing.JMenu menuGestaoMateriais;
    private javax.swing.JMenu menuGestaoOrdem;
    private javax.swing.JMenu menuGestaoProdutos;
    private javax.swing.JMenuItem menuMateriais;
    private javax.swing.JMenuItem menuMateriaisemFalta;
    private javax.swing.JMenuItem menuOrdemdeFabricacao;
    private javax.swing.JMenuItem menuProdutos;
    private javax.swing.JMenuItem menuSaidadeProdutos;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JMenuItem sair;
    // End of variables declaration//GEN-END:variables
}
