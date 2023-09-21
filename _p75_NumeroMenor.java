//Diseña un programa con una función que pida 4 números enteros y devuelva el menor de ellos.

import java.util.Scanner;
import static java.lang.System.out;

public class _p75_NumeroMenor {

    public static void mayormenor (int n1, int n2, int n3, int n4){
        int men=0, may=0;

        if( n1>n2 && n1>n3 && n1>n4 ) may=n1;
        else if( n2>n1 && n2>n3 && n2>n4 ) may=n2;
        else if( n3>n1 && n3>n2 && n3>n4 ) may=n3;
        else if (n4>n1 && n4>n2 && n4>n3 ) may=n4;

        if( n1<n2 && n1<n3 && n1<n4 ) men=n1;
        else if( n2<n1 && n2<n3 && n2<n4 ) men=n2;
        else if( n3<n1 && n3<n2 && n3<n4 ) men=n3;
        else if (n4<n1 && n4<n2 && n4<n3 ) men=n4;

        out.println(String.format("el numero mayor es: %d, el menor es: %d", may, men ));
    }
    
    public static void main(String[] args) {
        int n1, n2, n3, n4;
        Scanner obj = new Scanner(System.in);

        out.println("dame 4 numeros separados por enter: ");
        n1 = obj.nextInt();
        n2 = obj.nextInt();
        n3 = obj.nextInt();
        n4 = obj.nextInt();

        mayormenor(n1, n2, n3, n4);
        
    }

}
