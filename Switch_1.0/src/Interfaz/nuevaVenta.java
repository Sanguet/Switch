/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Cliente;
import Clases.Conexion;
import Clases.Cuenta_corriente;
import Clases.Detalle_de_venta;
import Clases.Metodo_de_pago;
import Clases.Producto;
import Clases.Venta;
import Clases_data.Cliente_data;
import Clases_data.Cuenta_corriente_data;
import Clases_data.Detalle_de_venta_data;
import Clases_data.Metodo_de_pago_data;
import Clases_data.Producto_data;
import Clases_data.Venta_data;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class nuevaVenta extends javax.swing.JDialog {

    /**
     * Creates new form nuevaVenta
     */
    public nuevaVenta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        initComponents();
        
        agregarComboClientes();
        AutoCompleteDecorator.decorate(this.jcbBuscarCliente);
        agregarComboMetodos();
        AutoCompleteDecorator.decorate(this.jcbMetodo);
        agregarComboProductos();
        AutoCompleteDecorator.decorate(this.jcbProducto);
        
        DefaultTableModel modelo = (DefaultTableModel) jtDetalle.getModel();
        
    }

    
    
    //Metodos
    private void agregarComboClientes(){
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Cliente_data cd = new Cliente_data(con);
            List<Cliente> listA = cd.obtenerClientes();
            for (int i = 0; i < listA.size(); i++){
                jcbBuscarCliente.addItem(listA.get(i).getNombre());
            }
            
        }catch (Exception e){
          JOptionPane.showMessageDialog(null, "Ocurrio un error inesperado, vuelve a intentar");
        }
    }
    
    private void agregarComboMetodos(){
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Metodo_de_pago_data cd = new Metodo_de_pago_data(con);
            List<Metodo_de_pago> listA = cd.obtenerMetodos_de_pago();
            for (int i = 0; i < listA.size(); i++){
                jcbMetodo.addItem(listA.get(i).getNombre());
            }
            
        }catch (Exception e){
          JOptionPane.showMessageDialog(null, "Ocurrio un error inesperado, vuelve a intentar");
        }
    }
    
    private void agregarComboProductos(){
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Producto_data cd = new Producto_data(con);
            List<Producto> listA = cd.obtenerProductos();
            for (int i = 0; i < listA.size(); i++){
                jcbProducto.addItem(listA.get(i).getNombre());
            }
            
        }catch (Exception e){
          JOptionPane.showMessageDialog(null, "Ocurrio un error inesperado, vuelve a intentar");
        }
    }
    
    public void mostrarLista(List<Producto> lista){
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            
            
            String matris[][] = new String[lista.size()][5];
            
            for (int i = 0; i < lista.size(); i++){
                matris[i][0] = Long.toString(lista.get(i).getCodigo());
                matris[i][1] = lista.get(i).getNombre();
                matris[i][2] = Double.toString(lista.get(i).getCosto());
                matris[i][3] = Double.toString(lista.get(i).getPrecio());
                matris[i][4] = Integer.toString(lista.get(i).getCantidad());
            }
            
            jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            matris,
            new String [] {
                "Codigo", "Nombre", "Coste", "Precio", "Stock"
            }
        ) {
        });
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error inesperado en la lista de productos, vuelve a intentarlo" + e);
        
        }
    }
    
    public void total(){
        try{
            int rows = jtDetalle.getRowCount();
            double total = 0;
            double descuento = Math.abs(Double.parseDouble(jtDescuento.getText()) / 100 - 1);
            for(int i = 0; i < rows; i++ ){
                total += (double)jtDetalle.getValueAt(i, 4);
            }
            jtTotal.setText(String.valueOf(total * descuento));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error inesperado " + e);
        }
    }
    
    //Variables publicas
    public String nombre, precio, stock;
    public int fila_det;


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuVenta = new javax.swing.JPanel();
        jbConfirmar = new javax.swing.JButton();
        jtTotal = new javax.swing.JTextField();
        jtDescuento = new javax.swing.JTextField();
        jlTotal = new javax.swing.JLabel();
        jlNuevaVenta = new javax.swing.JLabel();
        jspLista = new javax.swing.JScrollPane();
        jtDetalle = new javax.swing.JTable();
        jlDescuento = new javax.swing.JLabel();
        jlPorcentaje = new javax.swing.JLabel();
        jcbBuscarCliente = new javax.swing.JComboBox<>();
        jlBuscarCliente = new javax.swing.JLabel();
        jcbMetodo = new javax.swing.JComboBox<>();
        jlMetodo = new javax.swing.JLabel();
        jlPesos = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        listaProductos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jbCerrar = new javax.swing.JButton();
        jlSeleccProductos = new javax.swing.JLabel();
        jcbProducto = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuVenta.setBackground(new java.awt.Color(255, 255, 255));
        menuVenta.setPreferredSize(new java.awt.Dimension(500, 700));
        menuVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbConfirmar.setBackground(new java.awt.Color(224, 30, 90));
        jbConfirmar.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jbConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        jbConfirmar.setText("Confirmar");
        jbConfirmar.setBorderPainted(false);
        jbConfirmar.setPreferredSize(new java.awt.Dimension(200, 35));
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });
        menuVenta.add(jbConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 642, -1, -1));

        jtTotal.setEditable(false);
        jtTotal.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtTotal.setText("0000,00");
        jtTotal.setPreferredSize(new java.awt.Dimension(80, 25));
        jtTotal.setSelectionColor(new java.awt.Color(224, 30, 90));
        jtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTotalActionPerformed(evt);
            }
        });
        menuVenta.add(jtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 606, -1, -1));

        jtDescuento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jtDescuento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtDescuento.setText("0");
        jtDescuento.setPreferredSize(new java.awt.Dimension(50, 25));
        jtDescuento.setSelectionColor(new java.awt.Color(224, 30, 90));
        jtDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDescuentoActionPerformed(evt);
            }
        });
        jtDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtDescuentoKeyReleased(evt);
            }
        });
        menuVenta.add(jtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 606, -1, -1));

        jlTotal.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        jlTotal.setText("Total:");
        menuVenta.add(jlTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 608, 71, -1));

        jlNuevaVenta.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 24)); // NOI18N
        jlNuevaVenta.setText("Nueva Venta");
        menuVenta.add(jlNuevaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 16, 165, -1));

        jspLista.setBorder(null);
        jspLista.setMaximumSize(new java.awt.Dimension(270, 500));
        jspLista.setMinimumSize(new java.awt.Dimension(270, 300));
        jspLista.setPreferredSize(new java.awt.Dimension(450, 490));
        jspLista.setRequestFocusEnabled(false);

        jtDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio", "Cantidad", "Descuento", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtDetalle.setPreferredSize(new java.awt.Dimension(365, 625));
        jtDetalle.setRowHeight(25);
        jtDetalle.setShowGrid(true);
        jtDetalle.setShowVerticalLines(false);
        jtDetalle.getTableHeader().setResizingAllowed(false);
        jtDetalle.getTableHeader().setReorderingAllowed(false);
        jtDetalle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtDetalleFocusGained(evt);
            }
        });
        jtDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtDetalleMouseClicked(evt);
            }
        });
        jtDetalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtDetalleKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtDetalleKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDetalleKeyTyped(evt);
            }
        });
        jspLista.setViewportView(jtDetalle);

        menuVenta.add(jspLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 106, -1, 489));

        jlDescuento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlDescuento.setText("Descuento:");
        menuVenta.add(jlDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 611, 73, -1));

        jlPorcentaje.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jlPorcentaje.setText("%");
        menuVenta.add(jlPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 606, -1, 25));

        jcbBuscarCliente.setPreferredSize(new java.awt.Dimension(270, 27));
        jcbBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbBuscarClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jcbBuscarClienteMouseEntered(evt);
            }
        });
        jcbBuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcbBuscarClienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jcbBuscarClienteKeyTyped(evt);
            }
        });
        menuVenta.add(jcbBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 68, -1, -1));

        jlBuscarCliente.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlBuscarCliente.setText("Buscar Cliente");
        menuVenta.add(jlBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 47, 98, -1));

        menuVenta.add(jcbMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 68, 162, 27));

        jlMetodo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlMetodo.setText("Metodo de Pago");
        menuVenta.add(jlMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 47, 98, -1));

        jlPesos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlPesos.setText("$");
        menuVenta.add(jlPesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 610, -1, -1));

        jButton2.setText("Borrar fila");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        menuVenta.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 650, 90, 30));

        getContentPane().add(menuVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        listaProductos.setBackground(new java.awt.Color(255, 255, 255));
        listaProductos.setPreferredSize(new java.awt.Dimension(696, 700));
        listaProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
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
                "Codigo", "Nombre", "Costo", "Precio", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProductos.setEnabled(false);
        jtProductos.setPreferredSize(new java.awt.Dimension(365, 625));
        jtProductos.setRowHeight(25);
        jtProductos.setShowGrid(true);
        jtProductos.setShowVerticalLines(false);
        jtProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProductosMouseClicked(evt);
            }
        });
        jtProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtProductosKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jtProductos);

        listaProductos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 670, 570));

        jbCerrar.setBackground(new java.awt.Color(255, 51, 102));
        jbCerrar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/CerrarC.png"))); // NOI18N
        jbCerrar.setToolTipText("");
        jbCerrar.setAutoscrolls(true);
        jbCerrar.setBorder(null);
        jbCerrar.setBorderPainted(false);
        jbCerrar.setContentAreaFilled(false);
        jbCerrar.setMaximumSize(new java.awt.Dimension(40, 25));
        jbCerrar.setMinimumSize(new java.awt.Dimension(40, 25));
        jbCerrar.setPreferredSize(new java.awt.Dimension(35, 25));
        jbCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/CloD.png"))); // NOI18N
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });
        listaProductos.add(jbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 0, -1, -1));

        jlSeleccProductos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlSeleccProductos.setText("Seleccionar Productos");
        listaProductos.add(jlSeleccProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 160, -1));

        listaProductos.add(jcbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 260, 30));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        listaProductos.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 70, 30));

        getContentPane().add(listaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        int rows = jtDetalle.getRowCount();
        int msj = JOptionPane.showConfirmDialog(null,"¿Estas seguro de realizar esta venta?");
        if(JOptionPane.YES_OPTION == msj){
            try {
                if (rows > 0){
                    //Conexion y datas
                    Conexion con = null;
                    con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
                    Producto_data pd = new Producto_data(con);
                    Detalle_de_venta_data ddvd = new Detalle_de_venta_data(con);
                    Cliente_data cd = new Cliente_data(con);
                    Venta_data vd = new Venta_data(con);
                    Cuenta_corriente_data ccd = new Cuenta_corriente_data(con);
                    
                    //Variables de venta
                    int indice = jcbBuscarCliente.getSelectedIndex();
                    int indice2 = jcbMetodo.getSelectedIndex();
                    Metodo_de_pago_data mdpd = new Metodo_de_pago_data(con);
                    int id_cliente = cd.getCliente_por_nombre(jcbBuscarCliente.getItemAt(indice)).getId();
                    int id_metodo_de_pago = mdpd.getMetodo_de_pago_por_nombre(jcbMetodo.getItemAt(indice2)).getId();
                    String comentario = "";
                    
                    //Creacion de los detalles de ventas y las ventas
                    for (int i = 0; i < rows; i++){
                        int id_producto = pd.getProducto_por_nombre(jtDetalle.getValueAt(i, 0).toString()).getId();
                        Detalle_de_venta detalle_de_venta = new Detalle_de_venta(id_producto,(Integer)jtDetalle.getValueAt(i, 2), (int)(double)jtDetalle.getValueAt(i, 3), (Double)jtDetalle.getValueAt(i, 4));
                        ddvd.guardarDetalle_de_venta(detalle_de_venta);
                        int id_detalle = ddvd.obtenerDetalle_de_venta().get(ddvd.obtenerDetalle_de_venta().size()-1).getId();
                        int descuento = Integer.parseInt(jtDescuento.getText());
                        Double total = Double.parseDouble(jtDetalle.getValueAt(i, 4).toString());
                        Venta venta = new Venta(id_cliente, id_detalle, id_metodo_de_pago, total, descuento, comentario);
                        if("Cuenta corriente".equals(jcbMetodo.getItemAt(indice2))){
                            Cliente cliente = cd.getCliente_por_id(id_cliente);
                            Cuenta_corriente cuenta_nueva = ccd.getCuenta_corriente_por_cliente(id_cliente);
                            cuenta_nueva.setMonto(total * -1 + cuenta_nueva.getMonto());
                            ccd.actualizarCuenta_corriente(cuenta_nueva);
                        }   
                        vd.guardarVenta(venta);
                    }
                    
                    
                    JOptionPane.showMessageDialog(null, "Felicidades, venta finalizada");
                    
                    Inicio.jlFondo.setVisible(false);
                    this.setVisible(false);

                    con.close();
                }else{
                    JOptionPane.showMessageDialog(null, "Ocurrio un error al guardar la venta, no hay productos seleccionados");
                }
            } catch (Exception e){
                System.out.println("Error al instanciar la clase conexion " + e.getMessage());
                JOptionPane.showMessageDialog(null,"No se pudo guardar la venta, intente nuevamente " + e);
            }
        }
    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTotalActionPerformed

    private void jtDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDescuentoActionPerformed

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        // TODO add your handling code here:
        Inicio.jlFondo.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jtProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosMouseClicked


        int fila = this.jtProductos.getSelectedRow();
        
        nombre = jtProductos.getValueAt(fila, 1).toString();
        precio = jtProductos.getValueAt(fila, 3).toString();
        stock = jtProductos.getValueAt(fila, 4).toString();
        
        
       
    }//GEN-LAST:event_jtProductosMouseClicked

    private void jtDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDetalleMouseClicked
        
    }//GEN-LAST:event_jtDetalleMouseClicked

    private void jcbBuscarClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbBuscarClienteKeyPressed

    }//GEN-LAST:event_jcbBuscarClienteKeyPressed

    private void jcbBuscarClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbBuscarClienteKeyTyped

    }//GEN-LAST:event_jcbBuscarClienteKeyTyped

    private void jcbBuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbBuscarClienteMouseClicked
    }//GEN-LAST:event_jcbBuscarClienteMouseClicked

    private void jcbBuscarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbBuscarClienteMouseEntered
    }//GEN-LAST:event_jcbBuscarClienteMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Producto_data producto_data = new Producto_data(con);
            int indice = jcbProducto.getSelectedIndex();
            List<Producto> lista_productos = producto_data.obtenerProductos_por_nombre(jcbProducto.getItemAt(indice));
            
            mostrarLista(lista_productos);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la tabla " + e.getMessage());
        }
        jtProductos.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtProductosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtProductosKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER){
            DefaultTableModel modelo = (DefaultTableModel) jtDetalle.getModel();
            modelo.addRow(new Object []{nombre,Double.parseDouble(precio),1,Double.parseDouble("0"),Double.parseDouble(precio)});
            jtDetalle.requestFocus();
            total();
            
        }
    }//GEN-LAST:event_jtProductosKeyTyped

    private void jtDetalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDetalleKeyTyped
        
    }//GEN-LAST:event_jtDetalleKeyTyped

    private void jtDetalleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDetalleKeyReleased
        char c = evt.getKeyChar();
            if (c == KeyEvent.VK_ENTER){
                int fila = this.jtDetalle.getSelectedRow();
                int cantidad = (Integer)(jtDetalle.getValueAt(fila, 2));
                double descuento;
                if((Double)jtDetalle.getValueAt(fila, 3) == 0){
                    descuento = 1;
                } else {
                    descuento = Math.abs(((Double)jtDetalle.getValueAt(fila, 3) / 100) - 1);
                }
                Double precio_base = (Double)jtDetalle.getValueAt(fila, 1);
                double sub_total = precio_base * descuento * cantidad;
                jtDetalle.setValueAt(sub_total , fila, 4);
                total();
        }
    }//GEN-LAST:event_jtDetalleKeyReleased

    private void jtDetalleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDetalleKeyPressed
            
    }//GEN-LAST:event_jtDetalleKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            DefaultTableModel modelo = (DefaultTableModel) jtDetalle.getModel();
            int fila = this.jtDetalle.getSelectedRow();
            modelo.removeRow(fila);
            total();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Tienes que seleccionar una fila");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtDescuentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDescuentoKeyReleased
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER){
            total();
        }
    }//GEN-LAST:event_jtDescuentoKeyReleased

    private void jtDetalleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDetalleFocusGained
        jtDetalle.setColumnSelectionAllowed(true);
        jtDetalle.setCellSelectionEnabled(true);
    }//GEN-LAST:event_jtDetalleFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(nuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                nuevaVenta dialog = new nuevaVenta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JComboBox<String> jcbBuscarCliente;
    private javax.swing.JComboBox<String> jcbMetodo;
    private javax.swing.JComboBox<String> jcbProducto;
    private javax.swing.JLabel jlBuscarCliente;
    private javax.swing.JLabel jlDescuento;
    private javax.swing.JLabel jlMetodo;
    private javax.swing.JLabel jlNuevaVenta;
    private javax.swing.JLabel jlPesos;
    private javax.swing.JLabel jlPorcentaje;
    private javax.swing.JLabel jlSeleccProductos;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JScrollPane jspLista;
    private javax.swing.JTextField jtDescuento;
    private javax.swing.JTable jtDetalle;
    private javax.swing.JTable jtProductos;
    private javax.swing.JTextField jtTotal;
    private javax.swing.JPanel listaProductos;
    private javax.swing.JPanel menuVenta;
    // End of variables declaration//GEN-END:variables
}
