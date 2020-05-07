package Clases_data;

import Clases.Cliente;
import Clases.Conexion;
import java.sql.*;
import java.util.*;

/**
 * @author Ivan
 * Creacion de la clase cliente tipo Data
 */
public class Cliente_data {
    
    //Creamos la conexion a la base de datos
    
    private Connection connection = null;
    public Cliente_data(Conexion conexion){
        try{
            connection = conexion.getConexion();
        } catch (SQLException ex){
            System.out.println("Error al obtener la conexion");
        }
    }
    
    //Metodos de la clase
    
    public void guardarCliente(Cliente cliente){
        try{
            String sql = "INSERT INTO cliente (nombre,telefono,correo,box,metodo_de_pago_preferido,comentario) VALUES (?,?,?,?,?,?);";
            
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, cliente.getNombre());
            stmt.setLong(2,cliente.getTelefono());
            stmt.setString(3,cliente.getCorreo());
            stmt.setString(4,cliente.getBox());
            stmt.setString(5,cliente.getMetodo_de_pago_preferido());
            stmt.setString(6,cliente.getComentario());
            
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
                cliente.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar el cliente ");
            }
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al insertar un cliente " + ex.getMessage());
        }
    }
    
    public void borrarCliente(Cliente cliente){
        try{
            String sql = "DELETE FROM clientes WHERE id_cliente = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, cliente.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al borrar un cliente " + ex.getMessage());
        }
    }
    
    public void actualizarCliente(Cliente cliente){
        try{
            String sql = "UPDATE cliente SET nombre = ?, telefono = ?, correo = ?, box = ?, metodo_de_pago_preferido = ?, comentario = ? WHERE id_cliente = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNombre());
            stmt.setLong(2,cliente.getTelefono());
            stmt.setString(3,cliente.getCorreo());
            stmt.setString(4,cliente.getBox());
            stmt.setString(5,cliente.getMetodo_de_pago_preferido());    
            stmt.setString(6,cliente.getComentario());
            stmt.setInt(7, cliente.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al actualizar el cliente " + ex.getMessage());
        }
    }
    
    public List <Cliente> obtenerAlumnos(){
        List <Cliente> clientes = new ArrayList<Cliente>();
        
        try {
            String sql = "SELECT * FROM cliente;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Cliente cliente;
            while (rs.next()){
                cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setTelefono(rs.getLong("telefono"));
                cliente.setCorreo(rs.getString("correo"));
                cliente.setBox(rs.getString("box"));
                cliente.setMetodo_de_pago_preferido(rs.getString("metodo_de_pago_preferido"));
                cliente.setComentario(rs.getString("comentario"));
                
                clientes.add(cliente);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        return clientes;
    } 
    
    //Faltan todas las listas especificas y las busquedas individuales
    
    
}
