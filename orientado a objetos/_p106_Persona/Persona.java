package _p106_Persona;

public class Persona {

    String Direccion, Nombre;

    public Persona(String nombre, String direccion) {
        Direccion = direccion;
        Nombre = nombre;
    }

    public Persona() {
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String toString() {
        return "Persona [Direccion=" + Direccion + ", Nombre=" + Nombre + "]";
    }

}
