package Clases_data;

import Clases.Gasto;
import Clases.Conexion;
import java.sql.*;
import java.util.*;
/**
 * @author Ivan
 * Creacion de la clase gasto del tipo data
 */
public class Gasto_data {
    
    //Creamos la conexion a la base de datos
    
    private Connection connection = null;
    public Gasto_data(Conexion conexion){
        try{
            connection = conexion.getConexion();
        } catch (SQLException ex){
            System.out.println("Error al obtener la conexion");
        }
    }
    
    //Metodos de la clase
    
    public void guardarGasto(Gasto gasto){
        try{
            String sql = "INSERT INTO gasto (id_provedor,monto,id_metodo_de_pago,id_categoria,id_detalle,fecha_y_hora,comentario) VALUES (?,?,?,?,?,?,?);";
            
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, gasto.getId_provedor());
            stmt.setDouble(2, gasto.getMonto());
            stmt.setInt(3, gasto.getId_metodo_de_pago());
            stmt.setInt(4, gasto.getId_categoria());
            stmt.setInt(5, gasto.getId_detalle());
            stmt.setTimestamp(6, gasto.getFecha_y_hora());
            stmt.setString(7, gasto.getComentario());
            
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
                gasto.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar el gasto ");
            }
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al insertar un gasto " + ex.getMessage());
        }
    }
    
    public void borrarGasto(Gasto gasto){
        try{
            String sql = "DELETE FROM gasto WHERE id_gasto = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, gasto.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al borrar el gasto " + ex.getMessage());
        }
    }
    
    public void actualizarGasto(Gasto gasto){
        try{
            String sql = "UPDATE gasto SET id_provedor = ?, monto = ?, id_metodo_de_pago = ?, id_categoria = ?, id_detalle = ?, fecha_y_hora = ?, comentario = ? WHERE id_cliente = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, gasto.getId_provedor());
            stmt.setDouble(2, gasto.getMonto());
            stmt.setInt(3, gasto.getId_metodo_de_pago());
            stmt.setInt(4, gasto.getId_categoria());
            stmt.setInt(5, gasto.getId_detalle());
            stmt.setTimestamp(6, gasto.getFecha_y_hora());
            stmt.setString(7, gasto.getComentario());
            stmt.setInt(8, gasto.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al actualizar el gasto " + ex.getMessage());
        }
    }
    
    public List <Gasto> obtenerGastos(){
        List <Gasto> gastos = new ArrayList<Gasto>();
        
        try {
            String sql = "SELECT g.id_gasto, p.id_provedor AS id_provedor, g.monto, m.Id_metodo AS metodo_de_pago, c.id_categoria AS categoria, d.id_detalle AS id_detalle, g.fecha_y_hora, g.comentario FROM provedor AS p, metodo_de_pago AS m, categoria AS c, detalle_de_venta AS d, gasto AS g WHERE p.id_provedor = g.id_provedor AND m.Id_metodo = g.id_metodo_de_pago AND c.id_categoria = g.id_categoria AND d.id_detalle = g.id_detalle ORDER BY g.fecha_y_hora DESC;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Gasto gasto;
            while (rs.next()){
                gasto = new Gasto();
                gasto.setId(rs.getInt("id_gasto"));
                gasto.setId_provedor(rs.getInt("id_provedor"));
                gasto.setMonto(rs.getDouble("monto"));
                gasto.setId_metodo_de_pago(rs.getInt("metodo_de_pago"));
                gasto.setId_categoria(rs.getInt("categoria"));
                gasto.setId_detalle(rs.getInt("id_detalle"));
                gasto.setFecha_y_hora(rs.getTimestamp("fecha_y_hora"));
                gasto.setComentario(rs.getString("comentario"));
                
                gastos.add(gasto);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los gastos: " + ex.getMessage());
        }
        return gastos;
    }
    
    public List <Gasto> obtenerGastos_por_categoria(String categoria){
        List <Gasto> gastos = new ArrayList<Gasto>();
        
        try {
            String sql = "SELECT g.id_gasto, p.id_provedor AS id_provedor, g.monto, m.Id_metodo AS metodo_de_pago, c.id_categoria AS categoria, d.id_detalle AS id_detalle, g.fecha_y_hora, g.comentario FROM provedor AS p, metodo_de_pago AS m, categoria AS c, detalle_de_venta AS d, gasto AS g WHERE p.id_provedor = g.id_provedor AND m.Id_metodo = g.id_metodo_de_pago AND c.id_categoria = g.id_categoria AND d.id_detalle = g.id_detalle AND c.nombre LIKE ?;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, categoria);
            
            ResultSet rs = stmt.executeQuery();
            Gasto gasto;
            while (rs.next()){
                gasto = new Gasto();
                gasto.setId(rs.getInt("id_gasto"));
                gasto.setId_provedor(rs.getInt("id_provedor"));
                gasto.setMonto(rs.getDouble("monto"));
                gasto.setId_metodo_de_pago(rs.getInt("metodo_de_pago"));
                gasto.setId_categoria(rs.getInt("categoria"));
                gasto.setId_detalle(rs.getInt("id_detalle"));
                gasto.setFecha_y_hora(rs.getTimestamp("fecha_y_hora"));
                gasto.setComentario(rs.getString("comentario"));
                
                gastos.add(gasto);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los gastos: " + ex.getMessage());
        }
        return gastos;
    }
    
    public List <Gasto> obtenerGastos_por_provedor(String provedor){
        List <Gasto> gastos = new ArrayList<Gasto>();
        
        try {
            String sql = "SELECT g.id_gasto, p.id_provedor AS id_provedor, g.monto, m.Id_metodo AS metodo_de_pago, c.id_categoria AS categoria, d.id_detalle AS id_detalle, g.fecha_y_hora, g.comentario FROM provedor AS p, metodo_de_pago AS m, categoria AS c, detalle_de_venta AS d, gasto AS g WHERE p.id_provedor = g.id_provedor AND m.Id_metodo = g.id_metodo_de_pago AND c.id_categoria = g.id_categoria AND d.id_detalle = g.id_detalle AND p.nombre LIKE ?;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, provedor);
            
            ResultSet rs = stmt.executeQuery();
            Gasto gasto;
            while (rs.next()){
                gasto = new Gasto();
                gasto.setId(rs.getInt("id_gasto"));
                gasto.setId_provedor(rs.getInt("id_provedor"));
                gasto.setMonto(rs.getDouble("monto"));
                gasto.setId_metodo_de_pago(rs.getInt("metodo_de_pago"));
                gasto.setId_categoria(rs.getInt("categoria"));
                gasto.setId_detalle(rs.getInt("id_detalle"));
                gasto.setFecha_y_hora(rs.getTimestamp("fecha_y_hora"));
                gasto.setComentario(rs.getString("comentario"));
                
                gastos.add(gasto);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los gastos: " + ex.getMessage());
        }
        return gastos;
    }    
        
    public List <Gasto> obtenerGastos_por_fecha(Timestamp fecha_min, Timestamp fecha_max){
        List <Gasto> gastos = new ArrayList<Gasto>();
        
        try {
            String sql = "SELECT g.id_gasto, p.id_provedor AS id_provedor, g.monto, m.Id_metodo AS metodo_de_pago, c.id_categoria AS categoria, d.id_detalle AS id_detalle, g.fecha_y_hora, g.comentario FROM provedor AS p, metodo_de_pago AS m, categoria AS c, detalle_de_venta AS d, gasto AS g WHERE p.id_provedor = g.id_provedor AND m.Id_metodo = g.id_metodo_de_pago AND c.id_categoria = g.id_categoria AND d.id_detalle = g.id_detalle AND g.fecha_y_hora BETWEEN ? AND ?;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setTimestamp(1, fecha_min);
            stmt.setTimestamp(2, fecha_max);
            
            ResultSet rs = stmt.executeQuery();
            Gasto gasto;
            while (rs.next()){
                gasto = new Gasto();
                gasto.setId(rs.getInt("id_gasto"));
                gasto.setId_provedor(rs.getInt("id_provedor"));
                gasto.setMonto(rs.getDouble("monto"));
                gasto.setId_metodo_de_pago(rs.getInt("metodo_de_pago"));
                gasto.setId_categoria(rs.getInt("categoria"));
                gasto.setId_detalle(rs.getInt("id_detalle"));
                gasto.setFecha_y_hora(rs.getTimestamp("fecha_y_hora"));
                gasto.setComentario(rs.getString("comentario"));
                
                gastos.add(gasto);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los gastos: " + ex.getMessage());
        }
        return gastos;
    }
    
    //Busquedas
}
