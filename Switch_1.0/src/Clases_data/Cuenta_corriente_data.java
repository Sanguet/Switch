package Clases_data;

import Clases.Cuenta_corriente;
import Clases.Conexion;
import java.sql.*;
import java.util.*;
/**
 * @author Ivan
 * Creacion de la clase cuenta corriente del tipo Data
 */
public class Cuenta_corriente_data {
    
    //Creamos la conexion a la base de datos
    
    private Connection connection = null;
    public Cuenta_corriente_data(Conexion conexion){
        try{
            connection = conexion.getConexion();
        } catch (SQLException ex){
            System.out.println("Error al obtener la conexion");
        }
    }
    
    //Metodos de la clase
    
    public void guardarCuenta_corriente(Cuenta_corriente cuenta_corriente){
        try{
            String sql = "INSERT INTO cuenta_corriente (id_cliente, monto, id_metodo_de_pago, comentario) VALUES (?,?,?,?);";
            
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, cuenta_corriente.getId_cliente());
            stmt.setDouble(2, cuenta_corriente.getMonto());
            stmt.setInt(3, cuenta_corriente.getId_metodo_de_pago());
            stmt.setString(4, cuenta_corriente.getComentario());
            
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
                cuenta_corriente.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar la cuenta corriente ");
            }
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al insertar la cuenta corriente " + ex.getMessage());
        }
    }
    
    public void borrarCuenta_corriente(Cuenta_corriente cuenta_corriente){
        try{
            String sql = "DELETE FROM cuenta_corriente WHERE id_cuenta = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, cuenta_corriente.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al borrar la cuenta corriente " + ex.getMessage());
        }
    }
    
    public void actualizarCuenta_corriente(Cuenta_corriente cuenta_corriente){
        try{
            String sql = "UPDATE cuenta_corriente SET id_cliente = ?, monto = ?, id_metodo_de_pago = ?, comentario = ? WHERE id_cuenta_corriente = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, cuenta_corriente.getId_cliente());
            stmt.setDouble(2, cuenta_corriente.getMonto());
            stmt.setInt(3, cuenta_corriente.getId_metodo_de_pago());
            stmt.setString(4, cuenta_corriente.getComentario());
            stmt.setInt(5, cuenta_corriente.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al actualizar la cuenta corriente " + ex.getMessage());
        }
    }
    
    public List <Cuenta_corriente> obtenerCuentas_corriente(){
        List <Cuenta_corriente> cuentas_corriente = new ArrayList<Cuenta_corriente>();
        
        try {
            String sql = "SELECT cuent.id_cuenta, c.id_cliente AS id_cliente, cuent.monto, m.Id_metodo AS metodo_de_pago, cuent.comentario FROM cliente AS c, metodo_de_pago AS m, cuenta_corriente as cuent WHERE c.id_cliente = cuent.id_cliente AND m.Id_metodo = cuent.id_metodo_de_pago;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Cuenta_corriente cuenta_corriente;
            while (rs.next()){
                cuenta_corriente = new Cuenta_corriente();
                cuenta_corriente.setId(rs.getInt("id_cuenta"));
                cuenta_corriente.setId_cliente(rs.getInt("id_cliente"));
                cuenta_corriente.setMonto(rs.getDouble("monto"));
                cuenta_corriente.setId_metodo_de_pago(rs.getInt("metodo_de_pago"));
                cuenta_corriente.setComentario(rs.getString("comentario"));
                
                cuentas_corriente.add(cuenta_corriente);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener las cuentas corriente: " + ex.getMessage());
        }
        return cuentas_corriente;
    }
}
