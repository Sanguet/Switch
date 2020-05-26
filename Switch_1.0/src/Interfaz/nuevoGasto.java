/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Categoria;
import Clases.Conexion;
import Clases.Detalle_de_venta;
import Clases.Gasto;
import Clases.Metodo_de_pago;
import Clases.Producto;
import Clases.Provedor;
import Clases_data.Categoria_data;
import Clases_data.Detalle_de_venta_data;
import Clases_data.Gasto_data;
import Clases_data.Metodo_de_pago_data;
import Clases_data.Producto_data;
import Clases_data.Provedor_data;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import pnls.Gastos1;

/**
 *
 * @author Alex
 */
public class nuevoGasto extends javax.swing.JDialog {

    /**
     * Creates new form nuevoGasto
     */
    public nuevoGasto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        agregarComboCategorias();
        AutoCompleteDecorator.decorate(this.jcbCategoria);
        agregarComboMetodos();
        AutoCompleteDecorator.decorate(this.jcbMetodo);
        agregarComboProductos();
        AutoCompleteDecorator.decorate(this.jcbProducto);
        agregarComboProvedores();
        AutoCompleteDecorator.decorate(this.jcbProvedor);
        jcArqueo.setVisible(false);
    }
    
    //Metodos
    private void agregarComboCategorias(){
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Categoria_data cd = new Categoria_data(con);
            List<Categoria> listA = cd.obtenerCategorias();
            for (int i = 0; i < listA.size(); i++){
                jcbCategoria.addItem(listA.get(i).getNombre());
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
    
    //El combo servicio funciona bien
    private void agregarComboServicios(){
        try{
            jcbProducto.addItem("Expensas");
            jcbProducto.addItem("Empleados");
            jcbProducto.addItem("Retiro de dinero");
            jcbProducto.addItem("Otros");
            
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
    
    public void mostrarLista(List<Producto> lista){
        try{
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
    
    //Lista de servicios funciona bien
    public void mostrarListaServicios(){
        try{
            String matris[][] = new String[4][5];
            
            matris[0][0] = "Expensas";
            matris[0][1] = "0";
            matris[1][0] = "Empleados";
            matris[1][1] = "0";
            matris[2][0] = "Retiro de dinero";
            matris[2][1] = "0";
            matris[3][0] = "Otros";
            matris[3][1] = "0";
            
            
            jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            matris,
            new String [] {
                "Nombre","Importe"
            }
        ) {
        });
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error inesperado en la lista de servicios, vuelve a intentarlo" + e);
        
        }
    }
    
    public void mostrarDetalleServicios(){
        try{
            String matris[][] = new String[0][5];
            
            jtDetalle.setModel(new javax.swing.table.DefaultTableModel(
            matris,
            new String [] {
                "Nombre","Importe"
            }
        ) {
        });
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error inesperado en la lista de servicios, vuelve a intentarlo" + e);
        
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
    
    public void total_servicios(){
        jtTotal.setText(jtDetalle.getValueAt(0, 1).toString());
    }
    
    //Variables
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

        menuGasto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jspComentario = new javax.swing.JScrollPane();
        jtaComentario = new javax.swing.JTextArea();
        jlPesos = new javax.swing.JLabel();
        jlPorcentaje = new javax.swing.JLabel();
        jlDescuento = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();
        jtTotal = new javax.swing.JTextField();
        jtDescuento = new javax.swing.JTextField();
        jbConfirmar = new newscomponents.RSButtonFlat_new();
        jcbMetodo = new RSMaterialComponent.RSComboBoxMaterial();
        jcbProvedor = new RSMaterialComponent.RSComboBoxMaterial();
        jcbCategoria = new RSMaterialComponent.RSComboBoxMaterial();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDetalle = new RSMaterialComponent.RSTableMetroCustom();
        jcArqueo = new javax.swing.JCheckBox();
        jbBorrarFila = new newscomponents.RSButtonFlat_new();
        listaProductos = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jcbProducto = new RSMaterialComponent.RSComboBoxMaterial();
        jButton2 = new newscomponents.RSButtonFlat_new();
        jButton1 = new newscomponents.RSButtonFlat_new();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProductos = new RSMaterialComponent.RSTableMetroCustom();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuGasto.setBackground(new java.awt.Color(255, 255, 255));
        menuGasto.setPreferredSize(new java.awt.Dimension(500, 700));
        menuGasto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 24)); // NOI18N
        jLabel2.setText("Nuevo Gasto");
        menuGasto.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 30, 165, -1));

        jtaComentario.setColumns(20);
        jtaComentario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtaComentario.setLineWrap(true);
        jtaComentario.setRows(5);
        jtaComentario.setText("Comentario");
        jtaComentario.setToolTipText("");
        jtaComentario.setMinimumSize(new java.awt.Dimension(450, 50));
        jspComentario.setViewportView(jtaComentario);

        menuGasto.add(jspComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 194, 450, 66));

        jlPesos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlPesos.setText("$");
        menuGasto.add(jlPesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 608, -1, -1));

        jlPorcentaje.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jlPorcentaje.setText("%");
        menuGasto.add(jlPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 603, -1, 25));

        jlDescuento.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlDescuento.setText("Descuento:");
        menuGasto.add(jlDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 609, 73, -1));

        jlTotal.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 18)); // NOI18N
        jlTotal.setText("Importe:");
        menuGasto.add(jlTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 603, 94, -1));

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
        menuGasto.add(jtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 606, -1, -1));

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
        menuGasto.add(jtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 606, -1, -1));

        jbConfirmar.setBackground(new java.awt.Color(46, 182, 125));
        jbConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/confirmar.png"))); // NOI18N
        jbConfirmar.setText("Confirmar");
        jbConfirmar.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jbConfirmar.setPreferredSize(new java.awt.Dimension(200, 35));
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });
        menuGasto.add(jbConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 642, -1, -1));

        jcbMetodo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Metodo de pago" }));
        jcbMetodo.setColorMaterial(new java.awt.Color(46, 182, 125));
        jcbMetodo.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jcbMetodo.setPreferredSize(new java.awt.Dimension(180, 30));
        jcbMetodo.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        menuGasto.add(jcbMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 71, 220, -1));

        jcbProvedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Proveedor" }));
        jcbProvedor.setColorMaterial(new java.awt.Color(46, 182, 125));
        jcbProvedor.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jcbProvedor.setPreferredSize(new java.awt.Dimension(180, 30));
        jcbProvedor.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        jcbProvedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProvedorActionPerformed(evt);
            }
        });
        menuGasto.add(jcbProvedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 134, 220, -1));

        jcbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar Categoria" }));
        jcbCategoria.setColorMaterial(new java.awt.Color(46, 182, 125));
        jcbCategoria.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jcbCategoria.setPreferredSize(new java.awt.Dimension(180, 30));
        jcbCategoria.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        jcbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCategoriaActionPerformed(evt);
            }
        });
        menuGasto.add(jcbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 71, 220, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(450, 321));

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
        jtDetalle.setSelectionBackground(new java.awt.Color(46, 182, 125));
        jtDetalle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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
        jScrollPane1.setViewportView(jtDetalle);
        if (jtDetalle.getColumnModel().getColumnCount() > 0) {
            jtDetalle.getColumnModel().getColumn(0).setResizable(false);
            jtDetalle.getColumnModel().getColumn(0).setPreferredWidth(140);
            jtDetalle.getColumnModel().getColumn(1).setResizable(false);
            jtDetalle.getColumnModel().getColumn(2).setPreferredWidth(40);
            jtDetalle.getColumnModel().getColumn(3).setPreferredWidth(50);
            jtDetalle.getColumnModel().getColumn(4).setResizable(false);
        }

        menuGasto.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 271, -1, -1));

        jcArqueo.setBackground(new java.awt.Color(255, 255, 255));
        jcArqueo.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jcArqueo.setSelected(true);
        jcArqueo.setText("Usar en arqueo");
        jcArqueo.setBorder(null);
        jcArqueo.setEnabled(false);
        jcArqueo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jcArqueo.setIconTextGap(10);
        menuGasto.add(jcArqueo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jbBorrarFila.setBackground(new java.awt.Color(14, 21, 30));
        jbBorrarFila.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/borrar.png"))); // NOI18N
        jbBorrarFila.setText("Borrar Fila");
        jbBorrarFila.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jbBorrarFila.setIconTextGap(3);
        jbBorrarFila.setPreferredSize(new java.awt.Dimension(105, 30));
        menuGasto.add(jbBorrarFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 134, -1, -1));

        getContentPane().add(menuGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        listaProductos.setBackground(new java.awt.Color(255, 255, 255));
        listaProductos.setPreferredSize(new java.awt.Dimension(696, 700));
        listaProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(255, 51, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/CerrarC.png"))); // NOI18N
        jButton3.setToolTipText("");
        jButton3.setAutoscrolls(true);
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setMaximumSize(new java.awt.Dimension(40, 25));
        jButton3.setMinimumSize(new java.awt.Dimension(40, 25));
        jButton3.setPreferredSize(new java.awt.Dimension(35, 25));
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets.Icons/CloD.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        listaProductos.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 0, -1, -1));

        jcbProducto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buscar Producto" }));
        jcbProducto.setColorMaterial(new java.awt.Color(46, 182, 125));
        jcbProducto.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 14)); // NOI18N
        jcbProducto.setOpaque(true);
        jcbProducto.setPreferredSize(new java.awt.Dimension(260, 30));
        jcbProducto.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        jcbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProductoActionPerformed(evt);
            }
        });
        listaProductos.add(jcbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 71, -1, -1));

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
        jtProductos.setSelectionBackground(new java.awt.Color(46, 182, 125));
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

        listaProductos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        getContentPane().add(listaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Inicio.jlFondo.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            DefaultTableModel modelo = (DefaultTableModel) jtDetalle.getModel();
            int fila = this.jtDetalle.getSelectedRow();
            modelo.removeRow(fila);
            total();
            //total_servicios();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Tienes que seleccionar una fila");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTotalActionPerformed

    private void jtDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDescuentoActionPerformed

    private void jtDescuentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDescuentoKeyReleased
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER){
            total();
            total_servicios();
        }
    }//GEN-LAST:event_jtDescuentoKeyReleased

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        int rows = jtDetalle.getRowCount();
        int msj = JOptionPane.showConfirmDialog(null,"¿Estas seguro de realizar este gasto?");
        if(JOptionPane.YES_OPTION == msj){
            try {
                if (rows > 0){
                    //Conexion y datas
                    Conexion con = null;
                    con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
                    Producto_data pd = new Producto_data(con);
                    Detalle_de_venta_data ddvd = new Detalle_de_venta_data(con);
                    Gasto_data gd = new Gasto_data(con);
                    Categoria_data cd = new Categoria_data(con);
                    Provedor_data pvd = new Provedor_data(con);
                    

                    //Variables de venta
                    int indice = jcbCategoria.getSelectedIndex();
                    int indice2 = jcbMetodo.getSelectedIndex();
                    int indice3 = jcbProvedor.getSelectedIndex();
                    Metodo_de_pago_data mdpd = new Metodo_de_pago_data(con);
                    
                    int id_categoria = cd.getCategoria_por_nombre(String.valueOf(jcbCategoria.getItemAt(indice))).getId();
                    int id_metodo_de_pago = mdpd.getMetodo_de_pago_por_nombre(String.valueOf(jcbMetodo.getItemAt(indice2))).getId();
                    int id_provedor = pvd.getProvedor_por_nombre(String.valueOf(jcbProvedor.getItemAt(indice3))).getId();
                    String comentario = jtaComentario.getText();
                    
                    //Creacion de los detalles de ventas y las ventas
                    String categoria = String.valueOf(jcbMetodo.getItemAt(indice));
                    
                    /*Inicio de los servicios
                    if("Servicios".equals(categoria)){
                            int id_producto = pd.getProducto_por_nombre(jtDetalle.getValueAt(0, 0).toString()).getId();
                            Detalle_de_venta detalle_de_venta = new Detalle_de_venta(id_producto, 1, 0, (Double)jtDetalle.getValueAt(0, 1));
                            ddvd.guardarDetalle_de_venta(detalle_de_venta);
                            int id_detalle = ddvd.obtenerDetalle_de_venta().get(ddvd.obtenerDetalle_de_venta().size()-1).getId();
                            Double total = Double.parseDouble(jtDetalle.getValueAt(0, 1).toString());
                            Gasto gasto = new Gasto(id_provedor, total, id_metodo_de_pago, id_categoria, id_detalle, comentario);
                            
                            gd.guardarGasto(gasto);
                    } else {
                    

                    }*/
                    for (int i = 0; i < rows; i++){
                        Producto producto = pd.getProducto_por_nombre(jtDetalle.getValueAt(i, 0).toString());
                        int id_producto = producto.getId();
                        int cantidad_producto = producto.getCantidad();
                        Detalle_de_venta detalle_de_venta = new Detalle_de_venta(id_producto,Integer.parseInt(jtDetalle.getValueAt(i, 2).toString()), (int)(Double.parseDouble(jtDetalle.getValueAt(i, 3).toString())), Double.parseDouble(jtDetalle.getValueAt(i, 4).toString()));
                        ddvd.guardarDetalle_de_venta(detalle_de_venta);
                        int id_detalle = ddvd.obtenerDetalle_de_venta().get(ddvd.obtenerDetalle_de_venta().size()-1).getId();
                        int descuento = Integer.parseInt(jtDescuento.getText());
                        Double total = Double.parseDouble(jtDetalle.getValueAt(i, 4).toString());
                        Gasto gasto = new Gasto(id_provedor, total, id_metodo_de_pago, id_categoria, id_detalle, comentario);

                        pd.actualizarStock_por_id_producto(detalle_de_venta.getCantidad() + cantidad_producto, id_producto);
                        gd.guardarGasto(gasto);
                    }

                    JOptionPane.showMessageDialog(null, "Felicidades, gasto finalizado");

                    Inicio.jlFondo.setVisible(false);
                    this.setVisible(false);
                    Gastos1.addMenu.add(Gastos1.jlBackground);

                    con.close();
                }else{
                    JOptionPane.showMessageDialog(null, "Ocurrio un error al guardar el gasto, no hay productos seleccionados");
                }
            } catch (Exception e){
                System.out.println("Error al instanciar la clase conexion " + e.getMessage());
                JOptionPane.showMessageDialog(null,"No se pudo guardar el gasto, intente nuevamente " + e);
            }
        }
    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jcbProvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProvedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbProvedorActionPerformed

    private void jcbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbProductoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int indice = jcbMetodo.getSelectedIndex();
        String categoria = String.valueOf(jcbMetodo.getItemAt(indice));
        /*Inicio de los servicios
        if("Servicios".equals(categoria)){
            mostrarListaServicios();
        } else {
            
        }
        */
        try{
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/e-wod","root","");
            Producto_data producto_data = new Producto_data(con);
            int indice2 = jcbProducto.getSelectedIndex();
            List<Producto> lista_productos = producto_data.obtenerProductos_por_nombre(String.valueOf(jcbProducto.getItemAt(indice2)));

            mostrarLista(lista_productos);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la tabla " + e.getMessage());
        }
        jtProductos.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jtDetalle.getModel();
        modelo.addRow(new Object []{nombre,Double.parseDouble(precio),1,Double.parseDouble("0"),Double.parseDouble(precio)});
        jtDetalle.requestFocus();
        total();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosMouseClicked
        int indice = jcbMetodo.getSelectedIndex();
        String categoria = String.valueOf(jcbMetodo.getItemAt(indice));
        /*Inicio de los servicios
        if("Servicios".equals(categoria)){
            int fila = this.jtProductos.getSelectedRow();
            
            nombre = jtProductos.getValueAt(fila, 0).toString();
            precio = jtProductos.getValueAt(fila, 1).toString();
        } else  {
            
        }*/
        int fila = this.jtProductos.getSelectedRow();

            nombre = jtProductos.getValueAt(fila, 1).toString();
            precio = jtProductos.getValueAt(fila, 3).toString();
            stock = jtProductos.getValueAt(fila, 4).toString();
        
    }//GEN-LAST:event_jtProductosMouseClicked

    private void jtProductosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtProductosKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER){
            DefaultTableModel modelo = (DefaultTableModel) jtDetalle.getModel();
            modelo.addRow(new Object []{nombre,Double.parseDouble(precio),1,Double.parseDouble("0"),Double.parseDouble(precio)});
            jtDetalle.requestFocus();
            total();
        }
    }//GEN-LAST:event_jtProductosKeyTyped

    private void jtDetalleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDetalleFocusGained
        jtDetalle.setColumnSelectionAllowed(true);
        jtDetalle.setCellSelectionEnabled(true);
    }//GEN-LAST:event_jtDetalleFocusGained

    private void jtDetalleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDetalleFocusLost

    }//GEN-LAST:event_jtDetalleFocusLost

    private void jtDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDetalleMouseClicked

    }//GEN-LAST:event_jtDetalleMouseClicked

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

    private void jcbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(nuevoGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevoGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevoGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevoGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                nuevoGasto dialog = new nuevoGasto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private newscomponents.RSButtonFlat_new jbBorrarFila;
    private newscomponents.RSButtonFlat_new jbConfirmar;
    private javax.swing.JCheckBox jcArqueo;
    private RSMaterialComponent.RSComboBoxMaterial jcbCategoria;
    private RSMaterialComponent.RSComboBoxMaterial jcbMetodo;
    private RSMaterialComponent.RSComboBoxMaterial jcbProducto;
    private RSMaterialComponent.RSComboBoxMaterial jcbProvedor;
    private javax.swing.JLabel jlDescuento;
    private javax.swing.JLabel jlPesos;
    private javax.swing.JLabel jlPorcentaje;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JScrollPane jspComentario;
    private javax.swing.JTextField jtDescuento;
    private RSMaterialComponent.RSTableMetroCustom jtDetalle;
    private RSMaterialComponent.RSTableMetroCustom jtProductos;
    private javax.swing.JTextField jtTotal;
    private javax.swing.JTextArea jtaComentario;
    private javax.swing.JPanel listaProductos;
    private javax.swing.JPanel menuGasto;
    // End of variables declaration//GEN-END:variables
}
