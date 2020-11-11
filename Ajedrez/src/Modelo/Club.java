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
    private String nombre;
    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    private Entrenador entrenador;
    private Gerente gerente;
    
    public Club(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void addJugador (Jugador jugador)
    {
        jugadores.add(jugador);
    }
    
    public void addEntrenador (Entrenador entrenador)
    {
        this.entrenador = entrenador;
    }
    
    public void addGerente(Gerente gerente)
    {
        this.gerente = gerente;
    }
    
    public ArrayList getJugadores ()
    {
        return jugadores;
    }
    
    public String getEntrenadores ()
    {
        return entrenador.getNombreEntrenador();
    }

    public String getNombre()
    {
        return nombre;
    }
    
    public String getGerente()
    {
        return gerente.getNombre();
    }
    
    public String toString()
    {
        return nombre;
    }
}
