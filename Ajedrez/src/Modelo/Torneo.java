/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author amadeo
 */
public class Torneo 
{  
    private String nombre;
    private Federacion federacion;
    private Date fechaIni, fechaFin;
    private int num_participantes;
    private ArrayList<Jugador> jugadores = new ArrayList();
    
    public Torneo(String nombre, Date fechaIni, Date fechaFin, int num_participantes)
    {
        this.nombre = nombre;
        this.federacion = federacion;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.num_participantes = num_participantes;   
        
    }
    
    public boolean comprobarFechas(Date data1, Date data2)
    {
        boolean ok = false;
        
        if(fechaIni.getYear() == data1.getYear() && fechaIni.getMonth() == data1.getMonth() && fechaIni.getDay() == data1.getDay())
        {
            if(fechaFin.getYear() == data2.getYear() && fechaFin.getMonth() == data2.getMonth() && fechaFin.getDay() == data2.getDay())
                ok = true;
        }
        
        
        return ok;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void addJugador (Jugador jugador)
    {
        jugadores.add(jugador);
    }

    public ArrayList getJugadores ()
    {
        return jugadores;
    }
    
    public String toString()
    {
        return nombre;
    }
}
    
    
