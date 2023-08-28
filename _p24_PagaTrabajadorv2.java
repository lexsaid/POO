import java.util.Scanner;
import static java.lang.System.out;

public class _p24_PagaTrabajadorv2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horas, extra = 0;
        float paga, total;

        out.println("calcula la paga de un trabajador, horas extra se pagan doble");
        out.println("\n horas trabajadas: "); horas = entrada.nextInt();
        out.println("\n paga por hora: "); paga = entrada.nextFloat();

        if(horas > 40){
            extra = horas - 40;
            total = (40*paga) + (extra * paga * 2);
        }else{
            total = horas * paga;
        }
        out.println("el total de la paga es: "+total);
        out.println("horas extra: "+extra);
    
    }    
}
