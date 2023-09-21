/*
Diseña un programa con una función que reciba tres parámetros: dos números que corresponden a un rango (ini,
fin), otro número constante que es 3 o 4 regrese la suma de números múltiplos de 3 o múltiplos de 4 en el rango
de números especificados. Deberá́ mostrar un menú́ con las opciones correspondientes. La llamada a la función
podría ser:
• SumaMultiplos(10,20,3) – para la suma de los múltiplos de 3 entre 10 y 20
• SumaMultiplos(50,100,4) - para los múltiplos de 4 entre 50 y 100
Nota:
• Antes de llamar a la función deberá validar que el rango de números es válido (ini < fin).
*/

import java.util.Scanner;
import static java.lang.System.out;

public class _p78_SumaMultiplos {

    public static int sumarMultiplos(int ini, int fin, int constante) {
        int suma = 0;

        for (int i = ini; i <= fin; i++) {
            if (constante == 3 && i % 3 == 0){ 
                suma +=i;
            }else if(constante == 4 && i % 4 == 0){
                suma += i;
            }
        }

        return suma;
    }

    public static void main(String[] args) {

        int ini, fin, constante;
        Scanner obj = new Scanner(System.in);

        do {
            out.println("Ingresa un número inicial: ");
            ini = obj.nextInt();
            out.println("Ingresa un número final mayor al inicial: ");
            fin = obj.nextInt();
        } while (ini >= fin);

        do {
            out.println("¿Con qué constante deseas calcular? 3 o 4");
            constante = obj.nextInt();
        } while (constante != 3 && constante != 4);

        out.println("la suma del rango es: "+ sumarMultiplos(ini, fin, constante));
    }

}
