// Calcula el promedio de tres números usando una función

import java.util.Scanner;
import static java.lang.System.out;


public class _p65_PromedioNumeros {

    public static float Promedio(float num1, float num2, float num3){
        float suma, promedio;
        suma = num1 + num2 + num3;
        promedio = suma/3;
        return promedio;
    }

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float n1, n2, n3, promedio;

        out.println("dame numero 1"); n1 = entrada.nextFloat();
        out.println("dame numero 2"); n2 = entrada.nextFloat();
        out.println("dame numero 3"); n3 = entrada.nextFloat();

        promedio = Promedio(n1, n2, n3);
        out.println("el promedio es: " + promedio);
        out.println("el promedio de 10.5, 20.5, 30.5 es: "+Promedio(10.5f, 20.5f, 30.5f));//aqui en los 3 numeros desde el codigo ya le damos un valor en los parametros
                                                                    //num1  num2  num3
    }
}
