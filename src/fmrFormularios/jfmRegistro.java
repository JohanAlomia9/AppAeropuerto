/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fmrFormularios;

import rsscalelabel.RSScaleLabel;

/**
 *
 * @author AlomiaTobar
 */
public class jfmRegistro extends javax.swing.JFrame {

    /**
     * Creates new form jfmRegistro
     */
    public jfmRegistro() {
        initComponents();
        setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(lblImagenAvion, "src/Imagenes/avion.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblP, "src/Imagenes/mundo.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblC, "src/Imagenes/ced.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblN, "src/Imagenes/fnaci.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblG, "src/Imagenes/genero.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblU, "src/Imagenes/user.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblA, "src/Imagenes/user.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblCl, "src/Icons/CONTRASEÑA.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblE, "src/Imagenes/email.png");
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
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblClave = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField8 = new javax.swing.JTextField();
        lblImagenAvion = new javax.swing.JLabel();
        lblP = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        lblU = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblN = new javax.swing.JLabel();
        lblG = new javax.swing.JLabel();
        lblCl = new javax.swing.JLabel();
        lblE = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("CREAR CUENTA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 32, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Pais:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 116, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Cedula/Pasaporte:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 164, -1, -1));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 161, 171, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Nombres:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 217, -1, -1));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 214, 171, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Apellidos:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 268, -1, -1));

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 265, 171, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 323, -1, -1));

        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 320, 171, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Genero:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 389, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Email:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 116, -1, -1));

        lblClave.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblClave.setText("Constraseña:");
        getContentPane().add(lblClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 217, -1, -1));

        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 113, 171, -1));

        jTextField7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 386, 171, -1));

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 265, 215, -1));

        jTextField8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 161, 215, -1));
        getContentPane().add(lblImagenAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 11, 117, 91));
        getContentPane().add(lblP, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 113, 40, 30));
        getContentPane().add(lblC, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 161, 40, 30));
        getContentPane().add(lblU, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 214, 40, 30));
        getContentPane().add(lblA, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 265, 40, 30));
        getContentPane().add(lblN, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 320, 40, 30));
        getContentPane().add(lblG, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 381, 40, 30));
        getContentPane().add(lblCl, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 214, 40, 30));
        getContentPane().add(lblE, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 113, 40, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setText("INICIAR SESION");

        jButton1.setText("REGISTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(81, 81, 81)
                .addComponent(jButton2)
                .addGap(236, 236, 236))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(490, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(47, 47, 47))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

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
            java.util.logging.Logger.getLogger(jfmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfmRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblCl;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblE;
    private javax.swing.JLabel lblG;
    private javax.swing.JLabel lblImagenAvion;
    private javax.swing.JLabel lblN;
    private javax.swing.JLabel lblP;
    private javax.swing.JLabel lblU;
    // End of variables declaration//GEN-END:variables
}
