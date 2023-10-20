//Dados tres números enteros, verificar cual es el mayor

import java.util.Scanner;
import static java.lang.System.out;

public class _p34_numeromayor {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;

        out.println("Dados tres n\u00FAmeros enteros, verificar cual es el mayor");

        out.println("\ndame el num1: "); n1= teclado.nextInt();
        out.println("dame el num2: "); n2= teclado.nextInt();
        out.println("dame el num3: "); n3= teclado.nextInt();

        if ((n1>n2) && (n1>n3)){
            out.println("el num1 es mayor");
        }else if ((n2>n1) && (n2>n3)){
            out.println("el num2 es mayor");
        }else if ((n3>n2) && (n3>n1)){
            out.println("el num3 es mayor");
        }else if ((n1==n2) && (n1==n3) && (n2==n3)){
            out.println("son iguales los 3 numeros");
        }
    }
}
