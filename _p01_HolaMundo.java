//manda un mensaje a la pantalla

public class _p01_HolaMundo {
    public static void main(String[] args) {

        String amigo = "Juan";
        String hermano = "Emmanuel";
        String mensaje = String.format("\ntanto %s como %s desean aprender java", amigo, hermano);
        
        System.out.println("hola mundo en java");
        System.out.println("\nhola amigo "+amigo+" bienvenido a java" );
        System.out.println("\nmi amigo es "+amigo+" y el hermano es "+hermano );
        System.out.println(mensaje);
    }
}
