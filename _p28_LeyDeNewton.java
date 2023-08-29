// Calcula fuerza, masa, y aceleración de acuerdo a la segunda ley de newton

import java.util.Scanner;

public class _p28_LeyDeNewton {
    public static void main(String[] args) {

        float f, m, a;
        char opcion;
        Scanner entrada = new Scanner(System.in);

        System.out.flush();
        System.out.println("Calcula la segunda ley de newton");
        System.out.println("[F]uerza ( f=m*a ) ");
        System.out.println("[M]asa ( m=f/a ) ");
        System.out.println("[A]celeracion ( a=f/m ) ");

        System.out.print("Elije una opcion ? ");
        opcion = Character.toUpperCase(entrada.next().charAt(0));
        f = m = a = 0;

        if (opcion == 'F') {
            System.out.println("\nCalculando la Fuerza ...");
            System.out.print("Masa ? ");
            m = entrada.nextFloat();
            System.out.print("Aceleracion ? ");
            a = entrada.nextFloat();
            f = m * a;
            System.out.printf("\nFuerza: %.2f", f);
        } else if (opcion == 'M') {
            System.out.println("\nCalculando la Masa ...");
            System.out.print("Fuerza ? ");
            f = entrada.nextFloat();
            System.out.print("Aceleracion ? ");
            a = entrada.nextFloat();
            m = f / a;
            System.out.printf("\nMasa: %.2f", m);
        } else if (opcion == 'A') {
            System.out.println("\nCalculando la Aceleracion ...");
            System.out.print("Fuerza ? ");
            f = entrada.nextFloat();
            System.out.print("Masa ? ");
            m = entrada.nextFloat();
            a = f / m;
            System.out.printf("\nAceleración: %.2f", a);
        } else
            System.out.println("\nOpcion Invalida \n");

    }
}
