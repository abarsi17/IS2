/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.*;

/**
 *
 * @author ivana
 */
public class LigaAjedrez {
    
    private ArrayList<Jugador> jugadores;
    private ArrayList<Entrenador> entrenadores;
    private ArrayList<Club> clubs;
    private ArrayList<Torneo> torneos;
    
    public LigaAjedrez()
    {
        
    }
    
    public Jugador crearJugador(String _nombre, String _apellidos, int _elo, int _categoria, int _edad)
    {
        Jugador jugador = new Jugador(_nombre, _apellidos, _elo, _categoria, _edad);
        jugadores.add(jugador);
        
        return jugador;
    }
    
    public void addJugador(Jugador jug)
    {
        jugadores.add(jug);
    }
    
    public Entrenador crearEntrenador(String _nombreEntrenador, String _apellidosentrenador, int _edadEntrenador)
    {
        Entrenador entrenador = new Entrenador(_nombreEntrenador, _apellidosentrenador, _edadEntrenador);
        addEntrenador(entrenador);
        
        return entrenador;
    }
    
    public void addEntrenador(Entrenador ent)
    {
        entrenadores.add(ent);
    }
    
    public ArrayList ListaJugadores()
    {   
        return jugadores;
    }
    
    public ArrayList ListaJugadoresMayores()
    {
        
        ArrayList<Jugador> jugadoresMayores = new ArrayList<Jugador>();
        
        for(int i = 0; i < jugadores.size(); i++)
        {
            if(jugadores.get(i).getCategoria() == 3)
            {
                jugadoresMayores.add(jugadores.get(i));
            }
        }
        
        return jugadoresMayores;
    }
    
    public ArrayList ListaJugadoresMenores()
    {   
        ArrayList<Jugador> jugadoresMenores = new ArrayList<Jugador>();
        
        for(int i = 0; i < jugadores.size(); i++)
        {
            if(jugadores.get(i).getCategoria() == 1)
            {
                jugadoresMenores.add(jugadores.get(i));
            }
        }
        
        return jugadoresMenores;
    }
    
    public ArrayList ListaClubes()
    {
        return clubs;
    }
    
    public ArrayList ListaJugadoresClub()
    {
        return clubs;
    }
        
    
    public Jugador buscarJugadores(String _nombre)
    {
        int i = 0;
        boolean enc = false;
        Jugador jug = null;
        
        while(enc == false && i < jugadores.size())
        {
            if(jugadores.get(i).getNombre().equals(_nombre))
            {
                enc = true;
                jug = jugadores.get(i);
            }
            i++;
        }
        
        return jug;
    }
    
    public int cantidadClubs()
    {
        return clubs.size();
    }
    
    public Jugador getJugador(Jugador jugador)
    {
        return jugador;
    }
    
    public void cambiarClub(Jugador jugador, Club club)
    {
        
        for(int j = 0 ; j < clubs.size(); j++)
        {
            for (int z = 0; z < clubs.get(j).getJugadores().size(); z++)
            {
                if (clubs.get(j).nombreJugador(jugador).equals(jugador.getNombre())) //no entenc pq.....
                {
                      clubs.get(j).eliminarJugador(jugador);
                }
            }
        }
        
        for (int i = 0; i < clubs.size(); i++)
        {
            if (clubs.get(i).getNombre().equals(club.getNombre()))
            {
                clubs.get(i).addJugador(jugador);               
            }
        }
 
    }
    
    public ArrayList consultarTorneosDisponibles(Date data1, Date data2)
    {
        ArrayList<Torneo> torneosDisp = new ArrayList<Torneo>();
        
        for(int i = 0; i < torneos.size(); i++)
        {
            if(torneos.get(i).comprobarFechas(data1, data2))
            {
                torneosDisp.add(torneos.get(i));
            }
        }
        
        return torneosDisp;
    }
    
    public void asignarResponsable(Jugador jugadormenor, Jugador jugadormayor)
    {
        for(int i = 0; i < jugadores.size(); i++)
        {
            if(jugadormenor.getNombre().equals(jugadores.get(i)))
                jugadormenor.setResponsable(jugadormayor);
        }
    }
        
    
    public void cargarDatos()
    {
        jugadores = new ArrayList<Jugador>();
        entrenadores = new ArrayList<Entrenador>();
        torneos = new ArrayList<Torneo>();
        clubs = new ArrayList<Club> ();
        
        Jugador jugador1 = new Jugador("Amadeo", "Barbera", 12, 3, 22);
        Jugador jugador2 = new Jugador("Gomina", "69", 5, 1, 13);
        Jugador jugador3 = new Jugador("Osli", "Ramon", 30, 1, 12);
        Jugador jugador4 = new Jugador("Kebin", "KOK", 2, 2, 16);
        Jugador jugador5 = new Jugador("Narrote", "Garrote", 28, 3, 24);
        Jugador jugador6 = new Jugador("Fresen", "LOL", 50, 3, 28);
        Jugador jugador7 = new Jugador("Yorrow", "Tronista", 2, 2, 17);
        Jugador jugador8 = new Jugador("Edgar", "Delegat", 100, 3, 30);
        Jugador jugador9 = new Jugador("Ricardo", "España", 120, 2, 16);
        
        Entrenador entrenador1 = new Entrenador("Enric", "Valor", 34);
        Entrenador entrenador2 = new Entrenador("Vicent", "Estelles", 32);
        Entrenador entrenador3 = new Entrenador("ElYoyas", "Kostiliev", 35);
        
        Date dateIni1 = new Date(2020, 11, 23);
        Date dateFin1 = new Date(2020, 11, 26);
        Date dateIni2 = new Date(2020, 11, 27);
        Date dateFin2 = new Date(2020, 11, 30);
        
        Torneo torneo1 = new Torneo("Torneo Champ", dateIni1, dateFin1, 6);
        Torneo torneo2 = new Torneo("Torneo Estrella", dateIni2, dateFin2, 10);
        
        entrenadores.add(entrenador1);
        entrenadores.add(entrenador2);
        entrenadores.add(entrenador3);
        
        jugador3.setResponsable(jugador1);
        
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        jugadores.add(jugador4);
        jugadores.add(jugador5);
        jugadores.add(jugador6);
        jugadores.add(jugador7);
        jugadores.add(jugador8);
        jugadores.add(jugador9);
        
        
        
        Club club1 = new Club("GuadassuarFC");
        Club club2 = new Club("Montortal");
        Club club3 = new Club("CatadauFC");
        
        Gerente gerente1 = new Gerente("Pacoduty", club1);
        Gerente gerente2 = new Gerente("Fuso", club2);
        Gerente gerente3 = new Gerente("Serdo", club3);
        
        club1.addGerente(gerente1);
        club2.addGerente(gerente2);
        club3.addGerente(gerente3);
        
        club1.addJugador(jugador2);
        club1.addJugador(jugador3);
        club1.addJugador(jugador9);
        club1.addEntrenador(entrenador1);
        
        club2.addJugador(jugador4);
        club2.addJugador(jugador5);
        club2.addJugador(jugador8);
        club2.addEntrenador(entrenador3);
        
        club3.addJugador(jugador1);
        club3.addJugador(jugador6);
        club3.addJugador(jugador7);
        club3.addEntrenador(entrenador2);
        
        clubs.add(club1);
        clubs.add(club2);
        clubs.add(club3);
          
    }
    
    
}
