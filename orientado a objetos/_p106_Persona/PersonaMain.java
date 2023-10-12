package _p106_Persona;

public class PersonaMain {
    public static void main(String[] args) {

        Persona persona1= new Persona("Carlos Castañeda", "Av Lopez Velarde");
        System.out.println(persona1);

        Persona p2 = new Persona("Ana", "Catedral");
        System.out.println(p2);

        Estudiante p3 = new Estudiante(persona1, "Inge Software", 2023, 500);
        System.out.println(p3);
        p3.setNombre("Lex Said");
        System.out.println("Nombre: : " + p3.getNombre());
        System.out.println("Direccion : " + p3.getDireccion());
        System.out.println("Carrera : " + p3.getCarrera());
        System.out.println("Año : " + p3.getAño());
        System.out.println("Colegiatura : " + p3.getColegiatura());

        Apoyo apoyo1 = new Apoyo(p2, "Licenciatura", 1500);
        apoyo1.setPaga(2500);
        System.out.println("Nombre: : " + apoyo1.getNombre());
        System.out.println("Direccion : " + apoyo1.getDireccion());
        System.out.println("Escolaridad : " + apoyo1.getEscolaridad());
        System.out.println("paga : " + apoyo1.getPaga());

        Apoyo apoyo2 = new Apoyo("Sara", "Avenida san luis", "Secundaria", 1500);
        System.out.println(apoyo2);
        Estudiante estudiante2 = new Estudiante("EDgar", "Calle morelos", "Inge civil", 2023, 2000);
        System.out.println(estudiante2);
        

    }
}
