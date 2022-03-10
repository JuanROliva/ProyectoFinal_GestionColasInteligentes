public class DescripcionLocal {
    private String nombreLocal;
    private Ubicacion ubicacionLocal;
    private int codigoLocal;

    public DescripcionLocal() {
    }

    public DescripcionLocal(String nombreLocal, Ubicacion ubicacionLocal, int codigoLocal) {
        this.nombreLocal = nombreLocal;
        this.ubicacionLocal = ubicacionLocal;
        this.codigoLocal = codigoLocal;
    }

    public String getNombreLocal() {
        return nombreLocal;
    }

    public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }

    public Ubicacion getUbicacionLocal() {
        return ubicacionLocal;
    }

    public void setUbicacionLocal(Ubicacion ubicacionLocal) {
        this.ubicacionLocal = ubicacionLocal;
    }

    public int getCodigoLocal() {
        return codigoLocal;
    }

    public void setCodigoLocal(int codigoLocal) {
        this.codigoLocal = codigoLocal;
    }

    @Override
    public String toString() {
        return nombreLocal;
    }
}
