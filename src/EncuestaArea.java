
import java.util.ArrayList;

public class EncuestaArea {
    private ArrayList<Encuesta> encuestaRecibidasArea = new ArrayList<>();
    private String nombreAreaLocal;
    private double promedioTiempoEspera;
    private double promedioCalidadServicio;

    public EncuestaArea() {
        this.promedioCalidadServicio = 0;
        this.promedioTiempoEspera = 0;
    }

    public EncuestaArea(String nombreAreaLocal) {
        this.nombreAreaLocal = nombreAreaLocal;
        this.promedioCalidadServicio = 0;
        this.promedioTiempoEspera = 0;
    }

    public ArrayList<Encuesta> getEncuestaArea() {
        return encuestaRecibidasArea;
    }

    public void setEncuestaArea(ArrayList<Encuesta> encuestaArea) {
        this.encuestaRecibidasArea = encuestaArea;
    }

    public String getNombreAreaLocal() {
        return nombreAreaLocal;
    }

    public void setNombreAreaLocal(String nombreAreaLocal) {
        this.nombreAreaLocal = nombreAreaLocal;
    }

    public double getPromedioTiempoEspera() {
        return promedioTiempoEspera;
    }
    
    public double getPromedioCalidadServicio() {
        return promedioCalidadServicio;
    }
    
    public void agregarEncuesta(Encuesta e){
        encuestaRecibidasArea.add(e);
    }
    
    public void calcularPromedio(){
        int cantidadEncuestaRecibidas = encuestaRecibidasArea.size();
        int sumaCalidad = 0, sumaTiempo = 0;
        for (Encuesta encuesta : encuestaRecibidasArea) {
            sumaCalidad += encuesta.getCalificacionCalidadServicio();
            sumaTiempo += encuesta.getCalificacionTiempoEspera();
        }
        this.promedioCalidadServicio = sumaCalidad / cantidadEncuestaRecibidas;
        this.promedioTiempoEspera = sumaTiempo / cantidadEncuestaRecibidas;
    }
}
