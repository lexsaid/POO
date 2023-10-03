/*
Elaborar un programa que:
• Permita al usuario capturar n números en un arreglo de números enteros.
• Muestre los elementos del arreglo
• Encuentre cuál es el número mayor dentro del arreglo y lo muestre
• Encuentre cuál es el número menor dentro del arreglo y lo muestre
*/

import java.util.Scanner;
import static java.lang.System.out;

public class _p92_MayorMenor {

    public static void mostrar(int n, float[] arreglo){

        out.println("el orden asi quedo");
        for(int i=0; i<n; i++){
            out.print(arreglo[i]+" ");
        }
    }

    public static float[] mayormenor(float[] arreglo){
        float mayor=arreglo[0], menor=arreglo[0];

        for (int i=0; i<arreglo.length; i++){
            if (arreglo[i] > mayor){
                mayor = arreglo[i];
            }else if (arreglo[i] < menor){
                menor = arreglo[i];
            }
        }

        float[] resultado = {menor, mayor};
        return resultado; 
    }
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n;

        out.print("cuantos numeros quieres escribir? "); n = entrada.nextInt();
        float[] arreglo = new float[n];

        for(int i=0; i<n; i++){
            out.println("n:"+(i+1));
            arreglo[i] = entrada.nextFloat();
        }

        mostrar(n,arreglo);
        out.println("\nel menor es: "+mayormenor(arreglo)[0]+" el mayor es: "+mayormenor(arreglo)[1]);

    }
    
}
