/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    private ArrayList<Sede> sedes;
    private Persona_FACTORY p_fac;
    
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
            if(jugadormenor.getNombre().equals(jugadores.get(i).getNombre()))
                jugadores.get(i).setResponsable(jugadormayor);
        }
    }
    
    public ArrayList ListaTorneos()
    {
        return torneos;
    }

    public void inscribirATorneo(Jugador jugador, Torneo torneo)
    {
        for(int i = 0; i < torneos.size(); i++)
        {
            if(torneos.get(i).getNombre().equals(torneo.getNombre()))
            {
                torneos.get(i).addJugador(jugador);
            }
        } 
    }
    
    public void asignarResponsableInicio(Jugador jug)
    {
        for(int i = 0; i < jugadores.size(); i++)
        {
            if(jug.getNombre().equals(jugadores.get(i).getNombre()))
                jug.setResponsable(jugadores.get(0));
        }
    }
    
    public ArrayList ListaSedes()
    {
        return sedes;
    }
        
    
    public void cargarDatos()
    {
        Jugador j1, j2, j3, j4, j5, j6, j7, j8, j9;
        Entrenador e1, e2, e3;
        Gerente g1, g2, g3;
        
        jugadores = new ArrayList<Jugador>();
        entrenadores = new ArrayList<Entrenador>();
        torneos = new ArrayList<Torneo>();
        clubs = new ArrayList<Club> ();
        sedes = new ArrayList<Sede>();
        p_fac = new Persona_FACTORY();
        
        
        
        j1 = (Jugador) p_fac.Persona_FACTORY(0,"Amadeo", "Barbera", 22);
        j2 = (Jugador) p_fac.Persona_FACTORY(0,"Gomina", "Baronista", 13);
        j3 = (Jugador) p_fac.Persona_FACTORY(0,"Osli", "Ramon", 12);
        j4 = (Jugador) p_fac.Persona_FACTORY(0,"Kebin", "KOK", 16);
        j5 = (Jugador) p_fac.Persona_FACTORY(0,"Narrote", "Garrote", 24);
        j6 = (Jugador) p_fac.Persona_FACTORY(0,"Fresen", "LOL", 28);
        j7 = (Jugador) p_fac.Persona_FACTORY(0,"Yorrow", "Tronista", 17);
        j8 = (Jugador) p_fac.Persona_FACTORY(0,"Edgar", "Delegat", 30);
        j9 = (Jugador) p_fac.Persona_FACTORY(0,"TOntio", "Artes", 16);
        
        j1.setElo(60);
        j2.setElo(40);
        j3.setElo(5);
        j4.setElo(10);
        j5.setElo(15);
        j6.setElo(20);
        j7.setElo(25);
        j8.setElo(30);
        j9.setElo(35);
        
        j3.setResponsable(j1);
        j2.setResponsable(j8);
        
        jugadores.add(j1);
        jugadores.add(j2);
        jugadores.add(j3);
        jugadores.add(j4);
        jugadores.add(j5);
        jugadores.add(j6);
        jugadores.add(j7);
        jugadores.add(j8);
        jugadores.add(j9);
        
        
/*
        Jugador jugador1 = new Jugador("Amadeo", "Barbera", 12, 3, 22);
        Jugador jugador2 = new Jugador("Gomina", "69", 5, 1, 13);
        Jugador jugador3 = new Jugador("Osli", "Ramon", 30, 1, 12);
        Jugador jugador4 = new Jugador("Kebin", "KOK", 2, 2, 16);
        Jugador jugador5 = new Jugador("Narrote", "Garrote", 28, 3, 24);
        Jugador jugador6 = new Jugador("Fresen", "LOL", 50, 3, 28);
        Jugador jugador7 = new Jugador("Yorrow", "Tronista", 2, 2, 17);
        Jugador jugador8 = new Jugador("Edgar", "Delegat", 100, 3, 30);
        Jugador jugador9 = new Jugador("TOntio", "Artes", 120, 2, 16);
        
        Entrenador entrenador1 = new Entrenador("Enric", "Valor", 34);
        Entrenador entrenador2 = new Entrenador("Vicent", "Estelles", 32);
        Entrenador entrenador3 = new Entrenador("ElYoyas", "Kostiliev", 35);
*/

        e1 = (Entrenador) p_fac.Persona_FACTORY(1, "Enric", "Valor", 34);
        e2 = (Entrenador) p_fac.Persona_FACTORY(1, "Vicent", "Estelles", 32);
        e3 = (Entrenador) p_fac.Persona_FACTORY(1, "ElYoyas", "Kostiliev", 35);
        
        entrenadores.add(e1);
        entrenadores.add(e2);
        entrenadores.add(e3);
        
        Date dateIni1 = new Date(2020-1900, 11-1, 23);
        Date dateFin1 = new Date(2020-1900, 11-1, 26);
        Date dateIni2 = new Date(2020-1900, 11-1, 27);
        Date dateFin2 = new Date(2020-1900, 11-1, 30);
        
        Torneo torneo1 = new Torneo("Torneo Champ", dateIni1, dateFin1, 6);
        Torneo torneo2 = new Torneo("Torneo Estrella", dateIni2, dateFin2, 10);

        
        Club club1 = new Club("GuadassuarFC");
        Club club2 = new Club("Montortal");
        Club club3 = new Club("CatadauFC");
 /*       
        Gerente gerente1 = new Gerente("Pacoduty", club1);
        Gerente gerente2 = new Gerente("Fuso", club2);
        Gerente gerente3 = new Gerente("ElSigro", club3);
*/
    
        g1 = (Gerente) p_fac.Persona_FACTORY(2, "Anil", "Murthy", 56);
        g2 = (Gerente) p_fac.Persona_FACTORY(2, "Fernando", "Roig", 64);
        g3 = (Gerente) p_fac.Persona_FACTORY(2, "Peter", "Lim", 62);
        
        club1.addGerente(g1);
        club2.addGerente(g2);
        club3.addGerente(g3);
        
        club1.addJugador(j2);
        club1.addJugador(j3);
        club1.addJugador(j9);
        club1.addEntrenador(e1);
        
        club2.addJugador(j4);
        club2.addJugador(j5);
        club2.addJugador(j8);
        club2.addEntrenador(e3);
        
        club3.addJugador(j1);
        club3.addJugador(j6);
        club3.addJugador(j7);
        club3.addEntrenador(e2);
        
        clubs.add(club1);
        clubs.add(club2);
        clubs.add(club3);
        
        torneo1.addJugador(j1);
        torneo1.addJugador(j2);
        torneo1.addJugador(j3);
        torneo1.addJugador(j4);
        torneo1.addJugador(j5);
        
        torneo2.addJugador(j6);
        torneo2.addJugador(j7);
        torneo2.addJugador(j8);
        torneo2.addJugador(j9);
        
        torneos.add(torneo1);
        torneos.add(torneo2);
        
        Sede sede1 = new Sede("Guadassuar");
        Sede sede2 = new Sede("Montortal");
        Sede sede3 = new Sede("Catadau");
        
        sedes.add(sede1);
        sedes.add(sede2);
        sedes.add(sede3);
          
    }
}
