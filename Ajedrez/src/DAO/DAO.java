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
    private Connection conexionBD;
     
    public DAO()
    {
        String bd = "jdbc:mysql://localhost/PRACTICA_ISI2?serverTimezone=" + TimeZone.getDefault().getID();
        try {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Driver de mysql
            // Conexión usando usuario y clave de administrador de la BD
                conexionBD = DriverManager.getConnection(bd, "root", "vabramai17");    
        } catch (Exception e) { // Error en la conexión con la BD 
            System.out.println("Error de conexión");
            e.printStackTrace();
        }  
    }
    
    public void realizarConsultaSQL (String arg, String atr)
    {
        ResultSet resultados = null;
            try {
                
                if (atr == null)
                    atr = "*";
                String con;
                con = "SELECT " + atr + "FROM " + arg;
                PreparedStatement s = conexionBD.prepareStatement(con); // Consulta SQL
                resultados = s.executeQuery(con);
            while (resultados.next()) {
                int id = resultados.getInt("ID_JUGADOR");
                String nom = resultados.getString("NOMBRE");
                String apellidos = resultados.getString("APELLIDOS");
                int edad = resultados.getInt("EDAD");
                int elo = resultados.getInt("ELO");
                System.out.println(id + "\n" + apellidos + "\n" + edad+ "\n" + elo); }
            } catch (Exception e) { // Error al realizar la consulta
                System.out.println("Error en la petición a la BD");
            }
    }
    
    public void realizarOperacionSQL (String arg, String atr)
    {
        ResultSet resultados2 = null;
        try
        {
            int id = 10; // Valor a insertar
            String con = "INSERT INTO " + arg + " (" + atr +") VALUES ('" + id + "')";
             PreparedStatement s = conexionBD.prepareStatement(con); // Consulta SQL
            // Operación SQL sobre la base de datos   
            s.executeUpdate();
        }
        catch(Exception e)
        { // Error al realizar la operación
            System.out.println("No se ha completado la operación");
        }
 
    }
}
    
