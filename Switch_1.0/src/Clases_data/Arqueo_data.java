package Clases_data;

import Clases.Arqueo;
import Clases.Conexion;
import java.sql.*;
import java.util.*;
/**
 * @author Ivan
 * Creacion de la clase arqueo del tipo data
 */
public class Arqueo_data {
    
    //Creamos la conexion a la base de datos
    
    private Connection connection = null;
    public Arqueo_data(Conexion conexion){
        try{
            connection = conexion.getConexion();
        } catch (SQLException ex){
            System.out.println("Error al obtener la conexion");
        }
    }
    
    //Metodos de la clase
    
    public void guardarArqueo(Arqueo arqueo){
        try{
            String sql = "INSERT INTO arqueo (monto_inicial,fecha_de_inicio,fecha_de_cierre,comentario) VALUES (?,?,?,?);";
            
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setDouble(1, arqueo.getMonto_inicial());
            stmt.setTimestamp(2, arqueo.getFecha_de_inicio());
            stmt.setTimestamp(3, arqueo.getFecha_de_cierre());
            stmt.setString(4, arqueo.getComentario());
            
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
                arqueo.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar el arqueo ");
            }
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al insertar el arqueo " + ex.getMessage());
        }
    }
    
    public void borrarArqueo(Arqueo arqueo){
        try{
            String sql = "DELETE FROM arqueo WHERE id_arqueo = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, arqueo.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al borrar el arqueo " + ex.getMessage());
        }
    }
    
    public void actualizarArqueo(Arqueo arqueo){
        try{
            String sql = "UPDATE arqueo SET monto_inicial = ?, fecha_de_inicio = ?, fecha_de_cierre = ?, comentario = ? WHERE id_arqueo = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setDouble(1, arqueo.getMonto_inicial());
            stmt.setTimestamp(2, arqueo.getFecha_de_inicio());
            stmt.setTimestamp(3, arqueo.getFecha_de_cierre());
            stmt.setString(4, arqueo.getComentario());
            stmt.setInt(5, arqueo.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al actualizar el arqueo " + ex.getMessage());
        }
    }
    
    public List <Arqueo> obtenerArqueos(){
        List <Arqueo> arqueos = new ArrayList<Arqueo>();
        
        try {
            String sql = "SELECT * FROM arqueo;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Arqueo arqueo;
            while (rs.next()){
                arqueo = new Arqueo();
                arqueo.setId(rs.getInt("id_arqueo"));
                arqueo.setMonto_inicial(rs.getDouble("monto_inicial"));
                arqueo.setFecha_de_inicio(rs.getTimestamp("fecha_de_inicio"));
                arqueo.setFecha_de_cierre(rs.getTimestamp("fecha_de_cierre"));
                arqueo.setComentario(rs.getString("comentario"));
                
                arqueos.add(arqueo);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los arqueos: " + ex.getMessage());
        }
        return arqueos;
    }
}
