public class Camioneta extends Vehiculo {
    
    double Capacidad;
    int Ejes;

    public Camioneta() {
        
    }

    public Camioneta(String serie, String marca, int año, double precio,double capacidad, int ejes) {
        super(serie, marca, año, precio);
        Capacidad = capacidad;
        Ejes = ejes;
    }

    public double getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(double capacidad) {
        Capacidad = capacidad;
    }

    public int getEjes() {
        return Ejes;
    }

    public void setEjes(int ejes) {
        Ejes = ejes;
    }

    @Override
    public String toString() {
        return "Camioneta [" + super.toString() + "Capacidad=" + Capacidad + ", Ejes=" + Ejes + "]";
    }

}
