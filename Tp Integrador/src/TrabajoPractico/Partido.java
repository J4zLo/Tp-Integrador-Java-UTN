package TrabajoPractico;

public class Partido {
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int golesEquipoLocal;
    private int golesEquipoVisitante;


    //Constructor
    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipoLocal = equipo1;
        this.equipoVisitante = equipo2;
    }

    //Setters
    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipoLocal = golesEquipo1;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipoVisitante = golesEquipo2;
    }

    //Getters
    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public int getGolesEquipo1() {
        return golesEquipoLocal;
    }

    public int getGolesEquipo2() {
        return golesEquipoVisitante;
    }

    //Metodo Resultado
    public String resultadoPartido(Equipo equipo) {
        if (equipo.equals(equipoLocal)) {
            if (golesEquipoLocal > golesEquipoVisitante) {
                return "ganadorLocal";
            }
        }
        return "completar";
        //pendiente
    }
}//Fin

