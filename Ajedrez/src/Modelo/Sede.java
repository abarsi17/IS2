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
public class Sede {
    private String nombre;
    private Jugador jug;
    
    public Sede (String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }
    
    public void addJugador(Jugador jug)
    {
        this.jug = jug;
    }
    
     public String toString()
    {
        return nombre;
    }

}
