package Clases_data;

import Clases.Detalle_de_venta;
import Clases.Conexion;
import java.sql.*;
import java.util.*;
/**
 * @author Ivan
 * Creacion de la clase detalle de venta de tipo Data
 */
public class Detalle_de_venta_data {
    
    //Creamos la conexion a la base de datos
    
    private Connection connection = null;
    public Detalle_de_venta_data(Conexion conexion){
        try{
            connection = conexion.getConexion();
        } catch (SQLException ex){
            System.out.println("Error al obtener la conexion");
        }
    }
    
    //Metodos de la clase
    
    public void guardarDetalle_de_venta(Detalle_de_venta detalle_de_venta){
        try{
            String sql = "INSERT INTO detalle_de_venta (id_producto, cantidad, descuento, sub_total) VALUES (?,?,?,?);";
            
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, detalle_de_venta.getId_producto());
            stmt.setInt(2, detalle_de_venta.getCantidad());
            stmt.setInt(3, detalle_de_venta.getDescuento());
            stmt.setDouble(4, detalle_de_venta.getSub_total());
            
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
                detalle_de_venta.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar el detalle_de_venta ");
            }
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al insertar el detalle_de_venta " + ex.getMessage());
        }
    }
    
    public void borrarDetalle_de_venta(Detalle_de_venta detalle_de_venta){
        try{
            String sql = "DELETE FROM detalle_de_venta WHERE id_detalle_de_venta = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, detalle_de_venta.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al borrar un detalle de venta " + ex.getMessage());
        }
    }
    
    public void actualizarDetalle_de_venta(Detalle_de_venta detalle_de_venta){
        try{
            String sql = "UPDATE detalle_de_venta SET id_producto = ?, cantidad = ?, descuento = ?, sub_total = ? WHERE id_cliente = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, detalle_de_venta.getId_producto());
            stmt.setInt(2, detalle_de_venta.getCantidad());
            stmt.setInt(3, detalle_de_venta.getDescuento());
            stmt.setDouble(4, detalle_de_venta.getSub_total());
            stmt.setInt(5, detalle_de_venta.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al actualizar el detalle de venta " + ex.getMessage());
        }
    }
    
    public List <Detalle_de_venta> obtenerDetalle_de_venta(){
        List <Detalle_de_venta> detalles_de_venta = new ArrayList<Detalle_de_venta>();
        
        try {
            String sql = "SELECT d.id_detalle, p.id_producto as id_producto, d.cantidad, d.descuento, d.sub_total FROM detalle_de_venta AS d, producto AS p WHERE p.id_producto = d.id_producto ORDER BY d.id_detalle;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Detalle_de_venta detalle_de_venta;
            while (rs.next()){
                detalle_de_venta = new Detalle_de_venta();
                detalle_de_venta.setId(rs.getInt("id_detalle"));
                detalle_de_venta.setId_producto(rs.getInt("id_producto"));
                detalle_de_venta.setCantidad(rs.getInt("cantidad"));
                detalle_de_venta.setDescuento(rs.getInt("descuento"));
                detalle_de_venta.setSub_total(rs.getDouble("sub_total"));
                
                detalles_de_venta.add(detalle_de_venta);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los detalles de venta: " + ex.getMessage());
        }
        return detalles_de_venta;
    }
    
    public Detalle_de_venta getDetalle_de_venta_por_id(int id){
        Detalle_de_venta a = null;
        try{
            String sql = "SELECT d.id_detalle, p.id_producto as id_producto, d.cantidad, d.descuento, d.sub_total FROM detalle_de_venta AS d, producto AS p WHERE p.id_producto = d.id_producto AND d.id_detalle = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            rs.next();
            a = new Detalle_de_venta(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getDouble(5));
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al obtener el detalle de venta" + ex.getMessage());
        }
        return a;
    }
}
