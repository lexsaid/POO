//verificar si es numero negativo, positivo o cero

import java.util.Scanner;
import static java.lang.System.out;

public class _p21_VerificarNumero {
    public static void main(String[] args) {
        
        out.println("determina si un numero es positivo, negativo o cero");
        out.println("dame un numero: ");

        int num = new Scanner(System.in).nextInt();
        if (num>0) out.println("es positivo");
        if (num<0) out.println("es negativo");
        if (num==0) out.println("es cero");

    }
}
