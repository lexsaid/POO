//divide un numero de 3 cifras en unidades, decenas y centenas
import static java.lang.System.out;
import java.util.Scanner;

public class _p09_DividirEnCifras {
    public static void main(String[] args) {
        
        out.println("dame un angulo en grados");
        int num= new Scanner(System.in).nextInt();
        
        int centenas = num/100;
        int decenas =(num - centenas*100)/10;
        int unidades = (num- (centenas*100+decenas*10));

        out.println("el numero es: "+num);
        out.println("centena: "+centenas);
        out.println("decena: "+decenas);
        out.println("unidades: "+unidades);

    }
}
