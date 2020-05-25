/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Toolkit;
import pnls.*;
import pnls.list.row;


/**
 *
 * @author Alex
 */
import pnls.Home;
import java.awt.event.ActionEvent;import javax.swing.JPanel;
/**
 * 
 *
 * @author Alex
 */
public class Inicio extends javax.swing.JFrame{

    /**
     * Creates new form NewJFrame
     */
    
        static int a = 10;
    
    public Inicio() {
        initComponents();
        
        Toolkit t = Toolkit.getDefaultToolkit();
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setBounds(0,0,ancho,alto);
        new CambiaPanel(this.panelBase, new Home());
        this.jlFondo.setVisible(false);
        
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlFondo = new javax.swing.JLabel();
        verticalMenu = new javax.swing.JPanel();
        jbVentas = new javax.swing.JButton();
        jbInicio = new javax.swing.JButton();
        jbGastos = new javax.swing.JButton();
        jbClientes = new javax.swing.JButton();
        jbProductos = new javax.swing.JButton();
        jbProvedores = new javax.swing.JButton();
        jbOpciones = new javax.swing.JButton();
        panelBase = new javax.swing.JPanel();
        ventana = new javax.swing.JPanel();
        jbCerrar1 = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();
        jbCerrar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlFondo.setBackground(new java.awt.Color(51, 51, 51, 100));
        jlFondo.setForeground(new java.awt.Color(51, 51, 51,100));
        jlFondo.setOpaque(true);
        getContentPane().add(jlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 870));

        verticalMenu.setBackground(new java.awt.Color(14, 21, 30));
        verticalMenu.setMaximumSize(new java.awt.Dimension(70, 720));
        verticalMenu.setMinimumSize(new java.awt.Dimension(70, 720));
        verticalMenu.setPreferredSize(new java.awt.Dimension(70, 864));

