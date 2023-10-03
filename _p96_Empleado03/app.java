package _p96_Empleado03;

public class app {

    public static void main(String[] args) {
    
        // Instanciar y reservar espacio en memoria
        Empleado empleado1 = new Empleado();
        empleado1.setNombre ("Juan Perez");
        empleado1.setEdad(35);
        System.out.println(empleado1.toString());

        // Instanciar, luego reservar espacio en memoria
        Empleado empleado2;
        empleado2 = new Empleado();
        empleado2.setNombre ("Maria de Jesus");
        empleado2.setEdad(16);
        System.out.println(empleado2.toString());

        //inatcian objeto 3
        Empleado empleado3 = new Empleado("peje", 74);
        System.out.println(empleado3.toString());

        System.out.println(" ");
        // Accede elementos individuales directamente
        System.out.println("Nombre : " + empleado1.getNombre());
        System.out.println("Edad : " + empleado1.getEdad());
        System.out.println("Nombre : " + empleado2.getNombre());
        System.out.println("Edad : " + empleado2.getEdad());
        System.out.println("Nombre : " + empleado3.getNombre());
        System.out.println("Edad : " + empleado3.getEdad());
    }
    
}
