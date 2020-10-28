/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author amadeo
 */
public class Club
{
    private ArrayList<Jugador> jugadores;
    private Entrenador entrenador;
    //private Gerente;
    
    public Club()
    {
        
    }
    
    public void addJugador (Jugador jugador)
    {
        jugadores.add(jugador);
    }
    
    public void addEntrenador (Entrenador entrenador)
    {
        this.entrenador = entrenador;
    }
    
    public ArrayList getJugadores ()
    {
        return jugadores;
    }
    
    public Entrenador getEntrenadores ()
    {
        return entrenador;
    }
 
}
