/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pnls.AddsMenu;

import pnls.Clientes123;

import Clases.Cliente;
import Clases.Conexion;
import Clases.Cuenta_corriente;
import Clases_data.Cliente_data;
import Clases_data.Cuenta_corriente_data;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import pnls.AddsMenu.nuevoCliente;
public class nuevoCliente extends javax.swing.JPanel {

    /**
     * Creates new form nuevoCliente
     */
    public static Clientes123 ventana_cliente = new Clientes123();
    public nuevoCliente() {
        initComponents();
        
        
        /*
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Cliente_data cd = new Cliente_data(con);
            List<Cliente> lista = cd.obtenerClientes();
            
            Cuenta_corriente_data ccd = new Cuenta_corriente_data(con);
            List<Cuenta_corriente> lista2 = ccd.obtenerCuentas_corriente();
            
            c.mostrarLista(lista, lista2);
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la tabla " + e.getMessage());
        }*/
    }
    public void Sacar_texto(){
        if("Telefono".equals(jtTelefono.getText())){
            jtTelefono.setText("0");
            }
                
        if("Email".equals(jtEmail.getText())){
            jtEmail.setText(null);
            }
                
        if("Box".equals(jtBox.getText())){
            jtBox.setText(null);
            }
                
        if("Metodo de pago preferido".equals(jtMetodo_de_pago.getText())){
            jtMetodo_de_pago.setText(null);
        }
                
        if("Comentario".equals(jtaComentario.getText())){
            jtaComentario.setText(null);
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
        jtBox = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jtEmail = new javax.swing.JTextField();
        jtMetodo_de_pago = new javax.swing.JTextField();
        jspComentario = new javax.swing.JScrollPane();
        jtaComentario = new javax.swing.JTextArea();
        jbConfirmar = new javax.swing.JButton();
        jtNombre = new javax.swing.JTextField();
        jlNombreyApellido = new javax.swing.JLabel();
        jlBox = new javax.swing.JLabel();
        jlTelefono = new javax.swing.JLabel();
        jlEmail = new javax.swing.JLabel();
        jlMetodo = new javax.swing.JLabel();
        jlComentario = new javax.swing.JLabel();
        tituloAddMenu = new javax.swing.JLabel();

        addMenu.setBackground(new java.awt.Color(54, 197, 240));
        addMenu.setPreferredSize(new java.awt.Dimension(300, 680));

        form.setBackground(new java.awt.Color(14, 21, 30));
        form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtBoxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtBoxFocusLost(evt);
            }
        });
        jtBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBoxActionPerformed(evt);
            }
        });
        form.add(jtBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 240, 30));

        jtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtTelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtTelefonoFocusLost(evt);
            }
        });
        jtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTelefonoActionPerformed(evt);
            }
        });
        jtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTelefonoKeyTyped(evt);
            }
        });
        form.add(jtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 162, 240, 30));

        jtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtEmailFocusLost(evt);
            }
        });
        form.add(jtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 219, 240, 30));

        jtMetodo_de_pago.setPreferredSize(new java.awt.Dimension(125, 30));
        jtMetodo_de_pago.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtMetodo_de_pagoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtMetodo_de_pagoFocusLost(evt);
            }
        });
        jtMetodo_de_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMetodo_de_pagoActionPerformed(evt);
            }
        });
        jtMetodo_de_pago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtMetodo_de_pagoKeyTyped(evt);
            }
        });
        form.add(jtMetodo_de_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 277, 240, -1));

        jtaComentario.setColumns(20);
        jtaComentario.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtaComentario.setLineWrap(true);
        jtaComentario.setRows(5);
        jtaComentario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtaComentarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtaComentarioFocusLost(evt);
            }
        });
        jspComentario.setViewportView(jtaComentario);

        form.add(jspComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 334, 240, 66));

        jbConfirmar.setBackground(new java.awt.Color(54, 197, 240));
        jbConfirmar.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jbConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        jbConfirmar.setText("Confirmar");
        jbConfirmar.setBorderPainted(false);
        jbConfirmar.setPreferredSize(new java.awt.Dimension(101, 35));
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });
        form.add(jbConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 418, 240, -1));

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
        form.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 42, 240, 30));

        jlNombreyApellido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlNombreyApellido.setForeground(new java.awt.Color(255, 255, 255));
        jlNombreyApellido.setText("Nombre y Apellido");
        form.add(jlNombreyApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 21, 117, -1));

        jlBox.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlBox.setForeground(new java.awt.Color(255, 255, 255));
        jlBox.setText("Box");
        form.add(jlBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 78, 64, -1));

        jlTelefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jlTelefono.setText("Telefono");
        form.add(jlTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 141, 64, -1));

        jlEmail.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlEmail.setForeground(new java.awt.Color(255, 255, 255));
        jlEmail.setText("E-mail");
        form.add(jlEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 198, 64, -1));

        jlMetodo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlMetodo.setForeground(new java.awt.Color(255, 255, 255));
        jlMetodo.setText("Metodo de pago preferido");
        form.add(jlMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 256, 205, -1));

        jlComentario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlComentario.setForeground(new java.awt.Color(255, 255, 255));
        jlComentario.setText("Comentario");
        form.add(jlComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 313, 99, -1));

        tituloAddMenu.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        tituloAddMenu.setForeground(new java.awt.Color(255, 255, 255));
        tituloAddMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloAddMenu.setText("Nuevo Cliente");

        javax.swing.GroupLayout addMenuLayout = new javax.swing.GroupLayout(addMenu);
        addMenu.setLayout(addMenuLayout);
        addMenuLayout.setHorizontalGroup(
            addMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addComponent(tituloAddMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addMenuLayout.setVerticalGroup(
            addMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMenuLayout.createSequentialGroup()
                .addComponent(tituloAddMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
        );

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

    private void jtBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtBoxActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

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

    private void jtBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtBoxFocusGained
        this.jtBox.setText("");
        jtBox.setForeground(Color.black);
    }//GEN-LAST:event_jtBoxFocusGained

    private void jtBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtBoxFocusLost
    }//GEN-LAST:event_jtBoxFocusLost

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != KeyEvent.VK_SPACE)){
            evt.consume();
        }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtTelefonoFocusGained
        this.jtTelefono.setText("");
        jtTelefono.setForeground(Color.black);
    }//GEN-LAST:event_jtTelefonoFocusGained

    private void jtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtTelefonoFocusLost

    }//GEN-LAST:event_jtTelefonoFocusLost

    private void jtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelefonoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9'){
            evt.consume();
        }
    }//GEN-LAST:event_jtTelefonoKeyTyped

    private void jtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtEmailFocusGained
        this.jtEmail.setText("");
        jtEmail.setForeground(Color.black);
    }//GEN-LAST:event_jtEmailFocusGained

    private void jtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtEmailFocusLost

    }//GEN-LAST:event_jtEmailFocusLost

    private void jtMetodo_de_pagoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtMetodo_de_pagoFocusGained
        this.jtMetodo_de_pago.setText("");
        jtMetodo_de_pago.setForeground(Color.black);
    }//GEN-LAST:event_jtMetodo_de_pagoFocusGained

    private void jtMetodo_de_pagoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtMetodo_de_pagoFocusLost

    }//GEN-LAST:event_jtMetodo_de_pagoFocusLost

    private void jtMetodo_de_pagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtMetodo_de_pagoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != KeyEvent.VK_SPACE)){
            evt.consume();
        }
    }//GEN-LAST:event_jtMetodo_de_pagoKeyTyped

    private void jtaComentarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtaComentarioFocusGained
        this.jtaComentario.setText("");
        jtaComentario.setForeground(Color.black);
    }//GEN-LAST:event_jtaComentarioFocusGained

    private void jtaComentarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtaComentarioFocusLost

    }//GEN-LAST:event_jtaComentarioFocusLost

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        int msj = JOptionPane.showConfirmDialog(null,"¿Estas seguro de querer agregar este cliente?");
        if(JOptionPane.YES_OPTION == msj){
            try {
                if (jtNombre.getText().length() > 0 && !jtNombre.getText().equals("Nombre Apellido") && !jtNombre.getText().equals("Es necesario rellenar este campo")){
                    Sacar_texto();
                    Conexion con = null;
                    con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
                    Cliente cliente = new Cliente(jtNombre.getText(), Long.parseLong(jtTelefono.getText()), jtEmail.getText(), jtBox.getText(), jtMetodo_de_pago.getText(), jtaComentario.getText());
                    Cliente_data cliente_data = new Cliente_data(con);
                    cliente_data.guardarCliente(cliente);
                    Cuenta_corriente_data ccd = new Cuenta_corriente_data(con);

                    int id_cliente = cliente_data.getCliente_por_nombre(jtNombre.getText()).getId();
                    Cuenta_corriente cuenta_corriente = new Cuenta_corriente(id_cliente,0,1,null);
                    ccd.guardarCuenta_corriente(cuenta_corriente);
                    JOptionPane.showMessageDialog(null, "Felicidades, cliente agregado");

                    List<Cliente> lista = cliente_data.obtenerClientes();
                    List<Cuenta_corriente> lista2 = ccd.obtenerCuentas_corriente();

                    ventana_cliente.mostrarLista(lista, lista2);
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
    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTelefonoActionPerformed

    private void jtMetodo_de_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMetodo_de_pagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMetodo_de_pagoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addMenu;
    private javax.swing.JPanel form;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JLabel jlBox;
    private javax.swing.JLabel jlComentario;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlMetodo;
    private javax.swing.JLabel jlNombreyApellido;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JScrollPane jspComentario;
    private javax.swing.JTextField jtBox;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtMetodo_de_pago;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    private javax.swing.JTextArea jtaComentario;
    private javax.swing.JLabel tituloAddMenu;
    // End of variables declaration//GEN-END:variables
}
