// Efectua opcioneraciones matemáticas báscias con dos números

import java.util.Scanner;

public class _p29_Calculadora {
    public static void main(String[] args) {

        double n1, n2;
        char opcion;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Efectua opcioneraciones matemáticas básicas con 2 número\n");

        System.out.print("Dame número 1 ? ");
        n1 = entrada.nextDouble();
        System.out.print("Dame número 2 ? ");
        n2 = entrada.nextDouble();
        System.out.print("opcioneración ( + - * / ^ ) ? ");
        opcion = entrada.next().charAt(0);
        
        switch (opcion) {
            
            case '+':
                System.out.printf("n1 + n2 = %.2f", n1 + n2);
            break;

            case '-':
                System.out.printf("n1 - n2 = %.2f", n1 - n2);
            break;

            case '*':
                System.out.printf("n1 * n2 = %.2f", n1 * n2);
            break;
            
            case '/':
                System.out.printf("n1 / n2 = %.2f", n1 / n2);
            break;
            
            case '^':
                System.out.printf("n1 / n2 = %.2f", Math.pow(n1, n2));
            break;
            
            default:
                System.out.println("\nopcioneración Inválida ...");
            break;

        }

        System.out.println("\nProceso terminado ...");

    }
}