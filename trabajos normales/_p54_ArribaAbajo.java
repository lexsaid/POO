// De 1 a n y de n a 1, según el usuario lo decida

import java.util.Scanner;

public class _p54_ArribaAbajo {
    public static void main(String[] args) {

        int n, op;
        Scanner entrada = new Scanner(System.in);

        do {
        System.out.println(" ");
        System.out.println("Numeros de 1 a n .... [ 1 ]");
        System.out.println("Numeros de n a 1 .... [ 2 ]");
        System.out.println("Salir ............... [ 3 ]");

        System.out.print("Elije ? "); op = entrada.nextInt();

        switch(op) {
            case 1:
                System.out.print("\nHasta donde ? "); n = entrada.nextInt();
                for(int i=1; i<=n; i++)
                    System.out.printf("%d ",i);

                System.out.println(" ");
                break;

            case 2:
                System.out.print("\nDesde donde ? "); n = entrada.nextInt();
                for(int i=n; i>=1; i--)
                    System.out.printf("%d ",i);

                System.out.println(" ");
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
