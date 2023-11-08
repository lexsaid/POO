import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class _p138_ArchivoMaterias {
    
public static void escribirmaterias(ArrayList<String> datos){
        String dato="";

        System.out.print("Introduce las materias cursadas (separadas por comas): ");
        while(true) {
            dato = new Scanner(System.in).nextLine();
            if(!dato.isEmpty()) 
                datos.add(dato);
            else break;
        }
        
    }

    public static void grabarmaterias(String archivo, ArrayList<String> materias) throws IOException {
        BufferedWriter farch = new BufferedWriter(new FileWriter(new File(archivo)));
        for (String materia : materias) {
            farch.write(materia);
            farch.newLine();
        }
        farch.close();
    }

    public static ArrayList<String> leermaterias(String archivo) throws IOException{
        ArrayList<String> datos = new ArrayList<>();

        BufferedReader fdatos = new BufferedReader(new FileReader(new File(archivo)));

        String dato;
        while((dato=fdatos.readLine())!=null){
            datos.add(dato);
        }

        fdatos.close();
        return datos;
    }

    public static void main(String[] args) {
        
        String archivo = "materias.txt";
        ArrayList<String> Materias = new ArrayList<>(), lasmaterias = new ArrayList<>();
        
        escribirmaterias(Materias);

        try {
            grabarmaterias(archivo, Materias);
            lasmaterias = leermaterias(archivo);
            System.out.println("ya esta echo \n"+ Materias);

        } catch (IOException e) {
            System.out.println("Problemas al escribir los datos en el archivo.");
        }


    }

}
