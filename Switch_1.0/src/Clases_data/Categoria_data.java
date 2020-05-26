package Clases_data;

import Clases.Categoria;
import Clases.Conexion;
import java.sql.*;
import java.util.*;
/**
 * @author Ivan
 * Creacion de la clase categoria de tipo data
 */
public class Categoria_data {
    
    //Creamos la conexion a la base de datos
    
    private Connection connection = null;
    public Categoria_data(Conexion conexion){
        try{
            connection = conexion.getConexion();
        } catch (SQLException ex){
            System.out.println("Error al obtener la conexion");
        }
    }
    
    //Metodos de la clase
    
    public void guardarCategoria(Categoria categoria){
        try{
            String sql = "INSERT INTO categoria (nombre) VALUES (?);";
            
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, categoria.getNombre());
            
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
                categoria.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar la categoria ");
            }
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al insertar la categoria " + ex.getMessage());
        }
    }
    
    public void borrarCategoria(Categoria categoria){
        try{
            String sql = "DELETE FROM categoria WHERE id_categoria = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, categoria.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al borrar la categoria " + ex.getMessage());
        }
    }
    
    public void actualizarCategoria(Categoria categoria){
        try{
            String sql = "UPDATE categoria SET nombre = ? WHERE id_categoria = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, categoria.getNombre());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al actualizar la categoria " + ex.getMessage());
        }
    }
    
    public List <Categoria> obtenerCategorias(){
        List <Categoria> categorias = new ArrayList<Categoria>();
        
        try {
            String sql = "SELECT * FROM categoria;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Categoria categoria;
            while (rs.next()){
                categoria = new Categoria();
                categoria.setId(rs.getInt("id_categoria"));
                categoria.setNombre(rs.getString("nombre"));
                
                categorias.add(categoria);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener las categorias: " + ex.getMessage());
        }
        return categorias;
    }
    
    public Categoria getCategoria_por_id(int id){
        Categoria a = null;
        try{
            String sql = "SELECT * FROM categoria WHERE categoria.id_categoria = ?;";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            rs.next();
            a = new Categoria(rs.getInt(1),rs.getString(2));
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al obtener la cateogira" + ex.getMessage());
        }
        return a;
    }
    
    public Categoria getCategoria_por_nombre(String nombre){
        Categoria a = null;
        try{
            String sql = "SELECT * FROM categoria WHERE categoria.nombre LIKE ?;";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nombre);
            
            ResultSet rs = stmt.executeQuery();
            
            rs.next();
            a = new Categoria(rs.getInt(1),rs.getString(2));
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al obtener la cateogira " + ex.getMessage());
        }
        return a;
    }
}
