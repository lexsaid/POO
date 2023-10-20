// Procesa n calificaciones, calcula la suma y el promedio

import java.util.Scanner;

public class _p41_procesacalificaciones {
    public static void main(String[] args) {

        int n,c;
        float calif,suma, prom;
        Scanner entrada = new Scanner(System.in);
        calif=suma=prom=0;

        System.out.println("Procesa n calificaciones, calcula la suma y el promedio");
        System.out.print("Cuantas calificaciones ? ");
        n = entrada.nextInt();
        c = 1;

        while( c <= n ) {
            System.out.printf("Calificacion %d? ",c++);
            calif = entrada.nextFloat();
            suma = suma + calif;
        }
        
        prom = suma / n;
        System.out.printf("La suma es : %.2f\n", suma);
        System.out.printf("El promedio es : %.2f\n", prom);

    }
}
