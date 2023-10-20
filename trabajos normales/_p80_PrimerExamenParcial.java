import java.util.Scanner;
import static java.lang.System.out;

public class _p80_PrimerExamenParcial {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int totaldinero=0, Palumnos=0, mujeres=0, hombres=0, Ptrabajadores=0, Pdocente=0, edad, totaledades=0, alumnos=0, docente=0, trabajadores=0, participantes=0;
        float promedad=0;
        String sexo, nombre, tipoparticipante;
        char respuestaF;


        do{

            do {
                out.println("\nnombre: ");
                nombre = obj.nextLine();
                out.println("sexo: (H/M) ");
                sexo = obj.nextLine();
                out.println("Tipo de participante: (A/D/T)");
                tipoparticipante = obj.nextLine();
                out.println("edad");
                edad = obj.nextInt();

                obj.nextLine();
    
                if (edad >= 18 && (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("H")) && (tipoparticipante.equalsIgnoreCase("A") || tipoparticipante.equalsIgnoreCase("D") || tipoparticipante.equalsIgnoreCase("T"))) {
                    out.println("Pasas");
                } else {
                    out.println("No pasas, verifica los datos ingresados.");
                }
            } while (edad < 18 || (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("H")) || (!tipoparticipante.equalsIgnoreCase("A") && !tipoparticipante.equalsIgnoreCase("D") && !tipoparticipante.equalsIgnoreCase("T")));
    
            participantes+=1;
            totaledades+=edad;
            promedad=(float)totaledades/participantes;

            if(tipoparticipante.equalsIgnoreCase("a")){
                Palumnos+=50;
                alumnos+=1;
            }else if(tipoparticipante.equalsIgnoreCase("d")){ 
                Pdocente+=80;
                docente+=1;
            }else if(tipoparticipante.equalsIgnoreCase("t")){
                Ptrabajadores+=60;
                trabajadores+=1;
            }
            totaldinero=Palumnos+Pdocente+Ptrabajadores;

            if(sexo.equalsIgnoreCase("H")){
                hombres+=1;
            }else if(sexo.equalsIgnoreCase("M")){
                mujeres+=1;
            }

            out.println(" ");
            out.println(String.format("total de alumnos: %d, dinero total de los alumnos: %d", alumnos, Palumnos));
            out.println(String.format("total de docentes: %d, dinero total de los docentes: %d", docente, Pdocente));
            out.println(String.format("total de trabajadores: %d, dinero total de los trabajadores: %d", trabajadores, Ptrabajadores));
            out.println(String.format("total de hombres: %d, ", hombres ));
            out.println(String.format("total de mujeres: %d, ", mujeres ));
            out.println(String.format("total de participantes: %d, ", participantes ));
            out.println(String.format("total de dinero ganado: %d, ", totaldinero ));
            out.println(String.format("Promedio edad: %.2f", promedad));
            
            out.println("\nquieres seguir intentando? (S/N)");
            respuestaF = Character.toUpperCase(obj.next().charAt(0));

            obj.nextLine();
        }while(respuestaF == 'S');

        if(totaldinero<100){
            out.println("el evento concluye con ganancias bajas");
        }else if(totaldinero>=100 && totaldinero<200){
            out.println("el evento concluye con ganancias moderadas");
        }else if(totaldinero>=200){
            out.println("el evento concluye con ganancias altas");
        }
        
    }

}
