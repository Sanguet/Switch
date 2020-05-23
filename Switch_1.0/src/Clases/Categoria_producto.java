package Clases;

import java.util.List;

/**
 *
 * @author Ivan
 * Creacion de la categoria producto
 */
public class Categoria_producto {
    
    //Variables iniciales de la clase
    
    private int id = -1;
    private String nombre;
    private int id_categoria_padre;
    private String comentario;
    
    //Constructors

    public Categoria_producto(int id, String nombre, int id_categoria_padre, String comentario) {
        this.id = id;
        this.nombre = nombre;
        this.id_categoria_padre = id_categoria_padre;
        this.comentario = comentario;
    }

    public Categoria_producto(String nombre, int id_categoria_padre, String comentario) {
        this.id = -1;
        this.nombre = nombre;
        this.id_categoria_padre = id_categoria_padre;
        this.comentario = comentario;
    }

    public Categoria_producto(String nombre, String comentario) {
        this.id = -1;   
        this.nombre = nombre;
        this.comentario = comentario;
    }
    
    
    public Categoria_producto() {
        this.id = -1;
    }
    
    //Getters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId_categoria_padre() {
        return id_categoria_padre;
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

    public void setId_categoria_padre(int id_categoria_padre) {
        this.id_categoria_padre = id_categoria_padre;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    //Metodos
    
    public static void mostrarCategoriasDeProductos(List<Categoria_producto> categoria_productos){
        /*Este metodo  muestra la lista de categorias de los productos sin el ID
        *Recibe como parametro una lista de tipo Categoria_producto
        *Devuelve un println con la lista
        */
        for (int i = 0; i < categoria_productos.size(); i++){
                System.out.println("Nombre = " + categoria_productos.get(i).getNombre() + "Id de categoria padre = " + categoria_productos.get(i).getId_categoria_padre() + "Comentario = " + categoria_productos.get(i).getComentario());
        }
    }
    
}
