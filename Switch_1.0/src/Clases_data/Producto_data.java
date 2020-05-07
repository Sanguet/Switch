package Clases_data;

import Clases.Producto;
import Clases.Conexion;
import java.sql.*;
import java.util.*;
/**
 * @author Ivan
 * Creacion del producto de tipo Data
 */
public class Producto_data {
    
    //Creamos la conexion a la base de datos
    
    private Connection connection = null;
    public Producto_data(Conexion conexion){
        try{
            connection = conexion.getConexion();
        } catch (SQLException ex){
            System.out.println("Error al obtener la conexion");
        }
    }
    
    //Metodos de la clase
    
    public void guardarProducto(Producto producto){
        try{
            String sql = "INSERT INTO producto (nombre,id_categoria,costo,box,metodo_de_pago_preferido,comentario) VALUES (?,?,?,?,?,?);";
            
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
    
}