        jbVentas.setBackground(new java.awt.Color(14, 21, 30));
        jbVentas.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        jbVentas.setForeground(new java.awt.Color(255, 255, 255));
        jbVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/VentasA.png"))); // NOI18N
        jbVentas.setBorderPainted(false);
        jbVentas.setMaximumSize(new java.awt.Dimension(70, 70));
        jbVentas.setMinimumSize(new java.awt.Dimension(70, 70));
        jbVentas.setPreferredSize(new java.awt.Dimension(70, 70));
        jbVentas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/VentaB.png"))); // NOI18N
        jbVentas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/VentaB.png"))); // NOI18N
        jbVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVentasActionPerformed(evt);
            }
        });

        jbInicio.setBackground(new java.awt.Color(255, 255, 255));
        jbInicio.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        jbInicio.setForeground(new java.awt.Color(255, 255, 255));
        jbInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/HomeA.png"))); // NOI18N
        jbInicio.setToolTipText("");
        jbInicio.setBorderPainted(false);
        jbInicio.setContentAreaFilled(false);
        jbInicio.setMaximumSize(new java.awt.Dimension(70, 70));
        jbInicio.setMinimumSize(new java.awt.Dimension(70, 70));
        jbInicio.setPreferredSize(new java.awt.Dimension(70, 70));
        jbInicio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/HomeB.png"))); // NOI18N
        jbInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/HomeB.png"))); // NOI18N
        jbInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInicioActionPerformed(evt);
            }
        });

        jbGastos.setBackground(new java.awt.Color(14, 21, 30));
        jbGastos.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        jbGastos.setForeground(new java.awt.Color(255, 255, 255));
        jbGastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/GastosA.png"))); // NOI18N
        jbGastos.setBorderPainted(false);
        jbGastos.setIconTextGap(0);
        jbGastos.setMaximumSize(new java.awt.Dimension(70, 70));
        jbGastos.setMinimumSize(new java.awt.Dimension(70, 70));
        jbGastos.setPreferredSize(new java.awt.Dimension(70, 70));
        jbGastos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/GastosB.png"))); // NOI18N
        jbGastos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/GastosB.png"))); // NOI18N
        jbGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGastosActionPerformed(evt);
            }
        });

        jbClientes.setBackground(new java.awt.Color(14, 21, 30));
        jbClientes.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        jbClientes.setForeground(new java.awt.Color(255, 255, 255));
        jbClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/ClientesA.png"))); // NOI18N
        jbClientes.setBorderPainted(false);
        jbClientes.setMaximumSize(new java.awt.Dimension(70, 70));
        jbClientes.setMinimumSize(new java.awt.Dimension(70, 70));
        jbClientes.setPreferredSize(new java.awt.Dimension(70, 70));
        jbClientes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/ClientesB.png"))); // NOI18N
        jbClientes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/ClientesB.png"))); // NOI18N
        jbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClientesActionPerformed(evt);
            }
        });

        jbProductos.setBackground(new java.awt.Color(14, 21, 30));
        jbProductos.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        jbProductos.setForeground(new java.awt.Color(255, 255, 255));
        jbProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/ProductosA.png"))); // NOI18N
        jbProductos.setBorderPainted(false);
        jbProductos.setMaximumSize(new java.awt.Dimension(70, 70));
        jbProductos.setMinimumSize(new java.awt.Dimension(70, 70));
        jbProductos.setPreferredSize(new java.awt.Dimension(70, 70));
        jbProductos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/ProductosB.png"))); // NOI18N
        jbProductos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/ProductosB.png"))); // NOI18N
        jbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductosActionPerformed(evt);
            }
        });

        jbProvedores.setBackground(new java.awt.Color(14, 21, 30));
        jbProvedores.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        jbProvedores.setForeground(new java.awt.Color(255, 255, 255));
        jbProvedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/ProvedoresA.png"))); // NOI18N
        jbProvedores.setBorderPainted(false);
        jbProvedores.setMaximumSize(new java.awt.Dimension(70, 70));
        jbProvedores.setMinimumSize(new java.awt.Dimension(70, 70));
        jbProvedores.setPreferredSize(new java.awt.Dimension(70, 70));
        jbProvedores.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/ProvedoresB.png"))); // NOI18N
        jbProvedores.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/ProvedoresB.png"))); // NOI18N
        jbProvedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProvedoresActionPerformed(evt);
            }
        });

        jbOpciones.setBackground(new java.awt.Color(14, 21, 30));
        jbOpciones.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        jbOpciones.setForeground(new java.awt.Color(255, 255, 255));
        jbOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/AjustesA.png"))); // NOI18N
        jbOpciones.setBorderPainted(false);
        jbOpciones.setMaximumSize(new java.awt.Dimension(70, 70));
        jbOpciones.setMinimumSize(new java.awt.Dimension(70, 70));
        jbOpciones.setPreferredSize(new java.awt.Dimension(70, 70));
        jbOpciones.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/AjustesB.png"))); // NOI18N
        jbOpciones.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/AjustesB.png"))); // NOI18N
        jbOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOpcionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout verticalMenuLayout = new javax.swing.GroupLayout(verticalMenu);
        verticalMenu.setLayout(verticalMenuLayout);
        verticalMenuLayout.setHorizontalGroup(
            verticalMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(verticalMenuLayout.createSequentialGroup()
                .addComponent(jbGastos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jbClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbProvedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbOpciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        verticalMenuLayout.setVerticalGroup(
            verticalMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verticalMenuLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jbInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jbVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbProvedores, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(jbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(verticalMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelBase.setBackground(new java.awt.Color(153, 0, 153));
        panelBase.setMaximumSize(new java.awt.Dimension(1010, 695));
        panelBase.setMinimumSize(new java.awt.Dimension(1010, 695));
        panelBase.setPreferredSize(new java.awt.Dimension(1466, 839));
        panelBase.setLayout(new javax.swing.BoxLayout(panelBase, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(panelBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 25, -1, -1));

        ventana.setBackground(new java.awt.Color(255, 255, 255));
        ventana.setPreferredSize(new java.awt.Dimension(1466, 25));
        ventana.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbCerrar1.setBackground(new java.awt.Color(255, 255, 255));
        jbCerrar1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/MinD.png"))); // NOI18N
        jbCerrar1.setToolTipText("");
        jbCerrar1.setBorderPainted(false);
        jbCerrar1.setMaximumSize(new java.awt.Dimension(40, 25));
        jbCerrar1.setMinimumSize(new java.awt.Dimension(40, 25));
        jbCerrar1.setPreferredSize(new java.awt.Dimension(40, 25));
        jbCerrar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/MinM.png"))); // NOI18N
        jbCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrar1ActionPerformed(evt);
            }
        });
        ventana.add(jbCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1346, 0, -1, -1));

        jbCerrar.setBackground(new java.awt.Color(255, 255, 255));
        jbCerrar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/CerrarC.png"))); // NOI18N
        jbCerrar.setToolTipText("");
        jbCerrar.setBorderPainted(false);
        jbCerrar.setContentAreaFilled(false);
        jbCerrar.setMaximumSize(new java.awt.Dimension(40, 25));
        jbCerrar.setMinimumSize(new java.awt.Dimension(40, 25));
        jbCerrar.setPreferredSize(new java.awt.Dimension(40, 25));
        jbCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/CloD.png"))); // NOI18N
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });
        ventana.add(jbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1426, 0, -1, -1));

        jbCerrar2.setBackground(new java.awt.Color(239, 239, 239));
        jbCerrar2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbCerrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/MaxD.png"))); // NOI18N
        jbCerrar2.setToolTipText("");
        jbCerrar2.setBorderPainted(false);
        jbCerrar2.setMaximumSize(new java.awt.Dimension(40, 25));
        jbCerrar2.setMinimumSize(new java.awt.Dimension(40, 25));
        jbCerrar2.setPreferredSize(new java.awt.Dimension(40, 25));
        jbCerrar2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/MaxM.png"))); // NOI18N
        jbCerrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrar2ActionPerformed(evt);
            }
        });
        ventana.add(jbCerrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1386, 0, -1, -1));

        getContentPane().add(ventana, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVentasActionPerformed
        new CambiaPanel(this.panelBase, new Ventas1());
        jbVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/VentaN.png")));
        jbProvedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Provedores.png")));
        jbProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Productos.png")));
        jbGastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Gastos.png")));
        jbClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Clientes.png")));
    }//GEN-LAST:event_jbVentasActionPerformed

    private void jbInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbInicioActionPerformed

    private void jbGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGastosActionPerformed
        new CambiaPanel(this.panelBase, new Gastos1());
        jbVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Venta.png")));
        jbProvedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Provedores.png")));
        jbProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Productos.png")));
        jbGastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/GastosN.png")));
        jbClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Clientes.png")));
    }//GEN-LAST:event_jbGastosActionPerformed

    private void jbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClientesActionPerformed
        jbVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Venta.png")));
        jbProvedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Provedores.png")));
        jbProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Productos.png")));
        jbGastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Gastos.png")));
        jbClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/ClientesN.png")));
        new CambiaPanel(this.panelBase, new Clientes1());
    }//GEN-LAST:event_jbClientesActionPerformed

    private void jbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProductosActionPerformed
        new CambiaPanel(this.panelBase, new Productos1());
        jbVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Venta.png")));
        jbProvedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Provedores.png")));
        jbProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/ProductosN.png")));
        jbGastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Gastos.png")));
        jbClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Clientes.png")));
    }//GEN-LAST:event_jbProductosActionPerformed

    private void jbProvedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProvedoresActionPerformed
        new CambiaPanel(this.panelBase, new Provedores1());
        jbVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Venta.png")));
        jbProvedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/ProvedoresN.png")));
        jbProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Productos.png")));
        jbGastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Gastos.png")));
        jbClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Clientes.png")));
    }//GEN-LAST:event_jbProvedoresActionPerformed

    private void jbOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOpcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbOpcionesActionPerformed

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCerrar1ActionPerformed

    private void jbCerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCerrar2ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbCerrar1;
    private javax.swing.JButton jbCerrar2;
    private javax.swing.JButton jbClientes;
    private javax.swing.JButton jbGastos;
    private javax.swing.JButton jbInicio;
    private javax.swing.JButton jbOpciones;
    private javax.swing.JButton jbProductos;
    private javax.swing.JButton jbProvedores;
    private javax.swing.JButton jbVentas;
    public static javax.swing.JLabel jlFondo;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel ventana;
    private javax.swing.JPanel verticalMenu;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
