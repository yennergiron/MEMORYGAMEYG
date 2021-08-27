/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umgmemorygame;

/**
 *
 * @author yenne
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtAinstrucciones = new javax.swing.JTextArea();
        BtnCreateuser = new javax.swing.JButton();
        BtnPlay = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU");

        jLabel1.setText("Menu");

        TxtAinstrucciones.setColumns(20);
        TxtAinstrucciones.setRows(5);
        TxtAinstrucciones.setText("Cuando el usuario ingrese a la opción jugar, el programa mostrará un tablero de 8x8 casillas en\nblanco, ocultas “detrás” de cada casilla se encontrarán 32 pares de imágenes, o sea que, existen 32\nimágenes que existen 2 veces dentro del tablero de juego, la posición de cada imagen en el tablero\nserá aleatoria, cada vez que el usuario haga clic en una casilla, el programa mostrará la imagen que\nestá escondida “detrás” de la casilla, después de mostrar dos casillas el programa comparará si\nambas imágenes son iguales, si lo son, dejará visibles (ya no ocultará) este par de imágenes, de lo\ncontrario, el sistema “ocultará” nuevamente las imágenes.\n");
        TxtAinstrucciones.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TxtAinstruccionesAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(TxtAinstrucciones);

        BtnCreateuser.setText("Crear Usuario");
        BtnCreateuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateuserActionPerformed(evt);
            }
        });

        BtnPlay.setText("Jugar");
        BtnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPlayActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Ayuda");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem2.setText("Creditos");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(427, 427, 427))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCreateuser)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(BtnPlay)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(BtnCreateuser)
                        .addGap(18, 18, 18)
                        .addComponent(BtnPlay))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(344, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtAinstruccionesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TxtAinstruccionesAncestorAdded
        TxtAinstrucciones.setText("Este juego no solo se trata de poner en practica la memoria, sino también poner en practica la\n"
        + "atención, se mostrara un tablero de 8x8 casillas, todas  estas casillas  estarán en  blanco, y\n"
        + "ocultaranuna ficha, si se levantan dos fichas y estas  coinciden, se mostraran ambas fichas en\n"
        + "pantalla, pero si estas no coinciden se volverán a ocultar y  esa acción contaría como un int-\n"
        + "ento. El juego se gana levantando  todas las fichas antes de  3 min, si el tiempo se agota el \n"
        + "juego estará perdido. Pilas!!\n");
    }//GEN-LAST:event_TxtAinstruccionesAncestorAdded

    private void BtnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPlayActionPerformed
        FrmCrearUsuario FCU = new FrmCrearUsuario();
        FCU.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnPlayActionPerformed

    private void BtnCreateuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateuserActionPerformed
        FrmRegistrarUsuario FRU = new FrmRegistrarUsuario();
        FRU.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnCreateuserActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCreateuser;
    private javax.swing.JButton BtnPlay;
    private javax.swing.JTextArea TxtAinstrucciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
