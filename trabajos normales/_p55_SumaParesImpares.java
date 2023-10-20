// Suma de pares e impares

import java.util.Scanner;

public class _p55_SumaParesImpares {
    public static void main(String[] args) {

        int n, s, op;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("\n\nImpares ascendente .... [ 1 ]");
            System.out.println("Pares descentente...... [ 2 ]");
            System.out.println("Salir ................. [ 3 ]");

            System.out.print("Elije ? "); op = entrada.nextInt();

            switch(op) {
                case 1:
                    s = 0;
                    System.out.println("\nImpares ascendente y su suma:");

                    System.out.print("Hasta donde ? "); n = entrada.nextInt();

                    for(int i=1; i<=n; i+=2) {
                        System.out.printf("%d ",i);
                        s += i;
                    }

                    System.out.printf("\nLa suma de impares es: %d", s);
                    break;

                case 2:
                    s = 0;
                    System.out.println("\nPares descendente y su suma:");

                    System.out.print("desde donde ? "); n = entrada.nextInt();

                    if(n%2!=0){
                        n--;
                    }
                    for(int i=n; i>=1; i-=2) {
                        System.out.printf("%d ",i);
                        s += i;
                    }
                   
                    System.out.printf("\nLa suma de impares es: %d", s);
                    break;

                case 3:
                System.out.println("\nTe vas por que quieres nadie te corre");
                break;

                default:
                System.out.println("\nOpcion Invalida");
                break;
            }

        } while( op != 3);

        System.out.println("\nProceso Terminado ....");

    }
}