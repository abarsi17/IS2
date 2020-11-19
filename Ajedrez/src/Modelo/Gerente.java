 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author amadeo
 */
public class Gerente extends Persona_FACTORY
{
    private String nombre;
    private String apellidos;
    private int edad;
    private Club club;
    
    public Gerente(String nombre, Club club)
    {
        this.nombre = nombre;
        this.club = club;
    }
    
    public Gerente(String nombre, String apellidos, int edad)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getApellidos()
    {
        return apellidos;
    }

    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }
    public int getEdad()
    {
        return edad;
    }

    public void setNombre(int edad)
    {
        this.edad = edad;
    }
    
}
