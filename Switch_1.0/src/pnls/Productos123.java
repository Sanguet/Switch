/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pnls;

import Clases.*;
import Clases_data.*;
import java.util.List;
import javax.swing.JOptionPane;
import pnls.AddsMenu.nuevoCliente;
import pnls.AddsMenu.nuevoProducto;
public class Productos123 extends javax.swing.JPanel {

    /**
     * Creates new form Productos
     */
    public Productos123() {
        initComponents();try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Producto_data producto_data = new Producto_data(con);
            List<Producto> lista_productos = producto_data.obtenerProductos();
            
            mostrarLista(lista_productos);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la tabla " + e.getMessage());
        }
    }
    
    public void mostrarLista(List<Producto> lista){
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            
            Categoria_data categoria_data = new Categoria_data(con);
            Provedor_data provedor_data = new Provedor_data(con);
            
            String matris[][] = new String[lista.size()][5];
            
            for (int i = 0; i < lista.size(); i++){
                matris[i][0] = Long.toString(lista.get(i).getCodigo());
                matris[i][1] = lista.get(i).getNombre();
                matris[i][2] = Double.toString(lista.get(i).getCosto());
                matris[i][3] = Double.toString(lista.get(i).getPrecio());
                matris[i][4] = Integer.toString(lista.get(i).getCantidad());
            }
            
            jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            matris,
            new String [] {
                "Codigo", "Nombre", "Coste", "Precio", "Stock"
            }
        ) {
        });
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error inesperado en la lista, vuelve a intentarlo" + e);
        
        }
    }

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
        jbNuevo_producto = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jbNuena_categoria = new javax.swing.JButton();
        addMenu = new javax.swing.JPanel();
        categoriaMenu = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        registro = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();

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

        jbNuevo_producto.setBackground(new java.awt.Color(14, 21, 30));
        jbNuevo_producto.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 16)); // NOI18N
        jbNuevo_producto.setForeground(new java.awt.Color(255, 255, 255));
        jbNuevo_producto.setText("Nuevo Producto");
        jbNuevo_producto.setBorder(null);
        jbNuevo_producto.setBorderPainted(false);
        jbNuevo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevo_productoActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Title/ProductosR.png"))); // NOI18N
        jLabel6.setText("Imagen");
        jLabel6.setPreferredSize(new java.awt.Dimension(50, 50));

        jbNuena_categoria.setBackground(new java.awt.Color(14, 21, 30));
        jbNuena_categoria.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 16)); // NOI18N
        jbNuena_categoria.setForeground(new java.awt.Color(255, 255, 255));
        jbNuena_categoria.setText("Nueva Categoria");
        jbNuena_categoria.setBorder(null);
        jbNuena_categoria.setBorderPainted(false);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 682, Short.MAX_VALUE)
                .addComponent(jbNuevo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbNuena_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jbNuevo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbNuena_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        addMenu.setBackground(new java.awt.Color(224, 30, 90));
        addMenu.setPreferredSize(new java.awt.Dimension(300, 680));
        addMenu.setLayout(new javax.swing.BoxLayout(addMenu, javax.swing.BoxLayout.LINE_AXIS));
        add(addMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1146, 140, -1, -1));

        categoriaMenu.setBackground(new java.awt.Color(14, 21, 30));
        categoriaMenu.setPreferredSize(new java.awt.Dimension(200, 680));

        jButton1.setBackground(new java.awt.Color(14, 21, 30));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Categoria principal");
        jButton1.setBorderPainted(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout categoriaMenuLayout = new javax.swing.GroupLayout(categoriaMenu);
        categoriaMenu.setLayout(categoriaMenuLayout);
        categoriaMenuLayout.setHorizontalGroup(
            categoriaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        categoriaMenuLayout.setVerticalGroup(
            categoriaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoriaMenuLayout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 645, Short.MAX_VALUE))
        );

        add(categoriaMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        registro.setMaximumSize(new java.awt.Dimension(32767, 700));
        registro.setMinimumSize(new java.awt.Dimension(23, 700));
        registro.setPreferredSize(new java.awt.Dimension(890, 680));

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
        registro.setViewportView(jtProductos);

        add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 140, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevo_productoActionPerformed
        new CambiaPanel(this.addMenu, new nuevoProducto());
    }//GEN-LAST:event_jbNuevo_productoActionPerformed

    private void jbNuena_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuena_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbNuena_categoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Titulo;
    private javax.swing.JPanel addMenu;
    private javax.swing.JPanel categoriaMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbNuena_categoria;
    private javax.swing.JButton jbNuevo_producto;
    private javax.swing.JTable jtProductos;
    private javax.swing.JScrollPane registro;
    // End of variables declaration//GEN-END:variables
}
