package Clases_data;

import Clases.Conexion;
import Clases.Provedor;
import java.sql.*;
import java.util.*;

/**
 * @author Ivan
 * Creacion de la clase provedor del tipo Data
 */
public class Provedor_data {
    
    //Creamos la conexion a la base de datos
    
    private Connection connection = null;
    public Provedor_data(Conexion conexion){
        try{
            connection = conexion.getConexion();
        } catch (SQLException ex){
            System.out.println("Error al abrr al obtener la conexion");
        }
    }
    
    //Metodos de la clase
    //Metodos de guardado
    public void guardarProvedor(Provedor provedor){
        try{
            String sql = "INSERT INTO provedor (nombre,telefono,correo,direccion,comentario) VALUES (?,?,?,?,?)";
            
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, provedor.getNombre());
            stmt.setLong(2,provedor.getTelefono());
            stmt.setString(3,provedor.getCorreo());
            stmt.setString(4,provedor.getDireccion());
            stmt.setString(5,provedor.getComentario());
            
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
                provedor.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar el provedor ");
            }
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al insertar el provedor " + ex.getMessage());
        }
    }
    
    public void borrarProvedor(Provedor provedor){
        try{
            String sql = "DELETE FROM provedor WHERE id_provedor = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, provedor.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al borrar el provedor " + ex.getMessage());
        }
    }
    
    public void actualizarProvedor(Provedor provedor){
        try{
            String sql = "UPDATE provedor SET nombre = ?, telefono = ?, correo = ?, direccion = ?, comentario = ? WHERE id_provedor = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, provedor.getNombre());
            stmt.setLong(2,provedor.getTelefono());
            stmt.setString(3,provedor.getCorreo());
            stmt.setString(4,provedor.getDireccion());    
            stmt.setString(5,provedor.getComentario());
            stmt.setInt(6, provedor.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al actualizar el provedor " + ex.getMessage());
        }
    }
    
    public List <Provedor> obtenerProvedores(){
        List <Provedor> provedores = new ArrayList<Provedor>();
        
        try {
            String sql = "SELECT * FROM provedor;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Provedor provedor;
            while (rs.next()){
                provedor = new Provedor();
                provedor.setId(rs.getInt("id_provedor"));
                provedor.setNombre(rs.getString("nombre"));
                provedor.setTelefono(rs.getLong("telefono"));
                provedor.setCorreo(rs.getString("correo"));
                provedor.setDireccion(rs.getString("direccion"));
                provedor.setComentario(rs.getString("comentario"));
                
                provedores.add(provedor);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los provedores: " + ex.getMessage());
        }
        return provedores;
    } 
    
    public List <Provedor> obtenerProvedores_por_nombre(String nombre){
        List <Provedor> provedores = new ArrayList<Provedor>();
        
        try {
            String sql = "SELECT * FROM provedor WHERE provedor.nombre LIKE ? ORDER BY provedor.nombre;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nombre);
            
            ResultSet rs = stmt.executeQuery();
            Provedor provedor;
            while (rs.next()){
                provedor = new Provedor();
                provedor.setId(rs.getInt("id_provedor"));
                provedor.setNombre(rs.getString("nombre"));
                provedor.setTelefono(rs.getLong("telefono"));
                provedor.setCorreo(rs.getString("correo"));
                provedor.setDireccion(rs.getString("direccion"));
                provedor.setComentario(rs.getString("comentario"));
                
                provedores.add(provedor);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los provedores: " + ex.getMessage());
        }
        return provedores;
    }
}