import java.util.Scanner;
import static java.lang.System.out;

//Se desea calcular el volumen de un cilindro dado su radio y altura

public class _p13_VolumenCilindro {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double radio, volumen, altura;

        out.println("dame el radio del cilindro: ");
        radio = entrada.nextDouble();
        out.println("dame la altura del cilindro: ");
        altura = entrada.nextDouble();

        volumen = Math.PI * (radio * radio) * altura;
        out.println("el volumen es: "+volumen);

    }
}
