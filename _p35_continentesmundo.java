/*
Dado un número entero entre 1 y 6 que corresponde a un continente del mundo, escribir su nombre: 1 Asia, 2 África, 
3 América del Norte, 4 América del Sur, 5 Antártida, 6 Europa. Si el número no está en el rango especificado, mostrar
un mensaje de error.
*/

import java.util.Scanner;
import static java.lang.System.out;

public class _p35_continentesmundo {
    public static void main(String[] args) {
        
        out.println("Dado un n\u00FAmero entero entre 1 y 6 que corresponde a un continente del mundo, escribir su nombre: 1 Asia, 2 Africa, \n" +
                "3 America del Norte, 4 America del Sur, 5 Antartida, 6 Europa. Si el numero no est\u00E1 en el rango especificado, mostrar\n" + 
                "un mensaje de error.");

        out.println("\nescoge un continente 1-Asia, 2-Africa, 3-America del Norte, 4-America del Sur, 5-Antartida, 6-Europa: ");
        int opcion = new Scanner(System.in).nextInt();

        switch(opcion){
            case 1: out.println("Asia"); break;

            case 2: out.println("Africa");break;
            
            case 3: out.println("America del Norte");break;

            case 4: out.println("America del Sur");break;

            case 5: out.println("Antartida");break;

            case 6: out.println("Europa");break;

            default: out.println("en que planeta vives????");break;
        }
    }
}
