public class Encuesta {
    private int calificacionTiempoEspera;
    private int calificacionCalidadServicio;
    private String comentarioAdicional;

    public Encuesta() {
    }

    public Encuesta(int calificacionTiempoEspera, int calificacionCalidadServicio, String comentarioAdicional) {
        this.calificacionTiempoEspera = calificacionTiempoEspera;
        this.calificacionCalidadServicio = calificacionCalidadServicio;
        this.comentarioAdicional = comentarioAdicional;
    }

    public int getCalificacionTiempoEspera() {
        return calificacionTiempoEspera;
    }

    public void setCalificacionTiempoEspera(int calificacionTiempoEspera) {
        this.calificacionTiempoEspera = calificacionTiempoEspera;
    }

    public int getCalificacionCalidadServicio() {
        return calificacionCalidadServicio;
    }

    public void setCalificacionCalidadServicio(int calificacionCalidadServicio) {
        this.calificacionCalidadServicio = calificacionCalidadServicio;
    }
    
    
    
    
}
