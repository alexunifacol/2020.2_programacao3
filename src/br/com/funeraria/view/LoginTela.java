/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.funeraria.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Luan
 */
public class LoginTela extends javax.swing.JFrame {

    /**
     * Creates new form LoginTela
     */
    public LoginTela() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        JLogin = new javax.swing.JButton();
        JSair = new javax.swing.JButton();
        txtLogin = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMaximumSize(new java.awt.Dimension(350, 350));
        setPreferredSize(new java.awt.Dimension(350, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/funeraria/imagens/Logo-.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 30, 150, 50);

        JLogin.setBackground(new java.awt.Color(35, 35, 67));
        JLogin.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        JLogin.setForeground(new java.awt.Color(255, 255, 255));
        JLogin.setText("Login");
        JLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JLoginActionPerformed(evt);
            }
        });
        JLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JLoginKeyPressed(evt);
            }
        });
        getContentPane().add(JLogin);
        JLogin.setBounds(110, 200, 65, 25);

        JSair.setBackground(new java.awt.Color(34, 33, 59));
        JSair.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        JSair.setForeground(new java.awt.Color(255, 255, 255));
        JSair.setText("Sair");
        JSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSairActionPerformed(evt);
            }
        });
        getContentPane().add(JSair);
        JSair.setBounds(200, 200, 100, 25);
        getContentPane().add(txtLogin);
        txtLogin.setBounds(110, 110, 190, 30);
        getContentPane().add(txtPassword);
        txtPassword.setBounds(110, 160, 190, 30);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 90, 41, 18);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 140, 80, 18);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/funeraria/imagens/background.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -50, 440, 400);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JLoginActionPerformed
        // TODO add your handling code here:
        if(txtPassword.getText().equals("admin") && txtLogin.getText().equals("admin")) {
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuario ou senha está incorreto"); 
    }
        
    }//GEN-LAST:event_JLoginActionPerformed

    private void JSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_JSairActionPerformed

    private void JLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JLoginKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JLoginKeyPressed

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
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginTela().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JLogin;
    private javax.swing.JButton JSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
