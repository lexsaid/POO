//Se desea imprimir la secuencia de términos armónicos el número de renglones que el usuario desee y su suma:

import java.util.Scanner;
import static java.lang.System.out;

public class _p63_SumaTerminos1 {
    public static void main(String[] args) {
        
        float n, i, suma;
        char respuesta;
        Scanner entrada = new Scanner(System.in);

        do{
            suma=0;
            out.print("cuantos terminos? "); n = entrada.nextInt();

            for(i=1; i<=n; i++){
                out.printf("1/%.0f + ", i);
                suma += (1/i);
            }

            out.println("\nla suma es = "+suma);
            out.print("quieres seguir ?");
            respuesta = Character.toUpperCase(entrada.next().charAt(0));
        }while(respuesta == 'S');

    }
}
