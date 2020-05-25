package Clases_data;

import Clases.Metodo_de_pago;
import Clases.Conexion;
import java.sql.*;
import java.util.*;
/**
 * @author Ivan
 * Creacion de la clase metodo de pago del tipo data
 */
public class Metodo_de_pago_data {
    
    //Creamos la conexion a la base de datos
    
    private Connection connection = null;
    public Metodo_de_pago_data(Conexion conexion){
        try{
            connection = conexion.getConexion();
        } catch (SQLException ex){
            System.out.println("Error al obtener la conexion");
        }
    }
    
    //Metodos de la clase
    
    public void guardarMetodo_de_pago(Metodo_de_pago metodo_de_pago){
        try{
            String sql = "INSERT INTO metodo_de_pago (nombre) VALUES (?);";
            
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, metodo_de_pago.getNombre());
            
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
                metodo_de_pago.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar el metodo de pago ");
            }
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al insertar el metodo de pago " + ex.getMessage());
        }
    }
    
    public void borrarMetodo_de_pago(Metodo_de_pago metodo_de_pago){
        try{
            String sql = "DELETE FROM metodo_de_pago WHERE id_metodo_de_pago = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, metodo_de_pago.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al borrar el metodo_de_pago " + ex.getMessage());
        }
    }
    
    public void actualizarMetodo_de_pago(Metodo_de_pago metodo_de_pago){
        try{
            String sql = "UPDATE metodo_de_pago SET nombre = ? WHERE id_metodo_de_pago = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, metodo_de_pago.getNombre());
            stmt.setInt(2, metodo_de_pago.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al actualizar el metodo_de_pago " + ex.getMessage());
        }
    }
    
    public List <Metodo_de_pago> obtenerMetodos_de_pago(){
        List <Metodo_de_pago> metodos_de_pago = new ArrayList<Metodo_de_pago>();
        
        try {
            String sql = "SELECT * FROM metodo_de_pago;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Metodo_de_pago metodo_de_pago;
            while (rs.next()){
                metodo_de_pago = new Metodo_de_pago();
                metodo_de_pago.setId(rs.getInt("id_metodo"));
                metodo_de_pago.setNombre(rs.getString("nombre"));
                
                metodos_de_pago.add(metodo_de_pago);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los metodos de pago: " + ex.getMessage());
        }
        return metodos_de_pago;
    } 
    
    public Metodo_de_pago getMetodo_de_pago_por_id(int id){
        Metodo_de_pago a = null;
        try{
            String sql = "SELECT * FROM metodo_de_pago WHERE metodo_de_pago.id_metodo = ?;";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            rs.next();
            a = new Metodo_de_pago(rs.getInt(1), rs.getString(2));
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al obtener el proveedor" + ex.getMessage());
        }
        return a;
    }
    
    public Metodo_de_pago getMetodo_de_pago_por_nombre(String nombre){
        Metodo_de_pago a = null;
        try{
            String sql = "SELECT * FROM metodo_de_pago WHERE metodo_de_pago.nombre LIKE ?;";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nombre);
            
            ResultSet rs = stmt.executeQuery();
            
            rs.next();
            a = new Metodo_de_pago(rs.getInt(1),rs.getString(2));
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al obtener el metodo de pago " + ex.getMessage());
        }
        return a;
    }
    
}
