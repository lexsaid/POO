public class Compacto extends Vehiculo {
    
    int Pasajero, Puertas;

    public Compacto() {

    }

    public Compacto(String serie, String marca, int año, double precio,int pasajero, int puertas) {
        super(serie,marca,año,precio);
        Pasajero = pasajero;
        Puertas = puertas;
    }

    public int getPasajero() {
        return Pasajero;
    }

    public void setPasajero(int pasajero) {
        Pasajero = pasajero;
    }

    public int getPuertas() {
        return Puertas;
    }

    public void setPuertas(int puertas) {
        Puertas = puertas;
    }

    @Override
    public String toString() {
        return "Compacto [" + super.toString() + "Pasajero=" + Pasajero + ", Puertas=" + Puertas + "]";
    }

}
