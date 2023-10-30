package _p120_Vehiculo;

public class App {
    
    public static void main(String[] args) {
        
        Sedan mimamalon= new Sedan("Caliber", "Lex (talli)", 5);
        System.out.println(mimamalon);
        mimamalon.SistemaElectrico();
        mimamalon.CombustionInterna();
        mimamalon.CarroceriaTres();
        mimamalon.ChasisMonocasco();
        mimamalon.repostar();
        mimamalon.arrancar();
        mimamalon.frenar();

        System.out.println(" ");
    
        Suv trocona= new Suv("Ram", "pal n4rc0", 8);
        System.out.println(trocona);
        trocona.SistemaElectrico();
        trocona.CombustionInterna();
        trocona.Traccion4x4();;
        trocona.ChasisIndependiente();
        trocona.repostar();
        trocona.arrancar();
        trocona.frenar();

    }

}
