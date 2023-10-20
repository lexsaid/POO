// Administra el pago por estacionamiento de acuerdo a la Zona

import java.util.Scanner;

public class _p32_PagoEstacionamiento {
    public static void main(String[] args) {
        
        int opcion;
        float tasa=0, pago=0, impuesto=0, total=0;
        String salida="";
        Scanner entrada = new Scanner(System.in);

        System.out.println("Administra el pago por estacionamiento de acuerdo a la Zona\n");

        System.out.println("1 - Estacionamiento Tacuba 3%");
        System.out.println("2 - Estacionamiento Portales 5%");
        System.out.println("3 - Estacionamiento Conquistadores 10%");
        System.out.println("4 - Estacionamiento Pajaros Caidos 15%");

        System.out.print("Elige opcionción ? "); opcion =entrada.nextInt();
        System.out.print("Pago efectuado ? "); pago = entrada.nextFloat();

        switch (opcion) {
            case 1 : tasa = 0.03f;break;

            case 2 : tasa = 0.05f;break;

            case 3 : tasa = 0.10f;break;

            case 4 : tasa = 0.15f;break;
            
            default : System.out.println("opcionción Inválida !!!");break;
        }
        
        impuesto = pago * tasa;    
        total = pago + impuesto;

        salida = String.format("\nElegiste el estacionamiento %d \n" +
        "Pagaste %.2f por el tiempo de uso \n" +
        "Corresponde un impuesto de %,.2f \n" +
        "El pago total es de %,.2f",opcion,pago,impuesto,total);
        
        System.out.println(salida);
        System.out.println("\nProceso terminado ...");

    }
}