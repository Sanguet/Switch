package Clases;

import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author Ivan
 * Creacion de la clase Gasto
 */
public class Gasto {
    
    //Variables iniciales de la clase
    
    private int id = -1;
    private int id_provedor;
    private double monto;
    private int id_metodo_de_pago;
    private int id_categeoria;
    private int id_detalle;
    private Timestamp fecha_y_hora;
    private String comentario;
    
    //Constructors

    public Gasto(int id, int id_provedor, double monto, int id_metodo_de_pago, int id_categeoria, int id_detalle, Timestamp fecha_y_hora, String comentario) {
        this.id = -1;
        this.id_provedor = id_provedor;
        this.monto = monto;
        this.id_metodo_de_pago = id_metodo_de_pago;
        this.id_categeoria = id_categeoria;
        this.id_detalle = id_detalle;
        this.fecha_y_hora = new Timestamp(System.currentTimeMillis());
        this.comentario = comentario;
    }

    public Gasto(int id_provedor, double monto, int id_metodo_de_pago, int id_categeoria, int id_detalle, Timestamp fecha_y_hora, String comentario) {
        this.id = -1;
        this.id_provedor = id_provedor;
        this.monto = monto;
        this.id_metodo_de_pago = id_metodo_de_pago;
        this.id_categeoria = id_categeoria;
        this.id_detalle = id_detalle;
        this.fecha_y_hora = new Timestamp(System.currentTimeMillis());
        this.comentario = comentario;
    }
    
    public Gasto() {
        this.id = -1;
        this.fecha_y_hora = new Timestamp(System.currentTimeMillis());
    }
    
    //Getters

    public int getId() {
        return id;
    }

    public int getId_provedor() {
        return id_provedor;
    }

    public double getMonto() {
        return monto;
    }

    public int getId_metodo_de_pago() {
        return id_metodo_de_pago;
    }

    public int getId_categeoria() {
        return id_categeoria;
    }

    public int getId_detalle() {
        return id_detalle;
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

    public void setId_provedor(int id_provedor) {
        this.id_provedor = id_provedor;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setId_metodo_de_pago(int id_metodo_de_pago) {
        this.id_metodo_de_pago = id_metodo_de_pago;
    }

    public void setId_categeoria(int id_categeoria) {
        this.id_categeoria = id_categeoria;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public void setFecha_y_hora(Timestamp fecha_y_hora) {
        this.fecha_y_hora = fecha_y_hora;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    //Metodos
    
    public static void mostrarGastos(List<Gasto> gastos){
        /*Este metodo  muestra la lista de ventas sin el ID
        *Recibe como parametro una lista de tipo Venta
        *Devuelve un println con la lista
        */
        for (int i = 0; i < gastos.size(); i++){
                System.out.println("Id del provedor = " + gastos.get(i).getId_provedor() + "Monto = " + gastos.get(i).getMonto() + "Id del metodo de pago = " + gastos.get(i).getId_metodo_de_pago() + "Id de la categoria = " + gastos.get(i).getId_categeoria() + "Id del detalle = " + gastos.get(i).getId_detalle() + "Fecha y hora = " + gastos.get(i).getFecha_y_hora() + "Comentario = " + gastos.get(i).getComentario());
        }
    }
    
}
