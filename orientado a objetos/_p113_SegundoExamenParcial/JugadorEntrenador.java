package _p113_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador{

    int Subordinados, Proyectos;

    public JugadorEntrenador(String nombre, char sexo, String descripcion, double salario, int subordinados, int proyectos) {
        super(nombre, sexo, descripcion, salario);
        Subordinados = subordinados;
        Proyectos = proyectos;
        Total = Salario + getBono();
    }

    @Override
    public double getBono(){
        double bono = (Salario * 0.15) + (Proyectos * 100)+ (Subordinados * 10);    
        return bono;
    }

    @Override
    public String toString() {
        return "JugadorEntrenador [" + super.toString() + " Subordinados=" + Subordinados + ", Proyectos=" + Proyectos + " Bono=" + getBono() + " Total=" + Total + "]";
    }
    
}
