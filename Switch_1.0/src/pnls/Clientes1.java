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
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import pnls.AddsMenu.nuevoCliente;

/**
 *
 * @author Alex
 */

public class Clientes1 extends javax.swing.JPanel {

    /**
     * Creates new form Clientes
     */
    public Clientes1() {
        initComponents();
        
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Cliente_data cd = new Cliente_data(con);
            List<Cliente> lista = cd.obtenerClientes();
            
            Cuenta_corriente_data ccd = new Cuenta_corriente_data(con);
            List<Cuenta_corriente> lista2 = ccd.obtenerCuentas_corriente();
            
            mostrarLista(lista, lista2);
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la tabla, inicie el xampp ");
        }
        agregarComboClientes();
        AutoCompleteDecorator.decorate(this.jcbNombre);
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
       private void agregarComboClientes(){
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Cliente_data cd = new Cliente_data(con);
            List<Cliente> listA = cd.obtenerClientes();
            for (int i = 0; i < listA.size(); i++){
                jcbNombre.addItem(listA.get(i).getNombre());
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

        Titulo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbNuevoCliente = new rsbuttoncustom.RSButtonCustom();
        addMenu = new javax.swing.JPanel();
        jlBackground = new javax.swing.JLabel();
        Registro = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtClientes = new RSMaterialComponent.RSTableMetroCustom();
        jPanel1 = new javax.swing.JPanel();
        jcbSaldo = new RSMaterialComponent.RSComboBoxMaterial();
        jcbNombre = new RSMaterialComponent.RSComboBoxMaterial();
        jcbBox = new RSMaterialComponent.RSComboBoxMaterial();
        jbActualizar = new newscomponents.RSButtonFlat_new();

        setPreferredSize(new java.awt.Dimension(1466, 839));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setPreferredSize(new java.awt.Dimension(1466, 120));

        jLabel5.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 50)); // NOI18N
        jLabel5.setText("Clientes");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Title/ClientesR.png"))); // NOI18N
        jLabel6.setToolTipText("");

