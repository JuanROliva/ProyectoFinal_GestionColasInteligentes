public class EmpleadoNormal extends Empleado{
    private String areaAsignado;

    public EmpleadoNormal() {
        super();
    }

    public EmpleadoNormal(String areaAsignado, String usuario, String password, String nombre, String numeroIdentidad) {
        super(usuario, password, nombre, numeroIdentidad,true);
        this.areaAsignado = areaAsignado;
    }

    public String getAreaAsignado() {
        return areaAsignado;
    }

    public void setAreaAsignado(String areaAsignado) {
        this.areaAsignado = areaAsignado;
    }
    
}
