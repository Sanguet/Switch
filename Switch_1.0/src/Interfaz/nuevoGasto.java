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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDetalle = new javax.swing.JTable();
        jspComentario = new javax.swing.JScrollPane();
        jtaComentario = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jcbCategoria = new javax.swing.JComboBox<>();
        jcbProvedor = new javax.swing.JComboBox<>();
        jlPesos = new javax.swing.JLabel();
        jlPorcentaje = new javax.swing.JLabel();
        jlDescuento = new javax.swing.JLabel();
        jlTotal = new javax.swing.JLabel();
        jlMetodo = new javax.swing.JLabel();
        jcbMetodo = new javax.swing.JComboBox<>();
        jlCategoria = new javax.swing.JLabel();
        jlProvedor = new javax.swing.JLabel();
        jlComentario = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jtTotal = new javax.swing.JTextField();
        jtDescuento = new javax.swing.JTextField();
        jbConfirmar = new javax.swing.JButton();
        listaProductos = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jlProductos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jcbProducto = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuGasto.setBackground(new java.awt.Color(255, 255, 255));
        menuGasto.setPreferredSize(new java.awt.Dimension(500, 700));
        menuGasto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Metropolis Semi Bold", 0, 24)); // NOI18N
        jLabel2.setText("Nuevo Gasto");
        menuGasto.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 19, 165, -1));

        jScrollPane1.setBorder(null);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(270, 500));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(270, 300));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(270, 300));

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
        jScrollPane1.setViewportView(jtDetalle);

        menuGasto.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 271, 450, 321));

        jtaComentario.setColumns(20);
        jtaComentario.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jtaComentario.setLineWrap(true);
        jtaComentario.setRows(5);
        jtaComentario.setMinimumSize(new java.awt.Dimension(450, 50));
        jtaComentario.setPreferredSize(new java.awt.Dimension(450, 50));
        jspComentario.setViewportView(jtaComentario);

        menuGasto.add(jspComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 194, 450, 66));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Usar en arqueo");
        jCheckBox1.setBorder(null);
        jCheckBox1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jCheckBox1.setIconTextGap(10);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        menuGasto.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 141, -1, -1));

        jcbCategoria.setPreferredSize(new java.awt.Dimension(220, 27));
        menuGasto.add(jcbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 71, -1, 31));

        menuGasto.add(jcbProvedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 134, 220, 31));

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

        jlMetodo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlMetodo.setText("Metodo de Pago");
        menuGasto.add(jlMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 50, 98, -1));

        jcbMetodo.setPreferredSize(new java.awt.Dimension(29, 27));
        menuGasto.add(jcbMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 71, 212, 31));

        jlCategoria.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlCategoria.setText("Seleccionar Categoria");
        menuGasto.add(jlCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 50, 128, -1));

        jlProvedor.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlProvedor.setText("Seleccionar Provedor");
        menuGasto.add(jlProvedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 113, 128, -1));

        jlComentario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlComentario.setText("Comentario");
        menuGasto.add(jlComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 176, 128, -1));

        jButton4.setText("Borrar fila");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        menuGasto.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, 90, 30));

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
        menuGasto.add(jbConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 642, -1, -1));

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

        jlProductos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jlProductos.setText("Seleccionar Productos");
        listaProductos.add(jlProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 130, -1));

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

        listaProductos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 670, 570));

        jcbProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcbProductoFocusGained(evt);
            }
        });
        jcbProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jcbProductoMouseEntered(evt);
            }
        });
        listaProductos.add(jcbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 260, 30));

        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        listaProductos.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 70, 30));

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

    private void jtProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosMouseClicked
        int indice = jcbCategoria.getSelectedIndex();
        String categoria = jcbCategoria.getItemAt(indice);
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
            int indice = jcbCategoria.getSelectedIndex();
            String categoria = jcbCategoria.getItemAt(indice);
            /*Inicio de los servicios
            if("Servicios".equals(categoria)){
                mostrarDetalleServicios();
                DefaultTableModel modelo = (DefaultTableModel) jtDetalle.getModel();
                modelo.addRow(new Object []{nombre, precio});
                jtDetalle.requestFocus();
                total_servicios();
            } else {
                
            }*/
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

    private void jtDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDetalleMouseClicked

    }//GEN-LAST:event_jtDetalleMouseClicked

    private void jtDetalleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDetalleKeyPressed

    }//GEN-LAST:event_jtDetalleKeyPressed

    private void jtDetalleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDetalleKeyReleased
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER){
            int indice = jcbCategoria.getSelectedIndex();
            String categoria = jcbCategoria.getItemAt(indice);
            /*Inicio de los servicios
            if("Servicios".equals(categoria)){
                int fila = this.jtDetalle.getSelectedRow();
                total_servicios();
            } else {

            }*/
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

    private void jtDetalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDetalleKeyTyped

    }//GEN-LAST:event_jtDetalleKeyTyped

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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int indice = jcbCategoria.getSelectedIndex();
        String categoria = jcbCategoria.getItemAt(indice);
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
            List<Producto> lista_productos = producto_data.obtenerProductos_por_nombre(jcbProducto.getItemAt(indice2));

            mostrarLista(lista_productos);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo cargar la tabla " + e.getMessage());
        }
        jtProductos.setEnabled(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
                    
                    int id_categoria = cd.getCategoria_por_nombre(jcbCategoria.getItemAt(indice)).getId();
                    int id_metodo_de_pago = mdpd.getMetodo_de_pago_por_nombre(jcbMetodo.getItemAt(indice2)).getId();
                    int id_provedor = pvd.getProvedor_por_nombre(jcbProvedor.getItemAt(indice3)).getId();
                    String comentario = jtaComentario.getText();
                    
                    //Creacion de los detalles de ventas y las ventas
                    String categoria = jcbCategoria.getItemAt(indice);
                    
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
                        Detalle_de_venta detalle_de_venta = new Detalle_de_venta(id_producto,(Integer)jtDetalle.getValueAt(i, 2), (int)(double)jtDetalle.getValueAt(i, 3), (Double)jtDetalle.getValueAt(i, 4));
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

    private void jtDetalleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDetalleFocusLost

    }//GEN-LAST:event_jtDetalleFocusLost

    private void jcbProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbProductoMouseEntered
        int indice = jcbCategoria.getSelectedIndex();
        String categoria = jcbCategoria.getItemAt(indice);
        /*Inicio de los servicios
        if("Servicios".equals(categoria)){
            jcbProducto.removeAllItems();
            agregarComboServicios();
        } else {
            jcbProducto.removeAllItems();
            agregarComboProductos();
        }*/
        jcbProducto.removeAllItems();
        agregarComboProductos();
    }//GEN-LAST:event_jcbProductoMouseEntered

    private void jcbProductoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcbProductoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbProductoFocusGained

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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JComboBox<String> jcbMetodo;
    private javax.swing.JComboBox<String> jcbProducto;
    private javax.swing.JComboBox<String> jcbProvedor;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlComentario;
    private javax.swing.JLabel jlDescuento;
    private javax.swing.JLabel jlMetodo;
    private javax.swing.JLabel jlPesos;
    private javax.swing.JLabel jlPorcentaje;
    private javax.swing.JLabel jlProductos;
    private javax.swing.JLabel jlProvedor;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JScrollPane jspComentario;
    private javax.swing.JTextField jtDescuento;
    private javax.swing.JTable jtDetalle;
    private javax.swing.JTable jtProductos;
    private javax.swing.JTextField jtTotal;
    private javax.swing.JTextArea jtaComentario;
    private javax.swing.JPanel listaProductos;
    private javax.swing.JPanel menuGasto;
    // End of variables declaration//GEN-END:variables
}
