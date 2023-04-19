/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.material.view;

import br.com.ifba.infrastructure.service.Facade;
import br.com.ifba.infrastructure.service.FacadeInstance;
import br.com.ifba.infrastructure.service.IFacade;
import br.com.ifba.infrastructure.support.StringUtil;
import br.com.ifba.material.model.Material;
import br.com.ifba.material.dao.DaoMaterial;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author clebinho
 */
public class TelaMaterial extends javax.swing.JFrame {
    //private IFacade facade = new Facade();
    
    DefaultTableModel listaTabela;
    List<Material> lista;
    List<Material> itemLista;
    int selecionado;
    
    Material material;
    
    /**
     * Creates new form TelaMaterial
     */
    public TelaMaterial() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.itemLista = FacadeInstance.getInstance().getAllMaterial();
        atualizarMaterial(this.itemLista);
    }
    
    private void atualizarMaterial(List<Material> listaMaterial){
        this.listaTabela =  new DefaultTableModel(null, new String [] {"Id", "Código", "Nome", "Descrição", "Valor"});
        
        for(Material al: listaMaterial){
            listaTabela.addRow(new Object[]{al.getId(), al.getCodigo(), al.getNome(), al.getDescricao(), al.getValor()});
        }
        
        this.tblTabela.setModel(this.listaTabela);
    }
    
    private boolean validarCampos(Material material){
        StringUtil validacao = StringUtil.getInstance();
        if(validacao.isEmpty(material.getCodigo()) || validacao.isEmpty(material.getNome()) ||
           validacao.isEmpty(material.getDescricao()) || validacao.isEmpty(material.getValor()) ||
           validacao.isEmpty(material.getEstoqueAtual()) || validacao.isEmpty(material.getEstoqueMinimo()))
        {
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblModulo = new javax.swing.JLabel();
        lblOperacional = new javax.swing.JLabel();
        lblMateriais = new javax.swing.JLabel();
        lblPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        lblNome = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        lblEstoqueAtual = new javax.swing.JLabel();
        lblEstoqueMínimo = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        txtEstoqueAtual = new javax.swing.JTextField();
        txtEstoqueMinimo = new javax.swing.JTextField();
        lblHome = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCheck = new javax.swing.JButton();
        lblModuloIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 160, 19));

        lblModulo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblModulo.setText("Módulo");

        lblOperacional.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblOperacional.setText("Operacional");

        lblMateriais.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lblMateriais.setText("Materiais");

        lblPesquisar.setBackground(new java.awt.Color(0, 0, 0));
        lblPesquisar.setText("Pesquisar");

        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTabela);

        lblNome.setText("Nome");

        lblCodigo.setText("Código");

        lblValor.setText("Valor");

        lblDescricao.setText("Descrição");

        lblEstoqueAtual.setText("Estoque Atual");

        lblEstoqueMínimo.setText("Estoque Mínimo");

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        lblHome.setBackground(new java.awt.Color(0, 0, 0));
        lblHome.setText("HOME");

        lblSair.setText("SAIR");

        btnCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/images/add-java.png"))); // NOI18N
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/images/edit-java.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/images/delete-java.png"))); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCheck.setBackground(new java.awt.Color(255, 255, 255));
        btnCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/images/done-java.png"))); // NOI18N

        lblModuloIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/images/modulo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblNome)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblCodigo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCodigo))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblValor)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtValor))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(lblModulo)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblEstoqueMínimo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEstoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(lblHome)
                                                    .addGap(18, 18, 18))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(lblDescricao)
                                                    .addGap(32, 32, 32)))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(lblSair)
                                                    .addGap(31, 31, 31))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblEstoqueAtual)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtEstoqueAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(lblPesquisar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lblModuloIcon)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOperacional)
                            .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblMateriais)
                .addGap(311, 311, 311))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModulo)
                            .addComponent(lblHome)
                            .addComponent(lblSair))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOperacional))
                    .addComponent(lblModuloIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMateriais)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisar)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDescricao)
                                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEstoqueAtual)
                                .addComponent(txtEstoqueAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValor)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEstoqueMínimo)
                                .addComponent(txtEstoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        
        material.setCodigo(txtCodigo.getText());
        material.setNome(txtNome.getText());
        material.setDescricao(txtDescricao.getText());
        material.setValor(txtValor.getText());
        material.setEstoqueAtual(txtEstoqueAtual.getText());
        material.setEstoqueMinimo(txtEstoqueMinimo.getText());
        
        FacadeInstance.getInstance().updateMaterial(material);
        
        this.lista = FacadeInstance.getInstance().getAllMaterial();
        
        this.atualizarMaterial(this.lista);
        
        JOptionPane.showMessageDialog(null, "Material Editado com sucesso", "Parabéns", JOptionPane.WARNING_MESSAGE);

       
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        Material material = new Material();
        
        material.setCodigo(txtCodigo.getText());
        material.setNome(txtNome.getText());
        material.setDescricao(txtDescricao.getText());
        material.setValor(txtValor.getText());
        material.setEstoqueAtual(txtEstoqueAtual.getText());
        material.setEstoqueMinimo(txtEstoqueMinimo.getText());
        
        if(validarCampos(material) == true){
            FacadeInstance.getInstance().saveMaterial(material);
            JOptionPane.showMessageDialog(null, "Material Cadastrado", "Parabéns", JOptionPane.WARNING_MESSAGE);
            
            this.lista = FacadeInstance.getInstance().getAllMaterial();
        
            this.atualizarMaterial(this.lista);
        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        FacadeInstance.getInstance().deleteMaterial(material);
        this.lista = FacadeInstance.getInstance().getAllMaterial();
        this.atualizarMaterial(this.lista);
        
        this.selecionado = -1;
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void tblTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTabelaMouseClicked
        // TODO add your handling code here:
        
        this.selecionado = this.tblTabela.getSelectedRow();
        
        if(this.selecionado != -1){
            this.material = this.itemLista.get(this.selecionado);
        }
    }//GEN-LAST:event_tblTabelaMouseClicked
                                       

    
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
            java.util.logging.Logger.getLogger(TelaMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMaterial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMaterial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEstoqueAtual;
    private javax.swing.JLabel lblEstoqueMínimo;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblMateriais;
    private javax.swing.JLabel lblModulo;
    private javax.swing.JLabel lblModuloIcon;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblOperacional;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTable tblTabela;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEstoqueAtual;
    private javax.swing.JTextField txtEstoqueMinimo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}