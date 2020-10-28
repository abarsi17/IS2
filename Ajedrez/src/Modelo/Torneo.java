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
    private Date fecha;
    private int num_participantes;
    private ArrayList<Jugador> jugadores;
    
    public Torneo(String nombre, Federacion federacion, Date fecha, int num_participantes)
    {
        this.nombre = nombre;
        this.federacion = federacion;
        this.fecha = fecha;
        this.num_participantes = num_participantes;     
    }
}
