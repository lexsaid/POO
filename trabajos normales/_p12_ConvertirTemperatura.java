import java.util.Scanner;
import static java.lang.System.out;

//Se desea convertir una temperatura de grados fahrenheit a grados celsius

public class _p12_ConvertirTemperatura {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double fahrenheit, celcius;

        out.println("dame los grados en fahrenheit");
        fahrenheit = entrada.nextDouble();

        celcius = (fahrenheit-32.0)*(5.0/9.0);
        out.println("los grados en celcius es: "+celcius);

    }
}