        jbNuevoCliente.setBackground(new java.awt.Color(14, 21, 30));
        jbNuevoCliente.setForeground(new java.awt.Color(255, 255, 255));
        jbNuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/NuevoCliente.png"))); // NOI18N
        jbNuevoCliente.setText("Nuevo Cliente");
        jbNuevoCliente.setColorMaterial(new java.awt.Color(54, 197, 240));
        jbNuevoCliente.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 16)); // NOI18N
        jbNuevoCliente.setIconTextGap(3);
        jbNuevoCliente.setPreferredSize(new java.awt.Dimension(150, 35));
        jbNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoClienteActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 845, Short.MAX_VALUE)
                .addComponent(jbNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jbNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        jlBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.backgrounds/Clientes.png"))); // NOI18N
        jlBackground.setPreferredSize(new java.awt.Dimension(300, 680));
        addMenu.add(jlBackground);

        add(addMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1146, 140, -1, -1));

        Registro.setBackground(new java.awt.Color(255, 255, 255));
        Registro.setPreferredSize(new java.awt.Dimension(1096, 680));
        Registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setOpaque(false);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(1096, 671));

        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Box", "Telefono", "Email", "Saldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtClientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        jtClientes.setBackgoundHead(new java.awt.Color(255, 255, 255));
        jtClientes.setBorderRows(null);
        jtClientes.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        jtClientes.setColorSecondary(new java.awt.Color(255, 255, 255));
        jtClientes.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        jtClientes.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtClientes.setFontHead(new java.awt.Font("Metropolis Semi Bold", 0, 12)); // NOI18N
        jtClientes.setFontRowHover(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtClientes.setFontRowSelect(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtClientes.setForegroundHead(new java.awt.Color(0, 0, 0));
        jtClientes.setForegroundHover(new java.awt.Color(0, 0, 0));
        jtClientes.setGridColor(new java.awt.Color(214, 214, 214));
        jtClientes.setHighHead(25);
        jtClientes.setOpaque(false);
        jtClientes.setPreferredSize(new java.awt.Dimension(1096, 671));
        jtClientes.setRowHeight(40);
        jtClientes.setSelectionBackground(new java.awt.Color(54, 197, 240));
        jtClientes.setShowGrid(false);
        jtClientes.setShowHorizontalLines(true);
        jtClientes.getTableHeader().setResizingAllowed(false);
        jtClientes.getTableHeader().setReorderingAllowed(false);
        jtClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtClientes);
        if (jtClientes.getColumnModel().getColumnCount() > 0) {
            jtClientes.getColumnModel().getColumn(0).setResizable(false);
            jtClientes.getColumnModel().getColumn(0).setPreferredWidth(180);
            jtClientes.getColumnModel().getColumn(1).setResizable(false);
            jtClientes.getColumnModel().getColumn(1).setPreferredWidth(60);
            jtClientes.getColumnModel().getColumn(2).setResizable(false);
            jtClientes.getColumnModel().getColumn(2).setPreferredWidth(70);
            jtClientes.getColumnModel().getColumn(3).setResizable(false);
            jtClientes.getColumnModel().getColumn(3).setPreferredWidth(300);
            jtClientes.getColumnModel().getColumn(4).setResizable(false);
            jtClientes.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        Registro.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1090, 650));

        jPanel1.setBackground(new java.awt.Color(14, 21, 30));
        jPanel1.setPreferredSize(new java.awt.Dimension(1095, 30));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbSaldo.setBackground(new java.awt.Color(14, 21, 30));
        jcbSaldo.setForeground(new java.awt.Color(255, 255, 255));
        jcbSaldo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Filtrar por Saldo", "Negativo", "Positivo" }));
        jcbSaldo.setColorMaterial(new java.awt.Color(54, 197, 240));
        jcbSaldo.setEnabled(false);
        jcbSaldo.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jcbSaldo.setPreferredSize(new java.awt.Dimension(200, 30));
        jcbSaldo.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        jPanel1.add(jcbSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, -1));

        jcbNombre.setBackground(new java.awt.Color(14, 21, 30));
        jcbNombre.setForeground(new java.awt.Color(255, 255, 255));
        jcbNombre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Filtrar por Nombre" }));
        jcbNombre.setColorMaterial(new java.awt.Color(54, 197, 240));
        jcbNombre.setEnabled(false);
        jcbNombre.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jcbNombre.setPreferredSize(new java.awt.Dimension(200, 30));
        jcbNombre.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        jPanel1.add(jcbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jcbBox.setBackground(new java.awt.Color(14, 21, 30));
        jcbBox.setForeground(new java.awt.Color(255, 255, 255));
        jcbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Filtrar por Box" }));
        jcbBox.setColorMaterial(new java.awt.Color(54, 197, 240));
        jcbBox.setEnabled(false);
        jcbBox.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jcbBox.setPreferredSize(new java.awt.Dimension(200, 30));
        jcbBox.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        jPanel1.add(jcbBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        jbActualizar.setBackground(new java.awt.Color(14, 21, 30));
        jbActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/actualizar.png"))); // NOI18N
        jbActualizar.setText("Actualizar");
        jbActualizar.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jbActualizar.setPreferredSize(new java.awt.Dimension(120, 30));
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(jbActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(974, 0, -1, -1));

        Registro.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addMenuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addMenuFocusLost
        JOptionPane.showConfirmDialog(this, "Estas seguro que no quieres guardar el cliente?");
        
    }//GEN-LAST:event_addMenuFocusLost

    private void addMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMenuMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addMenuMouseExited

    private void jbNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoClienteActionPerformed
        new CambiaPanel(this.addMenu, new nuevoCliente());
    }//GEN-LAST:event_jbNuevoClienteActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Cliente_data cd = new Cliente_data(con);
            List<Cliente> lista = cd.obtenerClientes();
            
            Cuenta_corriente_data ccd = new Cuenta_corriente_data(con);
            List<Cuenta_corriente> lista2 = ccd.obtenerCuentas_corriente();
            
            mostrarLista(lista, lista2);
            
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la tabla ");
        }
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jtClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClientesMouseClicked
        try{
        int fila = this.jtClientes.getSelectedRow();

        nombre = jtClientes.getValueAt(fila, 0).toString();
        box = jtClientes.getValueAt(fila, 1).toString();
        telefono = jtClientes.getValueAt(fila, 2).toString();
        email = jtClientes.getValueAt(fila, 3).toString();
        saldo = jtClientes.getValueAt(fila, 4).toString();
        
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Cliente_data cliente_data = new Cliente_data(con);

            cliente_pasado = cliente_data.getCliente_por_nombre(nombre);
        
            new CambiaPanel(this.addMenu, new detalleCliente());
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar el detalle, intente otra vez ");
        }
    }//GEN-LAST:event_jtClientesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Registro;
    private javax.swing.JPanel Titulo;
    public static javax.swing.JPanel addMenu;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private newscomponents.RSButtonFlat_new jbActualizar;
    private rsbuttoncustom.RSButtonCustom jbNuevoCliente;
    private RSMaterialComponent.RSComboBoxMaterial jcbBox;
    private RSMaterialComponent.RSComboBoxMaterial jcbNombre;
    private RSMaterialComponent.RSComboBoxMaterial jcbSaldo;
    public static javax.swing.JLabel jlBackground;
    private RSMaterialComponent.RSTableMetroCustom jtClientes;
    // End of variables declaration//GEN-END:variables
}
