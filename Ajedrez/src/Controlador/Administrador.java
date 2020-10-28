/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.util.ArrayList;

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
    
    public void crearJugador(String _nombre, String _apellido, int _elo, int _categoria, int _edad)
    {
        jugador = liga.crearJugador(_nombre, _apellido, _elo, _categoria, _edad);
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
