package Clases;

import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author Ivan
 * Creacion de la clase Detalle de venta
 */
public class Detalle_de_venta {
    
    //Variables iniciales de la clase
    
    private int id = -1;
    private int id_producto;
    private int cantidad;
    private int descuento;
    private double sub_total;
    
    //Constructors

    public Detalle_de_venta(int id, int id_producto, int cantidad, int descuento, double total) {
        this.id = -1;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.sub_total = total;
    }

    public Detalle_de_venta(int id_producto, int cantidad, int descuento, double total) {
        this.id = -1;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.sub_total = total;
    }
    
    public Detalle_de_venta() {
        this.id = -1;
    }
    
    //Getters

    public int getId() {
        return id;
    }

    public int getId_producto() {
        return id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getDescuento() {
        return descuento;
    }

    public double getTotal() {
        return sub_total;
    }
    
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public void setTotal(double total) {
        this.sub_total = total;
    }
    
    //Metodos
    
    public static void mostrarDetallesDeVenta(List<Detalle_de_venta> detalles_de_ventas){
        /*Este metodo  muestra la lista de metodos de pago sin el ID
        *Recibe como parametro una lista de tipo Metodo_de_pago
        *Devuelve un println con la lista
        */
        for (int i = 0; i < detalles_de_ventas.size(); i++){
                System.out.println("Id del producto = " + detalles_de_ventas.get(i).getId_producto() + "Cantidad = " + detalles_de_ventas.get(i).getCantidad() + "Descuento = " + detalles_de_ventas.get(i).getDescuento() + "Sub total = " + detalles_de_ventas.get(i).getTotal());
        }
    }
}
