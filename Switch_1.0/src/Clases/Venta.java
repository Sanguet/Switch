package Clases;

import java.util.Date;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author Ivan
 * Creacio de la clase Venta
 */
public class Venta {
    
    //Variables iniciales de la clase
    
    private int id = -1;
    private int id_cliente;
    private int id_detalle;
    private int id_metodo_de_pago;
    private double total;
    private int descuento;
    private Timestamp fecha_y_hora;
    private String comentario;
    
    //Constructors

    public Venta(int id, int id_cliente, int id_detalle, int id_metodo_de_pago, double total,int descuento, String comentario) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.id_detalle = id_detalle;
        this.id_metodo_de_pago = id_metodo_de_pago;
        this.total = total;
        this.descuento = descuento;
        this.fecha_y_hora = new Timestamp(System.currentTimeMillis());
        this.comentario = comentario;
    }
    
    public Venta(int id, int id_cliente, int id_detalle, int id_metodo_de_pago, double total,int descuento,Timestamp fecha_y_hora, String comentario) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.id_detalle = id_detalle;
        this.id_metodo_de_pago = id_metodo_de_pago;
        this.total = total;
        this.descuento = descuento;
        this.fecha_y_hora = fecha_y_hora;
        this.comentario = comentario;
    }

    public Venta(int id_cliente, int id_detalle, int id_metodo_de_pago, double total,int descuento, String comentario) {
        this.id = -1;
        this.id_cliente = id_cliente;
        this.id_detalle = id_detalle;
        this.id_metodo_de_pago = id_metodo_de_pago;
        this.total = total;
        this.descuento = descuento;
        this.fecha_y_hora = new Timestamp(System.currentTimeMillis());;
        this.comentario = comentario;
    }
    
    public Venta() {
        this.id = -1;
        this.fecha_y_hora = new Timestamp(System.currentTimeMillis());;
    }

    //Getters

    public int getId() {
        return id;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public int getId_detalle() {
        return id_detalle;
    }

    public int getId_metodo_de_pago() {
        return id_metodo_de_pago;
    }

    public double getTotal() {
        return total;
    }

    public int getDescuento() {
        return descuento;
    }
    
    public Timestamp getFecha_y_hora() {
        return fecha_y_hora;
    }

    public String getComentario() {
        return comentario;
    }
    
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public void setId_metodo_de_pago(int id_metodo_de_pago) {
        this.id_metodo_de_pago = id_metodo_de_pago;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    
    public void setFecha_y_hora(Timestamp fecha_y_hora) {
        this.fecha_y_hora = fecha_y_hora;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    //Metodos
    
    public static void mostrarVentas(List<Venta> ventas){
        /*Este metodo  muestra la lista de ventas sin el ID
        *Recibe como parametro una lista de tipo Venta
        *Devuelve un println con la lista
        */
        for (int i = 0; i < ventas.size(); i++){
                System.out.println("Id del cliente = " + ventas.get(i).getId_cliente() + "Id del detalle = " + ventas.get(i).getId_detalle() + "Id del metodo de pago = " + ventas.get(i).getId_metodo_de_pago() + "Total = " + ventas.get(i).getTotal() + "Descuento = " + ventas.get(i).getDescuento() + "Fecha y hora = " + ventas.get(i).getFecha_y_hora() + "Comentario = " + ventas.get(i).getComentario());
        }
    }
    
    
}
