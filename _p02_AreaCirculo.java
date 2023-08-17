//calcular area del circulo
import java.util.Scanner;

public class _p02_AreaCirculo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double radio, area;

        System.out.println("\ncalculando el area de un circulo");
        System.out.println("\ndame el radio?");
        radio = entrada.nextDouble();

        area = Math.PI*Math.pow(radio, 2);
        System.out.println("el area es: "+area);

    }
}
