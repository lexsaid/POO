import java.util.Scanner;
import static java.lang.System.out;

public class _p04_PagaTrabajador {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int horas;
        double paga, pagabruta, paganeta, impuesto, tasa;
        
        //entrada
        out.print("nombre del trabajador: "); nombre = entrada.nextLine();
        out.print("horas trabajadas: "); horas  = entrada.nextInt();
        out.print("paga por hora: "); paga= entrada.nextInt();
        tasa=0.03;

        //calculos
        pagabruta= horas*paga;
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;

        //salida
        out.println("resumen de pago");
        out.println(String.format("el trabajador %s, trabajo %d horas, con una paga de %.2f pesos la hora, se asume una tasa de impuesto de %.2f", nombre, horas, paga, tasa));
        out.println("paga bruta: "+pagabruta);
        out.println("impuesto: "+ impuesto);
        out.println("paga neta: "+ paganeta);
    }
}
