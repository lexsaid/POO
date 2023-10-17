package _p110_CuentaBancariaV1;

import java.util.ArrayList;

public class Banco {
    
    private String Nombre;
    private String Domicilio;
    private ArrayList<Cliente> Clientes;
    
    public Banco() {
        Clientes = new ArrayList<>(); //reserva espacio en memoria para el arreglo
    }
    
    public Banco(String nombre, String domicilio) {
        this(); //llama el cosntructor vacio
        Nombre = nombre;
        Domicilio = domicilio;
    }
    
    public void agregarCliente(Cliente cliente) {
        Clientes.add(cliente);
    }
    
    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    @Override
    public String toString() {
        return "Banco [Nombre=" + Nombre + ", Domicilio=" + Domicilio + ", Clientes=" + Clientes.size() + "]";
    }

}
