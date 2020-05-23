/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pnls;

import pnls.AddsMenu.detalleCliente;
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

/**
 *
 * @author Alex
 */

public class Clientes123 extends javax.swing.JPanel {

    /**
     * Creates new form Clientes
     */
    public Clientes123() {
        initComponents();
        this.addMenu.setVisible(true);
        
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Cliente_data cd = new Cliente_data(con);
            List<Cliente> lista = cd.obtenerClientes();
            
            Cuenta_corriente_data ccd = new Cuenta_corriente_data(con);
            List<Cuenta_corriente> lista2 = ccd.obtenerCuentas_corriente();
            
            mostrarLista(lista, lista2);
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la tabla " + e.getMessage());
        }
    }
    public static String nombre,box,email,saldo,telefono;
    public static Cliente cliente_pasado;
    
    public void mostrarLista(List<Cliente> lista, List<Cuenta_corriente> lista2){
        try{
            String matris[][] = new String[lista.size()][5];
            
            for (int i = 0; i < lista.size(); i++){
                matris[i][0] = lista.get(i).getNombre();
                matris[i][1] = lista.get(i).getBox();
                matris[i][2] = Long.toString(lista.get(i).getTelefono());
                matris[i][3] = lista.get(i).getCorreo();
                matris[i][4] = Double.toString(lista2.get(i).getMonto());
            }
            
            jtClientes.setModel(new javax.swing.table.DefaultTableModel(
            matris,
            new String [] {
                "Nombre", "Box", "Telefono", "E-mail", "Saldo"
            }
        ) {
        });
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error inesperado en la lista, vuelve a intentarlo" + e);
        
    }
    }
    /*Esto es un metodo del agregar cliente
    public void Sacar_texto(){
        if("Telefono".equals(jtfTelefono.getText())){
            jtfTelefono.setText(null);
            }
                
        if("Email".equals(jtfEmail.getText())){
            jtfEmail.setText("");
            }
                
        if("Box".equals(jtfBox.getText())){
            jtfBox.setText("");
            }
                
        if("Metodo de pago preferido".equals(jtfMetodo_de_pago.getText())){
            jtfMetodo_de_pago.setText(null);
        }
                
        if("Comentario".equals(jtaComentario.getText())){
            jtaComentario.setText(null);
        }
    }
    */

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
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jbActualizar = new javax.swing.JButton();
        addMenu = new javax.swing.JPanel();
        Registro = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1466, 839));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setPreferredSize(new java.awt.Dimension(1466, 120));

        jLabel5.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 50)); // NOI18N
        jLabel5.setText("Clientes");

        jButton5.setBackground(new java.awt.Color(14, 21, 30));
        jButton5.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Nuevo Cliente");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Title/ClientesR.png"))); // NOI18N
        jLabel6.setToolTipText("");

        jbActualizar.setBackground(new java.awt.Color(14, 21, 30));
        jbActualizar.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 16)); // NOI18N
        jbActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/actualizar.png"))); // NOI18N
        jbActualizar.setText("Actualizar");
        jbActualizar.setBorder(null);
        jbActualizar.setBorderPainted(false);
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 696, Short.MAX_VALUE)
                .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(TituloLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        addMenu.setBackground(new java.awt.Color(54, 197, 240));
        addMenu.setPreferredSize(new java.awt.Dimension(300, 680));
        addMenu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                addMenuFocusLost(evt);
            }
        });
        addMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMenuMouseExited(evt);
            }
        });
        addMenu.setLayout(new javax.swing.BoxLayout(addMenu, javax.swing.BoxLayout.LINE_AXIS));
        add(addMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1146, 140, -1, -1));

        Registro.setBackground(new java.awt.Color(255, 255, 255));
        Registro.setPreferredSize(new java.awt.Dimension(1096, 680));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);

        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
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
                "Nombre", "Box", "Telefono", "E-mail", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtClientes.setRowHeight(25);
        jtClientes.setSelectionBackground(new java.awt.Color(54, 197, 240));
        jtClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtClientes.setShowGrid(true);
        jtClientes.setShowVerticalLines(false);
        jtClientes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtClientesFocusGained(evt);
            }
        });
        jtClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtClientes);
        if (jtClientes.getColumnModel().getColumnCount() > 0) {
            jtClientes.getColumnModel().getColumn(1).setResizable(false);
            jtClientes.getColumnModel().getColumn(3).setResizable(false);
            jtClientes.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro);
        Registro.setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1096, Short.MAX_VALUE)
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new CambiaPanel(this.addMenu, new nuevoCliente());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jtClientesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtClientesFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jtClientesFocusGained

    private void addMenuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addMenuFocusLost
        JOptionPane.showConfirmDialog(this, "Estas seguro que no quieres guardar el cliente?");
        
    }//GEN-LAST:event_addMenuFocusLost

    private void addMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMenuMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addMenuMouseExited

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Cliente_data cd = new Cliente_data(con);
            List<Cliente> lista = cd.obtenerClientes();
            
            Cuenta_corriente_data ccd = new Cuenta_corriente_data(con);
            List<Cuenta_corriente> lista2 = ccd.obtenerCuentas_corriente();
            
            mostrarLista(lista, lista2);
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la tabla " + e.getMessage());
        }
        
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jtClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClientesMouseClicked
        int fila = this.jtClientes.getSelectedRow();
        
        nombre = jtClientes.getValueAt(fila, 0).toString();
        box = jtClientes.getValueAt(fila, 1).toString();
        telefono = jtClientes.getValueAt(fila, 2).toString();
        email = jtClientes.getValueAt(fila, 3).toString();
        saldo = jtClientes.getValueAt(fila, 4).toString();
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Cliente_data cliente_data = new Cliente_data(con);
            
            cliente_pasado = cliente_data.getCliente_por_nombre(nombre);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la tabla " + e.getMessage());
        }
        new CambiaPanel(this.addMenu, new detalleCliente());
    }//GEN-LAST:event_jtClientesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Registro;
    private javax.swing.JPanel Titulo;
    private javax.swing.JPanel addMenu;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JTable jtClientes;
    // End of variables declaration//GEN-END:variables
}
