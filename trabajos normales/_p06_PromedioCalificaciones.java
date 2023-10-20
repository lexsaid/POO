//calcula la suma y el promedio de 3 calificaciones, calcula la mayor y la menor de ellas

import java.util.Scanner;

public class _p06_PromedioCalificaciones {
    public static void main(String[] args) {

        float cal1, cal2, cal3, suma, prom, min, max;
        Scanner entrada = new Scanner(System.in);

        cal1=cal2=cal3=0;

        System.out.println("calificacion 1: "); 
        cal1=entrada.nextFloat();
        System.out.println("calificacion 2: "); 
        cal2=entrada.nextFloat();
        System.out.println("calificacion 3: "); 
        cal3=entrada.nextFloat();

        suma=cal1+cal2+cal3;
        prom= suma/3;
        min = Math.min(Math.min(cal1, cal2), cal3);
        max = Math.max(Math.max(cal1, cal2), cal3);

        System.out.printf("\nLas calificaciones fueron: %.2f, %.2f, %.2f", cal1, cal2, cal3);
        System.out.printf("\nLa suma es: %.2f", suma);
        System.out.printf("\nLa promedio es: %.2f", prom);
        System.out.printf("\nEl menor es: %.2f", min);
        System.out.printf("\nEl mayor es: %.2f", max);

    }
}
