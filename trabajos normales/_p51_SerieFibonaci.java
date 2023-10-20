/*
Se desean imprimir los primeros n números de la será de fibbonaci. El proceso debe de poder repetirse hasta que
el usuario lo decida.
Ejemplo:
Ingrese el valor maximo: 50
La sucesion Fibonacci es:
0 1 1 2 3 5 8 13 21 34 166
*/

import java.util.Scanner;
import static java.lang.System.out;

public class _p51_SerieFibonaci {
    public static void main(String[] args) {

        int n, a, b, c;
        Scanner entrada = new Scanner(System.in);
        char respuesta;

        out.println("Se desean imprimir los primeros n numeros de la serie de fibbonaci. El proceso debe de poder repetirse hasta que\n" + 
                "el usuario lo decida.\n");

        do{
            out.println("hasta donde quieres que termine la serie?");
            n = entrada.nextInt();
            a=0; b=1; c=0;

            for(int i = 0; i < n; i++){
                out.print(a+" ");
                c= a+b;
                a = b;
                b = c;
            }

            System.out.print("\nDeseas continuar (S/N) ? ");
            respuesta = Character.toUpperCase(entrada.next().charAt(0));
        }while(respuesta == 'S');

    }
}
