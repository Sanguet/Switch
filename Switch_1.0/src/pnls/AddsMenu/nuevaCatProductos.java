/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pnls.AddsMenu;

import Clases_data.*;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import Clases.*;
import javax.swing.JTextField;
public class nuevaCatProductos extends javax.swing.JPanel {

    /**
     * Creates new form nuevaCatProductos
     */
    public nuevaCatProductos() {
        initComponents();
        agregarComboCategorias();
        AutoCompleteDecorator.decorate(this.jcbCategoria_padre);
        
    }
    
        private void agregarComboCategorias(){
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Categoria_producto_data cpd = new Categoria_producto_data(con);
            List<Categoria_producto> listA = cpd.obtenerCategorias_producto();
            for (int i = 0; i < listA.size(); i++){
                jcbCategoria_padre.addItem(listA.get(i).getNombre());
            }
            
        }catch (Exception e){
          JOptionPane.showMessageDialog(null, "Ocurrio un error inesperado, vuelve a intentar");
        }
    }
        public void Sacar_texto(){
        if("Nombre*".equals(jtNombre.getText())){
            jtNombre.setText(null);
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
        esSub = new javax.swing.JCheckBox();
        Comentario = new javax.swing.JScrollPane();
        jtaComentario = new javax.swing.JTextArea();
        jbConfirmar = new javax.swing.JButton();
        jtNombre = new javax.swing.JTextField();
        jcbCategoria_padre = new javax.swing.JComboBox<>();
        jlNombreProducto = new javax.swing.JLabel();
        jlCategoria = new javax.swing.JLabel();
        jlComentario = new javax.swing.JLabel();
        tituloAddMenu = new javax.swing.JLabel();

        addMenu.setBackground(new java.awt.Color(224, 30, 90));
        addMenu.setPreferredSize(new java.awt.Dimension(300, 680));
        addMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        form.setBackground(new java.awt.Color(14, 21, 30));

        esSub.setBackground(new java.awt.Color(14, 21, 30));
        esSub.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        esSub.setForeground(new java.awt.Color(255, 255, 255));
        esSub.setText("Es SubCategoria");
        esSub.setBorder(null);
        esSub.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        esSub.setIconTextGap(10);
        esSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esSubActionPerformed(evt);
            }
        });

        jtaComentario.setColumns(20);
        jtaComentario.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtaComentario.setRows(5);
        jtaComentario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtaComentarioFocusGained(evt);
            }
        });
        Comentario.setViewportView(jtaComentario);

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

        jcbCategoria_padre.setEditable(true);
        jcbCategoria_padre.setEnabled(false);

        jlNombreProducto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlNombreProducto.setForeground(new java.awt.Color(255, 255, 255));
        jlNombreProducto.setText("Nombre de la Categoria");

        jlCategoria.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jlCategoria.setText("Categoria Principal");

        jlComentario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlComentario.setForeground(new java.awt.Color(255, 255, 255));
        jlComentario.setText("Comentario");

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombreProducto)
                    .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(esSub)
                        .addComponent(jtNombre)
                        .addComponent(jcbCategoria_padre, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Comentario)
                        .addComponent(jbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlNombreProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(esSub)
                .addGap(18, 18, 18)
                .addComponent(jlCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbCategoria_padre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlComentario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Comentario, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(327, Short.MAX_VALUE))
        );

        addMenu.add(form, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        tituloAddMenu.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        tituloAddMenu.setForeground(new java.awt.Color(255, 255, 255));
        tituloAddMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloAddMenu.setText("Nueva Categoria");
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

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void esSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esSubActionPerformed
        if (jcbCategoria_padre.isEnabled()){
            jcbCategoria_padre.setEnabled(false);
        } else {
            jcbCategoria_padre.setEnabled(true);
        }
        
    }//GEN-LAST:event_esSubActionPerformed

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

    private void jtaComentarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtaComentarioFocusGained
        this.jtaComentario.setText("");
        jtaComentario.setForeground(Color.black);
    }//GEN-LAST:event_jtaComentarioFocusGained

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        int msj = JOptionPane.showConfirmDialog(null,"¿Estas seguro de querer agregar esta categoria?");
        if(JOptionPane.YES_OPTION == msj){
            Sacar_texto();
            try {
                if (Campo_valido(this.jtNombre)){
                    
                    Conexion con = null;
                    con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
                    Categoria_producto_data cpd = new Categoria_producto_data(con);
                    Categoria_producto categoria_producto;
                    if (!esSub.isEnabled()){
                        int id_categoria_padre = cpd.getCategoria_por_nombre(jcbCategoria_padre.getItemAt(0)).getId();
                        categoria_producto = new Categoria_producto(jtNombre.getText(),id_categoria_padre, jtaComentario.getText());
                    } else {
                        categoria_producto = new Categoria_producto(jtNombre.getText(), 0, jtaComentario.getText());
                    }
                    
                    cpd.guardarCategoria_producto(categoria_producto);
                    
                    JOptionPane.showMessageDialog(null, "Felicidades, categoria agregado");

                    this.setVisible(false);

                    con.close();
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Ocurrio un error al guardar la categoria, un campo quedo sin rellenar");
                }
            } catch (Exception e){
                System.out.println("Error al instanciar la clase conexion");
                JOptionPane.showMessageDialog(null,"No se pudo guardar la categoria, intente nuevamente ");
            }
        }
    }//GEN-LAST:event_jbConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Comentario;
    private javax.swing.JPanel addMenu;
    private javax.swing.JCheckBox esSub;
    private javax.swing.JPanel form;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JComboBox<String> jcbCategoria_padre;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlComentario;
    private javax.swing.JLabel jlNombreProducto;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextArea jtaComentario;
    private javax.swing.JLabel tituloAddMenu;
    // End of variables declaration//GEN-END:variables
}
