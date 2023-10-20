//Se desea calcular la hipotenusa de un triángulo rectángulo dadas las longitudes de sus lados,

import java.util.Scanner;
import static java.lang.System.out;

public class _p10_HipotenusaTriangulo{
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double long1, long2, hipotenusa;

        out.println("dame los dos lados del triangulo para calcular la hipotenusa");
        out.println("dame el lado 1 del triangulo");
        long1 = entrada.nextDouble();
        out.println("dame el lado 2 del triangulo");
        long2 = entrada.nextDouble();

        hipotenusa = Math.sqrt( long1 * long1 + long2 * long2 );
        out.printf("la hipotenusa del triangulo es: %.2f",hipotenusa);

    }
}