//Diseña un programa con una función que pida un número entero entre 1 y 7 y devuelva el día de la semana con
//letra. Deberá validar que el número está en el rango adecuado.

import java.util.Scanner;
import static java.lang.System.out;

public class _p76_DiaSemana {
    
    public static String diadelasemana(int n){
        String dia ="";

        switch (n){
            case 1: 
                dia = "lunes";
                break;
            case 2: 
                dia = "martes";
                break;
            case 3: 
                dia = "miercoles";
                break;
            case 4: 
                dia = "jueves";
                break;
            case 5: 
                dia = "viernes";
                break;
            case 6: 
                dia = "sabado";
                break;
            case 7: 
                dia = "domingo";
                break;
        }

        return dia;
    }

    public static void main(String[] args) {

        int n;
        Scanner obj = new Scanner(System.in);

        do{
            out.println("dame un numero para decirte el dia de la semana (1-7)");
            n= obj.nextInt();
        }while(n<1 || n>7);

        out.println(diadelasemana(n));
    
    }

}
