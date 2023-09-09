/*
Se desea imprimir los números impares de forma ascendente desde 1 hasta el número que el usuario decida (n),
además deberá imprimirse la suma y el promedio de esos números impares. El proceso debe de poder repetirse
hasta que el usuario lo decida.
Ejemplo: Números impares entre 1 y 10: 1 3 5 7 9,
la suma: 25, el promedio: 5, ¿Deseas continuar (S/N)?
*/

import java.util.Scanner;
import static java.lang.System.out;

public class _p48_ImparesAscendente {
    public static void main(String[] args) {

        int n, s, i, c=1;
        float promedio;
        char respuesta;
        Scanner entrada = new Scanner(System.in);

        out.println("Se desea imprimir los numeros impares de forma ascendente desde 1 hasta el numeros que el usuario decida (n),\n" + 
                "ademas debera imprimirse la suma y el promedio de esos numeros impares. El proceso debe de poder repetirse\n" +
                "hasta que el usuario lo decida.");

        do{
            out.println("\nhasta donde?");
            n = entrada.nextInt();

            s=0; i=0; c=1;

            while(c<=n){
                out.printf("%d ",c);
                i++;
                s= s+c;
                c+=2;
            }

            promedio = s/i;
            out.println(String.format("\nla suma es: %d,  el promedio es: %.2f",s, promedio));
            out.println("quieres seguir contando? (S/N)");
            respuesta = Character.toUpperCase(entrada.next().charAt(0));
        }while(respuesta != 'N');

    }
}
