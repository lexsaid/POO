/*
Un usuario puede elegir un tamaño de pizza (chica - $5, mediana $10, grande $20), luego elige la cantidad, si la
compra es menor a 2000 no tiene descuento, mayor a 2000 tiene un descuento de 15%. Diseñe un programa que
permita procesar la solicitud e imprimir: tamaño de la compra, cantidad comprada, total compra, descuento, total de
compra con descuento. 
*/

import java.util.Scanner;
import static java.lang.System.out;

public class _p36_comprapizza {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcion, cantidad; 
        float total = 0, descuento = 0, subtotal = 0;
        String tamaño = "";

        out.println("Un usuario puede elegir un tamaño de pizza (chica - $5, mediana $10, grande $20), luego elige la cantidad, si la\n" + 
                "compra es menor a 2000 no tiene descuento, mayor a 2000 tiene un descuento de 15%. Diseñe un programa que\n" + 
                "permita procesar la solicitud e imprimir: tamaño de la compra, cantidad comprada, total compra, descuento, total de\n" + 
                "compra con descuento. ");

        out.println("\nescoge el tamaño de la pizza: 1- chica: $5, 2- mediana: $10, 3- grande: $20 ");
        opcion = entrada.nextInt();

        switch (opcion){
            case 1: 
                tamaño ="chica";
                out.println("cuantas quieres? ");
                cantidad = entrada.nextInt();
                
                subtotal = cantidad * 5;

                if(subtotal>=2000){
                    descuento = (float) (subtotal * 0.15);
                    total = subtotal - descuento;
                    out.println(String.format("tamaño de la pizza: %s \ncantidad compara: %d \nel subtotal de la compra es: %.2f \ncon un descuento de: %.2f \nel total fue: %.2f  ", tamaño, cantidad, subtotal, descuento, total));
                }else {
                    total = subtotal;
                    out.println(String.format("tamaño de la pizza: %s \ncantidad compara: %d \nel subtotal de la compra es: %.2f \ncon un descuento de: %.2f \nel total fue: %.2f  ", tamaño, cantidad, subtotal, descuento, total));
                }
                break;

            case 2:
                out.println("cuantas quieres? ");
                tamaño ="mediana";
                cantidad = entrada.nextInt();
                
                subtotal = cantidad * 10;

                if(subtotal>=2000){
                    descuento = (float) (subtotal * 0.15);
                    total = subtotal - descuento;
                    out.println(String.format("tamaño de la pizza: %s \ncantidad compara: %d \nel subtotal de la compra es: %.2f \ncon un descuento de: %.2f \nel total fue: %.2f  ", tamaño, cantidad, subtotal, descuento, total));
                }else {
                    total = subtotal;
                    out.println(String.format("tamaño de la pizza: %s \ncantidad compara: %d \nel subtotal de la compra es: %.2f \ncon un descuento de: %.2f \nel total fue: %.2f  ", tamaño, cantidad, subtotal, descuento, total));
                }
                break;

            case 3: 
                tamaño ="grande";
                out.println("cuantas quieres? ");
                cantidad = entrada.nextInt();

                subtotal = cantidad * 20;

                if(subtotal>=2000){
                    descuento = (float) (subtotal * 0.15);
                    total = subtotal - descuento;
                    out.println(String.format("tamaño de la pizza: %s \ncantidad compara: %d \nel subtotal de la compra es: %.2f \ncon un descuento de: %.2f \nel total fue: %.2f  ", tamaño, cantidad, subtotal, descuento, total));
                }else {
                    total = subtotal;
                    out.println(String.format("tamaño de la pizza: %s \ncantidad compara: %d \nel subtotal de la compra es: %.2f \ncon un descuento de: %.2f \nel total fue: %.2f  ", tamaño, cantidad, subtotal, descuento, total));
                }
                break;

            default: 
                out.println("no existe esta pizza");
        }
    }
}
