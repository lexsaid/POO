// Imprime tabla de conversión de peso a dolar

import java.util.Scanner;

public class _p46_TablaConversion {
    public static void main(String[] args) {
        
        int ini, fin, c;
        float tc = 19.99f;
        char resp;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Imprime una tabla de conversion de peso a dolar\n");

            do {
                System.out.print("Inicio : "); 
                ini = entrada.nextInt();
                System.out.print("Fin : "); 
                fin = entrada.nextInt();
            } while( ini > fin );

            c=ini;
            System.out.println("Peso\tDolar");

            while( c<=fin ) {
                System.out.printf("%d\t%.2f\n",c,c/tc);
                c++;
            }

            System.out.print("\nDeseas continuar (S/N) ? ");
            resp = Character.toUpperCase(entrada.next().charAt(0));
        } while( resp != 'N');

        System.out.println("\nGracias por utilizar este programa !");

    }
}
