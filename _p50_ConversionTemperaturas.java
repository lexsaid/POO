/*
Se desea calcular la temperatura convertida de grados centígrados a grados farenheit de un rango de valores
introducidos por el usuario, es decir el usuario introduce la temperatura inicial y la temperatura final en grados
centígrados y el programa realiza la conversión a farenheit incrementando el valor inicial en 1, hasta llegar al
valor final. Se deberá validar el rango, es decir Final no puede ser menor a Inicial. El proceso debe de poder
repetirse hasta que el usuario lo decida.
Ejemplo: Temperatura Inicial: 10 , Temperatura Final: 15
------------------------------------
Centígrados Farenheit
------------------------------------
10          50
11          51.8
12          53.6
13          55.4
14          57.2
15          59
------------------------------------
*/

import java.util.Scanner;
import static java.lang.System.out;

public class _p50_ConversionTemperaturas {
    public static void main(String[] args) {
        
        float inicial, fin, Fa= 0, Ce = 0;
        Scanner entrada = new Scanner(System.in);
        char respuesta;

        out.println("Se desea calcular la temperatura convertida de grados centigrados a grados farenheit de un rango de valores\n" + 
                "introducidos por el usuario, es decir el usuario introduce la temperatura inicial y la temperatura final en grados\n" + 
                "centigrados y el programa realiza la conversion a farenheit incrementando el valor inicial en 1, hasta llegar al\n" + 
                "valor final. Se debera validar el rango, es decir Final no puede ser menor a Inicial. El proceso debe de poder\n" + 
                "repetirse hasta que el usuario lo decida.");

        do{
            inicial = 0; fin=0;
            out.println("\ndame una temperatura en celcius");

            do {
                 out.println("inicial"); inicial = entrada.nextFloat();
                 out.println("final"); fin = entrada.nextFloat();
            }while(inicial > fin);

            Ce = inicial;
            out.println("Celcius\tFarenheit");

            while(Ce<=fin){
                Fa =(Ce * 9/5) + 32;
                out.println(String.format("%.2f\t%.2f", Ce, Fa));
                Ce++;
            }

            System.out.print("\nDeseas continuar (S/N) ? ");
            respuesta = Character.toUpperCase(entrada.next().charAt(0));
        }while(respuesta == 'S');
    }
}
