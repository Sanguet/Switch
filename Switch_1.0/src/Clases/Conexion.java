package Clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion{
    private String url;
    private String usuario;
    private String password;

    private Connection conexion;
    
    public Conexion(String url, String usuario, String password) throws ClassNotFoundException {
        this.url = url;
        this.usuario = usuario;
        this.password = password;

        //Cargamos las clases de mywsql que implementan JDBC
        Class.forName("com.mysql.jdbc.Driver");

    }

    public Conexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Connection getConexion() throws SQLException{
        if(conexion == null){
                    // Setup the connection with the DB
            conexion = (Connection) DriverManager.getConnection(url, usuario, password);
        }
        return conexion;
    }
    
    //Esto lo cree recien y es para cerrar la conexion
    public void close() throws SQLException{
        conexion.close();
    }
}

