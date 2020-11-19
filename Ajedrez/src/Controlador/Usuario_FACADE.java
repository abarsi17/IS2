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
public class Usuario_FACADE {
    
    private Jugador jugador, jugador1;
    private LigaAjedrez liga;
    
    public Usuario_FACADE(LigaAjedrez liga)
    {
        this.liga = liga;
        
    }
}
