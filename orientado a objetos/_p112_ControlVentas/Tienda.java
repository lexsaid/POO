package _p112_ControlVentas;

import java.util.ArrayList;

public class Tienda {
    
    String Nombre, Propietario, Domicilio;
    ArrayList<Cliente> Clientes;

    public Tienda(String nombre, String propietario, String domicilio) {
        Nombre = nombre;
        Propietario = propietario;
        Domicilio = domicilio;
        Clientes = new ArrayList<>();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String propietario) {
        Propietario = propietario;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public void agregarCliente(Cliente cliente){
        Clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.Clientes = clientes;
    }

    public double getTotal(){
        double total = 0;
        for (Cliente cliente : Clientes) {
            total+=cliente.getTotal();
        }
        return total;
    }

    public void reporte(){
        for (Cliente cliente : Clientes) {
            System.out.println("> " + cliente);
            for (Venta venta : cliente.getVentas()) {
                System.out.println(venta);
            }
        }
    }

    @Override
    public String toString() {
        return "Tienda [Nombre= " + Nombre + ", Propietario= " + Propietario + ", Domicilio= " + Domicilio + ", clientes= " + Clientes.size() + ", Total= " + getTotal() + "]";
    }

}
