/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pnls;

import Clases.*;
import Clases_data.*;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import pnls.AddsMenu.detalleProducto;
import pnls.AddsMenu.nuevaCatProductos;
import pnls.AddsMenu.nuevoCliente;
import pnls.AddsMenu.nuevoProducto;
public class Productos1 extends javax.swing.JPanel {

    /**
     * Creates new form Productos
     */
    public Productos1() {
        initComponents();
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Producto_data producto_data = new Producto_data(con);
            List<Producto> lista_productos = producto_data.obtenerProductos();
            
            mostrarLista(lista_productos);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la tabla, inicie el xampp ");
        }
    }
    
    public void mostrarLista(List<Producto> lista){
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            
            Categoria_producto_data categoria_producto_data = new Categoria_producto_data(con);
            
            String matris[][] = new String[lista.size()][6];
            
            for (int i = 0; i < lista.size(); i++){
                matris[i][0] = categoria_producto_data.getCategoria_producto_por_id(lista.get(i).getId_categoria()).getNombre();
                matris[i][1] = Long.toString(lista.get(i).getCodigo());
                matris[i][2] = lista.get(i).getNombre();
                matris[i][3] = Double.toString(lista.get(i).getCosto());
                matris[i][4] = Double.toString(lista.get(i).getPrecio());
                matris[i][5] = Integer.toString(lista.get(i).getCantidad());
            }
            
            jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            matris,
            new String [] {
                "Categoria","Codigo", "Nombre", "Coste", "Precio", "Stock"
            }
        ) {
        });
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error inesperado en la lista, vuelve a intentarlo");
        
        }
    }
    public static String codigo, nombre, costo, precio, cantidad, categoria;
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
        jbNuevo_producto = new rsbuttoncustom.RSButtonCustom();
        jbNuena_categoria = new rsbuttoncustom.RSButtonCustom();
        addMenu = new javax.swing.JPanel();
        jlBackground = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        registro = new javax.swing.JScrollPane();
        jtProductos = new RSMaterialComponent.RSTableMetroCustom();
        jPanel2 = new javax.swing.JPanel();
        jbActualizar1 = new newscomponents.RSButtonFlat_new();
        jcbStock = new RSMaterialComponent.RSComboBoxMaterial();
        jcbCategoria = new RSMaterialComponent.RSComboBoxMaterial();
        jcbCodigo = new RSMaterialComponent.RSComboBoxMaterial();
        jcbNombre = new RSMaterialComponent.RSComboBoxMaterial();

        setMaximumSize(new java.awt.Dimension(1466, 839));
        setMinimumSize(new java.awt.Dimension(1466, 839));
        setPreferredSize(new java.awt.Dimension(1466, 839));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setMaximumSize(new java.awt.Dimension(1800, 120));
        Titulo.setMinimumSize(new java.awt.Dimension(1400, 120));
        Titulo.setPreferredSize(new java.awt.Dimension(1466, 120));

        jLabel5.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 50)); // NOI18N
        jLabel5.setText("Productos");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Title/ProductosR.png"))); // NOI18N
        jLabel6.setText("Imagen");
        jLabel6.setPreferredSize(new java.awt.Dimension(50, 50));

        jbNuevo_producto.setBackground(new java.awt.Color(14, 21, 30));
        jbNuevo_producto.setForeground(new java.awt.Color(255, 255, 255));
        jbNuevo_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/add.png"))); // NOI18N
        jbNuevo_producto.setText("Nuevo Producto");
        jbNuevo_producto.setColorMaterial(new java.awt.Color(224, 30, 90));
        jbNuevo_producto.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 16)); // NOI18N
        jbNuevo_producto.setIconTextGap(3);
        jbNuevo_producto.setPreferredSize(new java.awt.Dimension(160, 35));
        jbNuevo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevo_productoActionPerformed(evt);
            }
        });

        jbNuena_categoria.setBackground(new java.awt.Color(14, 21, 30));
        jbNuena_categoria.setForeground(new java.awt.Color(255, 255, 255));
        jbNuena_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/NuevaCategoria.png"))); // NOI18N
        jbNuena_categoria.setText("Nueva Categoria");
        jbNuena_categoria.setColorMaterial(new java.awt.Color(224, 30, 90));
        jbNuena_categoria.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 16)); // NOI18N
        jbNuena_categoria.setIconTextGap(3);
        jbNuena_categoria.setPreferredSize(new java.awt.Dimension(170, 35));
        jbNuena_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuena_categoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 656, Short.MAX_VALUE)
                .addComponent(jbNuevo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbNuena_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jbNuevo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbNuena_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        addMenu.setBackground(new java.awt.Color(224, 30, 90));
        addMenu.setPreferredSize(new java.awt.Dimension(300, 680));
        addMenu.setLayout(new javax.swing.BoxLayout(addMenu, javax.swing.BoxLayout.LINE_AXIS));

        jlBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.backgrounds/Productos.png"))); // NOI18N
        jlBackground.setPreferredSize(new java.awt.Dimension(300, 680));
        addMenu.add(jlBackground);

        add(addMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1146, 140, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1096, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registro.setMaximumSize(new java.awt.Dimension(32767, 700));
        registro.setMinimumSize(new java.awt.Dimension(23, 700));
        registro.setPreferredSize(new java.awt.Dimension(1096, 650));

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Categoria", "Codigo", "Nombre", "Costo", "Precio", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProductos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        jtProductos.setBackgoundHead(new java.awt.Color(255, 255, 255));
        jtProductos.setBorderRows(null);
        jtProductos.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        jtProductos.setColorSecondary(new java.awt.Color(255, 255, 255));
        jtProductos.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        jtProductos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtProductos.setFontHead(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jtProductos.setFontRowHover(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtProductos.setFontRowSelect(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtProductos.setForegroundHead(new java.awt.Color(0, 0, 0));
        jtProductos.setForegroundHover(new java.awt.Color(0, 0, 0));
        jtProductos.setGridColor(new java.awt.Color(214, 214, 214));
        jtProductos.setHighHead(25);
        jtProductos.setPreferredSize(new java.awt.Dimension(1096, 671));
        jtProductos.setRowHeight(40);
        jtProductos.setSelectionBackground(new java.awt.Color(224, 30, 90));
        jtProductos.setShowGrid(false);
        jtProductos.setShowHorizontalLines(true);
        jtProductos.getTableHeader().setResizingAllowed(false);
        jtProductos.getTableHeader().setReorderingAllowed(false);
        jtProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProductosMouseClicked(evt);
            }
        });
        registro.setViewportView(jtProductos);

        jPanel1.add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(14, 21, 30));
        jPanel2.setPreferredSize(new java.awt.Dimension(1095, 30));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbActualizar1.setBackground(new java.awt.Color(14, 21, 30));
        jbActualizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/actualizar.png"))); // NOI18N
        jbActualizar1.setText("Actualizar");
        jbActualizar1.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jbActualizar1.setPreferredSize(new java.awt.Dimension(120, 30));
        jbActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizar1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbActualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(974, 0, -1, -1));

        jcbStock.setBackground(new java.awt.Color(14, 21, 30));
        jcbStock.setForeground(new java.awt.Color(255, 255, 255));
        jcbStock.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Filtrar por Stock" }));
        jcbStock.setColorMaterial(new java.awt.Color(224, 30, 90));
        jcbStock.setEnabled(false);
        jcbStock.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jcbStock.setPreferredSize(new java.awt.Dimension(200, 30));
        jcbStock.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        jPanel2.add(jcbStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, -1));

        jcbCategoria.setBackground(new java.awt.Color(14, 21, 30));
        jcbCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Filtrar por Categoria" }));
        jcbCategoria.setColorMaterial(new java.awt.Color(224, 30, 90));
        jcbCategoria.setEnabled(false);
        jcbCategoria.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jcbCategoria.setPreferredSize(new java.awt.Dimension(200, 30));
        jcbCategoria.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        jPanel2.add(jcbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jcbCodigo.setBackground(new java.awt.Color(14, 21, 30));
        jcbCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jcbCodigo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Filtrar por Codigo" }));
        jcbCodigo.setColorMaterial(new java.awt.Color(224, 30, 90));
        jcbCodigo.setEnabled(false);
        jcbCodigo.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jcbCodigo.setPreferredSize(new java.awt.Dimension(200, 30));
        jcbCodigo.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        jPanel2.add(jcbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        jcbNombre.setBackground(new java.awt.Color(14, 21, 30));
        jcbNombre.setForeground(new java.awt.Color(255, 255, 255));
        jcbNombre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Filtrar por Nombre" }));
        jcbNombre.setColorMaterial(new java.awt.Color(224, 30, 90));
        jcbNombre.setEnabled(false);
        jcbNombre.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jcbNombre.setPreferredSize(new java.awt.Dimension(200, 30));
        jcbNombre.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        jPanel2.add(jcbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevo_productoActionPerformed
        new CambiaPanel(this.addMenu, new nuevoProducto());
    }//GEN-LAST:event_jbNuevo_productoActionPerformed

    private void jbNuena_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuena_categoriaActionPerformed
        new CambiaPanel(this.addMenu, new nuevaCatProductos());        // TODO add your handling code here:
    }//GEN-LAST:event_jbNuena_categoriaActionPerformed

    private void jbActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizar1ActionPerformed
             try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Producto_data producto_data = new Producto_data(con);
            List<Producto> lista_productos = producto_data.obtenerProductos();

            mostrarLista(lista_productos);

        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la tabla, intente otra vez ");
        }
    }//GEN-LAST:event_jbActualizar1ActionPerformed

    private void jtProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosMouseClicked
        int fila = this.jtProductos.getSelectedRow();
        categoria = jtProductos.getValueAt(fila, 0).toString();
        codigo = jtProductos.getValueAt(fila, 1).toString();
        nombre = jtProductos.getValueAt(fila, 2).toString();
        costo = jtProductos.getValueAt(fila, 3).toString();
        precio = jtProductos.getValueAt(fila, 4).toString();
        cantidad = jtProductos.getValueAt(fila, 5).toString();
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Producto_data producto_data = new Producto_data(con);

            producto_pasado = producto_data.getProducto_por_nombre(nombre);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar el detalle, intente otra vez  ");
        }
        new CambiaPanel(this.addMenu, new detalleProducto());
    }//GEN-LAST:event_jtProductosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Titulo;
    public static javax.swing.JPanel addMenu;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private newscomponents.RSButtonFlat_new jbActualizar1;
    private rsbuttoncustom.RSButtonCustom jbNuena_categoria;
    private rsbuttoncustom.RSButtonCustom jbNuevo_producto;
    private RSMaterialComponent.RSComboBoxMaterial jcbCategoria;
    private RSMaterialComponent.RSComboBoxMaterial jcbCodigo;
    private RSMaterialComponent.RSComboBoxMaterial jcbNombre;
    private RSMaterialComponent.RSComboBoxMaterial jcbStock;
    public static javax.swing.JLabel jlBackground;
    private RSMaterialComponent.RSTableMetroCustom jtProductos;
    private javax.swing.JScrollPane registro;
    // End of variables declaration//GEN-END:variables
}
