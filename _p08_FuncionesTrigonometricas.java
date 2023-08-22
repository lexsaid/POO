import static java.lang.System.out;
import java.util.Scanner;

//calcula las funciones trigonometricas basicas de un angulo en radianes

public class _p08_FuncionesTrigonometricas {
    public static void main(String[] args) {
        
        out.println("dame un angulo en grados");
        double angulog= new Scanner(System.in).nextDouble();
        double angulor=Math.toRadians(angulog);

        double sen= Math.sin(angulor);
        double cos= Math.cos(angulor);
        double tan= Math.tan(angulor);

        out.printf("angulo en radianes: %.2f, seno: %.2f, cos: %.2f, tan: %.2f;", angulor, sen, cos, tan);

    }
}
