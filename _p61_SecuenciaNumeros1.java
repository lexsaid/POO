//Se desea imprimir la secuencia de números mostrados el número de renglones que el usuario desee:

import java.util.Scanner;
import static java.lang.System.out;

public class _p61_SecuenciaNumeros1 {
    public static void main(String[] args) {
        
        int n, i, j, n2;
        char respuesta;
        Scanner entrada = new Scanner(System.in);

        do{
            n2=0;
            out.print("cuantos renglones? "); n = entrada.nextInt();

            for (i=1; i<=n ; i++){
                n2+=1;
                for(j=1; j<=i; j++){
                    out.print(n2);
                }
                out.println(" ");
            }

            out.println("quieres seguir intentando? S/N");
            respuesta = Character.toUpperCase(entrada.next().charAt(0));
        }while(respuesta == 'S');
    }
}
