package Clases_data;

import Clases.Categoria_producto;
import Clases.Conexion;
import java.sql.*;
import java.util.*;
/**
 * @author Ivan
 * Creacion de la clase categoria de producto del tipo data
 */
public class Categoria_producto_data {
    
    //Creamos la conexion a la base de datos
    
    private Connection connection = null;
    public Categoria_producto_data(Conexion conexion){
        try{
            connection = conexion.getConexion();
        } catch (SQLException ex){
            System.out.println("Error al obtener la conexion");
        }
    }
    
    //Metodos de la clase
    
    public void guardarCategoria_producto(Categoria_producto categoria_producto){
        try{
            String sql = "INSERT INTO categoria_producto (nombre, id_categoria_padre, comentario) VALUES (?,?,?);";
            
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, categoria_producto.getNombre());
            stmt.setInt(2, categoria_producto.getId_categoria_padre());
            stmt.setString(3, categoria_producto.getComentario());
            
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
                categoria_producto.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar la categoria del producto ");
            }
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al insertar la categoria del producto " + ex.getMessage());
        }
    }
    
    public void borrarCategoria_producto(Categoria_producto categoria_producto){
        try{
            String sql = "DELETE FROM categoria_producto WHERE id_categoria_producto = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, categoria_producto.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al borrar la categoria del producto " + ex.getMessage());
        }
    }
    
    public void actualizarCategoria_producto(Categoria_producto categoria_producto){
        try{
            String sql = "UPDATE categoria_producto SET nombre = ?, id_categoria_padre = ?, comentario = ? WHERE id_categoria_producto = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, categoria_producto.getNombre());
            stmt.setInt(2, categoria_producto.getId_categoria_padre());
            stmt.setString(3, categoria_producto.getComentario());
            stmt.setInt(4, categoria_producto.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al actualizar la categoria del producto " + ex.getMessage());
        }
    }
    
    public List <Categoria_producto> obtenerCategorias_producto(){
        List <Categoria_producto> categorias_producto = new ArrayList<Categoria_producto>();
        
        try {
            String sql = "SELECT * FROM categoria_producto;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Categoria_producto categoria_producto;
            while (rs.next()){
                categoria_producto = new Categoria_producto();
                categoria_producto.setId(rs.getInt("id_categoria_producto"));
                categoria_producto.setNombre(rs.getString("nombre"));
                categoria_producto.setId_categoria_padre(rs.getInt("id_categoria_padre"));
                categoria_producto.setComentario(rs.getString("Comentario"));
                
                categorias_producto.add(categoria_producto);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener las categorias de los productos: " + ex.getMessage());
        }
        return categorias_producto;
    } 
}
