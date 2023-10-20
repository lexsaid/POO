/*
Diseña un programa con una función que reciba como parámetro un ángulo entre 0 y 360 grados, y regrese una
palabra con el tipo de ángulo, en base a lo siguiente:
• < 90 agudo,
• = 90 recto,
• >90 y <180 obtuso,
• = 180 llano,
• > 180 y < 360 concavo
Nota:
• Antes de llamar a la función deberá validar que el ángulo es válido (0 a 360).
*/

import java.util.Scanner;
import static java.lang.System.out;

public class _p79_Angulo {

    public static String angulo(int n){

        String tipoangulo="";

        if(n<90) tipoangulo="agudo";
        else if(n==90) tipoangulo="recto";
        else if(n>90 && n<180) tipoangulo="obtuso";
        else if(n==180) tipoangulo="llano";
        else if(n>180 && n<360) tipoangulo="concavo";

        return tipoangulo;
    }

    public static void main(String[] args) {

        int n;
        Scanner obj = new Scanner(System.in);

        do{
            out.println("dame un angulo del 0-360");
            n = obj.nextInt();
        }while(n<0 || n>360);

        out.println("el angulo: "+n+" es: "+angulo(n));

    }
    
}
