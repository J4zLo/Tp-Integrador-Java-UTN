package TrabajoPractico;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");

        //Leer Archivo Partidos
        String miArchivoPartidos = "C:\\Users\\PC\\Documents\\GitHub\\Tp-Integrador-Java-UTN\\Partido.csv";
        Path ruta;
        List<String> lineasPartidos = null;
        try {
            ruta = Paths.get(miArchivoPartidos);
            lineasPartidos = Files.readAllLines(ruta);

        } catch (
                IOException e) {
            e.printStackTrace();
            for (String lineaArchivoPartido : lineasPartidos) {
                System.out.println(lineaArchivoPartido);
        }

        //Leer Archivo Pronosticos

        //Calcular los puntos y mostrar los resultados


        }
    }
}//Fin
