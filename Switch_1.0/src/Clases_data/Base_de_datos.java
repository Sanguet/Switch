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
            stmt.execute();
            
            stmt.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void Insertar_datos(){
        try{
            String z ="SET SQL_MODE = \"NO_AUTO_VALUE_ON_ZERO\";";
            String x = "START TRANSACTION;";
            String y = "SET time_zone = \"+00:00\";";
            String a = "CREATE TABLE `arqueo` (\n" +
"  `Id_arqueo` int(11) NOT NULL,\n" +
"  `monto_inicial` double NOT NULL,\n" +
"  `fecha_de_inicio` timestamp NOT NULL DEFAULT current_timestamp(),\n" +
"  `fecha_de_cierre` timestamp NULL DEFAULT NULL,\n" +
"  `comentario` text NOT NULL\n" +
") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";
            String b ="CREATE TABLE `categoria` (\n" +
"  `id_categoria` int(11) NOT NULL,\n" +
"  `nombre` varchar(44) NOT NULL\n" +
") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;";
            String c = "ALTER TABLE `categoria`\n" +
"  ADD PRIMARY KEY (`id_categoria`);";
            String u = "ALTER TABLE `categoria`\n" +
"  MODIFY `id_categoria` int(11) NOT NULL AUTO_INCREMENT;";
            PreparedStatement stmt2 = connection.prepareStatement(a);
            PreparedStatement stmt3 = connection.prepareStatement(b);
            PreparedStatement stmt4 = connection.prepareStatement(z);
            PreparedStatement stmt5 = connection.prepareStatement(x);
            PreparedStatement stmt6 = connection.prepareStatement(y);
            PreparedStatement stmt7 = connection.prepareStatement(c);
            PreparedStatement stmt8 = connection.prepareStatement(u);
            stmt2.execute();
            stmt3.execute();
            stmt4.execute();
            stmt5.execute();
            stmt6.execute();
            stmt7.execute();
            stmt8.execute();
            
            
            stmt2.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
}
