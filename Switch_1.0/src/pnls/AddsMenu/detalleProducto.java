package pnls.AddsMenu;

import pnls.Productos;

import Clases_data.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import Clases.*;
import javax.swing.JTextField;
public class detalleProducto extends javax.swing.JPanel {

    /**
     * Creates new form detalleProducto
     */
    public detalleProducto() {
        initComponents();
        jlNombre.setText(Productos.nombre);
        jtPrecio.setText(Productos.precio);
        jtCosto.setText(Productos.costo);
        jtCodigo.setText(Productos.codigo);
        jtCantidad.setText(Productos.cantidad);
        
        agregarComboCategorias();
        agregarComboProvedores();
        AutoCompleteDecorator.decorate(this.jcbCategoria);
        AutoCompleteDecorator.decorate(this.jcbProvedor);
        
        
    }
    private void agregarComboCategorias(){
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Categoria_producto_data cpd = new Categoria_producto_data(con);
            List<Categoria_producto> listA = cpd.obtenerCategorias_producto();
            for (int i = 0; i < listA.size(); i++){
                jcbCategoria.addItem(listA.get(i).getNombre());
            }
            
        }catch (Exception e){
          JOptionPane.showMessageDialog(null, "Ocurrio un error inesperado, vuelve a intentar");
        }
    }
    
    private void agregarComboProvedores(){
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Provedor_data cd = new Provedor_data(con);
            List<Provedor> listA = cd.obtenerProvedores();
            for (int i = 0; i < listA.size(); i++){
                jcbProvedor.addItem(listA.get(i).getNombre());
            }
            
        }catch (Exception e){
          JOptionPane.showMessageDialog(null, "Ocurrio un error inesperado, vuelve a intentar");
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

        addMenu = new javax.swing.JPanel();
        form = new javax.swing.JPanel();
        jlNombre = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        jtCosto = new javax.swing.JTextField();
        jtCodigo = new javax.swing.JTextField();
        comentario = new javax.swing.JScrollPane();
        jtaComentario = new javax.swing.JTextArea();
        jbEditar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jtCantidad = new javax.swing.JTextField();
        jbNuevo_stock = new javax.swing.JButton();
        tituloStock = new javax.swing.JLabel();
        jcbCategoria = new javax.swing.JComboBox<>();
        jcbProvedor = new javax.swing.JComboBox<>();
        tituloAddMenu = new javax.swing.JLabel();

        addMenu.setBackground(new java.awt.Color(224, 30, 90));

        form.setBackground(new java.awt.Color(14, 21, 30));

        jlNombre.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlNombre.setText("Nombre ");

        jtPrecio.setText("Precio");
        jtPrecio.setEnabled(false);

        jtCosto.setText("Costo");
        jtCosto.setEnabled(false);

        jtCodigo.setText("Codigo");
        jtCodigo.setEnabled(false);

        jtaComentario.setColumns(20);
        jtaComentario.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtaComentario.setRows(5);
        jtaComentario.setText("Comentario");
        jtaComentario.setEnabled(false);
        comentario.setViewportView(jtaComentario);

        jbEditar.setBackground(new java.awt.Color(224, 30, 90));
        jbEditar.setText("Editar");
        jbEditar.setBorderPainted(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbBorrar.setBackground(new java.awt.Color(224, 30, 90));
        jbBorrar.setText("Borrar");
        jbBorrar.setBorderPainted(false);

        jtCantidad.setEditable(false);
        jtCantidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtCantidad.setText("10u");
        jtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCantidadActionPerformed(evt);
            }
        });

        jbNuevo_stock.setBackground(new java.awt.Color(224, 30, 90));
        jbNuevo_stock.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jbNuevo_stock.setForeground(new java.awt.Color(255, 255, 255));
        jbNuevo_stock.setText("Nuevo Stock");
        jbNuevo_stock.setBorderPainted(false);

        tituloStock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tituloStock.setForeground(new java.awt.Color(255, 255, 255));
        tituloStock.setText("Cantidad Stock");

        jcbCategoria.setEditable(true);
        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        jcbCategoria.setEnabled(false);

        jcbProvedor.setEditable(true);
        jcbProvedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        jcbProvedor.setEnabled(false);

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jbNuevo_stock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(formLayout.createSequentialGroup()
                            .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtCosto, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(comentario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(formLayout.createSequentialGroup()
                            .addComponent(tituloStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jcbProvedor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(34, 34, 34))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEditar)
                    .addComponent(jbBorrar))
                .addGap(17, 17, 17)
                .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comentario, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbNuevo_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        tituloAddMenu.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        tituloAddMenu.setForeground(new java.awt.Color(255, 255, 255));
        tituloAddMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloAddMenu.setText("Detalles del Producto");

        javax.swing.GroupLayout addMenuLayout = new javax.swing.GroupLayout(addMenu);
        addMenu.setLayout(addMenuLayout);
        addMenuLayout.setHorizontalGroup(
            addMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMenuLayout.createSequentialGroup()
                .addGroup(addMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tituloAddMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCantidadActionPerformed

        
    }//GEN-LAST:event_jtCantidadActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        if (!jtPrecio.isEnabled()){
            jtPrecio.setEnabled(true);
            jtCosto.setEnabled(true);
            jtCodigo.setEnabled(true);
            jtaComentario.setEnabled(true);
            jcbCategoria.setEnabled(true);
            jcbProvedor.setEnabled(true);
        } else {
            int msj = JOptionPane.showConfirmDialog(null,"¿Estas seguro de querer editar este cliente?");
        if(JOptionPane.YES_OPTION == msj){
            try{
                Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
                Producto_data cd = new Producto_data(con);
                Provedor_data pd = new Provedor_data(con);
                Categoria_producto_data cpd = new Categoria_producto_data(con);
                int indice = jcbCategoria.getSelectedIndex();
                int indice2 = jcbProvedor.getSelectedIndex();
                int id_categoria =  cpd.getCategoria_por_nombre(this.jcbCategoria.getItemAt(indice)).getId();
                int id_provedor = pd.getProvedor_por_nombre(this.jcbProvedor.getItemAt(indice2)).getId();
                
                Producto producto = new Producto(jlNombre.getText(), id_categoria, Double.parseDouble(jtCosto.getText()), Double.parseDouble(jtPrecio.getText()), Integer.parseInt(jtCantidad.getText()), id_provedor, jtaComentario.getText(), Integer.parseInt(jtCodigo.getText()));

                cd.actualizarProducto_por_id(producto, Productos.producto_pasado.getId());

                JOptionPane.showMessageDialog(null, "Se actualizo con exito el Producto" );

                this.setVisible(false);

            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "No se pudo cargar la tabla " + e.getMessage());
            }
        }
        }
    }//GEN-LAST:event_jbEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addMenu;
    private javax.swing.JScrollPane comentario;
    private javax.swing.JPanel form;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbNuevo_stock;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JComboBox<String> jcbProvedor;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextField jtCantidad;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtCosto;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextArea jtaComentario;
    private javax.swing.JLabel tituloAddMenu;
    private javax.swing.JLabel tituloStock;
    // End of variables declaration//GEN-END:variables
}
