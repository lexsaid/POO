// Imprime la tabla de multiplicar que el usuario pida, desde 1 hasta 

import java.util.Scanner;

public class _p42_TablaMultiplicar {
    public static void main(String[] args) {

        int c,t,n;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Imprimir la tabla deseada de 1 a 10\n");

        System.out.print("Que tabla quieres ? ");
        t = entrada.nextInt();
        System.out.print("Hasta donde ? \n" );
        n = entrada.nextInt();

        c = 1;

        while( c <= n ) {
            System.out.printf("%d x %d = %d\n", t, c, c*t);
            c++;
        }

        System.out.println("\nProceso terminado");

    }
}