package TrabajoPractico;

public class Pronostico {
    private Partido partido;
    private Equipo equipo;
    private EnumResult resultadoProno;

    //Metodo de puntos
    public Pronostico(Partido partido, Equipo equipo, EnumResult resultadoProno) {
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
    public EnumResult getResultadoProno() {

        return this.resultadoProno;
    }

    public int puntos(){
        EnumResult resultadoPartido = this.partido.resultadoPartido(this.equipo);
        if(this.resultadoProno.equals(resultadoPartido)){
            return 1;
        } else {

            return 0;
        }
    }
}//Fin
