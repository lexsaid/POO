package _p129_ExcepcionDulces;

import java.util.InputMismatchException;
import java.util.Scanner;

public class app {
    
    public static int repartir(int niños, int dulces) throws SintaxError{
        if (niños==0 || dulces==0){
            throw new SintaxError("no hay dulces o niños");
        }
            return niños/dulces;
    }
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        try{
            System.out.println("numeros de niños en el barrio: ");
            int niños = entrada.nextInt();
            System.out.println("numeros de dulces que hay:");
            int dulces = entrada.nextInt();

            System.out.println("a cada niño le toca de: "+ repartir(niños, dulces));
            
        }catch(SintaxError e){
            System.out.println(e.getMessage());

        }catch (InputMismatchException e) {
            System.out.println("Error: Ingresa un números.");
        }

    }

}
