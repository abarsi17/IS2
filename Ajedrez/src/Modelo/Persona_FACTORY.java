/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author amadeo
 */

public class Persona_FACTORY 
{
    private static final int JUGADOR = 0;
    private static final int ENTRENADOR = 1;
    private static final int GERENTE = 2;
    
    
    private String nom;
    private String apellidos;
    private int edad;
    
    private Jugador jug;
    private Entrenador ent;
    private Gerente ger;
    
    public Object Persona_FACTORY(int id, String nom, String apellidos, int edad)
    {
        Object persona;
        
        switch (id) 
        {
            case JUGADOR:
                persona = jug = new Jugador(nom, apellidos, edad);
                break;
            case ENTRENADOR:
                persona = ent = new Entrenador(nom, apellidos, edad);
                break;
            case GERENTE:
                persona = ger = new Gerente(nom, apellidos, edad);
                break;
            default:
                persona = null;
                break;
        }
        
        return persona;
            
    }
}
