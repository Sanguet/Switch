package Clases;

import java.util.List;

/**
 *
 * @author Ivan
 * Creacion de la clse Producto
 */
public class Producto {
    
    //Variables iniciales de la clase
    
    private int id = -1;
    private String nombre;
    private int id_categoria;
    private double costo;
    private double precio;
    private int cantidad;
    private int id_provedor;
    private String comentario;
    private long codigo;
    
    //Constructores

    public Producto(int id, String nombre, int id_categoria, double costo, double precio, int cantidad, int id_provedor, String comentario, long codigo) {
        this.id = id;
        this.nombre = nombre;
        this.id_categoria = id_categoria;
        this.costo = costo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.id_provedor = id_provedor;
        this.comentario = comentario;
        this.codigo = codigo;
    }

    public Producto(String nombre, int id_categoria, double costo, double precio, int cantidad, int id_provedor, String comentario, long codigo) {
        this.id = -1;
        this.nombre = nombre;
        this.id_categoria = id_categoria;
        this.costo = costo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.id_provedor = id_provedor;
        this.comentario = comentario;
        this.codigo = codigo;
    }
    
    public Producto(String nombre, int id_categoria, double costo, double precio, int cantidad, int id_provedor, String comentario) {
        this.id = -1;
        this.nombre = nombre;
        this.id_categoria = id_categoria;
        this.costo = costo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.id_provedor = id_provedor;
        this.comentario = comentario;
        this.codigo = 0;
    }
        
    public Producto(){
        this.id = -1;
    }
    
    //Getters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public double getCosto() {
        return costo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getId_provedor() {
        return id_provedor;
    }

    public String getComentario() {
        return comentario;
    }

    public long getCodigo() {
        return codigo;
    }
    
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setId_provedor(int id_provedor) {
        this.id_provedor = id_provedor;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    
    //Metodos
    
    public static void mostrarProductos(List<Producto> productos){
        /*Este metodo  muestra la lista de productos sin el ID
        *Recibe como parametro una lista de tipo Producto
        *Devuelve un println con la lista
        */
        for (int i = 0; i < productos.size(); i++){
                System.out.println("Nombre = " + productos.get(i).getNombre()+ "Id de la categoria = " + productos.get(i).getId_categoria() + "Costo = " + productos.get(i).getCosto()+ "Precio = " + productos.get(i).getPrecio() + "Cantidad = " + productos.get(i).getCantidad() + "Id del provedor = " + productos.get(i).getId_provedor() + "Comentario = " + productos.get(i).getComentario() + "Codigo = " + productos.get(i).getCodigo());
        }
    }
}
