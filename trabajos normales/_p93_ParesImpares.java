/*
Elaborar un programa que
• Declare dos arreglos de números enteros de una cantidad MAX 100 (a[MAX], b[MAX])
• Rellene el arreglo a[] con números aleatorios entre 0 y 20
• Muestre elementos del arreglo
• Muestre solo los elementos que son pares y los cuente
• Muestre solo los elementos que son impares y los cuente
• Muestre la cuenta de pares
• Muestre la cuenta de impares
*/

import java.util.Random;
import static java.lang.System.out;

public class _p93_ParesImpares {

    public static void mostrararreglo(int[] arreglo){
        int contador=0;

        for (int i = 0; i < arreglo.length; i++) {
            out.print(arreglo[i]+" ");
            contador++;
        }
        out.println("\ncontador general: "+contador);
    }

    public static void mostrarpar(int[] arreglo){
        int contadorpares=0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0) {
                out.print(arreglo[i]+"(Par) ");
                contadorpares++;
            }
        }

        out.println("\nElementos pares: " + contadorpares);
    }

    public static void mostrarimpar(int[] arreglo){
        int contadorimpares=0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 != 0) {
                out.print(arreglo[i]+"(impar) ");
                contadorimpares++;
            }
        }
        out.println("\nElementos impares: " + contadorimpares);
    }
    
    public static void main(String[] args) {

        int MAX= 100;
        int[] arreglo = new int[MAX];
        Random rand = new Random();

        // Rellenar el arreglo a[] con números aleatorios entre 0 y 20
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rand.nextInt(21); // Genera números aleatorios entre 0 y 20
           }
        
        out.println("Elementos del arreglo:");
    
        // Mostrar elementos del arreglo y contar pares e impares
        mostrararreglo(arreglo);
        out.println(" ");
        mostrarpar(arreglo);
        out.println(" ");
        mostrarimpar(arreglo);

    }
}
