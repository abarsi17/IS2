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
public class Entrenador extends Persona_FACTORY
{
    private String nombreEntrenador;
    private String apellidosEntrenador;
    private int edadEntrenador;
    private int id_entrenador = -1;
    
    public Entrenador(String nombreEntrenador,String apellidosEntrenador,int edadEntrenador)
    {
        this.apellidosEntrenador = apellidosEntrenador;
        this.nombreEntrenador = nombreEntrenador;
        this.edadEntrenador = edadEntrenador;
        //this.club = club;
        this.id_entrenador = id_entrenador + 1; 
    }
        
    
    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public String getApellidosEntrenador() {
        return apellidosEntrenador;
    }

    public void setApellidosEntrenador(String apellidosEntrenador) {
        this.apellidosEntrenador = apellidosEntrenador;
    }

    public int getEdadEntrenador() {
        return edadEntrenador;
    }

    public void setEdadEntrenador(int edadEntrenador) {
        this.edadEntrenador = edadEntrenador;
    }
    
    
}
