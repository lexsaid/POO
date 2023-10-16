package _p109_FormaV2;

import static java.lang.System.out;
import java.util.ArrayList;

public class FormaV2Main {
    
    public static void main(String[] args) {
        
        Circulo F1 = new Circulo("Rosa", true, 10.23);
        out.println(F1);
        Circulo F2 = new Circulo("Verder", false, 99.12);
        out.println(F2);
        
        Rectangulo F3 = new Rectangulo("Amarillo", false, 10, 20);
        out.println(F3);
        Rectangulo F4 = new Rectangulo("Azul", true, 15, 44);
        out.println(F4);
        
        out.println(" ");
        
        ArrayList<FormaV2>formas = new ArrayList<>();
        formas.add(F1);
        formas.add(F2);
        formas.add(F3);
        formas.add(F4);

        out.println("Calculando las Areas y Perimetros: ");
        for (FormaV2 forma : formas) {
            if (forma instanceof Rectangulo){
                out.println("la forma es un Rectangulo");
                out.println("el area del Rectangulo es: "+ ((Rectangulo)forma).getArea());
                out.println("el perimetro del Rectangulo es: "+ ((Rectangulo)forma).getPerimetro());
            }
            else if (forma instanceof Circulo){
                out.println("la forma es un Circulo");
                out.println("el area del Circulo es: "+ ((Circulo)forma).getArea());
                out.println("el perimetro del Circulo es: "+ ((Circulo)forma).getPerimetro());
            }
        }

    }
}
