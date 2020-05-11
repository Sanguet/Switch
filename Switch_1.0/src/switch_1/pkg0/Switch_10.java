package switch_1.pkg0;


//No borren ningun paquete por favor f
import Clases.Conexion;
import Clases_data.*;
import Interfaz.Inicio;

public class Switch_10 {

    public static void main(String[] args) {
        try {
            Conexion con = new Conexion("jdbc:mysql://localhost:3306/test","root","");
            
            Venta_data vd = new Venta_data(con);
            Provedor_data provedor_data = new Provedor_data(con);
            Producto_data producto_data = new Producto_data(con);
            Metodo_de_pago_data metodo_de_pago_data = new Metodo_de_pago_data(con);
            Gasto_data gasto_data = new Gasto_data(con);
            Extraccion_data extraccion_data = new Extraccion_data(con);
            Detalle_de_venta_data detalle_de_venta_data = new Detalle_de_venta_data(con);
            Cuenta_corriente_data cuenta_corriente_data = new Cuenta_corriente_data(con);
            Cliente_data cliente_data = new Cliente_data(con);
            Categoria_producto_data categoria_producto_data = new Categoria_producto_data(con);
            Categoria_data categoria_data = new Categoria_data(con);
            Arqueo_data arqueo_data = new Arqueo_data(con);
            
             
            //String fec = "31-03-2016";
            //LocalDate date3 = LocalDate.parse("2018-10-30");
            
            con.close();
        }   
        catch (Exception e){
            System.out.println("Error al intentar conectar a la base de datos " + e.getMessage());
        }

        Inicio inicio = new Inicio();
        inicio.setVisible(true);
    }
}