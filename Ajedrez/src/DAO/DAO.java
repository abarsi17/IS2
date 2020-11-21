/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.TimeZone;

/**
 *
 * @author amadeo
 */
public class DAO 
{
     
    public DAO()
    {
        String bd = "jdbc:mysql://localhost/PRACTICA_ISI2?serverTimezone=" + TimeZone.getDefault().getID();
        try {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Driver de mysql
            // Conexión usando usuario y clave de administrador de la BD
            Connection conexionBD = DriverManager.getConnection(bd, "root", "vabramai17");
            
            
            ResultSet resultados = null;
            try {
            String con;
            con = "SELECT * FROM JUGADOR";
            PreparedStatement s = conexionBD.prepareStatement(con); // Consulta SQL
            resultados = s.executeQuery(con);
            while (resultados.next()) {
                int id = resultados.getInt("id_jugador");
                System.out.print(id); }
            } catch (Exception e) { // Error al realizar la consulta
                System.out.println("Error en la petición a la BD");
            }
 
            
            
            
        } catch (Exception e) { // Error en la conexión con la BD 
            System.out.println("Error de conexión");
            e.printStackTrace();
        }
        
        
    }
}
    
