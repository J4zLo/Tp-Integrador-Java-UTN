package TrabajoPractico;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Leer Archivo Partidos String miArchivoPartidos = "C:\\Users\\PC\\Desktop\\Trabajo integrador\\Partido.csv";
        Path ruta = Paths.get(args[0]);
        List<String> lineasArchivoPartidos = null;
        List<Partido> partidos = new ArrayList<Partido>();

        try {
            lineasArchivoPartidos = Files.readAllLines(ruta);
        } catch (IOException e) {
            System.out.println("ERROR: No se pudo encontrar el archivo " + args[0]);
            System.exit(1);
        }
        //Agrego aux (boolean esEncabezado) para no leer el encabezado.
        // La variable la inicializo como true y automaticamente en la primer iteracion pasa a ser false.
        boolean esEncabezado = true;
        for (String lineaArchivoPartido : lineasArchivoPartidos) {
            //Si el encabezado es true entonces el encabezado se convierte en false
            if (esEncabezado) {
                esEncabezado = false;
            }
            //Si el encabezado no es true entonces imprimo por pantalla.
            else {
                String[] campos = lineaArchivoPartido.split(";");
                Equipo equipoLocal = new Equipo(campos[0]);
                Equipo equipoVisitante = new Equipo(campos[3]);
                Partido partido = new Partido(equipoLocal, equipoVisitante);
                partido.setGolesEquipoLocal(Integer.parseInt(campos[1]));
                partido.setGolesEquipoVisitante(Integer.parseInt(campos[2]));
                partidos.add(partido);
            }

        }

        //Leer Archivo Pronosticos String miArchivoPronosticos = "C:\\Users\\PC\\Desktop\\Trabajo integrador\\Pronostico.csv";
        Path ruta2 = Paths.get(args[1]);
        List<String> lineasArchivoPronosticos = null;
        int puntos = 0;

        try {
            lineasArchivoPronosticos = Files.readAllLines(ruta2);
        } catch (IOException e) {
            System.out.println("ERROR: No se pudo encontrar el archivo " + args[1]);
            System.exit(1);
        }
        esEncabezado = true;
        for (String lineaArchivoPronostico : lineasArchivoPronosticos) {
            //Si el encabezado es true entonces el encabezado se convierte en false
            if (esEncabezado) {
                esEncabezado = false;
            }
            //Si el encabezado no es true entonces imprimo por pantalla.
            else {
                String[] campos = lineaArchivoPronostico.split(";");
                Equipo equipo1 = new Equipo(campos[0]);
                Equipo equipo2 = new Equipo(campos[4]);
                Partido parti = null;

                for (Partido partidoCol : partidos) {
                    if (partidoCol.getEquipoLocal().getNombre().equals(equipo1.getNombre())
                            && partidoCol.getEquipoVisitante().getNombre().equals(equipo2.getNombre())) {
                        parti = partidoCol;
                    }
                }
                Equipo equipo = null;
                EnumResult resultado = null;
                if ("1".equals(campos[1])) {
                    equipo = equipo1;
                    resultado = EnumResult.GANADOR;
                }
                if ("1".equals(campos[2])) {
                    equipo = equipo1;
                    resultado = EnumResult.EMPATE;
                }
                if ("1".equals(campos[3])) {
                    equipo = equipo1;
                    resultado = EnumResult.PERDEDOR;
                }
                Pronostico pronostico = new Pronostico(parti, equipo, resultado);
                puntos += pronostico.puntos();
            }
        }
        System.out.println("Total de puntos obtenidos por el usuario: "+puntos);
      
    }
}