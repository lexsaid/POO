//efectua operaciones subre un numero entero, usando los operadores de asignacion

import static java.lang.System.out;
import java.util.Scanner;

public class _p07_OperadoresAsignacion {
    public static void main(String[] args) {
        
        out.println("dame un numero");
        float num =new Scanner(System.in).nextFloat();

        out.printf("El numero es: %.2f \n",num);
        out.printf("incrementar: %.2f \n", ++num);
        out.printf("sumar 80: %.2f \n",num+=80);
        out.printf("restar 35: %.2f \n",num-=35);
        out.printf("mult x15: %.2f \n",num*=15);
        out.printf("div /4 es: %.2f \n",num/=4);
        out.printf("decrementar: %.2f \n", --num);

    }
}
