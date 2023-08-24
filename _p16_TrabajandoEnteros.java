import static java.lang.System.out;

//System.out.print("\033[H\033[2J"); System.out.flush(); (es para resetear la terminal)
//Trabajando con con variables y literales enteras

public class _p16_TrabajandoEnteros{
    public static void main(String[] args) {

        int num1= 158;
        int num2 = 0x2A;
        int num3 = 0b00101010;

        byte val1 = 120, val2 = 1;
        short horas = 24, dias = 9099;
        long ganancia = 9223372036854733307L;

        out.println("\nUso de String.format para formateo de números enteros: ");
        out.println(String.format("num1 base decimal : %d",num1));
        out.println(String.format("num1 base octal : %o",num1));
        out.println(String.format("num1 base hexadecimal : %x", num1));
        out.println(String.format("La ganancia anual : %,d", ganancia));

        out.println("\nUso de Integer.toString para formateo de números enteros: ");
        out.println("num2 base decimal : " + Integer.toString(num2));
        out.println("num2 base octal : " + Integer.toString(num2,8));
        out.println("num2 base hexadecimal : " + Integer.toString(num2,16));
        out.println("num2 base binaria : " + Integer.toString(num2,2));
        out.println("num3 base binaria : " + Integer.toString(num3,2));

        out.println("\nUso de System.out.prinf para dar formato a números enteros: ");
        out.printf("val1, val2 en formato decimal : %d %d \n",val1, val2);
        out.printf("val1, val2 en formato octal : %o %o \n",val1, val2);
        out.printf("val1, val2 en formato hexadecimal : %x %x \n",val1, val2);
        out.printf("horas, dias en formato decimal : %d %d \n",horas, dias);
        out.printf("horas, dias en formato octal : %o %o \n",horas, dias);
        out.printf("horas, dias en formato hexadecimal : %x %x \n",horas, dias);

        out.println("\nUso MIN_VALUE y MAX_VALUE conocer los rangos de los números enteros: ");
        out.println(String.format("\nTipo: byte, Min: %d Max: %d",Byte.MIN_VALUE, Byte.MAX_VALUE));
        out.println(String.format("\nTipo: short, Min: %d Max: %d",Short.MIN_VALUE, Short.MAX_VALUE));
        out.println(String.format("\nTipo: int , Min: %d Max: %d",Integer.MIN_VALUE, Integer.MAX_VALUE));
        out.println(String.format("\nTipo: long, Min: %d Max: %d",Long.MIN_VALUE, Long.MAX_VALUE));

        
    }
}