// Suma de un rango de numeros

import java.util.Scanner;

public class _p67_SumaRango {

    public static float SumaRango(float ini, float fin) {
        float s=0;

        for(float i=ini; i <= fin ;i++){
            s+=i;
        }

        return s;
    }

    public static void main(String[] args) {

        float ini, fin, res;
        Scanner entrada = new Scanner(System.in);

        do {

        System.out.print("Dame inicio : "); ini = entrada.nextFloat();
        System.out.print("Dame fin : "); fin = entrada.nextFloat();

        } while( ini > fin);

        res = SumaRango(ini, fin);
        System.out.printf("\nLa suma del rango es %.2f",res);

    }

}