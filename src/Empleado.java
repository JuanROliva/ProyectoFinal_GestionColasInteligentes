class Empleado extends Persona{

    private String areaAsignado;

    public Empleado() {
        super();
    }

    public Empleado(String nombre, int numeroIdentidad) {
        super(nombre, numeroIdentidad);
    }

    public Empleado(String areaAsignado, String nombre, int numeroIdentidad) {
        super(nombre, numeroIdentidad);
        this.areaAsignado = areaAsignado;
    }

    public String getAreaAsignado() {
        return areaAsignado;
    }

    public void setAreaAsignado(String areaAsignado) {
        this.areaAsignado = areaAsignado;
    }
    
}
