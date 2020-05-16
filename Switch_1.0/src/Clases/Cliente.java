package Clases;

import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author Ivan
 * Creacion de la clase Cliente
 */
public class Cliente {
    
    //Variables base de la clase
    
    private int id = -1;
    private String nombre;
    private long telefono;
    private String correo;
    private String box;
    private String metodo_de_pago_preferido;
    private String comentario;
    
    //Contructores

    public Cliente(int id, String nombre, long telefono, String correo, String box, String metodo_de_pago_preferido, String comentario) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.box = box;
        this.metodo_de_pago_preferido = metodo_de_pago_preferido;
        this.comentario = comentario;
    }

    public Cliente(String nombre, long telefono, String correo, String box, String metodo_de_pago_preferido, String comentario) {
        this.id = -1;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.box = box;
        this.metodo_de_pago_preferido = metodo_de_pago_preferido;
        this.comentario = comentario;
    }

    public Cliente(String nombre) {
        this.id = -1;
        this.nombre = nombre;
    }
    
    public Cliente() {
        this.id = -1;
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

    public String getBox() {
        return box;
    }

    public String getMetodo_de_pago_preferido() {
        return metodo_de_pago_preferido;
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

    public void setBox(String box) {
        this.box = box;
    }

    public void setMetodo_de_pago_preferido(String metodo_de_pago_preferido) {
        this.metodo_de_pago_preferido = metodo_de_pago_preferido;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    //Metodos 
    
    public static void mostrarClientes(List<Cliente> clientes){
        /*Este metodo  muestra la lista de clientes sin el ID
        *Recibe como parametro una lista de tipo Cliente
        *Devuelve un println con la lista
        */
        for (int i = 0; i < clientes.size(); i++){
                System.out.println("Nombre = " + clientes.get(i).getNombre()+ "Telefono = " + clientes.get(i).getTelefono() + " Correo = " + clientes.get(i).getCorreo() + "Box = " + clientes.get(i).getBox()+ "Metodo de pago preferido = " + clientes.get(i).getMetodo_de_pago_preferido() + "Comentario = " + clientes.get(i).getComentario());
        }
    }
    
}
