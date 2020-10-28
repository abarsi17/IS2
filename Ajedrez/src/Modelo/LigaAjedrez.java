/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.*;

/**
 *
 * @author ivana
 */
public class LigaAjedrez {
    
    private ArrayList<Jugador> jugadores;
    private ArrayList<Entrenador> entrenadores;
    
    public LigaAjedrez()
    {
        
    }
    
    public Jugador crearJugador(String _nombre, String _apellidos, int _elo, int _categoria, int _edad)
    {
        Jugador jugador = new Jugador(_nombre, _apellidos, _elo, _categoria, _edad);
        addJugador(jugador);
        
        return jugador;
    }
    
    public void addJugador(Jugador jug)
    {
        jugadores.add(jug);
    }
    
    public Entrenador crearEntrenador(String _nombreEntrenador, String _apellidosentrenador, int _edadEntrenador)
    {
        Entrenador entrenador = new Entrenador(_nombreEntrenador, _apellidosentrenador, _edadEntrenador);
        addEntrenador(entrenador);
        
        return entrenador;
    }
    
    public void addEntrenador(Entrenador ent)
    {
        entrenadores.add(ent);
    }
    
    public ArrayList ListaJugadores()
    {   
        return jugadores;
    }
    
    public Jugador buscarJugadores(String _nombre)
    {
        int i = 0;
        boolean enc = false;
        Jugador jug = null;
        
        while(enc == false && i< jugadores.size())
        {
            if(jugadores.get(i).getNombre().equals(_nombre))
            {
                enc = true;
                jug = jugadores.get(i);
            }
            i++;
        }
        
        return jug;
    }
    
    public void cargarDatos()
    {
        jugadores = new ArrayList<Jugador>();
        entrenadores = new ArrayList<Entrenador>();
        
        Jugador jugador1 = new Jugador("Amadeo", "Barbera", 12, 2, 22);
        Jugador jugador2 = new Jugador("Gomina", "69", 5, 1, 20);
        Jugador jugador3 = new Jugador("Osli", "Ramon", 30, 3, 20);
        Jugador jugador4 = new Jugador("Kebin", "KOK", 2, 1, 21);
        Jugador jugador5 = new Jugador("Narrote", "Garrote", 28, 3, 24);
        
        Entrenador entrenador1 = new Entrenador("Enric", "Valor", 34);
        Entrenador entrenador2 = new Entrenador("Vicent Andres", "Estelles", 32);
    }
}
