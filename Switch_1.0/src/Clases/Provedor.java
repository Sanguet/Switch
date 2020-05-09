package Clases;

import java.util.List;

/**
 *
 * @author Ivan
 * Creacion de la clase Provedor
 */
public class Provedor {
    
    //Variables iniciales de la clase
    
    private int id = -1;
    private String nombre;
    private long telefono;
    private String correo;
    private String direccion;
    private String comentario;
    
    //Constructores

    public Provedor(int id, String nombre, long telefono, String correo, String direccion, String comentario) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.comentario = comentario;
    }

    public Provedor(String nombre, long telefono, String correo, String direccion, String comentario) {
        this.id = -1;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.comentario = comentario;
    }
    
    public Provedor() {
        this.id = -1;
        this.nombre = "";
        this.telefono = 0;
        this.correo = "";
        this.direccion = "";
        this.comentario = "";
    }

    //Getters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getComentario() {
        return comentario;
    }
    
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    //Metodos
    
    public static void mostrarProvedores(List<Provedor> provedores){
        /*Este metodo  muestra la lista de provedores sin el ID
        *Recibe como parametro una lista de tipo Provedor
        *Devuelve un println con la lista
        */
        for (int i = 0; i < provedores.size(); i++){
                System.out.println("Nombre = " + provedores.get(i).getNombre() + "Telefono = " + provedores.get(i).getTelefono() + "Correo = " + provedores.get(i).getCorreo() + "Direccion = " + provedores.get(i).getDireccion() + "Comentario = " + provedores.get(i).getComentario());
        }
    }
    
}
