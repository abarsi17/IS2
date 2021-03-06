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
public class Jugador extends Persona_FACTORY
{
    private String nombre;
    private String apellidos;
    private int id = -1;
    private Jugador responsable = null;
    private int elo;
    private int categoria;
    private int edad;
    
    public Jugador(String nom, String apellidos, int edad)
    {
        nombre = nom;
        this.apellidos = apellidos;
        this.edad = edad;
        this.id = id + 1;
        
        if(edad <= 15)
           categoria = 1;
        else if(edad > 15 && edad <=18)
           categoria = 2;
        else if(edad > 18)
           categoria = 3;
    }
    
    public Jugador(String nombre, String apellidos, int elo, int categoria, int edad)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.elo = elo;
        this.categoria = categoria;
        this.edad = edad;
    }

    public void setResponsable(Jugador responsable)
    {
        this.responsable = responsable;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getElo() {
        return elo;
    }

    public void setElo(int elo) {
        this.elo = elo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toString()
    {
        return nombre;
    }
    
    public String getResponsable()
    {
        return responsable.getNombre();
    }
    
    
}
