class Empleado extends Persona{

    private String usuario;
    private String password;
    private int codigoLocal;
    private int codigoArea;
    private boolean activo;

    public Empleado() {
        super();
    }

    public Empleado(String usuario, String password, String nombre, String numeroIdentidad, boolean activo) {
        super(nombre, numeroIdentidad);
        this.usuario = usuario;
        this.password = password;
        this.activo = activo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    public boolean autentificacion(String usuario, String password){
        return this.usuario.equals(usuario)&& this.password.equals(password);
    }

}
