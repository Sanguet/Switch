/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pnls.AddsMenu;

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
        fecha = new javax.swing.JLabel();
        borrar = new javax.swing.JButton();
        hora = new javax.swing.JLabel();
        tituloCliente = new javax.swing.JLabel();
        tituloProductos = new javax.swing.JLabel();
        tituloMetodo = new javax.swing.JLabel();
        comentario = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        detalle = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        metodo = new javax.swing.JLabel();
        nombrecliente = new javax.swing.JLabel();
        tituloCometario = new javax.swing.JLabel();
        tituloAddMenu = new javax.swing.JLabel();

        addMenu.setBackground(new java.awt.Color(224, 30, 90));

        form.setBackground(new java.awt.Color(14, 21, 30));

        fecha.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("DD/MM/AA");

        borrar.setBackground(new java.awt.Color(224, 30, 90));
        borrar.setText("Borrar");
        borrar.setBorderPainted(false);

        hora.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        hora.setForeground(new java.awt.Color(255, 255, 255));
        hora.setText("00:00");

        tituloCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tituloCliente.setForeground(new java.awt.Color(224, 30, 90));
        tituloCliente.setText("Cliente:");

        tituloProductos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tituloProductos.setForeground(new java.awt.Color(224, 30, 90));
        tituloProductos.setText("Detalles:");

        tituloMetodo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tituloMetodo.setForeground(new java.awt.Color(224, 30, 90));
        tituloMetodo.setText("Metodo de pago:");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Puto el que lee ");
        jTextArea1.setSelectionColor(new java.awt.Color(224, 30, 90));
        comentario.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("1x Producto1 \n1x Producto3 \n1x Producto4 \n1x Producto5 \n3x Producto2\n\n\n\n\n\nTotal:                          $  1000,00");
        jTextArea2.setSelectionColor(new java.awt.Color(224, 30, 90));
        detalle.setViewportView(jTextArea2);

        metodo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        metodo.setForeground(new java.awt.Color(255, 255, 255));
        metodo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        metodo.setText("Debito");

        nombrecliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombrecliente.setForeground(new java.awt.Color(255, 255, 255));
        nombrecliente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nombrecliente.setText("Cliente1");

        tituloCometario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tituloCometario.setForeground(new java.awt.Color(224, 30, 90));
        tituloCometario.setText("Comentario:");

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comentario, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloCometario, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(formLayout.createSequentialGroup()
                                .addComponent(tituloCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(formLayout.createSequentialGroup()
                            .addComponent(tituloMetodo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(metodo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(formLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(borrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borrar)
                .addGap(18, 18, 18)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloCliente)
                    .addComponent(nombrecliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloMetodo)
                    .addComponent(metodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tituloProductos)
                .addGap(4, 4, 4)
                .addComponent(detalle, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloCometario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comentario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        tituloAddMenu.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        tituloAddMenu.setForeground(new java.awt.Color(255, 255, 255));
        tituloAddMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloAddMenu.setText("Detalles de Venta");

        javax.swing.GroupLayout addMenuLayout = new javax.swing.GroupLayout(addMenu);
        addMenu.setLayout(addMenuLayout);
        addMenuLayout.setHorizontalGroup(
            addMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tituloAddMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addMenuLayout.setVerticalGroup(
            addMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMenuLayout.createSequentialGroup()
                .addComponent(tituloAddMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addMenu;
    private javax.swing.JButton borrar;
    private javax.swing.JScrollPane comentario;
    private javax.swing.JScrollPane detalle;
    private javax.swing.JLabel fecha;
    private javax.swing.JPanel form;
    private javax.swing.JLabel hora;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel metodo;
    private javax.swing.JLabel nombrecliente;
    private javax.swing.JLabel tituloAddMenu;
    private javax.swing.JLabel tituloCliente;
    private javax.swing.JLabel tituloCometario;
    private javax.swing.JLabel tituloMetodo;
    private javax.swing.JLabel tituloProductos;
    // End of variables declaration//GEN-END:variables
}
