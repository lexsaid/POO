package _p139_ArchivoEstudiante;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class app {
    
    public static void escribirDatos(String archivo, ArrayList<Estudiante> estudiantes) throws IOException {
        BufferedWriter farch = new BufferedWriter(new FileWriter(archivo));
        for (Estudiante estudiante : estudiantes) {
            farch.write(estudiante.Nombre + "," + estudiante.Edad + "," + estudiante.Sexo + "," + estudiante.Promedio);
            farch.newLine();
        }
        farch.close();
    }


    public static ArrayList<Estudiante> leerDatos(String archivo) throws IOException {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        BufferedReader fdatos = new BufferedReader(new FileReader(archivo));
        String linea;
        while ((linea = fdatos.readLine()) != null) {
            String[] partes = linea.split(",");
            estudiantes.add(new Estudiante(partes[0], Integer.parseInt(partes[1]), partes[2].charAt(0), Double.parseDouble(partes[3])));
        }
        fdatos.close();
        return estudiantes;
    }

    public static void promedios(ArrayList<Estudiante> estudiantes){

        double sumaCalificaciones = 0;
            for (Estudiante estudiante : estudiantes) {
                sumaCalificaciones += estudiante.Promedio;
            }
            double promedioCalificaciones = sumaCalificaciones / estudiantes.size();
            System.out.println("Promedio de calificaciones: " + promedioCalificaciones);

            // Calcular y mostrar el promedio de edades
            int sumaEdades = 0;
            for (Estudiante estudiante : estudiantes) {
                sumaEdades += estudiante.Edad;
            }
            double promedioEdades = (double) sumaEdades / estudiantes.size();
            System.out.println("Promedio de edades: " + promedioEdades);

            // Calcular y mostrar la cantidad de hombres y mujeres
            int cantidadHombres = 0;
            int cantidadMujeres = 0;
            for (Estudiante estudiante : estudiantes) {
                if (estudiante.Sexo == 'H') {
                    cantidadHombres++;
                } else if (estudiante.Sexo == 'M') {
                    cantidadMujeres++;
                }
            }
            System.out.println("Cantidad de hombres: " + cantidadHombres);
            System.out.println("Cantidad de mujeres: " + cantidadMujeres);

    }

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        String archivo = "estudiantes.txt";

        while (true) {
           
            System.out.print("Introduce el nombre del estudiante: ");
            String nombre = entrada.nextLine();

            System.out.print("Introduce la edad: ");
            int edad = entrada.nextInt();
            entrada.nextLine(); // Consumir el salto de línea

            System.out.print("Introduce el sexo (H para hombre, M para mujer): ");
            char sexo = entrada.nextLine().toUpperCase().charAt(0);

            System.out.print("Introduce la promedio: ");
            double promedio = entrada.nextDouble();
            entrada.nextLine(); // Consumir el salto de línea

            Estudiante estudiante = new Estudiante(nombre, edad, sexo, promedio);
            estudiantes.add(estudiante);

            System.out.println("quieres salir? (s/n)");
            char resp = entrada.nextLine().toUpperCase().charAt(0);
            if (resp == 'S') {
                break;
            }else{
                continue;
            }
        }

        try {
            escribirDatos(archivo, estudiantes);
            
        }catch (Exception e) {
            System.out.println("Problemas al procesar el archivo: " + e );
            
        }

        try {
            ArrayList<Estudiante> lasPersonas = leerDatos(archivo);
            System.out.println("Los datos leidos del archivo son:");
            lasPersonas.forEach(p -> System.out.println(p));
            System.out.println("Cantidad de estudiantes: " + lasPersonas.size());

            promedios(estudiantes);

        } catch (Exception e) {
            System.out.println("Problemas al preocesar el archivo.." + e);

        }

    }
}
