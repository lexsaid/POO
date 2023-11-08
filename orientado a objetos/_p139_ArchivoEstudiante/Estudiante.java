package _p139_ArchivoEstudiante;

public class Estudiante {

    String Nombre;
    int Edad;
    char Sexo;
    double Promedio;

    public Estudiante(String nombre, int edad, char sexo, double promedio) {
        Nombre = nombre;
        Edad = edad;
        Sexo = sexo;
        Promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante [Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + ", Promedio=" + Promedio + "]";
    }

}
