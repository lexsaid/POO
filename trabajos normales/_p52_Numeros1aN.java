// Numeros de 1 a n con paso de p

import java.util.Scanner;

public class _p52_Numeros1aN {
    public static void main(String[] args) {

        int n,p;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Numeros de 1 a n con paso de p:");
        System.out.print("Hasta donde ? "); n = entrada.nextInt();
        System.out.print("Paso ? "); p = entrada.nextInt();

        for(int i=1; i<=n; i+=p) {
            System.out.printf("%d ",i);
        }

    }
}