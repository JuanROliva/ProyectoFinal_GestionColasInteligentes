
import java.util.ArrayList;

public class Local {
    private DescripcionLocal descripcionLocal;
    private Gerente gerenteUnico;
    private ArrayList<Integer> listaEmpleados = new ArrayList<Integer>();
    private ArrayList<AreaLocal> listaAreas = new ArrayList<AreaLocal>();

    public Local() {
    }
    
    public Local(DescripcionLocal descripcionLocal) {
        this.descripcionLocal = descripcionLocal;
    }

    public Local(DescripcionLocal descripcionLocal, Ubicacion ubicacionLocal, Gerente gerenteUnico) {
        this.descripcionLocal = descripcionLocal;
        this.gerenteUnico = gerenteUnico;
    }

    public DescripcionLocal getDescripcionLocal() {
        return descripcionLocal;
    }

    public void setDescripcionLocal(DescripcionLocal descripcionLocal) {
        this.descripcionLocal = descripcionLocal;
    }

    public Gerente getGerenteUnico() {
        return gerenteUnico;
    }

    public void setGerenteUnico(Gerente gerenteUnico) {
        this.gerenteUnico = gerenteUnico;
    }

    public ArrayList<Integer> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Integer> listaEmpleados) {
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
    public Object [] getTablaDescrion(){
        Object [] vector = { descripcionLocal.getCodigoLocal(), 
                             descripcionLocal.getNombreLocal(),
                             descripcionLocal.getUbicacionLocal()};
        return vector;
    }
    
}
