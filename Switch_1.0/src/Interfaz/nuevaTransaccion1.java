/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import Clases.Conexion;
import Clases.Cuenta_corriente;
import Clases_data.Cliente_data;
import Clases_data.Cuenta_corriente_data;
import javax.swing.JOptionPane;
import pnls.Clientes1;

/**
 *
 * @author Alex
 */
public class nuevaTransaccion1 extends javax.swing.JDialog {

    /**
     * Creates new form nuevaTransaccion1
     */
    public nuevaTransaccion1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel3 = new javax.swing.JPanel();
        jlNuevaTransaccion2 = new javax.swing.JLabel();
        jbCerrar2 = new javax.swing.JButton();
        jbConfirmar2 = new newscomponents.RSButtonFlat_new();
        jcbCobro2 = new RSMaterialComponent.RSComboBoxMaterial();
        jtMonto = new RSMaterialComponent.RSTextFieldMaterial();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(370, 260));

        jlNuevaTransaccion2.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 24)); // NOI18N
        jlNuevaTransaccion2.setText("Nueva Transacción");

        jbCerrar2.setBackground(new java.awt.Color(255, 51, 102));
        jbCerrar2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbCerrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/CerrarC.png"))); // NOI18N
        jbCerrar2.setToolTipText("");
        jbCerrar2.setAutoscrolls(true);
        jbCerrar2.setBorder(null);
        jbCerrar2.setBorderPainted(false);
        jbCerrar2.setContentAreaFilled(false);
        jbCerrar2.setMaximumSize(new java.awt.Dimension(40, 25));
        jbCerrar2.setMinimumSize(new java.awt.Dimension(40, 25));
        jbCerrar2.setPreferredSize(new java.awt.Dimension(35, 25));
        jbCerrar2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/CloD.png"))); // NOI18N
        jbCerrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrar2jbCerrarActionPerformed(evt);
            }
        });

        jbConfirmar2.setBackground(new java.awt.Color(54, 197, 240));
        jbConfirmar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/confirmar.png"))); // NOI18N
        jbConfirmar2.setText("Confirmar");
        jbConfirmar2.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jbConfirmar2.setPreferredSize(new java.awt.Dimension(200, 35));
        jbConfirmar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmar2jbConfirmarActionPerformed(evt);
            }
        });

        jcbCobro2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cobro" }));
        jcbCobro2.setColorMaterial(new java.awt.Color(54, 197, 240));
        jcbCobro2.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jcbCobro2.setPreferredSize(new java.awt.Dimension(180, 30));
        jcbCobro2.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        jcbCobro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCobro2jcbCobroActionPerformed(evt);
            }
        });

        jtMonto.setForeground(new java.awt.Color(0, 0, 0));
        jtMonto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtMonto.setColorMaterial(new java.awt.Color(54, 197, 240));
        jtMonto.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jtMonto.setPhColor(new java.awt.Color(0, 0, 0));
        jtMonto.setPlaceholder("Monto");
        jtMonto.setPreferredSize(new java.awt.Dimension(300, 30));
        jtMonto.setSelectionColor(new java.awt.Color(54, 197, 240));
        jtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMontojtMontoActionPerformed(evt);
            }
        });
        jtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMontojtMontoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbCerrar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jcbCobro2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                                        .addComponent(jbConfirmar2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jlNuevaTransaccion2))
                        .addContainerGap(38, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jbCerrar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jlNuevaTransaccion2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jcbCobro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbConfirmar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCerrar2jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrar2jbCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCerrar2jbCerrarActionPerformed

    private void jbConfirmar2jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmar2jbConfirmarActionPerformed
Double monto = Double.parseDouble(jtMonto.getText());
        if(jtMonto.getText().length() > 0){
            int msj = JOptionPane.showConfirmDialog(null,"¿Estas seguro de querer cambiar la cuenta corriente?");
            if(JOptionPane.YES_OPTION == msj){
                try{
                    Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
                    Cliente_data cd = new Cliente_data(con);
                    Cuenta_corriente_data ccd = new Cuenta_corriente_data(con);

                    int id_cliente = cd.getCliente_por_nombre(Clientes1.nombre).getId();

                    Cuenta_corriente cuenta_nueva = ccd.getCuenta_corriente_por_cliente(id_cliente);
                    cuenta_nueva.setMonto(monto + cuenta_nueva.getMonto());
                    ccd.actualizarCuenta_corriente(cuenta_nueva);

                    JOptionPane.showMessageDialog(null, "Se actualizo con exito la cuenta corriente de " + Clientes1.nombre);
                    this.dispose();
                    Inicio.jlFondo.setVisible(false);

                    this.setVisible(false);

                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar la cuenta corriente, quedaron campos sin rellenar ");
                }
            }
        }
    }//GEN-LAST:event_jbConfirmar2jbConfirmarActionPerformed

    private void jcbCobro2jcbCobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCobro2jcbCobroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCobro2jcbCobroActionPerformed

    private void jtMontojtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMontojtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMontojtMontoActionPerformed

    private void jtMontojtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMontojtMontoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9'){
            evt.consume();
        }
    }//GEN-LAST:event_jtMontojtMontoKeyTyped

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
            java.util.logging.Logger.getLogger(nuevaTransaccion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevaTransaccion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevaTransaccion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevaTransaccion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                nuevaTransaccion1 dialog = new nuevaTransaccion1(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbCerrar2;
    private newscomponents.RSButtonFlat_new jbConfirmar2;
    private RSMaterialComponent.RSComboBoxMaterial jcbCobro2;
    private javax.swing.JLabel jlNuevaTransaccion2;
    private RSMaterialComponent.RSTextFieldMaterial jtMonto;
    // End of variables declaration//GEN-END:variables
}
