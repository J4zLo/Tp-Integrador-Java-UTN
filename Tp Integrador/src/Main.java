import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");
        String miArchivoPartidos = "C:\\Users\\PC\\Desktop\\Trabajo integrador\\Partido.csv";
        Path ruta;
        List<String> lineasPartidos = null;
        try {
            ruta = Paths.get(miArchivoPartidos);
            lineasPartidos = Files.readAllLines(ruta, StandardCharsets.UTF_8);

        } catch (
                IOException e) {
            e.printStackTrace();

        }
        for (String linea : lineasPartidos) {
            System.out.println(linea);

        }
    }
}
