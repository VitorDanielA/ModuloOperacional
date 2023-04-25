package br.com.ifba.usuario.view;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import br.com.ifba.home.view.Principal;
import br.com.ifba.infrastructure.service.Facade;
import br.com.ifba.infrastructure.service.FacadeInstance;
import br.com.ifba.infrastructure.service.IFacade;
import br.com.ifba.infrastructure.support.StringUtil;
import br.com.ifba.usuario.model.Usuario;
import br.com.ifba.usuario.view.RedefinirSenha;
import br.com.ifba.usuario.view.TelaUsuario;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author felip
 */
public class TelaCadastro extends javax.swing.JFrame {

     private IFacade facade = new Facade();
    
     //private RedefinirSenha telaRedefinir = new RedefinirSenha(); 
     
     private TelaUsuario telaExibir;
    
    
    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private boolean validarCampos(Usuario usuario) {
         StringUtil validacao = StringUtil.getInstance();
         if (validacao.isEmpty(usuario.getLogin()) || validacao.isEmpty(usuario.getSenha()))
                {
            return false;
         }
        return true;
     }
    
    private Usuario validateLogin() {
        List<Usuario> users = FacadeInstance.getInstance().getAllUsuarios();

        Usuario user = new Usuario();
        user.setSenha(txtSenha.getText());
        
        user.setLogin(txtUsuario.getText());
            for (Usuario u : users) {
                if (u.getLogin().equals(user.getLogin()) && u.getSenha().equals(user.getSenha())) {
                    return u;
                }
            }
        
        return null;
    }
    
    private void makeLogin() {
        Usuario user = this.validateLogin();
        if (user == null) {
            // errro
            JOptionPane.showMessageDialog(null, "Erro, usuário não validado!", "Erro!", JOptionPane.ERROR_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "Bem Vindo ", "Sucesso!",
                    JOptionPane.INFORMATION_MESSAGE);

        }
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnLogin1 = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(102, 102, 102));
        lblUsuario.setText("Usuário");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 192, 33));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Senha");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Esqueceu a senha?");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/images/person.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ifba/images/lock.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel6.setText("Módulo Operacional");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 21, -1, -1));

        btnLogin1.setBackground(new java.awt.Color(51, 160, 19));
        btnLogin1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        btnLogin1.setText("Entrar");
        btnLogin1.setBorder(null);
        btnLogin1.setBorderPainted(false);
        btnLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 300, 34));
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 200, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        // TODO add your handling code here:
        this.makeLogin();
        
        Usuario usu = this.validateLogin();
        
        if(usu != null){
            this.setVisible(false);
            Principal principal = new Principal();

            principal.setVisible(true);
        }

        
    }//GEN-LAST:event_btnLogin1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        RedefinirSenha telaRedefinir = new RedefinirSenha(); 
        setVisible(false);
        telaRedefinir.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
