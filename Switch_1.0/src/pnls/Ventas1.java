/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pnls;

import Clases.*;
import Clases_data.*;
import Interfaz.Inicio;
import Interfaz.nuevaVenta;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import pnls.AddsMenu.detalleVentas;
import pnls.AddsMenu.nuevoArqueo;

public class Ventas1 extends javax.swing.JPanel {

    /**
     * Creates new form Clientes
     */
    public Ventas1() {
        initComponents();
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Venta_data venta_data = new Venta_data(con);
            List<Venta> lista_ventas = venta_data.obtenerVentas();
            
            mostrarLista(lista_ventas);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la tabla " + e.getMessage());
        }
        jbArqueo.setVisible(false);
    }
    
    public void mostrarLista(List<Venta> lista){
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            
            Cliente_data cliente_data = new Cliente_data(con);
            Metodo_de_pago_data metodo_de_pago_data = new Metodo_de_pago_data(con);
            
            String matris[][] = new String[lista.size()][5];
            
            for (int i = 0; i < lista.size(); i++){
                matris[i][0] = cliente_data.getCliente_por_id(lista.get(i).getId_cliente()).getNombre();
                matris[i][1] = lista.get(i).getFecha_y_hora().toString();
                matris[i][2] = metodo_de_pago_data.getMetodo_de_pago_por_id(lista.get(i).getId_metodo_de_pago()).getNombre();
                matris[i][3] = Double.toString(lista.get(i).getTotal());
                matris[i][4] = Integer.toString(lista.get(i).getId_detalle());
            }
            
            jtVentas.setModel(new javax.swing.table.DefaultTableModel(
            matris,
            new String [] {
                "Cliente", "Fecha","Metodo de pago", "Importe", "Detalle"
            }
        ) {
        });
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error inesperado en la lista, vuelve a intentarlo" + e);
        
        }
    }
    public static String cliente,fecha,importe,metodo_de_pago,detalle;
    public static Venta venta_pasada;
    public static Detalle_de_venta detalle_pasado;
    public static Producto producto_pasado;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbNueva_venta = new rsbuttoncustom.RSButtonCustom();
        jbArqueo = new rsbuttoncustom.RSButtonCustom();
        addMenu = new javax.swing.JPanel();
        jlBackground = new javax.swing.JLabel();
        Registro = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtVentas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        dtHasta = new newscomponents.RSDateChooserModern();
        jlTituloHasta = new javax.swing.JLabel();
        dtDesde = new newscomponents.RSDateChooserModern();
        jlTituloDesde = new javax.swing.JLabel();
        jcbMetodo = new RSMaterialComponent.RSComboBoxMaterial();
        jcbCliente = new RSMaterialComponent.RSComboBoxMaterial();
        jbActualizar = new newscomponents.RSButtonFlat_new();

        setPreferredSize(new java.awt.Dimension(1466, 839));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setPreferredSize(new java.awt.Dimension(1466, 120));

        jLabel5.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 50)); // NOI18N
        jLabel5.setText("Ventas");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Title/VentasR.png"))); // NOI18N

        jbNueva_venta.setBackground(new java.awt.Color(14, 21, 30));
        jbNueva_venta.setForeground(new java.awt.Color(255, 255, 255));
        jbNueva_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/add.png"))); // NOI18N
        jbNueva_venta.setText("Nueva Venta");
        jbNueva_venta.setColorMaterial(new java.awt.Color(224, 30, 90));
        jbNueva_venta.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 16)); // NOI18N
        jbNueva_venta.setIconTextGap(3);
        jbNueva_venta.setPreferredSize(new java.awt.Dimension(150, 35));
        jbNueva_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNueva_ventaActionPerformed(evt);
            }
        });

        jbArqueo.setBackground(new java.awt.Color(14, 21, 30));
        jbArqueo.setForeground(new java.awt.Color(255, 255, 255));
        jbArqueo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/Arqueo.png"))); // NOI18N
        jbArqueo.setText("Arqueo");
        jbArqueo.setColorMaterial(new java.awt.Color(224, 30, 90));
        jbArqueo.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 16)); // NOI18N
        jbArqueo.setIconTextGap(3);
        jbArqueo.setPreferredSize(new java.awt.Dimension(150, 35));
        jbArqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbArqueoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 685, Short.MAX_VALUE)
                .addComponent(jbArqueo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbNueva_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jLabel6)))
                    .addGroup(TituloLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbNueva_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbArqueo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        addMenu.setBackground(new java.awt.Color(224, 30, 90));
        addMenu.setPreferredSize(new java.awt.Dimension(300, 680));
        addMenu.setLayout(new javax.swing.BoxLayout(addMenu, javax.swing.BoxLayout.LINE_AXIS));

        jlBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.backgrounds/Ventas.png"))); // NOI18N
        jlBackground.setPreferredSize(new java.awt.Dimension(300, 680));
        addMenu.add(jlBackground);

        add(addMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1146, 140, -1, -1));

        Registro.setBackground(new java.awt.Color(255, 255, 255));
        Registro.setPreferredSize(new java.awt.Dimension(1096, 680));
        Registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setPreferredSize(new java.awt.Dimension(1096, 650));

        jtVentas.setModel(new javax.swing.table.DefaultTableModel(
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
                "Cliente", "Fecha", "Importe", "Metodo de pago", "Detalle"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtVentas.setRowHeight(30);
        jtVentas.setSelectionBackground(new java.awt.Color(224, 30, 90));
        jtVentas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtVentas.setShowGrid(true);
        jtVentas.setShowVerticalLines(false);
        jtVentas.getTableHeader().setResizingAllowed(false);
        jtVentas.getTableHeader().setReorderingAllowed(false);
        jtVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtVentasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtVentas);

        Registro.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(14, 21, 30));
        jPanel1.setPreferredSize(new java.awt.Dimension(1095, 30));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dtHasta.setBackground(new java.awt.Color(14, 21, 30));
        dtHasta.setEnabled(false);
        dtHasta.setFocusable(false);
        dtHasta.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        dtHasta.setFormatDate("dd/MM/yyyy");
        dtHasta.setMaximumSize(new java.awt.Dimension(140, 30));
        dtHasta.setMinimumSize(new java.awt.Dimension(140, 30));
        dtHasta.setPreferredSize(new java.awt.Dimension(140, 30));
        jPanel1.add(dtHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, -1));

        jlTituloHasta.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jlTituloHasta.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloHasta.setText("Hasta:");
        jPanel1.add(jlTituloHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 50, 30));

        dtDesde.setBackground(new java.awt.Color(14, 21, 30));
        dtDesde.setToolTipText("");
        dtDesde.setDate(new java.util.Date(1577847600000L));
        dtDesde.setEnabled(false);
        dtDesde.setFocusable(false);
        dtDesde.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        dtDesde.setFormatDate("dd/MM/yyyy");
        dtDesde.setMaximumSize(new java.awt.Dimension(140, 30));
        dtDesde.setMinimumSize(new java.awt.Dimension(140, 30));
        dtDesde.setPreferredSize(new java.awt.Dimension(140, 30));
        jPanel1.add(dtDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, -1));

        jlTituloDesde.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jlTituloDesde.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloDesde.setText("Desde:");
        jPanel1.add(jlTituloDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 0, 50, 30));

        jcbMetodo.setBackground(new java.awt.Color(14, 21, 30));
        jcbMetodo.setForeground(new java.awt.Color(255, 255, 255));
        jcbMetodo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Filtrar por Metodo de pago" }));
        jcbMetodo.setColorMaterial(new java.awt.Color(224, 30, 90));
        jcbMetodo.setEnabled(false);
        jcbMetodo.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jcbMetodo.setPreferredSize(new java.awt.Dimension(200, 30));
        jcbMetodo.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        jPanel1.add(jcbMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 210, -1));

        jcbCliente.setBackground(new java.awt.Color(14, 21, 30));
        jcbCliente.setForeground(new java.awt.Color(255, 255, 255));
        jcbCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Filtrar por Cliente" }));
        jcbCliente.setColorMaterial(new java.awt.Color(224, 30, 90));
        jcbCliente.setEnabled(false);
        jcbCliente.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jcbCliente.setPreferredSize(new java.awt.Dimension(200, 30));
        jcbCliente.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        jPanel1.add(jcbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jbActualizar.setBackground(new java.awt.Color(14, 21, 30));
        jbActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/actualizar.png"))); // NOI18N
        jbActualizar.setText("Actualizar");
        jbActualizar.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jbActualizar.setPreferredSize(new java.awt.Dimension(120, 30));
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jbActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(974, 0, -1, -1));

        Registro.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jtVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtVentasMouseClicked
        int fila = this.jtVentas.getSelectedRow();
        
        cliente = jtVentas.getValueAt(fila, 0).toString();
        fecha = jtVentas.getValueAt(fila, 1).toString();
        metodo_de_pago = jtVentas.getValueAt(fila, 2).toString();
        importe = jtVentas.getValueAt(fila, 3).toString();
        detalle = jtVentas.getValueAt(fila, 4).toString();
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Venta_data venta_data = new Venta_data(con);
            Detalle_de_venta_data detalle_de_venta_data = new Detalle_de_venta_data(con);
            Producto_data producto_data = new Producto_data(con);
            
            venta_pasada = venta_data.getVenta_por_detalle(Integer.parseInt(detalle));
            detalle_pasado = detalle_de_venta_data.getDetalle_de_venta_por_id(Integer.parseInt(detalle));
            producto_pasado = producto_data.getProducto_por_id(detalle_pasado.getId_producto());
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la venta " + e.getMessage());
        }
        new CambiaPanel(this.addMenu, new detalleVentas());
    }//GEN-LAST:event_jtVentasMouseClicked

    private void jbNueva_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNueva_ventaActionPerformed
        Inicio.jlFondo.setVisible(true);
        JDialog a = new nuevaVenta(null,true);
        a.setVisible(true);    
    }//GEN-LAST:event_jbNueva_ventaActionPerformed

    private void jbArqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbArqueoActionPerformed
       new CambiaPanel(this.addMenu, new nuevoArqueo());
    }//GEN-LAST:event_jbArqueoActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Venta_data venta_data = new Venta_data(con);
            List<Venta> lista_ventas = venta_data.obtenerVentas();
            
            mostrarLista(lista_ventas);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la tabla " + e.getMessage());
        }
    }//GEN-LAST:event_jbActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Registro;
    private javax.swing.JPanel Titulo;
    public static javax.swing.JPanel addMenu;
    private newscomponents.RSDateChooserModern dtDesde;
    private newscomponents.RSDateChooserModern dtHasta;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private newscomponents.RSButtonFlat_new jbActualizar;
    private rsbuttoncustom.RSButtonCustom jbArqueo;
    private rsbuttoncustom.RSButtonCustom jbNueva_venta;
    private RSMaterialComponent.RSComboBoxMaterial jcbCliente;
    private RSMaterialComponent.RSComboBoxMaterial jcbMetodo;
    public static javax.swing.JLabel jlBackground;
    private javax.swing.JLabel jlTituloDesde;
    private javax.swing.JLabel jlTituloHasta;
    private javax.swing.JTable jtVentas;
    // End of variables declaration//GEN-END:variables
}
