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
    private ArrayList<Club> clubs;
    private ArrayList<Torneo> torneos;
    
    public LigaAjedrez()
    {
        
    }
    
    public Jugador crearJugador(String _nombre, String _apellidos, int _elo, int _categoria, int _edad)
    {
        Jugador jugador = new Jugador(_nombre, _apellidos, _elo, _categoria, _edad);
        jugadores.add(jugador);
        
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
        
        while(enc == false && i < jugadores.size())
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
    
    public int cantidadClubs()
    {
        return clubs.size();
    }
    
    public Jugador getJugador(Jugador jugador)
    {
        return jugador;
    }
    
    public void cargarDatos()
    {
        jugadores = new ArrayList<Jugador>();
        entrenadores = new ArrayList<Entrenador>();
        torneos = new ArrayList<Torneo>();
        clubs = new ArrayList<Club> ();
        
        Jugador jugador1 = new Jugador("Amadeo", "Barbera", 12, 2, 22);
        Jugador jugador2 = new Jugador("Gomina", "69", 5, 1, 20);
        Jugador jugador3 = new Jugador("Osli", "Ramon", 30, 3, 20);
        Jugador jugador4 = new Jugador("Kebin", "KOK", 2, 1, 21);
        Jugador jugador5 = new Jugador("Narrote", "Garrote", 28, 3, 24);
        
        Entrenador entrenador1 = new Entrenador("Shermi", "Valor", 34);
        Entrenador entrenador2 = new Entrenador("Vicent", "Estelles", 32);
        
        Date dateIni1 = new Date(2020, 11, 23);
        Date dateFin1 = new Date(2020, 11, 26);
        Date dateIni2 = new Date(2020, 11, 27);
        Date dateFin2 = new Date(2020, 11, 30);
        
        Torneo torneo1 = new Torneo("Torneo Champ", dateIni1, dateFin1, 10);
        Torneo torneo2 = new Torneo("Torneo Champ", dateIni2, dateFin2, 10);
        
        entrenadores.add(entrenador1);
        entrenadores.add(entrenador2);
        
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        jugadores.add(jugador4);
        jugadores.add(jugador5);
        
    }
    
    
}
