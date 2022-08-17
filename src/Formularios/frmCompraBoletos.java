/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
/**
 *
 * @author sebas
 */
public class frmCompraBoletos extends javax.swing.JFrame {

    /**
     * Creates new form frmCompraBoletos
     */
    public frmCompraBoletos() {
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

        jLabel2 = new javax.swing.JLabel();
        cbxDestino = new javax.swing.JComboBox<>();
        spnNumero = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblPrecio = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 204));
        jLabel2.setText("SELECCIONE SU DESTINO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, 40));

        cbxDestino.setBackground(new java.awt.Color(204, 255, 204));
        cbxDestino.setFont(new java.awt.Font("Serif", 2, 14)); // NOI18N
        cbxDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEW YORK- ESTADOS UNIDOS", "MEDELLIN-COLOMBIA", "MADRID-ESPAÑA", "LIMA-PERU", "PARIS-FRANCIA", "SEATTLE-ESTADOS UNIDOS", "SAN JUAN-PUERTO RICO", "BRUSELAS-BELGICA", "SAN SALVADOR-EL SALVADOR" }));
        cbxDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 230, 30));
        getContentPane().add(spnNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 70, 30));

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("CANTIDAD DE BOLETOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, 40));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCompraBoletos/regreso.png"))); // NOI18N
        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 150, 40));

        jButton2.setBackground(new java.awt.Color(102, 255, 204));
        jButton2.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCompraBoletos/login.png"))); // NOI18N
        jButton2.setText("INGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 150, 40));

        lblPrecio.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 110, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesCompraBoletos/fondo.gif"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        frmMenuPrincipal form = new frmMenuPrincipal();
        form.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDestinoActionPerformed
        // TODO add your handling code here:
//        NEW YORK- ESTADOS UNIDOS
//MEDELLIN-COLOMBIA
//MADRID-ESPAÑA
//LIMA-PERU
//PARIS-FRANCIA
//SEATTLE-ESTADOS UNIDOS
//SAN JUAN-PUERTO RICO
//BRUSELAS-BELGICA
//SAN SALVADOR-EL SALVADOR
        if(cbxDestino.getSelectedItem().toString().equals("NEW YORK- ESTADOS UNIDOS"))
        {
            lblPrecio.setText("$689.15");
        }
        if(cbxDestino.getSelectedItem().toString().equals("MEDELLIN-COLOMBIA"))
        {
            lblPrecio.setText("$241.50");
        }
        if(cbxDestino.getSelectedItem().toString().equals("MADRID-ESPAÑA"))
        {
            lblPrecio.setText("$1541.00");
        }
        if(cbxDestino.getSelectedItem().toString().equals("LIMA-PERU"))
        {
            lblPrecio.setText("$499.19");
        }
         if(cbxDestino.getSelectedItem().toString().equals("PARIS-FRANCIA"))
        {
            lblPrecio.setText("$1684.00");
         if(cbxDestino.getSelectedItem().toString().equals("SEATTLE-ESTADOS UNIDOS"))
         {
             lblPrecio.setText("$1025.00");
         }
        }
        if(cbxDestino.getSelectedItem().toString().equals("SAN JUAN-PUERTO RICO"))
        {
            lblPrecio.setText("$565.56");
        }
        if(cbxDestino.getSelectedItem().toString().equals("BRUSELAS-BELGICA"))
        {
            lblPrecio.setText("$1225.00");
        }
        if(cbxDestino.getSelectedItem().toString().equals("SAN SALVADOR-EL SALVADOR"))
        {
            lblPrecio.setText("$489.00");
        }
    }//GEN-LAST:event_cbxDestinoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmCompraBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCompraBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCompraBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCompraBoletos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCompraBoletos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxDestino;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JSpinner spnNumero;
    // End of variables declaration//GEN-END:variables
}
