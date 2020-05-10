/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_data;

import Clases.Conexion;
import Clases.Venta;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Ivan
 * Creacion de la clase venta del tipo data
 */
public class Venta_data {
    
    //Creamos la conexion a la base de datos
    private Connection connection = null;
    public Venta_data(Conexion conexion){
        try{
            connection = conexion.getConexion();
        } catch (SQLException ex){
            System.out.println("Error al abrr al obtener la conexion");
        }
    }
    
    //Metodos de la clase
    //Metodos de guardado
    public void guardarVenta(Venta venta){
        try{
            String sql = "INSERT INTO venta (id_cliente, id_detalle, id_metodo_de_pago, total,descuento, fecha_y_hora, comentario) VALUES (?,?,?,?,?,?,?)";
            
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, venta.getId_cliente());
            stmt.setInt(2, venta.getId_detalle());
            stmt.setInt(3, venta.getId_metodo_de_pago());
            stmt.setDouble(4, venta.getTotal());
            stmt.setInt(5, venta.getDescuento());
            stmt.setTimestamp(6, venta.getFecha_y_hora());
            stmt.setString(7, venta.getComentario());
            
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
                venta.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un ");
            }
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al insertar la venta " + ex.getMessage());
        }
    }
    
    //Metodos de borrado
    
    public void borrarVenta(Venta venta){
        try{
            String sql = "DELETE FROM venta WHERE id_venta = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, venta.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al borrar la venta " + ex.getMessage());
        }
    }
    
    //Metodos de actualizacion
    
    public void actualizarVenta(Venta venta){
        try{
            String sql = "UPDATE venta SET id_cliente = ?, id_detalle = ?, id_metodo_de_pago = ?, total = ?, descuento = ?, fecha_y_hora = ?, comentario = ? WHERE id_venta = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, venta.getId_cliente());
            stmt.setInt(2, venta.getId_detalle());
            stmt.setInt(3, venta.getId_metodo_de_pago());
            stmt.setDouble(4, venta.getTotal());
            stmt.setInt(5, venta.getDescuento());
            stmt.setTimestamp(6, venta.getFecha_y_hora());
            stmt.setString(7,venta.getComentario());
            stmt.setInt(8, venta.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al actualizar la venta " + ex.getMessage());
        }
    }
    
    //Metodos de obtener una lista
    
    public List <Venta> obtenerVentas(){
        List <Venta> ventas = new ArrayList<Venta>();
        
        try {
            String sql = "SELECT v.id_venta, c.id_cliente as cliente, d.id_detalle as detalle_de_venta, m.Id_metodo as metodo_de_pago, v.total, v.descuento, v.fecha_y_hora, v.comentario FROM cliente as c, detalle_de_venta as d, metodo_de_pago as m, venta as v WHERE c.id_cliente = v.id_cliente AND d.id_detalle = v.id_detalle AND m.Id_metodo = v.id_metodo_de_pago;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Venta venta;
            while (rs.next()){
                venta = new Venta();
                venta.setId(rs.getInt("id_venta"));
                venta.setId_cliente(rs.getInt("cliente"));
                venta.setId_detalle(rs.getInt("detalle"));
                venta.setId_metodo_de_pago(rs.getInt("metodo_de_pago"));
                venta.setTotal(rs.getDouble("total"));
                venta.setDescuento(rs.getInt("descuento"));
                venta.setFecha_y_hora(rs.getTimestamp("fecha_y_hora"));
                venta.setComentario(rs.getString("comentario"));
                
                ventas.add(venta);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener las ventas: " + ex.getMessage());
        }
        return ventas;
    } 
    
    public List <Venta> obtenerVentas_por_cliente_y_fecha(String nombre, Timestamp fecha_min, Timestamp fecha_max){
        List <Venta> ventas = new ArrayList<Venta>();
        //La fecha min tiene 00:00:00 y la max 23:59:59
        try {
            String sql = "SELECT v.id_venta, c.id_cliente as cliente, d.id_detalle as detalle_de_venta, m.Id_metodo as metodo_de_pago, v.total, v.descuento, v.fecha_y_hora, v.comentario FROM cliente as c, detalle_de_venta as d, metodo_de_pago as m, venta as v WHERE c.id_cliente = v.id_cliente AND d.id_detalle = v.id_detalle AND m.Id_metodo = v.id_metodo_de_pago AND v.fecha_y_hora BETWEEN ? AND ? AND c.nombre LIKE ?;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setTimestamp(1, fecha_min);
            stmt.setTimestamp(2, fecha_max);
            stmt.setString(3, nombre);

            
            ResultSet rs = stmt.executeQuery();
            Venta venta1;
            while (rs.next()){
                venta1 = new Venta();
                venta1.setId(rs.getInt("id_venta"));
                venta1.setId_cliente(rs.getInt("cliente"));
                venta1.setId_detalle(rs.getInt("detalle"));
                venta1.setId_metodo_de_pago(rs.getInt("metodo_de_pago"));
                venta1.setTotal(rs.getDouble("total"));
                venta1.setDescuento(rs.getInt("descuento"));
                venta1.setFecha_y_hora(rs.getTimestamp("fecha_y_hora"));
                venta1.setComentario(rs.getString("comentario"));
                
                ventas.add(venta1);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener las ventas: " + ex.getMessage());
        }
        return ventas;
    } 
    
    
    // Busquedas
    
    public Venta getVenta_por_cliente(String cliente){
        Venta a = null;
        try{
            String sql = "SELECT v.id_venta, c.id_cliente as cliente, d.id_detalle as detalle_de_venta, m.Id_metodo as metodo_de_pago, v.total, v.descuento, v.fecha_y_hora, v.comentario FROM cliente as c, detalle_de_venta as d, metodo_de_pago as m, venta as v WHERE c.id_cliente = v.id_cliente AND d.id_detalle = v.id_detalle AND m.Id_metodo = v.id_metodo_de_pago AND c.nombre LIKE ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente);
            
            ResultSet rs = stmt.executeQuery();
            
            rs.next();
            a = new Venta(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4), rs.getDouble(5), rs.getInt(6), rs.getTimestamp(7), rs.getString(8));
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al obtener la venta" + ex.getMessage());
        }
        return a;
    }
    
    public Venta getVenta_por_cliente_y_fecha(Venta venta){
        Venta a = null;
        try{
            String sql = "SELECT v.id_venta, c.id_cliente as cliente, d.id_detalle as detalle_de_venta, m.Id_metodo as metodo_de_pago, v.total, v.descuento, v.fecha_y_hora, v.comentario FROM cliente as c, detalle_de_venta as d, metodo_de_pago as m, venta as v WHERE c.id_cliente = v.id_cliente AND d.id_detalle = v.id_detalle AND m.Id_metodo = v.id_metodo_de_pago AND v.id_cliente = ? AND v.fecha_y_hora = ?;";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, venta.getId_cliente());
            stmt.setTimestamp(1, venta.getFecha_y_hora());
            
            ResultSet rs = stmt.executeQuery();
            
            rs.next();
            a = new Venta(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4), rs.getDouble(5), rs.getInt(6), rs.getTimestamp(7), rs.getString(8));
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al obtener la venta" + ex.getMessage());
        }
        return a;
    }
}
