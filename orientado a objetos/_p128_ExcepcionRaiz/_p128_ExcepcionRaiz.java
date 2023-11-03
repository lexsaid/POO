package _p128_ExcepcionRaiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _p128_ExcepcionRaiz {
    
    public static float raiz(float n) throws SintaxError{
        if (n < 0) {
            throw new SintaxError("Número negativo: No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return (float) Math.sqrt(n);
    }

    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);

        System.out.println("dame un numero para sacrle la raiz cuadrada");

        try {
            float n = entrada.nextFloat();
            System.out.println("El resultado es: " + raiz(n));
            
        } catch (SintaxError e) {
            System.out.println("Error: " + e.getMessage());
        
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresa un número válido.");
        }

    }
    
}
