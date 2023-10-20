// Tablas de multiplicar con de 1 a n hasta la del n

import java.util.Scanner;

public class _p57_TablasMultiplicar {
    public static void main(String[] args) {

        int i,j,n,m;
        char resp;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Hasta que tabla ? "); n = entrada.nextInt();
            System.out.print("Hasta que rango ? "); m = entrada.nextInt();

            for(i=1; i<=n; i++) {
                System.out.printf("\nTabla del %d\n",i);

                for(j=1; j<=m; j++) {
                    System.out.printf("%d x %d = %d\n",i,j,i*j);
                }
            }

            System.out.print("\nDeseas continuar (S/N) ?");
            resp=Character.toUpperCase(entrada.next().charAt(0));
        } while( resp!= 'N');

        System.out.println("\nProceso terminado ");

    }
}