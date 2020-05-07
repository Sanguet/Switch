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
            String sql = "INSERT INTO venta (id_cliente, id_detalle, id_metodo_de_pago, total, fecha_y_hora, comentario) VALUES (?,?,?,?,?,?)";
            
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, venta.getId_cliente());
            stmt.setInt(1, venta.getId_detalle());
            stmt.setInt(1, venta.getId_metodo_de_pago());
            stmt.setDouble(1, venta.getTotal());
            stmt.setTimestamp(1, venta.getFecha_y_hora());
            stmt.setString(1, venta.getComentario());
            
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
            String sql = "UPDATE venta SET id_cliente = ?, id_detalle = ?, id_metodo_de_pago = ?, total = ?, fecha_y_hora = ?, comentario = ? WHERE id_venta = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, venta.getId_cliente());
            stmt.setInt(2, venta.getId_detalle());
            stmt.setInt(3, venta.getId_metodo_de_pago());
            stmt.setDouble(4, venta.getTotal());
            stmt.setTimestamp(5, venta.getFecha_y_hora());
            stmt.setString(6,venta.getComentario());
            stmt.setInt(7, venta.getId());
            
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
            String sql = "SELECT c.id_cliente as cliente, d.id_detalle as detalle_de_venta, m.Id_metodo as metodo_de_pago, v.total, v.fecha_y_hora, v.comentario FROM cliente as c, detalle_de_venta as d, metodo_de_pago as m, venta as v WHERE c.id_cliente = v.id_cliente AND d.id_detalle = v.id_detalle AND m.Id_metodo = v.id_metodo_de_pago;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Venta venta;
            while (rs.next()){
                venta = new Venta();
                venta.setId(rs.getInt("id"));
                venta.setId_cliente(rs.getInt("cliente"));
                venta.setId_detalle(rs.getInt("detalle"));
                venta.setId_metodo_de_pago(rs.getInt("metodo_de_pago"));
                venta.setTotal(rs.getDouble("total"));
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
}
