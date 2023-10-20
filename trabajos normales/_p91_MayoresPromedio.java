/*
Elaborar un programa que:
• Permita al usuario capturar n calificaciones en un arreglo de números flotantes.
• Muestre los elementos del arreglo
• Calcule y muestre la suma y el promedio de los elementos del arreglo
• Muestre solo aquellos elementos mayores al promedio y cuente cuantos son
*/

import java.util.Scanner;
import static java.lang.System.out;

public class _p91_MayoresPromedio {
    
    public static void Mostrarcalificaciones(float[] calificaciones){
        int i;
        out.println(" ");

        out.print("las calificaciones fueron: ");
        for(i=0; i<calificaciones.length; i++){
            out.print(calificaciones[i]+" ");
        }
    }

    public static void calcularcalificaciones(float[] calificaciones){
        float suma=0f, promedio=0f;
        int i;
        out.println(" ");

        out.print("\nlas sumas de las calificaciones son: ");
        for(i=0; i<calificaciones.length; i++){
            suma+=calificaciones[i];
            promedio+=1;
        }
        out.println(suma);
        out.println("el promedio es: "+ (suma/promedio));

        mostrarmayoresalpromedio(calificaciones, promedio);
    }

    public static void mostrarmayoresalpromedio(float[] calificaciones,float promedio){
        int i;
        out.println(" ");

        out.println("las calificaciones mayores al promedio son: ");
        for(i=0; i<calificaciones.length; i++){
            if (calificaciones[i] > promedio) {
                out.println(calificaciones[i]);
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n; 

        out.println("dame calificaciones"); n = entrada.nextInt();
        float[] calificaciones = new float[n];

        for (int i=0; i<n; i++){
            out.print("calificacion: "+(i+1)+" ");
            calificaciones[i]=entrada.nextFloat();
        }

        Mostrarcalificaciones(calificaciones);
        calcularcalificaciones(calificaciones);

    }

}
