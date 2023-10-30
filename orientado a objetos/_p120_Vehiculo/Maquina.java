package _p120_Vehiculo;

public class Maquina {
    
    String Nombre, Propietario;
    int Pasajeros;

    public Maquina(String nombre, String propietario, int pasajeros) {
        Nombre = nombre;
        Propietario = propietario;
        Pasajeros = pasajeros;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getPasajeros(){
        return Pasajeros;
    }

    @Override
    public String toString() {
        return "Maquina [Nombre=" + Nombre + ", Propietario=" + Propietario + ", Pasajeros=" + Pasajeros + "]";
    }

    public void repostar(){
        System.out.println("repostando");
    }

    public void arrancar(){
        System.out.println("arrancando");
    }

    public void frenar(){
        System.out.println("frenando");
    }

}
