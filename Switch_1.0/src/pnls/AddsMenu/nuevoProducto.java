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
        tituloAddMenu = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addMenu.setBackground(new java.awt.Color(224, 30, 90));

        form.setBackground(new java.awt.Color(14, 21, 30));

        jbConfirmar.setBackground(new java.awt.Color(224, 30, 90));
        jbConfirmar.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jbConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        jbConfirmar.setText("Confirmar");
        jbConfirmar.setBorderPainted(false);
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        jtaComentario.setColumns(20);
        jtaComentario.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtaComentario.setRows(5);
        jtaComentario.setText("Comentario");
        jtaComentario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtaComentarioFocusGained(evt);
            }
        });
        Comentario.setViewportView(jtaComentario);

        jtNombre.setText("Nombre*");
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

        jtCodigo.setText("Codigo");
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

        jtCosto.setText("Costo*");
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

        jtPrecio.setText("Precio*");
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

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtCosto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Comentario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jbConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jcbCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbProvedor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addComponent(Comentario, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        tituloAddMenu.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        tituloAddMenu.setForeground(new java.awt.Color(255, 255, 255));
        tituloAddMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloAddMenu.setText("Nuevo Producto");

        javax.swing.GroupLayout addMenuLayout = new javax.swing.GroupLayout(addMenu);
        addMenu.setLayout(addMenuLayout);
        addMenuLayout.setHorizontalGroup(
            addMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMenuLayout.createSequentialGroup()
                .addGroup(addMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloAddMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        addMenuLayout.setVerticalGroup(
            addMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMenuLayout.createSequentialGroup()
                .addComponent(tituloAddMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(addMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        /*
        int msj = JOptionPane.showConfirmDialog(null,"¿Estas seguro de querer agregar este cliente?");
        if(JOptionPane.YES_OPTION == msj){
            Sacar_texto();
            try {
                if (Campo_valido(this.jtNombre) && Campo_valido(this.jtPrecio) && Campo_valido(this.jtCosto)){
                    
                    Conexion con = null;
                    con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
                    Producto_data producto_data = new Producto_data(con);
                    Provedor_data pd = new Provedor_data(con);
                    Categoria_producto_data cpd = new Categoria_producto_data(con);
                    
                    int id_categoria = cpd.getCategoria_por_nombre(this.jcbCategoria.getItemAt(0)).getId();
                    int id_provedor =
                    Producto producto = new Producto(jtNombre,);
                    
                    Cliente cliente = new Cliente(jtNombre.getText(), Long.parseLong(jtTelefono.getText()), jtEmail.getText(), jtBox.getText(), jtMetodo_de_pago.getText(), jtaComentario.getText());
                    Cliente_data cliente_data = new Cliente_data(con);
                    cliente_data.guardarCliente(cliente);
                    Cuenta_corriente_data ccd = new Cuenta_corriente_data(con);

                    int id_cliente = cliente_data.getCliente_por_nombre(jtNombre.getText()).getId();
                    Cuenta_corriente cuenta_corriente = new Cuenta_corriente(id_cliente,0,1,null);
                    ccd.guardarCuenta_corriente(cuenta_corriente);
                    JOptionPane.showMessageDialog(null, "Felicidades, cliente agregado");

                    this.setVisible(false);

                    con.close();
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Ocurrio un error al guardar el cliente, un campo quedo sin rellenar");
                }
            } catch (Exception e){
                System.out.println("Error al instanciar la clase conexion" + e.getMessage());
                JOptionPane.showMessageDialog(null,"No se pudo guardar el cliente, intente nuevamente");
            }
        }
*/
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
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != KeyEvent.VK_SPACE)){
            evt.consume();
        }
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Comentario;
    private javax.swing.JPanel addMenu;
    private javax.swing.JPanel form;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JComboBox<String> jcbProvedor;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtCosto;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextArea jtaComentario;
    private javax.swing.JLabel tituloAddMenu;
    // End of variables declaration//GEN-END:variables
}
