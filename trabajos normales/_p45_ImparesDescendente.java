// Imprime numeros impares descendente

import java.util.Scanner;

public class _p45_ImparesDescendente {
    public static void main(String[] args) {

        int n,c,s;
        char resp;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Imprime números impares descendente\n");
            System.out.print("Desde donde ? "); n = entrada.nextInt();

            if (n%2==0){
                n--;
            }
            s=0;
            c=n;

            while( c>=1 ) {
            System.out.printf("%d ",c);
            s = s + c;
            c = c - 2;
            }

            System.out.printf("\nLa suma es %d",s);
            System.out.print("\nDeseas continuar (S/N) ? "); 
            resp = Character.toUpperCase(entrada.next().charAt(0));
        } while( resp != 'N' );

        System.out.println("\nGracias por utilizar este programa");

    }
}