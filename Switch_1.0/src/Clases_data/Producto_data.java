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
            String sql = "INSERT INTO producto (nombre,id_categoria,costo,precio,cantidad,id_provedor,comentario,codigo) VALUES (?,?,?,?,?,?,?,?);";
            
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, producto.getNombre());
            stmt.setInt(2,producto.getId_categoria());
            stmt.setDouble(3,producto.getCosto());
            stmt.setDouble(4,producto.getPrecio());
            stmt.setInt(5,producto.getCantidad());
            stmt.setInt(6,producto.getId_provedor());
            stmt.setString(7,producto.getComentario());
            stmt.setLong(8,producto.getCodigo());
            
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            
            if(rs.next()){
                producto.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar el producto ");
            }
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al insertar el producto " + ex.getMessage());
        }
    }
    
    public void borrarProducto(Producto producto){
        try{
            String sql = "DELETE FROM producto WHERE id_producto = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, producto.getId());
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al borrar el producto " + ex.getMessage());
        }
    }
    
    public void actualizarProducto_por_id(Producto producto, int id){
        try{
            String sql = "UPDATE producto SET nombre = ?, id_categoria = ?, costo = ?, precio = ?, cantidad = ?, id_provedor = ?, comentario = ?, codigo = ? WHERE id_producto = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, producto.getNombre());
            stmt.setInt(2,producto.getId_categoria());
            stmt.setDouble(3,producto.getCosto());
            stmt.setDouble(4,producto.getPrecio());
            stmt.setInt(5,producto.getCantidad());
            stmt.setInt(6,producto.getId_provedor());
            stmt.setString(7,producto.getComentario());
            stmt.setLong(8,producto.getCodigo());
            stmt.setInt(9,id);
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al actualizar el producto " + ex.getMessage());
        }
    }
    
    public void actualizarStock_por_id_producto(int cantidad, int id_producto){
        try{
            String sql = "UPDATE producto SET  cantidad = ? WHERE id_producto = ?";
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1,cantidad);
            stmt.setInt(2,id_producto);
            
            stmt.executeUpdate();
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al actualizar el producto " + ex.getMessage());
        }
    }
    
    public List <Producto> obtenerProductos(){
        List <Producto> productos = new ArrayList<Producto>();
        
        try {
            String sql = "SELECT pro.id_producto, c.id_categoria_producto AS categoria, p.id_provedor AS provedor, pro.nombre, pro.costo, pro.precio, pro.cantidad, pro.comentario, pro.codigo FROM categoria_producto AS c, provedor AS p, producto as pro WHERE c.id_categoria_producto = pro.id_categoria AND p.id_provedor = pro.id_provedor;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Producto producto;
            while (rs.next()){
                producto = new Producto();
                producto.setId(rs.getInt("id_producto"));
                producto.setId_categoria(rs.getInt("categoria"));
                producto.setId_provedor(rs.getInt("provedor"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCosto(rs.getDouble("costo"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setCantidad(rs.getInt("cantidad"));
                producto.setComentario(rs.getString("comentario"));
                producto.setCodigo(rs.getLong("codigo"));
                
                productos.add(producto);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los productos: " + ex.getMessage());
        }
        return productos;
    } 
    
    public List <Producto> obtenerProductos_por_nombre(String nombre){
        List <Producto> productos = new ArrayList<Producto>();
        
        try {
            String sql = "SELECT pro.id_producto, c.id_categoria_producto AS categoria, p.id_provedor AS provedor, pro.nombre, pro.costo, pro.precio, pro.cantidad, pro.comentario, pro.codigo FROM categoria_producto AS c, provedor AS p, producto as pro WHERE c.id_categoria_producto = pro.id_categoria AND p.id_provedor = pro.id_provedor AND pro.nombre = ? ORDER BY pro.nombre;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nombre);
            
            ResultSet rs = stmt.executeQuery();
            Producto producto;
            while (rs.next()){
                producto = new Producto();
                producto.setId(rs.getInt("id_producto"));
                producto.setId_categoria(rs.getInt("categoria"));
                producto.setId_provedor(rs.getInt("provedor"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCosto(rs.getDouble("costo"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setCantidad(rs.getInt("cantidad"));
                producto.setComentario(rs.getString("comentario"));
                producto.setCodigo(rs.getLong("codigo"));
                
                productos.add(producto);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los productos: " + ex.getMessage());
        }
        return productos;
    }
    
    public List <Producto> obtenerProductos_por_costo(Double costo){
        List <Producto> productos = new ArrayList<Producto>();
        
        try {
            String sql = "SELECT pro.id_producto, c.id_categoria AS categoria, p.id_provedor AS provedor, pro.nombre, pro.costo, pro.precio, pro.cantidad, pro.comentario, pro.codigo FROM categoria AS c, provedor AS p, producto as pro WHERE c.id_categoria = pro.id_categoria AND p.id_provedor = pro.id_provedor AND pro.costo = ? ORDER BY pro.costo;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setDouble(1, costo);
            
            ResultSet rs = stmt.executeQuery();
            Producto producto;
            while (rs.next()){
                producto = new Producto();
                producto.setId(rs.getInt("id_producto"));
                producto.setId_categoria(rs.getInt("categoria"));
                producto.setId_provedor(rs.getInt("provedor"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCosto(rs.getDouble("costo"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setCantidad(rs.getInt("cantidad"));
                producto.setComentario(rs.getString("comentario"));
                producto.setCodigo(rs.getLong("codigo"));
                
                productos.add(producto);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los productos: " + ex.getMessage());
        }
        return productos;
    }
    
    public List <Producto> obtenerProductos_por_precio(Double precio){
        List <Producto> productos = new ArrayList<Producto>();
        
        try {
            String sql = "SELECT pro.id_producto, c.id_categoria AS categoria, p.id_provedor AS provedor, pro.nombre, pro.costo, pro.precio, pro.cantidad, pro.comentario, pro.codigo FROM categoria AS c, provedor AS p, producto as pro WHERE c.id_categoria = pro.id_categoria AND p.id_provedor = pro.id_provedor AND pro.precio = ? ORDER BY pro.precio;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setDouble(1, precio);
            
            ResultSet rs = stmt.executeQuery();
            Producto producto;
            while (rs.next()){
                producto = new Producto();
                producto.setId(rs.getInt("id_producto"));
                producto.setId_categoria(rs.getInt("categoria"));
                producto.setId_provedor(rs.getInt("provedor"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCosto(rs.getDouble("costo"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setCantidad(rs.getInt("cantidad"));
                producto.setComentario(rs.getString("comentario"));
                producto.setCodigo(rs.getLong("codigo"));
                
                productos.add(producto);
            }
            stmt.close();
        } catch(SQLException ex){
            System.out.println("Error al obtener los productos: " + ex.getMessage());
        }
        return productos;
    }
    
    public Producto getProducto_por_nombre(String nombre){
        Producto a = null;
        try{
            String sql = "SELECT pro.id_producto, c.id_categoria_producto AS categoria, p.id_provedor AS provedor, pro.nombre, pro.costo, pro.precio, pro.cantidad, pro.comentario, pro.codigo FROM categoria_producto AS c, provedor AS p, producto as pro WHERE c.id_categoria_producto = pro.id_categoria AND p.id_provedor = pro.id_provedor AND pro.nombre LIKE ?";;
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nombre);
            
            ResultSet rs = stmt.executeQuery();
            
            rs.next();
            a = new Producto(rs.getInt(1),rs.getString(4),rs.getInt(2),rs.getDouble(5), rs.getDouble(6), rs.getInt(7), rs.getInt(3), rs.getString(8), rs.getLong(9));
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al obtener el producto" + ex.getMessage());
        }
        return a;
    }
    
    public Producto getProducto_por_id(int id){
        Producto a = null;
        try{
            String sql = "SELECT pro.id_producto, c.id_categoria_producto AS categoria, p.id_provedor AS provedor, pro.nombre, pro.costo, pro.precio, pro.cantidad, pro.comentario, pro.codigo FROM categoria_producto AS c, provedor AS p, producto as pro WHERE c.id_categoria_producto = pro.id_categoria AND p.id_provedor = pro.id_provedor AND pro.id_producto LIKE ?";;
            
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            rs.next();
            a = new Producto(rs.getInt(1),rs.getString(4),rs.getInt(2),rs.getDouble(5), rs.getDouble(6), rs.getInt(7), rs.getInt(3), rs.getString(8), rs.getLong(9));
            
            stmt.close();
        }
        catch(SQLException ex){
            System.out.println("Error al obtener el producto" + ex.getMessage());
        }
        return a;
    }
    
}
