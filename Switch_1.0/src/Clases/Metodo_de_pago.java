package Clases;

import java.util.List;

/**
 *
 * @author Ivan
 * Creacion de la clase Metodo de pago
 */
public class Metodo_de_pago {
    
    //Variables iniciales de la clase
    
    private int id = -1;
    private String nombre;
    
    //Constructors

    public Metodo_de_pago(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Metodo_de_pago(String nombre) {
        this.id = -1;
        this.nombre = nombre;
    }
    
    public Metodo_de_pago() {
        this.id = -1;
    }
    
    //Getters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodos
    
    public static void mostrarMetodosDePago(List<Metodo_de_pago> metodos_de_pago){
        /*Este metodo  muestra la lista de metodos de pago sin el ID
        *Recibe como parametro una lista de tipo Metodo_de_pago
        *Devuelve un println con la lista
        */
        for (int i = 0; i < metodos_de_pago.size(); i++){
                System.out.println("Nombre = " + metodos_de_pago.get(i).getNombre());
        }
    }
}
