//verifica si la suma de dos numeros es igual a un tercer numero
import java.util.Scanner;
import static java.lang.System.out;

public class _p22_VerificarSuma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1, num2, num3;

        out.println("verifica si la suma de dos numeros es igual a un tercer numero");
        out.println("\nsnumero1:"); num1 = entrada.nextFloat();
        out.println("numero2:"); num2 = entrada.nextFloat();
        out.println("numero3:"); num3 = entrada.nextFloat();
        
        if(num1+num2 ==num3)
            out.println("son iguales");
        else
            out.println("son diferentes");

        
    }
}
