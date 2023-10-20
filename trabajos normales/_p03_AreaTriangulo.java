//calcular el area de un triangulo

import java.util.Scanner;

public class _p03_AreaTriangulo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int base, altura;
        double area;

        System.out.println("dame la base");
        base = entrada.nextInt();
        System.out.println("dame la altura");
        altura = entrada.nextInt();

        area = (altura*base)/2;
        System.out.println(String.format("el triangulo de base es: %d y de altura es: %d, el area del triangulo es: %.2f", base, altura, area));;

    }
}
