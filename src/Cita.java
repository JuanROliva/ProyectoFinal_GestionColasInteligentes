
import java.util.ArrayList;
import java.util.Date;

public class Cita {
    private Persona solicitante;
    private Local localSeleccionado;
    private AreaLocal areaSeleccionada;
    private Date horaRealizacionCita;
    private Date horaCita;
    private boolean citaAgendaAnticipadamente;
    private int tiempoEsperaMinutos;
    ArrayList<Transaccion> listaTransaccionesRealizar = new ArrayList<>();

    public Cita() {
    }

    public Cita(Persona solicitante, Local localSeleccionado, AreaLocal areaSeleccionada, Date horaRealizacionCita, Date horaCita, boolean citaAgendaAnticipadamente, int tiempoEsperaMinutos) {
        this.solicitante = solicitante;
        this.localSeleccionado = localSeleccionado;
        this.areaSeleccionada = areaSeleccionada;
        this.horaRealizacionCita = horaRealizacionCita;
        this.horaCita = horaCita;
        this.citaAgendaAnticipadamente = citaAgendaAnticipadamente;
        this.tiempoEsperaMinutos = tiempoEsperaMinutos;
    }

    public Persona getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Persona solicitante) {
        this.solicitante = solicitante;
    }

    public Local getLocalSeleccionado() {
        return localSeleccionado;
    }

    public void setLocalSeleccionado(Local localSeleccionado) {
        this.localSeleccionado = localSeleccionado;
    }

    public AreaLocal getAreaSeleccionada() {
        return areaSeleccionada;
    }

    public void setAreaSeleccionada(AreaLocal areaSeleccionada) {
        this.areaSeleccionada = areaSeleccionada;
    }

    public Date getHoraRealizacionCita() {
        return horaRealizacionCita;
    }

    public void setHoraRealizacionCita(Date horaRealizacionCita) {
        this.horaRealizacionCita = horaRealizacionCita;
    }

    public Date getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(Date horaCita) {
        this.horaCita = horaCita;
    }
    
    public boolean isCitaAgendaAnticipadamente() {
        return citaAgendaAnticipadamente;
    }

    public void setCitaAgendaAnticipadamente(boolean citaAgendaAnticipadamente) {
        this.citaAgendaAnticipadamente = citaAgendaAnticipadamente;
    }

    public int getTiempoEsperaMinutos() {
        return tiempoEsperaMinutos;
    }

    public void setTiempoEsperaMinutos(int tiempoEsperaMinutos) {
        this.tiempoEsperaMinutos = tiempoEsperaMinutos;
    }

    public ArrayList<Transaccion> getListaTransaccionesRealizar() {
        return listaTransaccionesRealizar;
    }

    public void setListaTransaccionesRealizar(ArrayList<Transaccion> listaTransaccionesRealizar) {
        this.listaTransaccionesRealizar = listaTransaccionesRealizar;
    }
    
    public String tipoCita(){
        if(listaTransaccionesRealizar.size()>1){
            return "Multitrámite";
        }
        if (listaTransaccionesRealizar.size()==1) {
            return "Transaccion Unica";
        }
        return "Error, no se han definido transacciones";
    }

    @Override
    public String toString() {
        return solicitante.getNombre() + " " + tipoCita();
    }
}
