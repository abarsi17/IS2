/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ivana
 */
public class TarjetaJugador {
    private Jugador jugador;
    
    public TarjetaJugador(Jugador jugador)
    {
        this.jugador = jugador;
    }
    
    public String getNombreJugador()
    {
        return jugador.getNombre();
    }
    
    public String getApellidosJugador()
    {
        return jugador.getApellidos();
    }
    
    public int getNombreEdad()
    {
        return jugador.getEdad();
    }
    
    public int getCategoriaJugador()
    {
        return jugador.getCategoria();
    }
    
    public int getEloJugador()
    {
        return jugador.getElo();
    }
}
