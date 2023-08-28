import java.util.Scanner;
import static java.lang.System.out;

public class _p23_ConvertirTemperatura {
    public static void main(String[] args) {

        Scanner entrada =  new Scanner(System.in);
        char opcion;
        float farenheit, centigrados;

        out.println("convierte de farenheit a centigrados o viceversa");

        out.println("A: farenheit, B: centigrados, elige uno");
        opcion = Character.toUpperCase( entrada.next().charAt(0));

        if(opcion =='A'){
            out.println("convertir de farenheit a centigrados:");
            farenheit = entrada.nextFloat();
            centigrados = (farenheit - 32)*5/9;
            out.printf("%.2f Farenheit, equivale a %.2f Centigrados", farenheit, centigrados);
        }else if(opcion=='B'){
            out.println("\nConvertir de Centigrados a Farenheit");
            out.println("Dame los grados Centigrados ? "); 
            centigrados = entrada.nextFloat();
            farenheit = ( centigrados * 9 / 5 ) + 32;
            out.printf("%.2f Centigrados, equivale a %.2f Farenheit", centigrados, farenheit);;
        }else {
            out.println("dato invalido");
        }
    }    
}
