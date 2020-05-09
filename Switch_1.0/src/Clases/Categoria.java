package Clases;

import java.util.List;

/**
 *
 * @author Ivan
 * Creacion de la categoria
 */
public class Categoria {
    
    //Variables iniciales de la clase
    
    private int id = -1;
    private String nombre;
    
    //Constructors

    public Categoria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Categoria(String nombre) {
        this.id = -1;
        this.nombre = nombre;
    }
    
    public Categoria() {
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
    
    public static void mostrarCategorias(List<Categoria> categorias){
        /*Este metodo  muestra la lista de categorias en general sin el ID
        *Recibe como parametro una lista de tipo Categoria
        *Devuelve un println con la lista
        */
        for (int i = 0; i < categorias.size(); i++){
                System.out.println("Nombre = " + categorias.get(i).getNombre());
        }
    }
}
