/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umgmemorygame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author yenne
 */
public class FrmCrearUsuario extends javax.swing.JFrame {

    /**
     * Creates new form FrmCrearUsuario
     */
    public FrmCrearUsuario() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtUsernameCU = new javax.swing.JTextField();
        TxtPassCU = new javax.swing.JPasswordField();
        BtnLoginCU = new javax.swing.JButton();
        BtnRegister = new javax.swing.JButton();
        BtnReturnmenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CREAR USUARIO");
        setPreferredSize(new java.awt.Dimension(960, 540));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingresar");

        jLabel2.setText("Nombre de Usario");

        jLabel3.setText("Contraseña");

        TxtPassCU.setText("jPasswordField1");

        BtnLoginCU.setText("Iniciar Session");
        BtnLoginCU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnLoginCUMouseClicked(evt);
            }
        });

        BtnRegister.setText("Registrarse");
        BtnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegisterActionPerformed(evt);
            }
        });

        BtnReturnmenu.setText("Regresar al Menu Principal");
        BtnReturnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturnmenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtUsernameCU)
                            .addComponent(TxtPassCU, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
                    .addComponent(BtnReturnmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnLoginCU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(422, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtUsernameCU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(TxtPassCU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(BtnLoginCU)
                .addGap(36, 36, 36)
                .addComponent(BtnRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnReturnmenu)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegisterActionPerformed
        FrmRegistrarUsuario FRU = new FrmRegistrarUsuario();
        FRU.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegisterActionPerformed

    private void BtnReturnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturnmenuActionPerformed
        FrmMenu Frmm = new FrmMenu();
        Frmm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnReturnmenuActionPerformed

    public boolean verifyUser() throws IOException{
    
        File f = new File("Users.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        BufferedReader br = new BufferedReader(new FileReader(f));
        Object[] Lines = br.lines().toArray();
        int i = 0;
        for(i=0; i<Lines.length ; i++){
            String Line = Lines[i].toString().trim();
            String[] Row = Line.split(",");
            if(TxtUsernameCU.getText().equals(Row[1]) && TxtPassCU.getText().equals(Row[2])){
                return true;
            }
            else{
                return false;
            }
        }
    return false;
    }
    private void BtnLoginCUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLoginCUMouseClicked
        try {
            if(verifyUser() == true){
                JOptionPane.showMessageDialog(this, "Inicio de session exitoso, Bienvenido");
                FrmJuego FrmJ = new FrmJuego();
                FrmJ.setVisible(true);
                this.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(this, "Credenciales incorrectas, intente nuevamente o valle a mimir v<");
            }
        } catch (IOException ex) {
            Logger.getLogger(FrmCrearUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnLoginCUMouseClicked

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
            java.util.logging.Logger.getLogger(FrmCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCrearUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLoginCU;
    private javax.swing.JButton BtnRegister;
    private javax.swing.JButton BtnReturnmenu;
    private javax.swing.JPasswordField TxtPassCU;
    private javax.swing.JTextField TxtUsernameCU;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
