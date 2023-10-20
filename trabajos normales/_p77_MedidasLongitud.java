//Diseña un programa con dos funciones una que convierta pulgadas a centímetros y otra que convierta de metros a
//pies. Deberá́ mostrar un menú́ con las opciones correspondientes.

import java.util.Scanner;
import static java.lang.System.out;

public class _p77_MedidasLongitud {

    public static double conversion(int opcion1, double n){

        double cm=0, pies=0, valorfinal=0;

        if (opcion1==1){
            cm = n*2.54;
            valorfinal=cm;
        }else if(opcion1==2){
            pies = n * 3.28084;
            valorfinal = pies;
        }

        return valorfinal;
    }
    
    public static void main(String[] args) {

        double n=0;
        int opcion1;
        Scanner obj = new Scanner(System.in);

        do{
            out.println("que quieres convertir \n(1) pulgadas a centimetros \n(2) metros a pies");
            opcion1 = obj.nextInt();

            switch(opcion1){
                case 1:
                    out.println("cuantas pulgadas: ");
                    n = obj.nextDouble();
                    break;
                case 2:
                    out.println("cuantos metros: ");
                    n = obj.nextDouble();
                    break;
            }

        }while(opcion1 != 1 && opcion1!=2);

        out.println("el resultado es: "+conversion(opcion1, n));
        
    }

}
