// Conversion de temperaturas usando funciones

import java.util.Scanner;
import static java.lang.System.out;

public class _p66_ConversionTemperaturas {
    
    public static float Farenheit(float t) {
        float far = (t*9/5)+32;
        return far;
    }

    public static float Celcius(float t) {
        float cel = (t-32)*5/9;
        return cel;
    }

    public static void main(String[] args) {

        int op;
        float temp, res;
        Scanner entrada = new Scanner(System.in);

        out.println("[1] farenheit\n[2] celcius\nElige ? "); op = entrada.nextInt();
        if(op == 1) {
            out.println("\nDame la temperatura ? "); temp = entrada.nextFloat();
            res = Farenheit(temp);
            out.printf("\n%.2f grados celcius equivale a %.2f grados farenheit ..", temp, res);
        }else if(op == 2) {
            out.println("\nDame la temperatura ? "); temp = entrada.nextFloat();
            res = Celcius(temp);
            out.printf("\n%.2f grados farenheit equivale a %.2f grados celcius ..", temp, res);
        }else out.println("Opción inválida");

    }    
    
}
