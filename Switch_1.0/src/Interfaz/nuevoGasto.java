/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author Alex
 */
public class nuevoGasto extends javax.swing.JDialog {

    /**
     * Creates new form nuevoGasto
     */
    public nuevoGasto(java.awt.Frame parent, boolean modal) {
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

        menuGasto = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jspComentario = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jcbCategoria = new javax.swing.JComboBox<>();
        jcbProvedor = new javax.swing.JComboBox<>();
        jtTotal = new javax.swing.JTextField();
        jlPesos = new javax.swing.JLabel();
        jlPorcentaje = new javax.swing.JLabel();
        jtDescuento = new javax.swing.JTextField();
        jlDescuento = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();
        jlMetodo = new javax.swing.JLabel();
        jcbMetodo = new javax.swing.JComboBox<>();
        jlCategoria = new javax.swing.JLabel();
        jlProvedor = new javax.swing.JLabel();
        jlComentario = new javax.swing.JLabel();
        listaProductos = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jlProductos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuGasto.setBackground(new java.awt.Color(255, 255, 255));
        menuGasto.setPreferredSize(new java.awt.Dimension(500, 700));
        menuGasto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(46, 182, 125));
        jButton1.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Confirmar");
        jButton1.setBorderPainted(false);
        jButton1.setPreferredSize(new java.awt.Dimension(200, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        menuGasto.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 640, -1, -1));

        jLabel2.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 24)); // NOI18N
        jLabel2.setText("Nuevo Gasto");
        menuGasto.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 19, 165, -1));

        jScrollPane1.setBorder(null);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(270, 500));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(270, 300));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(270, 300));
        menuGasto.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 271, 450, 321));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jTextArea1.setMinimumSize(new java.awt.Dimension(450, 50));
        jTextArea1.setPreferredSize(new java.awt.Dimension(450, 50));
        jspComentario.setViewportView(jTextArea1);

        menuGasto.add(jspComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 194, 450, 66));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Usar en arqueo");
        jCheckBox1.setBorder(null);
        jCheckBox1.setEnabled(false);
        jCheckBox1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jCheckBox1.setIconTextGap(10);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        menuGasto.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 141, -1, -1));

        jcbCategoria.setPreferredSize(new java.awt.Dimension(220, 27));
        menuGasto.add(jcbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 71, -1, 31));

        jcbProvedor.setEnabled(false);
        menuGasto.add(jcbProvedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 134, 220, 31));

        jtTotal.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtTotal.setText("0000,00");
        jtTotal.setPreferredSize(new java.awt.Dimension(80, 25));
        jtTotal.setSelectionColor(new java.awt.Color(224, 30, 90));
        jtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTotalActionPerformed(evt);
            }
        });
        menuGasto.add(jtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 603, -1, -1));

        jlPesos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlPesos.setText("$");
        menuGasto.add(jlPesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 608, -1, -1));

        jlPorcentaje.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jlPorcentaje.setText("%");
        menuGasto.add(jlPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 603, -1, 25));

        jtDescuento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtDescuento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtDescuento.setText("0");
        jtDescuento.setPreferredSize(new java.awt.Dimension(50, 25));
        jtDescuento.setSelectionColor(new java.awt.Color(224, 30, 90));
        jtDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDescuentoActionPerformed(evt);
            }
        });
        menuGasto.add(jtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 604, -1, -1));

        jlDescuento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlDescuento.setText("Descuento:");
        menuGasto.add(jlDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 609, 73, -1));

        jlTotal.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        jlTotal.setText("Importe:");
        menuGasto.add(jlTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 603, 94, -1));

        jlMetodo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlMetodo.setText("Metodo de Pago");
        menuGasto.add(jlMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 50, 98, -1));

        jcbMetodo.setEnabled(false);
        jcbMetodo.setPreferredSize(new java.awt.Dimension(29, 27));
        menuGasto.add(jcbMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 71, 212, 31));

        jlCategoria.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlCategoria.setText("Seleccionar Categoria");
        menuGasto.add(jlCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 50, 128, -1));

        jlProvedor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlProvedor.setText("Seleccionar Provedor");
        menuGasto.add(jlProvedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 113, 128, -1));

        jlComentario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlComentario.setText("Comentario");
        menuGasto.add(jlComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 176, 128, -1));

        getContentPane().add(menuGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        listaProductos.setBackground(new java.awt.Color(255, 255, 255));
        listaProductos.setPreferredSize(new java.awt.Dimension(696, 700));
        listaProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(255, 51, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/CerrarC.png"))); // NOI18N
        jButton3.setToolTipText("");
        jButton3.setAutoscrolls(true);
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setMaximumSize(new java.awt.Dimension(40, 25));
        jButton3.setMinimumSize(new java.awt.Dimension(40, 25));
        jButton3.setPreferredSize(new java.awt.Dimension(35, 25));
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/CloD.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        listaProductos.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 0, -1, -1));

        jlProductos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlProductos.setText("Seleccionar Productos");
        listaProductos.add(jlProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 130, -1));

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Costo", "Precio", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProductos.setPreferredSize(new java.awt.Dimension(365, 625));
        jtProductos.setRowHeight(25);
        jtProductos.setShowGrid(true);
        jtProductos.setShowVerticalLines(false);
        jtProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtProductos);

        listaProductos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 670, 570));

        jTextField1.setEnabled(false);
        jTextField1.setPreferredSize(new java.awt.Dimension(260, 31));
        listaProductos.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        getContentPane().add(listaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Inicio.jlFondo.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTotalActionPerformed

    private void jtDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDescuentoActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jtProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosMouseClicked
        
    }//GEN-LAST:event_jtProductosMouseClicked

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
            java.util.logging.Logger.getLogger(nuevoGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevoGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevoGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevoGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                nuevoGasto dialog = new nuevoGasto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JComboBox<String> jcbMetodo;
    private javax.swing.JComboBox<String> jcbProvedor;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlComentario;
    private javax.swing.JLabel jlDescuento;
    private javax.swing.JLabel jlMetodo;
    private javax.swing.JLabel jlPesos;
    private javax.swing.JLabel jlPorcentaje;
    private javax.swing.JLabel jlProductos;
    private javax.swing.JLabel jlProvedor;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JScrollPane jspComentario;
    private javax.swing.JTextField jtDescuento;
    private javax.swing.JTable jtProductos;
    private javax.swing.JTextField jtTotal;
    private javax.swing.JPanel listaProductos;
    private javax.swing.JPanel menuGasto;
    // End of variables declaration//GEN-END:variables
}