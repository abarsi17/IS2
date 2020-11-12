/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.util.*;

/**
 *
 * @author ivana
 */
public class Administrador
{
    private LigaAjedrez liga;
    private Jugador jugador, jugador1;
    
    public Administrador (LigaAjedrez liga)
    {
        this.liga = liga;
    }
    
    public ArrayList ListaJugadores()
    {
        return liga.ListaJugadores();
    }
    
    public ArrayList ListaJugadoresClub()
    {
        return liga.ListaJugadoresClub();
    }
    
    public ArrayList ListaClubes()
    {
        return liga.ListaClubes();
    }
    /*
    public void crearJugador(String _nombre, String _apellido, int _elo, int _categoria, int _edad)
    {
        jugador = liga.crearJugador(_nombre, _apellido, _elo, _categoria, _edad);
    }*/
    
    
    public Jugador crearJugador(String _nombre, String _apellido, int _elo, int _categoria, int _edad)
    {
        return jugador = liga.crearJugador(_nombre, _apellido, _elo, _categoria, _edad);
    }
    
    public EstructuraJugador buscarJugadores(String _nombre)
    {
        EstructuraJugador estrucjug = null;
        jugador1 = liga.buscarJugadores(_nombre);
        
        if(jugador1 != null)
            estrucjug = new EstructuraJugador(jugador1.getNombre(), jugador1.getApellidos(), jugador1.getElo(), jugador1.getCategoria(), jugador1.getEdad());
        else
           estrucjug = null;
        
        return estrucjug;
    }
    /* ASO NO SE PA QUE EU GASTEM
    public Jugador getJugador(Object jugador)
    {
        return liga.getJugador((Jugador)jugador);
    }*/
    
    public void CambiarClub(Jugador jugador, Club club)
    {
        liga.cambiarClub(jugador, club);
    }
    
    public ArrayList consultarTorneosDisponibles(Date data1, Date data2)
    {
        return liga.consultarTorneosDisponibles(data1, data2);
    }
    
    public ArrayList ListaJugadoresMayores()
    {
        return liga.ListaJugadoresMayores();
    }
    
    public ArrayList ListaJugadoresMenores()
    {
        return liga.ListaJugadoresMenores();
    }
    
    public void AsignarResponsable(Jugador jugadormenor, Jugador jugadormayor)
    {
        liga.asignarResponsable(jugadormenor, jugadormayor);
    }
      
    public void inscribirATorneo(Jugador jugador, Torneo torneo)
    {
        liga.inscribirATorneo(jugador, torneo);
    }
    
    public ArrayList ListaTorneos()
    {
        return liga.ListaTorneos();
    }
    
    public void asignarResponsableInicio(Jugador jug)
    {
        liga.asignarResponsableInicio(jug);
    }
}
