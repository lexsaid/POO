package _p101_TrabajoPersona;

public class TrabajopersonaMain {
    public static void main(String[] args) {
    
        Persona persona1 = new Persona(null, null);
        Trabajo trabajo = new Trabajo(0, null, 0);
        trabajo.setId(2);
        trabajo.setRol("chofer");
        trabajo.setSalario(200);
        persona1.setNombre("perez juan");
        persona1.setTrabajo(trabajo);
        System.out.println(persona1);

        Persona persona2 = new Persona("Lex Said", new Trabajo(10, "mesero", 200));
        System.out.println(persona2);

        Persona persona3 = new Persona("carlos", new Trabajo(1, "youtuber", 500));
        System.out.println(persona3);

    }
}
