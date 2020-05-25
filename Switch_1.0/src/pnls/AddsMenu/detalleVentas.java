/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pnls.AddsMenu;

import Clases.Conexion;
import Clases_data.Venta_data;
import javax.swing.JOptionPane;
import pnls.Ventas1;

/**
 *
 * @author Alex
 */
public class detalleVentas extends javax.swing.JPanel {

    /**
     * Creates new form detalleVentas
     */
    public detalleVentas() {
        initComponents();
        String fecha = Ventas1.fecha;
        fecha = fecha.substring(0, fecha.length() - 10); 
        jlFecha.setText(fecha);
        String hora = Ventas1.fecha;
        hora = hora.substring(10, hora.length()); 
        jlHora.setText(hora);
        
        this.jlNombrecliente.setText(Ventas1.cliente);
        this.jlmetodo.setText(Ventas1.metodo_de_pago);
        this.jlTotal.setText(Ventas1.importe);
        this.jtaDetalle.setText(Ventas1.producto_pasado.getNombre());
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
        jltituloCliente = new javax.swing.JLabel();
        jlTituloDetalles = new javax.swing.JLabel();
        jlTituloMetodo = new javax.swing.JLabel();
        jspComentario = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jspDetalle = new javax.swing.JScrollPane();
        jtaDetalle = new javax.swing.JTextArea();
        jlmetodo = new javax.swing.JLabel();
        jlNombrecliente = new javax.swing.JLabel();
        jlTituloCometario = new javax.swing.JLabel();
        jlTituloTotal = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();
        tituloAddMenu = new javax.swing.JLabel();

        addMenu.setBackground(new java.awt.Color(224, 30, 90));
        addMenu.setPreferredSize(new java.awt.Dimension(300, 680));
        addMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        form.setBackground(new java.awt.Color(14, 21, 30));
        form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlFecha.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        jlFecha.setForeground(new java.awt.Color(255, 255, 255));
        jlFecha.setText("DD/MM/AA");
        jlFecha.setPreferredSize(new java.awt.Dimension(170, 30));
        form.add(jlFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 11, 230, -1));

        jbBorrar.setBackground(new java.awt.Color(224, 30, 90));
        jbBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/borrar.png"))); // NOI18N
        jbBorrar.setBorderPainted(false);
        jbBorrar.setPreferredSize(new java.awt.Dimension(30, 30));
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        form.add(jbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 49, -1, -1));

        jlHora.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        jlHora.setForeground(new java.awt.Color(255, 255, 255));
        jlHora.setText("00:00");
        jlHora.setPreferredSize(new java.awt.Dimension(170, 30));
        form.add(jlHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 47, -1, -1));

        jltituloCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jltituloCliente.setForeground(new java.awt.Color(224, 30, 90));
        jltituloCliente.setText("Cliente:");
        form.add(jltituloCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 98, 64, -1));

        jlTituloDetalles.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlTituloDetalles.setForeground(new java.awt.Color(224, 30, 90));
        jlTituloDetalles.setText("Detalles:");
        form.add(jlTituloDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 166, 64, -1));

        jlTituloMetodo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlTituloMetodo.setForeground(new java.awt.Color(224, 30, 90));
        jlTituloMetodo.setText("Metodo de pago:");
        form.add(jlTituloMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 121, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jTextArea1.setSelectionColor(new java.awt.Color(224, 30, 90));
        jspComentario.setViewportView(jTextArea1);

        form.add(jspComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 499, 240, 80));

        jtaDetalle.setEditable(false);
        jtaDetalle.setColumns(20);
        jtaDetalle.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtaDetalle.setLineWrap(true);
        jtaDetalle.setRows(5);
        jtaDetalle.setText("1x Producto1 \n1x Producto3 \n1x Producto4 \n1x Producto5 \n3x Producto2\n\n\n\n\n\n");
        jtaDetalle.setEnabled(false);
        jtaDetalle.setSelectionColor(new java.awt.Color(224, 30, 90));
        jspDetalle.setViewportView(jtaDetalle);

        form.add(jspDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 187, 240, 280));

        jlmetodo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlmetodo.setForeground(new java.awt.Color(255, 255, 255));
        jlmetodo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlmetodo.setText("Debito");
        form.add(jlmetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 120, 130, -1));

        jlNombrecliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlNombrecliente.setForeground(new java.awt.Color(255, 255, 255));
        jlNombrecliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlNombrecliente.setText("Nombre Apellido");
        form.add(jlNombrecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 97, 130, -1));

        jlTituloCometario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlTituloCometario.setForeground(new java.awt.Color(224, 30, 90));
        jlTituloCometario.setText("Comentario:");
        form.add(jlTituloCometario, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 478, 76, -1));

        jlTituloTotal.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlTituloTotal.setForeground(new java.awt.Color(224, 30, 90));
        jlTituloTotal.setText("Total:");
        form.add(jlTituloTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 144, 64, -1));

        jlTotal.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlTotal.setForeground(new java.awt.Color(255, 255, 255));
        jlTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlTotal.setText("$  1000,00");
        form.add(jlTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 143, 130, -1));

        addMenu.add(form, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 302, 650));

        tituloAddMenu.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        tituloAddMenu.setForeground(new java.awt.Color(255, 255, 255));
        tituloAddMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloAddMenu.setText("Detalles de Venta");
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
        int msj = JOptionPane.showConfirmDialog(null,"¿Estas seguro de querer borrar esta venta?");
        if(JOptionPane.YES_OPTION == msj){
            try{
                Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
                Venta_data venta_data = new Venta_data(con);
                venta_data.borrarVenta_por_id(Ventas1.venta_pasada.getId());

                JOptionPane.showMessageDialog(null, "Se borro con exito la venta" );

                this.setVisible(false);

            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "No se pudo borrar la venta " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jbBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addMenu;
    private javax.swing.JPanel form;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlHora;
    private javax.swing.JLabel jlNombrecliente;
    private javax.swing.JLabel jlTituloCometario;
    private javax.swing.JLabel jlTituloDetalles;
    private javax.swing.JLabel jlTituloMetodo;
    private javax.swing.JLabel jlTituloTotal;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JLabel jlmetodo;
    private javax.swing.JLabel jltituloCliente;
    private javax.swing.JScrollPane jspComentario;
    private javax.swing.JScrollPane jspDetalle;
    private javax.swing.JTextArea jtaDetalle;
    private javax.swing.JLabel tituloAddMenu;
    // End of variables declaration//GEN-END:variables
}
