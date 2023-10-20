//Se desea imprimir la secuencia de términos, el número de renglones que el usuario desee y su suma:

import java.util.Scanner;
import static java.lang.System.out;

public class _p64_SumaTerminos2 {
    public static void main(String[] args) {
     
        int n, i, j, suma, n2;
        char respuesta;
        Scanner entrada = new Scanner(System.in);

        do{
            suma=0;
            out.print("cuantos renglones? "); n = entrada.nextInt();

            for (i=1; i<=n ; i++){
                n2 = 0;
                for(j=0; j<i; j++){
                    n2 = n2 * 10 + 1; // Construimos el término actual
                }
                out.print(n2);
                suma +=n2;
                out.print(" + ");
            }

            out.println("\nla suma es = "+suma);
            out.println("quieres seguir intentando? S/N");
            respuesta = Character.toUpperCase(entrada.next().charAt(0));
        }while(respuesta == 'S');
    }
}
