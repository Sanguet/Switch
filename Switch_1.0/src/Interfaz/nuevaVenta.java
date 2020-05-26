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
        jtTotal = new javax.swing.JTextField();
        jtDescuento = new javax.swing.JTextField();
        jlTotal = new javax.swing.JLabel();
        jlNuevaVenta = new javax.swing.JLabel();
        jlDescuento = new javax.swing.JLabel();
        jlPorcentaje = new javax.swing.JLabel();
        jlPesos = new javax.swing.JLabel();
        jcbBuscarCliente = new RSMaterialComponent.RSComboBoxMaterial();
        jcbMetodo = new RSMaterialComponent.RSComboBoxMaterial();
        jbBorrarFila = new newscomponents.RSButtonFlat_new();
        jbConfirmar = new newscomponents.RSButtonFlat_new();
        jspLista = new javax.swing.JScrollPane();
        jtDetalle = new RSMaterialComponent.RSTableMetroCustom();
        listaProductos = new javax.swing.JPanel();
        jbCerrar = new javax.swing.JButton();
        jcbProducto = new RSMaterialComponent.RSComboBoxMaterial();
        jButton1 = new newscomponents.RSButtonFlat_new();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProductos = new RSMaterialComponent.RSTableMetroCustom();
        jButton2 = new newscomponents.RSButtonFlat_new();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuVenta.setBackground(new java.awt.Color(255, 255, 255));
        menuVenta.setPreferredSize(new java.awt.Dimension(500, 700));
        menuVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jlDescuento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlDescuento.setText("Descuento:");
        menuVenta.add(jlDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 611, 73, -1));

        jlPorcentaje.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jlPorcentaje.setText("%");
        menuVenta.add(jlPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 606, -1, 25));

        jlPesos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlPesos.setText("$");
        menuVenta.add(jlPesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 610, -1, -1));

        jcbBuscarCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar Cliente" }));
        jcbBuscarCliente.setColorMaterial(new java.awt.Color(224, 30, 90));
        jcbBuscarCliente.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jcbBuscarCliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jcbBuscarCliente.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        menuVenta.add(jcbBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 67, -1, -1));

        jcbMetodo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Metodo de pago" }));
        jcbMetodo.setColorMaterial(new java.awt.Color(224, 30, 90));
        jcbMetodo.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jcbMetodo.setPreferredSize(new java.awt.Dimension(140, 30));
        jcbMetodo.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        jcbMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMetodoActionPerformed(evt);
            }
        });
        jcbMetodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jcbMetodoKeyTyped(evt);
            }
        });
        menuVenta.add(jcbMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 67, -1, -1));

        jbBorrarFila.setBackground(new java.awt.Color(14, 21, 30));
        jbBorrarFila.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/borrar.png"))); // NOI18N
        jbBorrarFila.setText("Borrar Fila");
        jbBorrarFila.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jbBorrarFila.setIconTextGap(3);
        jbBorrarFila.setPreferredSize(new java.awt.Dimension(105, 30));
        jbBorrarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarFilaActionPerformed(evt);
            }
        });
        menuVenta.add(jbBorrarFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 67, -1, -1));

        jbConfirmar.setBackground(new java.awt.Color(224, 30, 90));
        jbConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/confirmar.png"))); // NOI18N
        jbConfirmar.setText("Confirmar");
        jbConfirmar.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jbConfirmar.setPreferredSize(new java.awt.Dimension(200, 35));
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });
        menuVenta.add(jbConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 642, -1, -1));

        jspLista.setPreferredSize(new java.awt.Dimension(450, 489));

        jtDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio", "Cant.", "Desc.", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtDetalle.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jtDetalle.setBackgoundHead(new java.awt.Color(14, 21, 30));
        jtDetalle.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        jtDetalle.setColorSecondary(new java.awt.Color(255, 255, 255));
        jtDetalle.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        jtDetalle.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtDetalle.setFontHead(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jtDetalle.setFontRowHover(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtDetalle.setFontRowSelect(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtDetalle.setForegroundHover(new java.awt.Color(0, 0, 0));
        jtDetalle.setGridColor(new java.awt.Color(214, 214, 214));
        jtDetalle.setHighHead(25);
        jtDetalle.setRowHeight(40);
        jtDetalle.setSelectionBackground(new java.awt.Color(224, 30, 90));
        jtDetalle.setShowGrid(false);
        jtDetalle.setShowHorizontalLines(true);
        jtDetalle.getTableHeader().setReorderingAllowed(false);
        jtDetalle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtDetalleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtDetalleFocusLost(evt);
            }
        });
        jtDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtDetalleMouseClicked(evt);
            }
        });
        jtDetalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtDetalleKeyReleased(evt);
            }
        });
        jspLista.setViewportView(jtDetalle);
        if (jtDetalle.getColumnModel().getColumnCount() > 0) {
            jtDetalle.getColumnModel().getColumn(0).setResizable(false);
            jtDetalle.getColumnModel().getColumn(0).setPreferredWidth(150);
            jtDetalle.getColumnModel().getColumn(1).setResizable(false);
            jtDetalle.getColumnModel().getColumn(2).setResizable(false);
            jtDetalle.getColumnModel().getColumn(2).setPreferredWidth(40);
            jtDetalle.getColumnModel().getColumn(3).setResizable(false);
            jtDetalle.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        menuVenta.add(jspLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 110, -1, -1));

        getContentPane().add(menuVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        listaProductos.setBackground(new java.awt.Color(255, 255, 255));
        listaProductos.setPreferredSize(new java.awt.Dimension(696, 700));
        listaProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jcbProducto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar Producto" }));
        jcbProducto.setColorMaterial(new java.awt.Color(224, 30, 90));
        jcbProducto.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jcbProducto.setOpaque(true);
        jcbProducto.setPreferredSize(new java.awt.Dimension(260, 30));
        jcbProducto.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        jcbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProductoActionPerformed(evt);
            }
        });
        listaProductos.add(jcbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 67, -1, -1));

        jButton1.setBackground(new java.awt.Color(14, 21, 30));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/add.png"))); // NOI18N
        jButton1.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jButton1.setIconTextGap(3);
        jButton1.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        listaProductos.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 50, -1));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(670, 570));

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Categoria", "Codigo", "Nombre", "Costo", "Precio", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProductos.setBackgoundHead(new java.awt.Color(14, 21, 30));
        jtProductos.setBorderHead(null);
        jtProductos.setColorPrimaryText(new java.awt.Color(0, 0, 0));
        jtProductos.setColorSecondary(new java.awt.Color(255, 255, 255));
        jtProductos.setColorSecundaryText(new java.awt.Color(0, 0, 0));
        jtProductos.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtProductos.setFontHead(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jtProductos.setFontRowHover(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtProductos.setFontRowSelect(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtProductos.setForegroundHover(new java.awt.Color(0, 0, 0));
        jtProductos.setGridColor(new java.awt.Color(214, 214, 214));
        jtProductos.setHighHead(25);
        jtProductos.setRowHeight(30);
        jtProductos.setSelectionBackground(new java.awt.Color(224, 30, 90));
        jtProductos.setShowGrid(false);
        jtProductos.setShowHorizontalLines(true);
        jtProductos.getTableHeader().setResizingAllowed(false);
        jtProductos.getTableHeader().setReorderingAllowed(false);
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
        if (jtProductos.getColumnModel().getColumnCount() > 0) {
            jtProductos.getColumnModel().getColumn(0).setResizable(false);
            jtProductos.getColumnModel().getColumn(0).setPreferredWidth(120);
            jtProductos.getColumnModel().getColumn(1).setResizable(false);
            jtProductos.getColumnModel().getColumn(1).setPreferredWidth(50);
            jtProductos.getColumnModel().getColumn(2).setPreferredWidth(150);
            jtProductos.getColumnModel().getColumn(5).setResizable(false);
            jtProductos.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        listaProductos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        jButton2.setBackground(new java.awt.Color(14, 21, 30));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/buscar.png"))); // NOI18N
        jButton2.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jButton2.setIconTextGap(3);
        jButton2.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        listaProductos.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        getContentPane().add(listaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTotalActionPerformed

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        // TODO add your handling code here:
        Inicio.jlFondo.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jtDescuentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDescuentoKeyReleased
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER){
            total();
        }
    }//GEN-LAST:event_jtDescuentoKeyReleased

    private void jtDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDescuentoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jtDetalle.getModel();
        modelo.addRow(new Object []{nombre,Double.parseDouble(precio),1,Double.parseDouble("0"),Double.parseDouble(precio)});
        jtDetalle.requestFocus();
        total();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbBorrarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarFilaActionPerformed
        try{
            DefaultTableModel modelo = (DefaultTableModel) jtDetalle.getModel();
            int fila = this.jtDetalle.getSelectedRow();
            modelo.removeRow(fila);
            total();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Tienes que seleccionar una fila");
        }
    }//GEN-LAST:event_jbBorrarFilaActionPerformed

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
                    int id_cliente = cd.getCliente_por_nombre(String.valueOf(jcbBuscarCliente.getItemAt(indice))).getId();
                    int id_metodo_de_pago = mdpd.getMetodo_de_pago_por_nombre(String.valueOf(jcbMetodo.getItemAt(indice2))).getId();
                    String comentario = "";
                    
                    //Creacion de los detalles de ventas y las ventas
                    for (int i = 0; i < rows; i++){
                        int cantidad_producto = pd.getProducto_por_nombre(jtDetalle.getValueAt(i, 0).toString()).getCantidad();
                        String cantidad_vendida = (String) jtDetalle.getValueAt(i, 2);
                        int id_producto = pd.getProducto_por_nombre(jtDetalle.getValueAt(i, 0).toString()).getId();
                        Detalle_de_venta detalle_de_venta = new Detalle_de_venta(id_producto, Integer.parseInt(cantidad_vendida), (int)(double)jtDetalle.getValueAt(i, 3), (Double)jtDetalle.getValueAt(i, 4));
                        if(cantidad_producto >= Integer.parseInt(cantidad_vendida)){
                            ddvd.guardarDetalle_de_venta(detalle_de_venta);
                            int id_detalle = ddvd.obtenerDetalle_de_venta().get(ddvd.obtenerDetalle_de_venta().size()-1).getId();
                            int descuento = Integer.parseInt(jtDescuento.getText());
                            Double total = Double.parseDouble(jtDetalle.getValueAt(i, 4).toString());
                            Venta venta = new Venta(id_cliente, id_detalle, id_metodo_de_pago, total, descuento, comentario);
                            if("Cuenta corriente".equals(jcbMetodo.getItemAt(indice2))){
                                Cuenta_corriente cuenta_nueva = ccd.getCuenta_corriente_por_cliente(id_cliente);
                                cuenta_nueva.setMonto(total * -1 + cuenta_nueva.getMonto());
                                ccd.actualizarCuenta_corriente(cuenta_nueva);
                            }
                            pd.actualizarStock_por_id_producto(cantidad_producto - detalle_de_venta.getCantidad(), id_producto);
                            
                            vd.guardarVenta(venta);
                            JOptionPane.showMessageDialog(null, "Felicidades, venta finalizada");
                            
                            Inicio.jlFondo.setVisible(false);
                            this.setVisible(false);
                        } else {
                            JOptionPane.showMessageDialog(null, "La venta fue cancelada porque no tienes suficiente stock de " + jtDetalle.getValueAt(i, 0).toString());
                        }
                    }
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

    private void jcbMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMetodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMetodoActionPerformed

    private void jcbMetodoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbMetodoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMetodoKeyTyped

    private void jtProductosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtProductosKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER){
            DefaultTableModel modelo = (DefaultTableModel) jtDetalle.getModel();
            modelo.addRow(new Object []{nombre,Double.parseDouble(precio),1,Double.parseDouble("0"),Double.parseDouble(precio)});
            jtDetalle.requestFocus();
            total();
        }
    }//GEN-LAST:event_jtProductosKeyTyped

    private void jtProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosMouseClicked
        int fila = this.jtProductos.getSelectedRow();
        
        nombre = jtProductos.getValueAt(fila, 1).toString();
        precio = jtProductos.getValueAt(fila, 3).toString();
        stock = jtProductos.getValueAt(fila, 4).toString();
    }//GEN-LAST:event_jtProductosMouseClicked

    private void jtDetalleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDetalleFocusGained
    }//GEN-LAST:event_jtDetalleFocusGained

    private void jtDetalleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDetalleFocusLost

    }//GEN-LAST:event_jtDetalleFocusLost

    private void jtDetalleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDetalleKeyReleased
        char c = evt.getKeyChar();
            if (c == KeyEvent.VK_ENTER){
                try{
                    int fila = this.jtDetalle.getSelectedRow();
                    String cantidad =  (String) jtDetalle.getValueAt(fila, 2);
                    double descuento;
                    if((Double)jtDetalle.getValueAt(fila, 3) == 0){
                        descuento = 1;
                    } else {
                        descuento = Math.abs(((Double)jtDetalle.getValueAt(fila, 3) / 100) - 1);
                    }
                    Double precio_base = (Double)jtDetalle.getValueAt(fila, 1);
                    double sub_total = precio_base * descuento * Integer.parseInt(cantidad);
                    jtDetalle.setValueAt(sub_total , fila, 4);
                    total();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Error desconocido " + e);
                }
        }
    }//GEN-LAST:event_jtDetalleKeyReleased

    private void jcbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbProductoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Producto_data producto_data = new Producto_data(con);
            int indice = jcbProducto.getSelectedIndex();
            List<Producto> lista_productos = producto_data.obtenerProductos_por_nombre(String.valueOf(jcbProducto.getItemAt(indice)));

            mostrarLista(lista_productos);

        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la tabla " + e.getMessage());
        }
        jtProductos.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDetalleMouseClicked
    }//GEN-LAST:event_jtDetalleMouseClicked

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
    private newscomponents.RSButtonFlat_new jButton1;
    private newscomponents.RSButtonFlat_new jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private newscomponents.RSButtonFlat_new jbBorrarFila;
    private javax.swing.JButton jbCerrar;
    private newscomponents.RSButtonFlat_new jbConfirmar;
    private RSMaterialComponent.RSComboBoxMaterial jcbBuscarCliente;
    private RSMaterialComponent.RSComboBoxMaterial jcbMetodo;
    private RSMaterialComponent.RSComboBoxMaterial jcbProducto;
    private javax.swing.JLabel jlDescuento;
    private javax.swing.JLabel jlNuevaVenta;
    private javax.swing.JLabel jlPesos;
    private javax.swing.JLabel jlPorcentaje;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JScrollPane jspLista;
    private javax.swing.JTextField jtDescuento;
    private RSMaterialComponent.RSTableMetroCustom jtDetalle;
    private RSMaterialComponent.RSTableMetroCustom jtProductos;
    private javax.swing.JTextField jtTotal;
    private javax.swing.JPanel listaProductos;
    private javax.swing.JPanel menuVenta;
    // End of variables declaration//GEN-END:variables
}
