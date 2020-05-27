/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pnls;

import Clases.*;
import Clases_data.*;
import Interfaz.Inicio;
import Interfaz.nuevoGasto;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import pnls.AddsMenu.detalleGasto;
import pnls.AddsMenu.nuevaCatGasto;

/**
 *
 * @author Alex
 */
public class Gastos1 extends javax.swing.JPanel {

    /**
     * Creates new form Gastos
     */
    public Gastos1() {
        initComponents();
        
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Gasto_data gasto_data = new Gasto_data(con);
            List<Gasto> lista_gasto = gasto_data.obtenerGastos();
            
            mostrarLista(lista_gasto);
            jlTituloDesde.setVisible(false);
            dtDesde.setVisible(false);
            jlTituloHasta.setVisible(false);
            dtHasta.setVisible(false);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la tabla " + e.getMessage());
        }
    }
    
    public void mostrarLista(List<Gasto> lista){
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            
            Provedor_data provedor_data = new Provedor_data(con);
            Metodo_de_pago_data metodo_de_pago_data = new Metodo_de_pago_data(con);
            Categoria_data categoria_data = new Categoria_data(con);
            
            String matris[][] = new String[lista.size()][6];
            
            for (int i = 0; i < lista.size(); i++){
                matris[i][0] = categoria_data.getCategoria_por_id(lista.get(i).getId_categoria()).getNombre();
                matris[i][1] = provedor_data.getProvedor_por_id(lista.get(i).getId_provedor()).getNombre();
                matris[i][2] = lista.get(i).getFecha_y_hora().toString();
                matris[i][3] = metodo_de_pago_data.getMetodo_de_pago_por_id(lista.get(i).getId_metodo_de_pago()).getNombre();
                matris[i][4] = Double.toString(lista.get(i).getMonto());
                matris[i][5] = Integer.toString(lista.get(i).getId_detalle());
            }
            
            jtGastos.setModel(new javax.swing.table.DefaultTableModel(
            matris,
            new String [] {
                "Categoria", "Provedor", "Fecha", "Metodo de pago", "Importe", "Detalle"
            }
        ) {
        });
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error inesperado en la lista, vuelve a intentarlo" + e);
        
        }
    }
    
    public static String categoria, provedor, fecha, metodo_de_pago, importe, detalle;
    public static Gasto gasto_pasado;
    public static Producto producto_pasado;
    public static String producto;

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
        jbNuevo_gasto = new rsbuttoncustom.RSButtonCustom();
        jbNueva_categoria = new rsbuttoncustom.RSButtonCustom();
        addMenu = new javax.swing.JPanel();
        jlBackground = new javax.swing.JLabel();
        Registro = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtGastos = new RSMaterialComponent.RSTableMetroCustom();
        jPanel1 = new javax.swing.JPanel();
        dtHasta = new newscomponents.RSDateChooserModern();
        jcb = new RSMaterialComponent.RSComboBoxMaterial();
        jcb1 = new RSMaterialComponent.RSComboBoxMaterial();
        dtDesde = new newscomponents.RSDateChooserModern();
        jlTituloHasta = new javax.swing.JLabel();
        jlTituloDesde = new javax.swing.JLabel();
        jbActualizar = new newscomponents.RSButtonFlat_new();

        setPreferredSize(new java.awt.Dimension(1466, 839));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setPreferredSize(new java.awt.Dimension(1466, 120));

        jLabel5.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 50)); // NOI18N
        jLabel5.setText("Gastos");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Title/GastosR.png"))); // NOI18N

        jbNuevo_gasto.setBackground(new java.awt.Color(14, 21, 30));
        jbNuevo_gasto.setForeground(new java.awt.Color(255, 255, 255));
        jbNuevo_gasto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/add.png"))); // NOI18N
        jbNuevo_gasto.setText("Nuevo gasto");
        jbNuevo_gasto.setColorMaterial(new java.awt.Color(46, 182, 125));
        jbNuevo_gasto.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 16)); // NOI18N
        jbNuevo_gasto.setPreferredSize(new java.awt.Dimension(150, 35));
        jbNuevo_gasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevo_gastoActionPerformed(evt);
            }
        });

        jbNueva_categoria.setBackground(new java.awt.Color(14, 21, 30));
        jbNueva_categoria.setForeground(new java.awt.Color(255, 255, 255));
        jbNueva_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/NuevaCategoria.png"))); // NOI18N
        jbNueva_categoria.setText("Nueva Categoria");
        jbNueva_categoria.setColorMaterial(new java.awt.Color(46, 182, 125));
        jbNueva_categoria.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 16)); // NOI18N
        jbNueva_categoria.setPreferredSize(new java.awt.Dimension(180, 35));
        jbNueva_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNueva_categoriaActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 656, Short.MAX_VALUE)
                .addComponent(jbNuevo_gasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbNueva_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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
                            .addComponent(jbNuevo_gasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbNueva_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        addMenu.setBackground(new java.awt.Color(46, 182, 125));
        addMenu.setPreferredSize(new java.awt.Dimension(300, 680));
        addMenu.setLayout(new javax.swing.BoxLayout(addMenu, javax.swing.BoxLayout.LINE_AXIS));

        jlBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.backgrounds/Gastos.png"))); // NOI18N
        jlBackground.setPreferredSize(new java.awt.Dimension(300, 680));
        addMenu.add(jlBackground);

        add(addMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1146, 140, -1, -1));

        Registro.setBackground(new java.awt.Color(255, 255, 255));
        Registro.setPreferredSize(new java.awt.Dimension(1096, 680));
        Registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(1096, 650));

        jtGastos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Categoria", "Proveedor", "Fecha", "Metodo de pago", "Importe", "Detalle"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtGastos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        jtGastos.setBackgoundHead(new java.awt.Color(255, 255, 255));
        jtGastos.setBorderRows(null);
        jtGastos.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        jtGastos.setColorSecondary(new java.awt.Color(255, 255, 255));
        jtGastos.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        jtGastos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtGastos.setFontHead(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jtGastos.setFontRowHover(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtGastos.setFontRowSelect(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtGastos.setForegroundHead(new java.awt.Color(0, 0, 0));
        jtGastos.setForegroundHover(new java.awt.Color(0, 0, 0));
        jtGastos.setGridColor(new java.awt.Color(214, 214, 214));
        jtGastos.setHighHead(25);
        jtGastos.setPreferredSize(new java.awt.Dimension(1096, 671));
        jtGastos.setRowHeight(40);
        jtGastos.setSelectionBackground(new java.awt.Color(46, 182, 125));
        jtGastos.setShowGrid(false);
        jtGastos.setShowHorizontalLines(true);
        jtGastos.getTableHeader().setResizingAllowed(false);
        jtGastos.getTableHeader().setReorderingAllowed(false);
        jtGastos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtGastosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtGastos);

        Registro.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(14, 21, 30));
        jPanel1.setPreferredSize(new java.awt.Dimension(1095, 30));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dtHasta.setBackground(new java.awt.Color(14, 21, 30));
        dtHasta.setEnabled(false);
        dtHasta.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        dtHasta.setFormatDate("dd/MM/yyyy");
        dtHasta.setMaximumSize(new java.awt.Dimension(140, 30));
        dtHasta.setMinimumSize(new java.awt.Dimension(140, 30));
        dtHasta.setPreferredSize(new java.awt.Dimension(140, 30));
        jPanel1.add(dtHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, -1, -1));

        jcb.setBackground(new java.awt.Color(14, 21, 30));
        jcb.setForeground(new java.awt.Color(255, 255, 255));
        jcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Filtrar por Provedor" }));
        jcb.setColorMaterial(new java.awt.Color(46, 182, 125));
        jcb.setEnabled(false);
        jcb.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jcb.setPreferredSize(new java.awt.Dimension(200, 30));
        jcb.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        jPanel1.add(jcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        jcb1.setBackground(new java.awt.Color(14, 21, 30));
        jcb1.setForeground(new java.awt.Color(255, 255, 255));
        jcb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Filtrar por Categoria" }));
        jcb1.setColorMaterial(new java.awt.Color(46, 182, 125));
        jcb1.setEnabled(false);
        jcb1.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jcb1.setPreferredSize(new java.awt.Dimension(200, 30));
        jcb1.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        jPanel1.add(jcb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        dtDesde.setBackground(new java.awt.Color(14, 21, 30));
        dtDesde.setToolTipText("");
        dtDesde.setDate(new java.util.Date(1577847600000L));
        dtDesde.setEnabled(false);
        dtDesde.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        dtDesde.setFormatDate("dd/MM/yyyy");
        dtDesde.setMaximumSize(new java.awt.Dimension(140, 30));
        dtDesde.setMinimumSize(new java.awt.Dimension(140, 30));
        dtDesde.setPreferredSize(new java.awt.Dimension(140, 30));
        jPanel1.add(dtDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, -1, -1));

        jlTituloHasta.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jlTituloHasta.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloHasta.setText("Hasta:");
        jPanel1.add(jlTituloHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 50, 30));

        jlTituloDesde.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jlTituloDesde.setForeground(new java.awt.Color(255, 255, 255));
        jlTituloDesde.setText("Desde:");
        jPanel1.add(jlTituloDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 50, 30));

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

    private void jbNuevo_gastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevo_gastoActionPerformed
        Inicio.jlFondo.setVisible(true);
        JDialog a = new nuevoGasto(null,true);
        a.setVisible(true);// TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jbNuevo_gastoActionPerformed

    private void jbNueva_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNueva_categoriaActionPerformed
        new CambiaPanel(this.addMenu, new nuevaCatGasto());
    }//GEN-LAST:event_jbNueva_categoriaActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Gasto_data gasto_data = new Gasto_data(con);
            List<Gasto> lista_gasto = gasto_data.obtenerGastos();
            
            mostrarLista(lista_gasto);
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la tabla " + e.getMessage());
        }
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jtGastosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtGastosMouseClicked
        int fila = this.jtGastos.getSelectedRow();

        categoria = jtGastos.getValueAt(fila, 0).toString();
        provedor = jtGastos.getValueAt(fila, 1).toString();
        fecha = jtGastos.getValueAt(fila, 2).toString();
        metodo_de_pago = jtGastos.getValueAt(fila, 3).toString();
        importe = jtGastos.getValueAt(fila, 4).toString();
        detalle = jtGastos.getValueAt(fila, 5).toString();
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Gasto_data gasto_data = new Gasto_data(con);
            Detalle_de_venta_data detalle_de_venta_data = new Detalle_de_venta_data(con);
            Producto_data producto_data = new Producto_data(con);

            gasto_pasado = gasto_data.getGasto_por_detalle(Integer.parseInt(detalle));
            Detalle_de_venta detalle_pasado = detalle_de_venta_data.getDetalle_de_venta_por_id(Integer.parseInt(detalle));
            try{
                producto_pasado = producto_data.getProducto_por_id(detalle_pasado.getId_producto());
            }catch(Exception e){
                producto = "No existe este producto";
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "El produco o la categoria no existen");
        }
        new CambiaPanel(this.addMenu, new detalleGasto());
    }//GEN-LAST:event_jtGastosMouseClicked


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
    private rsbuttoncustom.RSButtonCustom jbNueva_categoria;
    private rsbuttoncustom.RSButtonCustom jbNuevo_gasto;
    private RSMaterialComponent.RSComboBoxMaterial jcb;
    private RSMaterialComponent.RSComboBoxMaterial jcb1;
    public static javax.swing.JLabel jlBackground;
    private javax.swing.JLabel jlTituloDesde;
    private javax.swing.JLabel jlTituloHasta;
    private RSMaterialComponent.RSTableMetroCustom jtGastos;
    // End of variables declaration//GEN-END:variables
}
