package TrabajoPractico;

public class Pronostico {
    private Partido partido;
    private Equipo equipo;
    private String resultadoProno;

    //Metodo de puntos
    public Pronostico(Partido partido, Equipo equipo, String resultadoProno) {
        this.partido = partido;
        this.equipo = equipo;
        this.resultadoProno = resultadoProno;
    }
    //Getters
    public Partido getPartido() {
        return this.partido;
    }
    public Equipo getEquipo() {
        return this.equipo;
    }
    public String getResultadoProno() {
        return this.resultadoProno;
    }

    public int puntos(){
        String resultadoPartido = this.partido.resultadoPartido(this.equipo);
        if(this.resultadoProno.equals(resultadoPartido)){
            return 1;
        } else {
        }
        return 0;

    }
}//Fin
