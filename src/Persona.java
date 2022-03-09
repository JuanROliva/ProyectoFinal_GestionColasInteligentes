public class Persona {
    private String nombre;
    private int numeroIdentidad;

    public Persona() {
    }

    public Persona(String nombre, int numeroIdentidad) {
        this.nombre = nombre;
        this.numeroIdentidad = numeroIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public void setNumeroIdentidad(int numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
