
import java.util.ArrayList;
import java.util.HashMap;

class AreaLocal {
    private String nombreArea;
    private ArrayList<Transaccion> listaTransacciones = new ArrayList<>();
    private HashMap<Integer,String> listaEmpleadosArea = new HashMap<>();

    public AreaLocal(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public ArrayList<Transaccion> getListaTransacciones() {
        return listaTransacciones;
    }

    public void setListaTransacciones(ArrayList<Transaccion> listaTransacciones) {
        this.listaTransacciones = listaTransacciones;
    }

    public HashMap<Integer, String> getEmpleadosArea() {
        return listaEmpleadosArea;
    }

    public void setEmpleadosArea(HashMap<Integer, String> empleadosArea) {
        this.listaEmpleadosArea = empleadosArea;
    }

    public void agregarEmpleadoArea(Empleado e){
        listaEmpleadosArea.put(e.getNumeroIdentidad(), e.getNombre());
    }
    
    public void eliminarEmpleado(Empleado e){
        listaEmpleadosArea.remove(e.getNumeroIdentidad());
    }
    
    public void verificarEmpleadoExisteArea(Empleado e){
        listaEmpleadosArea.containsKey(e.getNumeroIdentidad());
    }
}
