import java.util.Scanner;
import static java.lang.System.out;

//Dada una cantidad en horas, calcular su equivalente en días, minutos y segundos,

public class _p14_CalculoTiempo {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        double horas, dias, minutos, segundos;

        out.println("dame las horas para convertirlos: ");
        horas = entrada.nextDouble();

        dias = horas/24;
        minutos = horas*60;
        segundos = horas * 3600;

        out.printf("las horas fueron: %.2f, en dias son: %.0f, en minutos: %.2f, en segundos: %.2f ", horas, dias, minutos, segundos);
    
    }
}
