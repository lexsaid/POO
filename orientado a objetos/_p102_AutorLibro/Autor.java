package _p102_AutorLibro;

public class Autor {
    
    private String Correo, Nombre;

    public Autor(String nombre, String correo) {
        Correo = correo;
        Nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    

    public String toString() {
        return "Autor [Correo=" + Correo + ", Nombre=" + Nombre + "]";
    }
    
}
