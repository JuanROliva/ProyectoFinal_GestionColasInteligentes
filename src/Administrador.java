public class Administrador extends Empleado{

    public Administrador() {
    }

    public Administrador(String usuario, String password, String nombre, String numeroIdentidad) {
        super(usuario, password, nombre, numeroIdentidad,true);
    }

}
