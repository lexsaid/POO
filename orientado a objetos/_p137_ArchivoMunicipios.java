import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class _p137_ArchivoMunicipios {
    
    public static void main(String[] args) {
        
        File arch= new File("deportes.txt");
        String[] Deportes = {"futbol", "Béisbol", "Ciclismo", "Atletimso", "Natación", "Motociclismo"};

        try{
            System.out.println("ya esta");
            BufferedWriter fDeportes = new BufferedWriter(new FileWriter(arch));
            for (String deportes : Deportes){
                fDeportes.write(deportes+" ");
            }
            fDeportes.close();

            BufferedReader reader = new BufferedReader(new FileReader(arch));
            String line;
            System.out.println("Contenido del archivo:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();


        }catch(Exception e){
            System.out.println("Problemas al procesar el archivo..");
        }

    }

}
