/*
Se desea calcular el promedio de 5 calificaciones introducidas por el usuario, luego evaluar el resultado e imprimir
un mensaje de acuerdo con el promedio obtenido:
• >0 y <= 6 Quedas reprobado
• >6 a <=7 Pasas de panzazo
• >7 y <=8 Muy bien, pues mejorar
• >8 y <=9 Excelente sigue así
• >9 y <=10 Perfecto tu esfuerzo valió la pena
*/

import java.util.Scanner;
import static java.lang.System.out;

public class _p37_calculonotas {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float cal, promedio, suma=0;

        out.println("Se desea calcular el promedio de 5 calificaciones introducidas por el usuario, luego evaluar el resultado e imprimir" + //
                "un mensaje de acuerdo con el promedio obtenido:" + 
                " >0 y <= 6 Quedas reprobado" + 
                " >6 a <=7 Pasas de panzazo" + 
                " >7 y <=8 Muy bien, pues mejorar" + 
                " >8 y <=9 Excelente sigue asi" + 
                " >9 y <=10 Perfecto tu esfuerzo valio la pena");

        out.println("\nescribe 5 calificaciones");

        for (int i = 1; i<=5; i++){
            cal =entrada.nextFloat();
            suma = suma + cal;
        }
        promedio= suma/5;
        out.println("tu promedio es: "+promedio);
        if (promedio>0 && promedio<=6){
            out.println("Quedas reprobado");

        }else if (promedio>6 && promedio<=7){
            out.println("pasas de pansazo");

        }else if (promedio>7 && promedio<=8){
            out.println("Muy bien, puedes mejorar");

        }else if (promedio>8 && promedio<=9){
            out.println("Excelente sigue asi");

        }else if (promedio>9 && promedio<=10){
            out.println("Perfecto tu esfuerzo valio la pena");
        }
    }
}
