public class Gerente extends Empleado{
    
    public Gerente() {
        super();
    }

    public Gerente(String usuario, String password, String nombre, String numeroIdentidad) {
        super(usuario, password, nombre, numeroIdentidad,true);
    }
   
}
