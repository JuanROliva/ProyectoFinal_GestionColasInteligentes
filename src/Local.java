
import java.util.ArrayList;

public class Local {
    private DescripcionLocal descripcionLocal;
    private Ubicacion ubicacionLocal;
    private Gerente gerenteUnico;
    private ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
    private ArrayList<AreaLocal> listaAreas = new ArrayList<AreaLocal>();

    public Local() {
    }

    public Local(DescripcionLocal descripcionLocal, Ubicacion ubicacionLocal, Gerente gerenteUnico) {
        this.descripcionLocal = descripcionLocal;
        this.ubicacionLocal = ubicacionLocal;
        this.gerenteUnico = gerenteUnico;
    }

    public DescripcionLocal getDescripcionLocal() {
        return descripcionLocal;
    }

    public void setDescripcionLocal(DescripcionLocal descripcionLocal) {
        this.descripcionLocal = descripcionLocal;
    }

    public Ubicacion getUbicacionLocal() {
        return ubicacionLocal;
    }

    public void setUbicacionLocal(Ubicacion ubicacionLocal) {
        this.ubicacionLocal = ubicacionLocal;
    }

    public Gerente getGerenteUnico() {
        return gerenteUnico;
    }

    public void setGerenteUnico(Gerente gerenteUnico) {
        this.gerenteUnico = gerenteUnico;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<AreaLocal> getListaAreas() {
        return listaAreas;
    }

    public void setListaAreas(ArrayList<AreaLocal> listaAreas) {
        this.listaAreas = listaAreas;
    }
    
    @Override
    public String toString() {
        return descripcionLocal.toString();
    }
    
    //MA 
    
}
