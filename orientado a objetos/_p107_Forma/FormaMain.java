package _p107_Forma;

import java.util.ArrayList;

public class FormaMain {   
    public static void main(String[] args) {
        
        //Forma f1 = new Forma("Azul"); no se puede crear istancias de una clase abstracta
        //System.out.println(f1);

        Circulo circulo1 = new Circulo("rojo", 10.3);
        System.out.println(circulo1);
        System.out.println("Area del circulo = "+ circulo1.getArea());

        Triangulo triangulo1 = new Triangulo("Verde", 10, 20);
        System.out.println(triangulo1);
        System.out.println("Area triangulo = "+ triangulo1.getArea());

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo1);
        formas.add(triangulo1);
        formas.add(new Circulo("rosa", 33.45));

        System.out.println("\nTodas las formas :");
        for (Forma forma : formas) {
            System.out.println(forma);
            System.out.println("el area del: ");
            if(forma instanceof Triangulo) {
                System.out.print("Triangulo es :");
                System.out.print( ((Triangulo)forma).getArea() );
            }
            else if(forma instanceof Circulo) {
                System.out.print("Circulo es :");
                System.out.print( ((Circulo)forma).getArea() );
            }
                System.out.println("\n");
        }

    }
}
