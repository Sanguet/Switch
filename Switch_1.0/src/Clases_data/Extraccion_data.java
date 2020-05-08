package Clases_data;

import Clases.Extraccion;
import Clases.Conexion;
import java.sql.*;
import java.util.*;
/**
 * @author Ivan
 * Creacio de la clase extraccion del tipo data
 */
public class Extraccion_data {
    
    //Creamos la conexion a la base de datos
    
    private Connection connection = null;
    public Extraccion_data(Conexion conexion){
        try{
            connection = conexion.getConexion();
        } catch (SQLException ex){
            System.out.println("Error al obtener la conexion");
        }
    }
    
    //Metodos de la clase
    
    public void guardarExtraccion(Extraccion extraccion){
        try{
            String sql = "INSERT INTO extraccion (monto,fecha_y_hora,comentario) VALUES (?,?,?);";
            
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setDouble(1, extraccion.getMonto());
            stmt.setTimestamp(2,extraccion.getFecha_y_hora());
            stmt.setString(3, extraccion.getComentario());
            
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
                extraccion.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar la extraccion ");
            }
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al insertar la extraccion " + ex.getMessage());
        }
    }
    
    public void borrarExtraccion(Extraccion extraccion){
        try{
            String sql = "DELETE FROM extraccion WHERE id_extraccion = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, extraccion.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al borrar la extraccion " + ex.getMessage());
        }
    }
    
    public void actualizarExtraccion(Extraccion extraccion){
        try{
            String sql = "UPDATE extraccion SET monto = ?, fecha_y_hora = ?, comentario = ? WHERE id_extraccion = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setDouble(1, extraccion.getMonto());
            stmt.setTimestamp(2,extraccion.getFecha_y_hora());
            stmt.setString(3, extraccion.getComentario());
            stmt.setInt(4, extraccion.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al actualizar la extraccion " + ex.getMessage());
        }
    }
    
    public List <Extraccion> obtenerExtracciones(){
        List <Extraccion> extracciones = new ArrayList<Extraccion>();
        
        try {
            String sql = "SELECT * FROM Extraccion;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Extraccion extraccion;
            while (rs.next()){
                extraccion = new Extraccion();
                extraccion.setId(rs.getInt("id_extraccion"));
                extraccion.setMonto(rs.getDouble("monto"));
                extraccion.setFecha_y_hora(rs.getTimestamp("fecha_y_hora"));
                extraccion.setComentario(rs.getString("comentario"));
                
                extracciones.add(extraccion);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener las extracciones: " + ex.getMessage());
        }
        return extracciones;
    } 
    
}
