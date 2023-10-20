package _p112_ControlVentas;

import java.util.ArrayList;

public class Cliente {
    
    String Nombre, Domicilio, Correo;
    ArrayList<Venta> Ventas;

    public Cliente(String nombre, String domicilio, String correo) {
        Nombre = nombre;
        Domicilio = domicilio;
        Correo = correo;
        Ventas = new ArrayList<>();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public ArrayList<Venta> getVentas() {
        return Ventas;
    }

    public void agregarVenta(Venta venta){
        Ventas.add(venta);
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.Ventas = ventas;
    }

    public double getTotal(){
        double total= 0;
        for (Venta venta : Ventas) {
            total += venta.getTotalVenta();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Cliente [Nombre= " + Nombre + ", Domicilio= " + Domicilio + ", Correo= " + Correo + ", ventas= " + Ventas.size() + ", Total= " + getTotal()+ "]";
    }

}
