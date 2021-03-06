/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pnls;

import Clases.Conexion;
import Clases_data.Base_de_datos;
import Interfaz.Inicio;
import Interfaz.nuevaVenta;
import Interfaz.nuevoGasto;
import javax.swing.JDialog;

/**
 *
 * @author Alex
 */
public class Home extends javax.swing.JPanel {

    /**
     * Creates new form Inicio
     */
    public Home() {
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

        jLabel1 = new javax.swing.JLabel();
        Titulo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbNueva_Venta = new rsbuttoncustom.RSButtonCustom();
        jbNuevo_gasto = new rsbuttoncustom.RSButtonCustom();

        setPreferredSize(new java.awt.Dimension(1466, 839));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.backgrounds/HomeBack.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(1415, 665));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setPreferredSize(new java.awt.Dimension(1466, 120));

        jLabel5.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 50)); // NOI18N
        jLabel5.setText("Mi Negocio");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Title/HomeR.png"))); // NOI18N
        jLabel6.setText("Imagen");
        jLabel6.setPreferredSize(new java.awt.Dimension(50, 50));

        jbNueva_Venta.setBackground(new java.awt.Color(14, 21, 30));
        jbNueva_Venta.setForeground(new java.awt.Color(255, 255, 255));
        jbNueva_Venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/add.png"))); // NOI18N
        jbNueva_Venta.setText("Nueva Venta");
        jbNueva_Venta.setColorMaterial(new java.awt.Color(224, 30, 90));
        jbNueva_Venta.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 16)); // NOI18N
        jbNueva_Venta.setIconTextGap(3);
        jbNueva_Venta.setPreferredSize(new java.awt.Dimension(150, 35));
        jbNueva_Venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNueva_VentaActionPerformed(evt);
            }
        });

        jbNuevo_gasto.setBackground(new java.awt.Color(14, 21, 30));
        jbNuevo_gasto.setForeground(new java.awt.Color(255, 255, 255));
        jbNuevo_gasto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/add.png"))); // NOI18N
        jbNuevo_gasto.setText("Nuevo Gasto");
        jbNuevo_gasto.setColorMaterial(new java.awt.Color(46, 182, 125));
        jbNuevo_gasto.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 16)); // NOI18N
        jbNuevo_gasto.setIconTextGap(3);
        jbNuevo_gasto.setPreferredSize(new java.awt.Dimension(150, 35));
        jbNuevo_gasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevo_gastoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 686, Short.MAX_VALUE)
                .addComponent(jbNuevo_gasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbNueva_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TituloLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TituloLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbNueva_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbNuevo_gasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jbNueva_VentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNueva_VentaActionPerformed
        Inicio.jlFondo.setVisible(true);
        JDialog a = new nuevaVenta(null,true);
        a.setVisible(true);     
    }//GEN-LAST:event_jbNueva_VentaActionPerformed

    private void jbNuevo_gastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevo_gastoActionPerformed
        Inicio.jlFondo.setVisible(true);
        JDialog a = new nuevoGasto(null,true);
        a.setVisible(true); 
    }//GEN-LAST:event_jbNuevo_gastoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private rsbuttoncustom.RSButtonCustom jbNueva_Venta;
    private rsbuttoncustom.RSButtonCustom jbNuevo_gasto;
    // End of variables declaration//GEN-END:variables
}
