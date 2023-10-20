//Se desea calcular el 3er ángulo de un triángulo dados los dos primeros ángulos del mismo

import java.util.Scanner;
import static java.lang.System.out;

public class _p11_CalcularAngulo {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double ang1, ang2, ang3;

        out.println("dame dos angulos para sacar el 3er angulo del triangulo");
        out.println("dame el 1er angulo: ");
        ang1 = entrada.nextDouble();
        out.println("dame el 2do angulo: ");
        ang2 = entrada.nextDouble();

        ang3 =  180 - (ang1 + ang2);

        out.println("el angulo 3 es: "+ ang3);
    }
    
}
