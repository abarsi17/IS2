/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import Modelo.*;

/**
 *
 * @author ivana
 */
public class Usuario {
    
    private Jugador jugador, jugador1;
    private LigaAjedrez liga;
    
    public void crearJugador(String _nombre, String _apellido, int _elo, int _categoria, int _edad)
    {
        jugador = new Jugador(_nombre, _apellido, _elo, _categoria, _edad);
    }
    
    public ArrayList<String> ListaJugadores()
    {
        return liga.ListaJugadores();
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
}
