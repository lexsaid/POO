package _p131_ExcepcionTemperatura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {


    public static double celsiusToFahrenheit(double celsius) throws SintaxError {
        if (celsius > 100) {
            throw new SintaxError("Temperatura demasiado alta, no se puede convertir");
        }
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Dame una temperatura en grados centígrados: ");
                double celsius = entrada.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.printf("%.2f grados centígrados equivale a %.2f grados Fahrenheit%n", celsius, fahrenheit);
                break;  // Salir del bucle si la conversión es exitosa
            } catch (InputMismatchException e) {
                System.out.println("Error: La temperatura debe ser un valor numérico.");
                entrada.next();  // Limpiar la entrada incorrecta
            } catch (SintaxError e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

