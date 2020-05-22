/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import pnls.*;


/**
 *
 * @author Alex
 */
import java.awt.event.ActionEvent;/**
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
        this.setExtendedState(6);
        this.setResizable(false);
        
        
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cerrar = new javax.swing.JButton();
        Escritorio = new javax.swing.JDesktopPane();
        panelBase = new javax.swing.JPanel();
        verticalMenu = new javax.swing.JPanel();
        jbVentas = new javax.swing.JButton();
        jbInicio = new javax.swing.JButton();
        jbGastos = new javax.swing.JButton();
        jbClientes = new javax.swing.JButton();
        jbProductos = new javax.swing.JButton();
        jbProvedores = new javax.swing.JButton();
        jbOpciones = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setUndecorated(true);

        Cerrar.setBackground(new java.awt.Color(255, 51, 102));
        Cerrar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Cerrar.setText("X");
        Cerrar.setToolTipText("");
        Cerrar.setBorderPainted(false);
        Cerrar.setMaximumSize(new java.awt.Dimension(40, 25));
        Cerrar.setMinimumSize(new java.awt.Dimension(40, 25));
        Cerrar.setPreferredSize(new java.awt.Dimension(40, 25));
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        panelBase.setBackground(new java.awt.Color(153, 0, 153));
        panelBase.setLayout(new javax.swing.BoxLayout(panelBase, javax.swing.BoxLayout.LINE_AXIS));

        Escritorio.setLayer(panelBase, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addComponent(panelBase, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelBase, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        verticalMenu.setBackground(new java.awt.Color(14, 21, 30));
        verticalMenu.setPreferredSize(new java.awt.Dimension(70, 489));

        jbVentas.setBackground(new java.awt.Color(14, 21, 30));
        jbVentas.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        jbVentas.setForeground(new java.awt.Color(255, 255, 255));
        jbVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Venta.png"))); // NOI18N
        jbVentas.setBorderPainted(false);
        jbVentas.setMaximumSize(new java.awt.Dimension(70, 70));
        jbVentas.setMinimumSize(new java.awt.Dimension(70, 70));
        jbVentas.setPreferredSize(new java.awt.Dimension(70, 70));
        jbVentas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/VentaN.png"))); // NOI18N
        jbVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVentasActionPerformed(evt);
            }
        });

        jbInicio.setBackground(new java.awt.Color(255, 255, 255));
        jbInicio.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        jbInicio.setForeground(new java.awt.Color(255, 255, 255));
        jbInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/HomeN.png"))); // NOI18N
        jbInicio.setToolTipText("");
        jbInicio.setBorderPainted(false);
        jbInicio.setContentAreaFilled(false);
        jbInicio.setMaximumSize(new java.awt.Dimension(70, 70));
        jbInicio.setMinimumSize(new java.awt.Dimension(70, 70));
        jbInicio.setPreferredSize(new java.awt.Dimension(70, 70));
        jbInicio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/HomeN.png"))); // NOI18N
        jbInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/HomeN.png"))); // NOI18N
        jbInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInicioActionPerformed(evt);
            }
        });

        jbGastos.setBackground(new java.awt.Color(14, 21, 30));
        jbGastos.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        jbGastos.setForeground(new java.awt.Color(255, 255, 255));
        jbGastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Gastos.png"))); // NOI18N
        jbGastos.setBorderPainted(false);
        jbGastos.setIconTextGap(0);
        jbGastos.setMaximumSize(new java.awt.Dimension(70, 70));
        jbGastos.setMinimumSize(new java.awt.Dimension(70, 70));
        jbGastos.setPreferredSize(new java.awt.Dimension(70, 70));
        jbGastos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/GastosN.png"))); // NOI18N
        jbGastos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/GastosN.png"))); // NOI18N
        jbGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGastosActionPerformed(evt);
            }
        });

        jbClientes.setBackground(new java.awt.Color(14, 21, 30));
        jbClientes.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        jbClientes.setForeground(new java.awt.Color(255, 255, 255));
        jbClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Clientes.png"))); // NOI18N
        jbClientes.setBorderPainted(false);
        jbClientes.setMaximumSize(new java.awt.Dimension(70, 70));
        jbClientes.setMinimumSize(new java.awt.Dimension(70, 70));
        jbClientes.setPreferredSize(new java.awt.Dimension(70, 70));
        jbClientes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/ClientesN.png"))); // NOI18N
        jbClientes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/ClientesN.png"))); // NOI18N
        jbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClientesActionPerformed(evt);
            }
        });

        jbProductos.setBackground(new java.awt.Color(14, 21, 30));
        jbProductos.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        jbProductos.setForeground(new java.awt.Color(255, 255, 255));
        jbProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Productos.png"))); // NOI18N
        jbProductos.setBorderPainted(false);
        jbProductos.setMaximumSize(new java.awt.Dimension(70, 70));
        jbProductos.setMinimumSize(new java.awt.Dimension(70, 70));
        jbProductos.setPreferredSize(new java.awt.Dimension(70, 70));
        jbProductos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/ProductosN.png"))); // NOI18N
        jbProductos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/ProductosN.png"))); // NOI18N
        jbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProductosActionPerformed(evt);
            }
        });

        jbProvedores.setBackground(new java.awt.Color(14, 21, 30));
        jbProvedores.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        jbProvedores.setForeground(new java.awt.Color(255, 255, 255));
        jbProvedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Provedores.png"))); // NOI18N
        jbProvedores.setBorderPainted(false);
        jbProvedores.setMaximumSize(new java.awt.Dimension(70, 70));
        jbProvedores.setMinimumSize(new java.awt.Dimension(70, 70));
        jbProvedores.setPreferredSize(new java.awt.Dimension(70, 70));
        jbProvedores.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/ProvedoresN.png"))); // NOI18N
        jbProvedores.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/ProvedoresN.png"))); // NOI18N
        jbProvedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProvedoresActionPerformed(evt);
            }
        });

        jbOpciones.setBackground(new java.awt.Color(14, 21, 30));
        jbOpciones.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        jbOpciones.setForeground(new java.awt.Color(255, 255, 255));
        jbOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Ajustes.png"))); // NOI18N
        jbOpciones.setBorderPainted(false);
        jbOpciones.setMaximumSize(new java.awt.Dimension(70, 70));
        jbOpciones.setMinimumSize(new java.awt.Dimension(70, 70));
        jbOpciones.setPreferredSize(new java.awt.Dimension(70, 70));
        jbOpciones.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/AjustesN.png"))); // NOI18N
        jbOpciones.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/AjustesN.png"))); // NOI18N
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
            .addComponent(jbGastos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jbClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbProvedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbOpciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        verticalMenuLayout.setVerticalGroup(
            verticalMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verticalMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jbInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jbVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbProvedores, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addComponent(jbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(verticalMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(840, 840, 840)
                        .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verticalMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
        new CambiaPanel(this.panelBase, new Gastos());
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
        new CambiaPanel(this.panelBase, new Clientes());
    }//GEN-LAST:event_jbClientesActionPerformed

    private void jbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProductosActionPerformed
        new CambiaPanel(this.panelBase, new Productos());
        jbVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Venta.png")));
        jbProvedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Provedores.png")));
        jbProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/ProductosN.png")));
        jbGastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Gastos.png")));
        jbClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Clientes.png")));
    }//GEN-LAST:event_jbProductosActionPerformed

    private void jbProvedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProvedoresActionPerformed
        new CambiaPanel(this.panelBase, new Provedores());
        jbVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Venta.png")));
        jbProvedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/ProvedoresN.png")));
        jbProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Productos.png")));
        jbGastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Gastos.png")));
        jbClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Bar/Clientes.png")));
    }//GEN-LAST:event_jbProvedoresActionPerformed

    private void jbOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOpcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbOpcionesActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CerrarActionPerformed

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
    private javax.swing.JButton Cerrar;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JButton jbClientes;
    private javax.swing.JButton jbGastos;
    private javax.swing.JButton jbInicio;
    private javax.swing.JButton jbOpciones;
    private javax.swing.JButton jbProductos;
    private javax.swing.JButton jbProvedores;
    private javax.swing.JButton jbVentas;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel verticalMenu;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
