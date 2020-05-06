package Clases;

import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author Ivan
 * Creacion de la clase extraccion
 */
public class Extraccion {
    
    //Variables iniciales de la clase
    
    private int id = -1;
    private double monto;
    private Timestamp fecha_y_hora;
    private String comentario;
    
    //Constructors

    public Extraccion(int id, double monto, Timestamp fecha_y_hora, String comentario) {
        this.id = -1;
        this.monto = monto;
        this.fecha_y_hora = new Timestamp(System.currentTimeMillis());
        this.comentario = comentario;
    }

    public Extraccion(double monto, Timestamp fecha_y_hora, String comentario) {
        this.id = -1;
        this.monto = monto;
        this.fecha_y_hora = new Timestamp(System.currentTimeMillis());
        this.comentario = comentario;
    }
    
    public Extraccion() {
        this.id = -1;
        this.fecha_y_hora = new Timestamp(System.currentTimeMillis());
    }
    
    //Getters

    public int getId() {
        return id;
    }

    public double getMonto() {
        return monto;
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

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setFecha_y_hora(Timestamp fecha_y_hora) {
        this.fecha_y_hora = fecha_y_hora;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    //Metodos
    
    public static void mostrarExtracciones(List<Extraccion> extracciones){
        /*Este metodo  muestra la lista de metodos de pago sin el ID
        *Recibe como parametro una lista de tipo Metodo_de_pago
        *Devuelve un println con la lista
        */
        for (int i = 0; i < extracciones.size(); i++){
                System.out.println("Monto = " + extracciones.get(i).getMonto() + "Fecha y hora = " + extracciones.get(i).getFecha_y_hora() + "Comentario = " + extracciones.get(i).getComentario());
        }
    }
}
