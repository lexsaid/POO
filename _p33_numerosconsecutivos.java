//Dados tres números enteros, verificar si son consecutivos y mandar mensaje confirmándolo, si no lo son mandar mensaje de error.

import java.util.Scanner;
import static java.lang.System.out;

public class _p33_numerosconsecutivos {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3;

        out.println("Dados tres numeros enteros, verificar si son consecutivos y mandar mensaje confirmandolo, si no lo son mandar mensaje de error.");
        
        out.println("\ndame el num1: "); n1= entrada.nextInt();
        out.println("dame el num2: "); n2= entrada.nextInt();
        out.println("dame el num3: "); n3= entrada.nextInt();
     
        if ((n1+1 == n2 && n2+1 == n3) || (n1-1 == n2 && n2-1 == n3)){
            out.println("es consecutivo");
        }else{
            out.println("no es consecutivo");
        }
    }
}
