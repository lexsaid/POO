// Tabla de multiplicar

import java.util.Scanner;

public class _p68_TablaMultiplicar {

    public static void Tabla(int t, int n) {

        System.out.printf("\nTabla del %d\n",t);
        for(int i=1; i <= n; i++){
            System.out.printf("%d x %d = %d\n",t,i,t*i);
        }
        
    }

    public static void main(String[] args) {

        int t,n;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Que tabla quieres ? "); t = entrada.nextInt();
        System.out.print("Hata donde la quieres ? "); n = entrada.nextInt();

        Tabla(t,n);

    }

}