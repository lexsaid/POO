package _p130_ExcepcionEdades;

import java.util.Scanner;
import java.util.InputMismatchException;

public class app {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] edades = new int[5];

        System.out.println("Captura las edades de 5 personas:");

        for (int i = 0; i < 5; i++) {
            try {
                System.out.print("Edad persona " + (i + 1) + ": ");
                edades[i] = entrada.nextInt();
                if (edades[i] < 0) {
                    System.out.println("Error: Ingresa una edad válida.");
                    i--; // Reintentar la misma posición
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                entrada.next(); // Limpiar la entrada incorrecta
                i--; // Reintentar la misma posición
            }
        }
        System.out.println("Captura terminada. Las edades son: " + arrayToString(edades));
    }

    public static String arrayToString(int[] arr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);
            if (i < arr.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}