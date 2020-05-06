package Clases;

import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author Ivan
 * Creacion de la clase arqueos
 */
public class Arqueo {
    
    //Variables iniciales de la clase
    
    private int id = -1;
    private double monto_inicial;
    private Timestamp fecha_de_inicio;
    private Timestamp fecha_de_cierre;
    private String comentario;
    
    //Constructors

    public Arqueo(int id, double monto_inicial, Timestamp fecha_de_inicio, Timestamp fecha_cierre, String comentario) {
        this.id = id;
        this.monto_inicial = monto_inicial;
        this.fecha_de_inicio = new Timestamp(System.currentTimeMillis());
        this.fecha_de_cierre = fecha_cierre;
        this.comentario = comentario;
    }

    public Arqueo(double monto_inicial, Timestamp fecha_de_inicio, Timestamp fecha_cierre, String comentario) {
        this.id = -1;
        this.monto_inicial = monto_inicial;
        this.fecha_de_inicio = new Timestamp(System.currentTimeMillis());
        this.fecha_de_cierre = fecha_cierre;
        this.comentario = comentario;
    }
    
    public Arqueo() {
        this.id = -1;
        this.fecha_de_inicio = new Timestamp(System.currentTimeMillis());
        this.fecha_de_cierre = null;
    }
    
    //Getters

    public int getId() {
        return id;
    }

    public double getMonto_inicial() {
        return monto_inicial;
    }

    public Timestamp getFecha_de_inicio() {
        return fecha_de_inicio;
    }

    public Timestamp getFecha_de_cierre() {
        return fecha_de_cierre;
    }

    public String getComentario() {
        return comentario;
    }
    
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setMonto_inicial(double monto_inicial) {
        this.monto_inicial = monto_inicial;
    }

    public void setFecha_de_inicio(Timestamp fecha_de_inicio) {
        this.fecha_de_inicio = fecha_de_inicio;
    }

    public void setFecha_de_cierre(Timestamp fecha_cierre) {
        this.fecha_de_cierre = fecha_cierre;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    //Metodos
    
    public static void mostrarArqueos(List<Arqueo> arqueos){
        /*Este metodo  muestra la lista de arqueos sin el ID
        *Recibe como parametro una lista de tipo Arqueo
        *Devuelve un println con la lista
        */
        for (int i = 0; i < arqueos.size(); i++){
                System.out.println("Monto inicial = " + arqueos.get(i).getMonto_inicial() + "Fecha de inicio = " + arqueos.get(i).getFecha_de_inicio() + "Fecha de cierre = " + arqueos.get(i).getFecha_de_cierre() + "Comentario = " + arqueos.get(i).getComentario());
        }
    }
}
