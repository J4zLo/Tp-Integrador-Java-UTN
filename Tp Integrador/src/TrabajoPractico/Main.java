package TrabajoPractico;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Leer Archivo Partidos
        String miArchivoPartidos = "C:\\Users\\PC\\Desktop\\Trabajo integrador\\Partido.csv";
        Path ruta = Paths.get(miArchivoPartidos);
        List<String> lineasArchivoPartidos = null;
        try {
            lineasArchivoPartidos = Files.readAllLines(ruta);
        } catch (IOException e) {
            System.out.println("ERROR: No se pudo encontrar el archivo " + miArchivoPartidos);

        }
        for (String lineaArchivoPartido : lineasArchivoPartidos) {
          
        }System.out.println(lineasArchivoPartidos);

        //Leer Archivo Pronosticos

        //Calcular los puntos y mostrar los resultados

    }

}//Fin
