/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pnls.AddsMenu;

import Clases_data.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import Clases.*;
import javax.swing.JTextField;
import pnls.Productos1;
import pnls.Provedores1;

/**
 *
 * @author Alex
 */
public class nuevoProducto extends javax.swing.JPanel {

    /**
     * Creates new form nuevoProducto
     */
    public nuevoProducto() {
        initComponents();
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
    
    public void Sacar_texto(){
        if("Nombre*".equals(jtNombre.getText())){
            jtNombre.setText(null);
        }
        
        if("Precio*".equals(jtPrecio.getText())){
            jtPrecio.setText(null);
        }
        
        if("Costo*".equals(jtCosto.getText())){
            jtCosto.setText(null);
        }
        
        if("Codigo".equals(jtCodigo.getText())){
            jtCodigo.setText("0");
        }
                
        if("Comentario".equals(jtaComentario.getText())){
            jtaComentario.setText(null);
        }
    }
    
    public boolean Campo_valido(JTextField campo){
        if (campo.getText().length() > 0 && !campo.getText().equals("Es necesario rellenar este campo")){
            return true;
        } else {
            return false;
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
        jbConfirmar = new javax.swing.JButton();
        Comentario = new javax.swing.JScrollPane();
        jtaComentario = new javax.swing.JTextArea();
        jtNombre = new javax.swing.JTextField();
        jtCodigo = new javax.swing.JTextField();
        jtCosto = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jcbCategoria = new javax.swing.JComboBox<>();
        jcbProvedor = new javax.swing.JComboBox<>();
        jtCantidad = new javax.swing.JTextField();
        jlNombreProducto = new javax.swing.JLabel();
        jlCategoria = new javax.swing.JLabel();
        jlPrecio = new javax.swing.JLabel();
        jlCosto = new javax.swing.JLabel();
        jlCodigo = new javax.swing.JLabel();
        jlProvedor = new javax.swing.JLabel();
        jlComentario = new javax.swing.JLabel();
        jlCantInicial = new javax.swing.JLabel();
        tituloAddMenu = new javax.swing.JLabel();

        addMenu.setBackground(new java.awt.Color(224, 30, 90));
        addMenu.setPreferredSize(new java.awt.Dimension(300, 680));
        addMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        form.setBackground(new java.awt.Color(14, 21, 30));

        jbConfirmar.setBackground(new java.awt.Color(224, 30, 90));
        jbConfirmar.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jbConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        jbConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/confirmar.png"))); // NOI18N
        jbConfirmar.setText("Confirmar");
        jbConfirmar.setBorderPainted(false);
        jbConfirmar.setPreferredSize(new java.awt.Dimension(240, 35));
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        jtaComentario.setColumns(20);
        jtaComentario.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtaComentario.setLineWrap(true);
        jtaComentario.setRows(5);
        jtaComentario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtaComentarioFocusGained(evt);
            }
        });
        Comentario.setViewportView(jtaComentario);

        jtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNombreFocusLost(evt);
            }
        });
        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });

        jtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtCodigoFocusGained(evt);
            }
        });
        jtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCodigoKeyTyped(evt);
            }
        });

        jtCosto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtCostoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtCostoFocusLost(evt);
            }
        });
        jtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCostoKeyTyped(evt);
            }
        });

        jtPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtPrecioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtPrecioFocusLost(evt);
            }
        });
        jtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioKeyTyped(evt);
            }
        });

        jcbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCategoriaActionPerformed(evt);
            }
        });

        jtCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtCantidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtCantidadFocusLost(evt);
            }
        });
        jtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCantidadKeyTyped(evt);
            }
        });

        jlNombreProducto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlNombreProducto.setForeground(new java.awt.Color(255, 255, 255));
        jlNombreProducto.setText("Nombre del Producto");

        jlCategoria.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jlCategoria.setText("Categoria");

        jlPrecio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jlPrecio.setText("Precio");

        jlCosto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlCosto.setForeground(new java.awt.Color(255, 255, 255));
        jlCosto.setText("Costo");

        jlCodigo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jlCodigo.setText("Codigo");

        jlProvedor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlProvedor.setForeground(new java.awt.Color(255, 255, 255));
        jlProvedor.setText("Provedor");

        jlComentario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlComentario.setForeground(new java.awt.Color(255, 255, 255));
        jlComentario.setText("Comentario");

        jlCantInicial.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlCantInicial.setForeground(new java.awt.Color(255, 255, 255));
        jlCantInicial.setText("Stock Inicial");

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombreProducto)
                    .addComponent(jlCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Comentario)
                        .addComponent(jtNombre)
                        .addComponent(jcbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtPrecio)
                        .addComponent(jtCosto)
                        .addComponent(jtCantidad)
                        .addComponent(jtCodigo)
                        .addComponent(jcbProvedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbConfirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jlCantInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlNombreProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPrecio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlCosto)
                .addGap(4, 4, 4)
                .addComponent(jtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jlCantInicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jlCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlProvedor)
                .addGap(5, 5, 5)
                .addComponent(jcbProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jlComentario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Comentario, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        addMenu.add(form, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        tituloAddMenu.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        tituloAddMenu.setForeground(new java.awt.Color(255, 255, 255));
        tituloAddMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloAddMenu.setText("Nuevo Producto");
        tituloAddMenu.setPreferredSize(new java.awt.Dimension(300, 30));
        addMenu.add(tituloAddMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        int msj = JOptionPane.showConfirmDialog(null,"¿Estas seguro de querer agregar este producto?");
        if(JOptionPane.YES_OPTION == msj){
            Sacar_texto();
            try {
                if (Campo_valido(this.jtNombre) && Campo_valido(this.jtPrecio) && Campo_valido(this.jtCosto) && Campo_valido(this.jtCantidad)){
                    
                    Conexion con = null;
                    con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
                    Producto_data producto_data = new Producto_data(con);
                    Provedor_data pd = new Provedor_data(con);
                    Categoria_producto_data cpd = new Categoria_producto_data(con);
                    
                    int indice = jcbCategoria.getSelectedIndex();
                    int indice2 = jcbProvedor.getSelectedIndex();
                    
                    int id_categoria =  cpd.getCategoria_por_nombre(this.jcbCategoria.getItemAt(indice)).getId();
                    int id_provedor = pd.getProvedor_por_nombre(this.jcbProvedor.getItemAt(indice2)).getId();
                    Producto producto = new Producto(jtNombre.getText(), id_categoria, Double.parseDouble(jtCosto.getText()), Double.parseDouble(jtPrecio.getText()), Integer.parseInt(jtCantidad.getText()), id_provedor, jtaComentario.getText(), Long.parseLong(jtCodigo.getText()));
                    producto_data.guardarProducto(producto);
                    
                    JOptionPane.showMessageDialog(null, "Felicidades, producto agregado");

                    this.setVisible(false);
                    Productos1.addMenu.add(Productos1.jlBackground);

                    con.close();
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Ocurrio un error al guardar el producto, un campo quedo sin rellenar");
                }
            } catch (Exception e){
                System.out.println("Error al instanciar la clase conexion" + e.getMessage());
                JOptionPane.showMessageDialog(null,"No se pudo guardar el producto, intente nuevamente " + e);
            }
        }

    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNombreFocusGained
        this.jtNombre.setText("");
        jtNombre.setForeground(Color.black);
    }//GEN-LAST:event_jtNombreFocusGained

    private void jtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNombreFocusLost
        if("".equals(jtNombre.getText())){
            jtNombre.setForeground(Color.red);
            jtNombre.setText("Es necesario rellenar este campo");
        }
    }//GEN-LAST:event_jtNombreFocusLost

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped

    }//GEN-LAST:event_jtNombreKeyTyped

    private void jcbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCategoriaActionPerformed

    private void jtPrecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtPrecioFocusGained
        this.jtPrecio.setText("");
        jtPrecio.setForeground(Color.black);
    }//GEN-LAST:event_jtPrecioFocusGained

    private void jtPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtPrecioFocusLost
        if("".equals(jtPrecio.getText())){
            jtPrecio.setForeground(Color.red);
            jtPrecio.setText("Es necesario rellenar este campo");
        }
    }//GEN-LAST:event_jtPrecioFocusLost

    private void jtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != KeyEvent.VK_PERIOD)){
            evt.consume();
        }
    }//GEN-LAST:event_jtPrecioKeyTyped

    private void jtCostoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCostoFocusGained
        this.jtCosto.setText("");
        jtCosto.setForeground(Color.black);
    }//GEN-LAST:event_jtCostoFocusGained

    private void jtCostoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCostoFocusLost
        if("".equals(jtCosto.getText())){
            jtCosto.setForeground(Color.red);
            jtCosto.setText("Es necesario rellenar este campo");
        }
    }//GEN-LAST:event_jtCostoFocusLost

    private void jtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCostoKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != KeyEvent.VK_PERIOD)){
            evt.consume();
        }
    }//GEN-LAST:event_jtCostoKeyTyped

    private void jtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCodigoFocusGained
        this.jtCodigo.setText("");
        jtCodigo.setForeground(Color.black);
    }//GEN-LAST:event_jtCodigoFocusGained

    private void jtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCodigoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9'){
            evt.consume();
        }
    }//GEN-LAST:event_jtCodigoKeyTyped

    private void jtaComentarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtaComentarioFocusGained
        this.jtaComentario.setText("");
        jtaComentario.setForeground(Color.black);
    }//GEN-LAST:event_jtaComentarioFocusGained

    private void jtCantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCantidadFocusGained
        this.jtCantidad.setText("");
        jtCantidad.setForeground(Color.black);
    }//GEN-LAST:event_jtCantidadFocusGained

    private void jtCantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtCantidadFocusLost
        if("".equals(jtCantidad.getText())){
            jtCantidad.setForeground(Color.red);
            jtCantidad.setText("Es necesario rellenar este campo");
        }
    }//GEN-LAST:event_jtCantidadFocusLost

    private void jtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCantidadKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9'){
            evt.consume();
        }
    }//GEN-LAST:event_jtCantidadKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Comentario;
    private javax.swing.JPanel addMenu;
    private javax.swing.JPanel form;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JComboBox<String> jcbProvedor;
    private javax.swing.JLabel jlCantInicial;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlComentario;
    private javax.swing.JLabel jlCosto;
    private javax.swing.JLabel jlNombreProducto;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JLabel jlProvedor;
    private javax.swing.JTextField jtCantidad;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtCosto;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextArea jtaComentario;
    private javax.swing.JLabel tituloAddMenu;
    // End of variables declaration//GEN-END:variables
}
