/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Conexion;
import Clases_data.Producto_data;
import Clases_data.Provedor_data;
import javax.swing.JOptionPane;
import pnls.AddsMenu.detalleProducto;
import pnls.Productos1;

/**
 *
 * @author Alex
 */
public class nuevoStock extends javax.swing.JDialog {

    /**
     * Creates new form nuevoStock
     */
    public nuevoStock(java.awt.Frame parent, boolean modal) {
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

        jPanel1 = new javax.swing.JPanel();
        jlNuevoStock = new javax.swing.JLabel();
        jbCerrar = new javax.swing.JButton();
        jbConfirmar = new newscomponents.RSButtonFlat_new();
        jcbTipo = new RSMaterialComponent.RSComboBoxMaterial();
        jtCantidad = new RSMaterialComponent.RSTextFieldMaterial();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(370, 260));

        jlNuevoStock.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 24)); // NOI18N
        jlNuevoStock.setText("Nuevo Stock");

        jbCerrar.setBackground(new java.awt.Color(255, 51, 102));
        jbCerrar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/CerrarC.png"))); // NOI18N
        jbCerrar.setToolTipText("");
        jbCerrar.setAutoscrolls(true);
        jbCerrar.setBorder(null);
        jbCerrar.setBorderPainted(false);
        jbCerrar.setContentAreaFilled(false);
        jbCerrar.setMaximumSize(new java.awt.Dimension(40, 25));
        jbCerrar.setMinimumSize(new java.awt.Dimension(40, 25));
        jbCerrar.setPreferredSize(new java.awt.Dimension(35, 25));
        jbCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/CloD.png"))); // NOI18N
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        jbConfirmar.setBackground(new java.awt.Color(224, 30, 90));
        jbConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/confirmar.png"))); // NOI18N
        jbConfirmar.setText("Confirmar");
        jbConfirmar.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jbConfirmar.setPreferredSize(new java.awt.Dimension(200, 35));
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ingreso", "Egreso" }));
        jcbTipo.setColorMaterial(new java.awt.Color(224, 30, 90));
        jcbTipo.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jcbTipo.setPreferredSize(new java.awt.Dimension(300, 30));
        jcbTipo.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        jcbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoActionPerformed(evt);
            }
        });

        jtCantidad.setForeground(new java.awt.Color(0, 0, 0));
        jtCantidad.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtCantidad.setColorMaterial(new java.awt.Color(224, 30, 90));
        jtCantidad.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jtCantidad.setPhColor(new java.awt.Color(0, 0, 0));
        jtCantidad.setPlaceholder("Cantidad");
        jtCantidad.setPreferredSize(new java.awt.Dimension(300, 30));
        jtCantidad.setSelectionColor(new java.awt.Color(224, 30, 90));
        jtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCantidadActionPerformed(evt);
            }
        });
        jtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCantidadKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jcbTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jlNuevoStock))
                        .addContainerGap(33, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jlNuevoStock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        Inicio.jlFondo.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        int cantidad_base = Integer.parseInt(detalleProducto.jtCantidad.getText());
        int indice = jcbTipo.getSelectedIndex();
        int cantidad = Integer.parseInt(jtCantidad.getText());
        if("Ingreso +".equals(jcbTipo.getItemAt(indice))){
            cantidad = cantidad_base + cantidad;
        } else {
            cantidad = cantidad_base - cantidad;
        }
        if(jtCantidad.getText().length() > 0 && cantidad >= 0){
            int msj = JOptionPane.showConfirmDialog(null,"¿Estas seguro de querer cambiar el stock?");
            if(JOptionPane.YES_OPTION == msj){

                detalleProducto.jtCantidad.setText(Integer.toString(cantidad));
                try{
                    Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
                    Producto_data cd = new Producto_data(con);
                    Provedor_data pd = new Provedor_data(con);

                    int id_producto = cd.getProducto_por_nombre(Productos1.nombre).getId();
                    cd.actualizarStock_por_id_producto(cantidad, id_producto);

                    JOptionPane.showMessageDialog(null, "Se actualizo con exito el Stock de " + Productos1.nombre);
                    this.dispose();
                    Inicio.jlFondo.setVisible(false);

                    this.setVisible(false);

                } catch (Exception e){
                    JOptionPane.showMessageDialog(null, "No se pudo actualizar el stock, quedaron campos sin rellenar");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Hubo un fallo, no se relleno el campo o selecciono una cantidad que no tiene");
        }
    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jcbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoActionPerformed

    private void jtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCantidadActionPerformed

    private void jtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCantidadKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9'){
            evt.consume();
        }
    }//GEN-LAST:event_jtCantidadKeyTyped

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
            java.util.logging.Logger.getLogger(nuevoStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevoStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevoStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevoStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                nuevoStock dialog = new nuevoStock(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCerrar;
    private newscomponents.RSButtonFlat_new jbConfirmar;
    private RSMaterialComponent.RSComboBoxMaterial jcbTipo;
    private javax.swing.JLabel jlNuevoStock;
    private RSMaterialComponent.RSTextFieldMaterial jtCantidad;
    // End of variables declaration//GEN-END:variables
}
