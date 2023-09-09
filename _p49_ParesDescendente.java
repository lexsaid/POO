/*
Se desea imprimir los números pares desde 100 hasta el número que el usuario decida (n), además deberá
imprimirse la suma y el promedio de esos números pares. El proceso debe de poder repetirse hasta que el
usuario lo decida.
Ejemplo: Números pares entre 100 y 90: 100 98 96 94 92 90,
la suma 57, promedio: 95, ¿Deseas continuar (S/N)?
*/

import java.util.Scanner;
import static java.lang.System.out;

public class _p49_ParesDescendente {
    public static void main(String[] args) {

        int n, s, i, c;
        float promedio;
        char respuesta;
        Scanner entrada = new Scanner(System.in);
        
        out.println("Se desea imprimir los numeros pares desde 100 hasta el numero que el usuario decida (n), ademas debera\n" + 
                "imprimirse la suma y el promedio de esos numeros pares. El proceso debe de poder repetirse hasta que el\n" +
                "usuario lo decida.");

        do{
            out.println("\nel contador va empezar desde 100, hasta que numero en menor de 100 quieres que quede? ");
            n = entrada.nextInt();

            c=100; s=0; i=0;

            if (n<=100){

                while (c>=n){
                    out.print(c+" ");
                    i++;
                    s+=c;
                    c-=2;
                }
                promedio = s/i;
                out.println(String.format("\nla suma es: %d,  el promedio es: %.2f",s, promedio));

            }else{
                out.println("te dije que menor a 100");
            }

            out.println("quieres seguir en el caso? (S/N)");
            respuesta = Character.toUpperCase(entrada.next().charAt(0));
        }while(respuesta != 'N');

    }
}
