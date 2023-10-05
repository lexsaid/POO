package _p98_Circulo;

import static java.lang.System.out;

public class Circulomain {
    
    public static void main(String[] args) {

        Circulo c1 = new Circulo(10.40);//es el radio
        out.println(c1);

        Circulo c2 = new Circulo();
        c2.setRadio(12.45);

        out.println(c2.toString());
        out.println("El radio es : " + c2.getRadio() );
        out.println("Area = " + c1.getArea() );
        out.println("Circunferencia = " + c1.getCircunferencia() );
    }

}
