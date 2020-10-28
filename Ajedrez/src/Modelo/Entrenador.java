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
public class Entrenador {
    private String nombreEntrenador;
    private String apellidosEntrenador;
    private int edadEntrenador;
    
    public Entrenador(String nombreEntrenador,String apellidosEntrenador,int edadEntrenador)
    {
        this.apellidosEntrenador = apellidosEntrenador;
        this.nombreEntrenador = nombreEntrenador;
        this.edadEntrenador = edadEntrenador;
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
