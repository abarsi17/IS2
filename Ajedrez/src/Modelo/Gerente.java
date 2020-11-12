 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author amadeo
 */
class Gerente 
{
    private String nombre;
    private Club club;
    
    public Gerente(String nombre, Club club)
    {
        this.nombre = nombre;
        this.club = club;
    }
    
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
}
