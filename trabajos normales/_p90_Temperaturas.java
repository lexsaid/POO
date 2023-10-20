/*
Elaborar un programa que:
• Declare un arreglo de números flotantes llamado temperaturas y que lo inicialice los siguientes elementos:
2.34 44.56 7.89 0.5 2.5 4.67 40.3 22.35 56.22
• Muestre el primer elemento
• Muestre el tercer elemento
• Muestre los elementos del arreglo
• Ponga a 0 todos los elementos mayores a 10
• Muestre nuevamente los elementos del arreglo
*/

import static java.lang.System.out;

public class _p90_Temperaturas {

    public static void convertidor(float[]temperaturas){

        // Ponga a 0 todos los elementos mayores a 10
        out.println("\n\ntemperaturas mayores a 10 se igualan a 0");
        for(int i=0; i<temperaturas.length; i++){
            if (temperaturas[i]>10){
                temperaturas[i]=0;
            }
            out.print(temperaturas[i] + " ");
        }

    }

    public static void main(String[] args) {
        
        float[] temperaturas = {2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f};

        out.println(String.format("el primer elemento de la tabla es: %.2f, el tercero es: %.2f",  temperaturas[0], temperaturas[2]));
        out.println("las temperaturas son: ");
        for(int i=0; i<temperaturas.length; i++){
            out.print(temperaturas[i]+" ");
        }

        convertidor(temperaturas);

    }
    
}
