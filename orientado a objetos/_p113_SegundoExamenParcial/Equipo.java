package _p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
   
    String Nombre, Liga;
    ArrayList<Jugador> Jugadores;

    public Equipo() {
        Jugadores = new ArrayList<>();
    }

    public Equipo(String nombre, String liga) {
        this();
        Nombre = nombre;
        Liga = liga;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getLiga() {
        return Liga;
    }

    public void setLiga(String liga) {
        Liga = liga;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        Jugadores = jugadores;
    }

    public void agregarJugador(Jugador jugador){
        Jugadores.add(jugador);
    }

    public double getTotalBono(){
        double totalbono = 0;
        for (Jugador jugador : Jugadores) {
            totalbono +=jugador.getBono();
        }
        return totalbono;
    }

    public double getTotal(){
        double totaldeltotal = 0;
        for (Jugador jugador : Jugadores) {
            totaldeltotal += jugador.Total;
        }
        return totaldeltotal;
    }

    public int getTotalH(){
        int hombres = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'H'){
                hombres +=1;
            }
        }
        return hombres;
    }

    public int getTotalM(){
        int mujeres = 0;
        for (Jugador jugador : Jugadores) {
            if (jugador.getSexo() == 'M'){
                mujeres +=1;
            }
        }
        return mujeres;
    }

    public void reporte(){
        System.out.println(this + "\n");

        for (Jugador jugador : Jugadores) {
            System.out.println(jugador);
        }
    }

    @Override
    public String toString() {
        return "Equipo [Nombre=" + Nombre + ", Liga=" + Liga + ", Jugadores=" + Jugadores.size() + " Bono=" + getTotalBono() + " Total=" + getTotal() + " Hombres=" +getTotalH() + " Mujeres=" + getTotalM() +"]";
    }

}
