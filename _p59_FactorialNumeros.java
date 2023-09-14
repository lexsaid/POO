// Factorial de n números

import java.util.Scanner;

public class _p59_FactorialNumeros {
    public static void main(String[] args) {

        int i,j,n,f;
        char resp;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("cual numero quieres sacar factorial ? "); n = entrada.nextInt();

            for(i=1; i<=n; i++) {
                System.out.printf("%d!=",i);
                f=1;
                for(j=1; j<=i; j++) {
                    f *= j;
                }
                System.out.println(f);
            }

            System.out.print("\nDeseas continuar (S/N) ?");
            resp=Character.toUpperCase(entrada.next().charAt(0));
        } while( resp!= 'N');

        System.out.println("\nProceso terminado");

    }
}