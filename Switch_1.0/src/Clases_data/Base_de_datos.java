/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases_data;

import Clases.Cliente;
import Clases.Conexion;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Base_de_datos {
    private Connection connection = null;
    public Base_de_datos(Conexion conexion){
        try{
            connection = conexion.getConexion();
        } catch (SQLException ex){
            System.out.println("Error al obtener la conexion");
        }
    }
    
    public void crear_Base(){
        try {
            String sql = "CREATE DATABASE casita_test;";
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
