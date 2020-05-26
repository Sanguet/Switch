/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pnls.AddsMenu;

import Clases.Conexion;
import Clases_data.Gasto_data;
import Clases_data.Venta_data;
import javax.swing.JOptionPane;
import pnls.Gastos1;
import pnls.Ventas1;

/**
 *
 * @author Alex
 */
public class detalleGasto extends javax.swing.JPanel {

    /**
     * Creates new form detalleGasto
     */
    public detalleGasto() {
        initComponents();
        
        String fecha = Gastos1.fecha;
        fecha = fecha.substring(0, fecha.length() - 10); 
        jlFecha.setText(fecha);
        String hora = Gastos1.fecha;
        hora = hora.substring(10, hora.length()); 
        jlHora.setText(hora);
        
        this.jlCategoria.setText(Gastos1.categoria);
        this.jlProvedor.setText(Gastos1.provedor);
        this.jlMetodo.setText(Gastos1.metodo_de_pago);
        this.jlTotal.setText(Gastos1.importe);
        this.jtaDetalle.setText(Gastos1.producto_pasado.getNombre());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMenu = new javax.swing.JPanel();
        form = new javax.swing.JPanel();
        jlFecha = new javax.swing.JLabel();
        jbBorrar = new javax.swing.JButton();
        jlHora = new javax.swing.JLabel();
        tituloCategoria = new javax.swing.JLabel();
        tituloProvedor = new javax.swing.JLabel();
        tituloProductos = new javax.swing.JLabel();
        tituloMetodo = new javax.swing.JLabel();
        comentario = new javax.swing.JScrollPane();
        jtaComentairo = new javax.swing.JTextArea();
        detalle = new javax.swing.JScrollPane();
        jtaDetalle = new javax.swing.JTextArea();
        jlProvedor = new javax.swing.JLabel();
        jlMetodo = new javax.swing.JLabel();
        jlCategoria = new javax.swing.JLabel();
        tituloCometario = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();
        jlImporte = new javax.swing.JLabel();
        tituloAddMenu = new javax.swing.JLabel();

        addMenu.setBackground(new java.awt.Color(46, 182, 125));
        addMenu.setPreferredSize(new java.awt.Dimension(300, 680));
        addMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        form.setBackground(new java.awt.Color(14, 21, 30));
        form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlFecha.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        jlFecha.setForeground(new java.awt.Color(255, 255, 255));
        jlFecha.setText("DD/MM/AA");
        jlFecha.setPreferredSize(new java.awt.Dimension(150, 30));
        form.add(jlFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 11, -1, -1));

        jbBorrar.setBackground(new java.awt.Color(46, 182, 125));
        jbBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/borrar.png"))); // NOI18N
        jbBorrar.setBorderPainted(false);
        jbBorrar.setPreferredSize(new java.awt.Dimension(30, 30));
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        form.add(jbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 49, -1, -1));

        jlHora.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        jlHora.setForeground(new java.awt.Color(255, 255, 255));
        jlHora.setText("00:00:00");
        jlHora.setPreferredSize(new java.awt.Dimension(150, 30));
        form.add(jlHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 47, -1, -1));

        tituloCategoria.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tituloCategoria.setForeground(new java.awt.Color(46, 182, 125));
        tituloCategoria.setText("Categoria:");
        form.add(tituloCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 126, 64, -1));

        tituloProvedor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tituloProvedor.setForeground(new java.awt.Color(46, 182, 125));
        tituloProvedor.setText("Proveedor:");
        form.add(tituloProvedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 154, 64, -1));

        tituloProductos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tituloProductos.setForeground(new java.awt.Color(46, 182, 125));
        tituloProductos.setText("Productos:");
        form.add(tituloProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 204, 64, -1));

        tituloMetodo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tituloMetodo.setForeground(new java.awt.Color(46, 182, 125));
        tituloMetodo.setText("Metodo de pago:");
        form.add(tituloMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 182, -1, -1));

        comentario.setPreferredSize(new java.awt.Dimension(237, 80));

        jtaComentairo.setEditable(false);
        jtaComentairo.setColumns(20);
        jtaComentairo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtaComentairo.setLineWrap(true);
        jtaComentairo.setRows(5);
        jtaComentairo.setSelectionColor(new java.awt.Color(46, 182, 125));
        comentario.setViewportView(jtaComentairo);

        form.add(comentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 453, -1, 134));

        jtaDetalle.setEditable(false);
        jtaDetalle.setColumns(20);
        jtaDetalle.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtaDetalle.setLineWrap(true);
        jtaDetalle.setRows(5);
        jtaDetalle.setText("1x Producto1 \n1x Producto3 \n1x Producto4 \n1x Producto5 \n3x Producto2\n\n\n\n\n");
        jtaDetalle.setSelectionColor(new java.awt.Color(46, 182, 125));
        detalle.setViewportView(jtaDetalle);

        form.add(detalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 223, 239, 191));

        jlProvedor.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlProvedor.setForeground(new java.awt.Color(255, 255, 255));
        jlProvedor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlProvedor.setText("Proveedor1");
        form.add(jlProvedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 153, 124, -1));

        jlMetodo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlMetodo.setForeground(new java.awt.Color(255, 255, 255));
        jlMetodo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlMetodo.setText("Contado");
        form.add(jlMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 181, 127, -1));

        jlCategoria.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jlCategoria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlCategoria.setText("Categoria1");
        form.add(jlCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 125, 124, -1));

        tituloCometario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tituloCometario.setForeground(new java.awt.Color(46, 182, 125));
        tituloCometario.setText("Comentario:");
        form.add(tituloCometario, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 432, 76, -1));

        jlTotal.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlTotal.setForeground(new java.awt.Color(46, 182, 125));
        jlTotal.setText("Importe:");
        form.add(jlTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 98, 64, -1));

        jlImporte.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlImporte.setForeground(new java.awt.Color(255, 255, 255));
        jlImporte.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlImporte.setText("$  1000,00");
        form.add(jlImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 97, 124, -1));

        addMenu.add(form, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 300, 650));

        tituloAddMenu.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        tituloAddMenu.setForeground(new java.awt.Color(255, 255, 255));
        tituloAddMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloAddMenu.setText("Detalles del Gasto");
        tituloAddMenu.setPreferredSize(new java.awt.Dimension(300, 30));
        addMenu.add(tituloAddMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        int msj = JOptionPane.showConfirmDialog(null,"¿Estas seguro de querer borrar este gasto?");
        if(JOptionPane.YES_OPTION == msj){
            try{
                Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
                Gasto_data gasto_data = new Gasto_data(con);
                gasto_data.borrarGasto_por_id_detalle(Integer.parseInt(Gastos1.detalle));

                JOptionPane.showMessageDialog(null, "Se borro con exito el gasto" );

                this.setVisible(false);

            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "No se pudo borrar el gasto " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jbBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addMenu;
    private javax.swing.JScrollPane comentario;
    private javax.swing.JScrollPane detalle;
    private javax.swing.JPanel form;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlHora;
    private javax.swing.JLabel jlImporte;
    private javax.swing.JLabel jlMetodo;
    private javax.swing.JLabel jlProvedor;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JTextArea jtaComentairo;
    private javax.swing.JTextArea jtaDetalle;
    private javax.swing.JLabel tituloAddMenu;
    private javax.swing.JLabel tituloCategoria;
    private javax.swing.JLabel tituloCometario;
    private javax.swing.JLabel tituloMetodo;
    private javax.swing.JLabel tituloProductos;
    private javax.swing.JLabel tituloProvedor;
    // End of variables declaration//GEN-END:variables
}
