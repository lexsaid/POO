/*
Dado el nombre del estudiante, sexo (h/m), su edad y tres calificaciones, decidir si el estudiante es aceptado. La
Universidad Kitty Kat SA es solo para mujeres mayores de 21 años con un promedio de entre 8 y 9.5.
*/

import java.util.Scanner;
import static java.lang.System.out;

public class _p38_aceptarestudiantev2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float cal, promedio, suma=0, edad;
        String nombre, sexo;

        out.println("Dado el nombre del estudiante, sexo (h/m), su edad y tres calificaciones, decidir si el estudiante es aceptado. La" +
                "Universidad Kitty Kat SA es solo para mujeres mayores de 21 a\u00F1os con un promedio de entre 8 y 9.5.");

        out.println("\nnombre: "); nombre=entrada.next();
        out.println("sexo: (h/m): "); sexo=entrada.next();

        if (sexo.equalsIgnoreCase("m")){
            out.println("\nmuy bien continuemos");
            out.println("edad: "); edad=entrada.nextInt();

            if(edad>=21){
                out.println("dame 3 calificaciones: ");
                for (int i=1; i<=3; i++){
                    cal =entrada.nextFloat();
                    suma = suma + cal;
                }
                promedio= suma/3;
                out.println("tu promedio es: "+promedio);
                if (promedio>=8){
                    out.println(String.format("felicidades %s, lograste entrar a la universidad \nedad: %.0f, promedio: %.2f, sexo: %s", nombre, edad, promedio, sexo));
                }else{
                    out.println("solo aceptamos promedios mayores de 8 ");
                }

            }else{
                out.println("solo aceptamos a mayores de 21 años");
            }

        }else{
            out.println("solo aceptamos mujeres");
        }

    }
}
