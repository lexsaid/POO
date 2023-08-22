//realiza operaciones matematicas basicas

public class _p05_OperacionesMatematicas {
    public static void main(String[] args) {
        
        double x, y, suma, resta, div, mult, residuo, pot;
        x=10.5; y=2.5;

        suma= x+y;
        resta= x-y;
        mult= x*y ;
        div= x/y;
        residuo = x%y;
        pot= Math.pow(x, y);

        System.out.println(String.format("la suma de las variables %s y %s es: %.2f", x,y, suma));
        System.out.println(String.format("la resta de las variables %s y %s es: %.2f", x,y, resta));
        System.out.println(String.format("la multiplicacion de las variables %s y %s es: %.2f", x,y, mult));
        System.out.println(String.format("la division de las variables %s y %s es: %.2f", x,y, div));
        System.out.println(String.format("el residuo de las variables %s y %s es: %.2f", x,y, residuo));
        System.out.println(String.format("la potencia de las variables %s y %s es: %.2f", x,y, pot));

    }
}
