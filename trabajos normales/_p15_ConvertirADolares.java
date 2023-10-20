import java.util.Scanner;
import static java.lang.System.out;

//Dada una cantidad en pesos y la cotización del dólar, se desea obtener el equivalente en dólares

public class _p15_ConvertirADolares {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double dolares, peso;

        out.println("cuantos pesos tienes ?");
        peso = entrada.nextDouble();

        dolares= peso/16.84;

        out .printf("me diste: %.2f pesos, en dolares es: %.2f", peso, dolares);
    }
}
