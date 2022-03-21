
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Cita {
    private int numeroCita;
    private String identidadPersona;
    private int codigoLocal;
    private int codigoArea;
    private Date horaRealizacionCita;
    private Date FechayhoraCita;
    private boolean citaRelializadaLinea;
    private int tiempoEsperaMinutos;
    ArrayList<Transaccion> listaTransaccionesRealizar = new ArrayList<>();

    public Cita() {
    }

    public Cita(int numeroCita, String identidadPersona, int codigoLocal, int codigoArea, Date horaRealizacionCita, Date FechayhoraCita, boolean citaRelializadaLinea, int tiempoEsperaMinutos) {
        this.numeroCita = numeroCita;
        this.identidadPersona = identidadPersona;
        this.codigoLocal = codigoLocal;
        this.codigoArea = codigoArea;
        this.horaRealizacionCita = horaRealizacionCita;
        this.FechayhoraCita = FechayhoraCita;
        this.citaRelializadaLinea = citaRelializadaLinea;
        this.tiempoEsperaMinutos = tiempoEsperaMinutos;
    }

    public int getNumeroCita() {
        return numeroCita;
    }

    public void setNumeroCita(int numeroCita) {
        this.numeroCita = numeroCita;
    }

    public String getIdentidadPersona() {
        return identidadPersona;
    }

    public void setIdentidadPersona(String identidadPersona) {
        this.identidadPersona = identidadPersona;
    }

    public int getCodigoLocal() {
        return codigoLocal;
    }

    public void setCodigoLocal(int codigoLocal) {
        this.codigoLocal = codigoLocal;
    }

    public int getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(int codigoArea) {
        this.codigoArea = codigoArea;
    }

    public Date getHoraRealizacionCita() {
        return horaRealizacionCita;
    }

    public void setHoraRealizacionCita(Date horaRealizacionCita) {
        this.horaRealizacionCita = horaRealizacionCita;
    }

    public Date getFechayhoraCita() {
        return FechayhoraCita;
    }

    public void setFechayhoraCita(Date FechayhoraCita) {
        this.FechayhoraCita = FechayhoraCita;
    }

    public boolean isCitaRelializadaLinea() {
        return citaRelializadaLinea;
    }

    public void setCitaRelializadaLinea(boolean citaRelializadaLinea) {
        this.citaRelializadaLinea = citaRelializadaLinea;
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
        SimpleDateFormat sdf = new SimpleDateFormat("E de dd MMMM del yyyy hh:mm");
        return sdf.format(FechayhoraCita);
    }
}
