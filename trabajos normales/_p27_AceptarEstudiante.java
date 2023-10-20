// Acepta a un estudiante en base a su edad y sus calificaciones

import java.util.Scanner;

public class _p27_AceptarEstudiante {

    public static void main(String[] args) {

        String nombre;
        int edad;
        float cal1,cal2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Acepta a un estudiante en base a su edad y sus calificaciones\n");
        
        System.out.print("Dame tu nombre ? "); 
        nombre = entrada.nextLine();
        System.out.print("Dame la edad ? "); 
        edad = entrada.nextInt();
        
        if( edad >= 18 ) {
            System.out.println("Eres mayor de edad, continuamos ");
            System.out.println("Dame dos calificaciones separadas por Enter:");
            cal1 = entrada.nextFloat();
            cal2 = entrada.nextFloat();
            if( cal1 >= 8 && cal2 >= 8)
                System.out.printf("\nBIENVENIDO %s tienes %d y calificaciones %.2f,%.2f ... ACEPTADO\n",nombre,edad,cal1,cal2);
            else
                System.out.println("\nSolo aceptamos estudiantes con calificaciones de 8 en adelante");
        }
        else
        System.out.println("Solo aceptamos estudiantes mayores de edad");

    }
}