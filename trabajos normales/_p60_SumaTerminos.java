// Suma de n términos de factorial

import java.util.Scanner;

public class _p60_SumaTerminos {
    public static void main(String[] args) {

        int i,j,n;
        float f, r;
        char resp;
        Scanner entrada = new Scanner(System.in);

        do {
        r=0;
        System.out.print("Cuantos números ? "); n = entrada.nextInt();

        for(i=1; i<=n; i++) {
            f=1;
            for(j=1; j<=i; j++) {
                f *= j;
            }
            System.out.printf(" 1 / %,.2f +",f);
            r += (1 / f);
        }

        System.out.printf("= %,.2f\n",r);
        System.out.print("\nDeseas continuar (S/N) ?");
        resp=Character.toUpperCase(entrada.next().charAt(0));
        } while( resp!= 'N');

        System.out.println("\nProceso terminado ..");

    }
}