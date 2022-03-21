public class Persona {
    private String nombre;
    private String numeroIdentidad;

    public Persona() {
    }

    public Persona(String nombre, String numeroIdentidad) {
        this.nombre = nombre;
        this.numeroIdentidad = numeroIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public void setNumeroIdentidad(String numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
