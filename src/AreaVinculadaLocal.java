public class AreaVinculadaLocal {
    private int codigoArea;
    private int codigoLocal;

    public AreaVinculadaLocal() {
    }
    
    public AreaVinculadaLocal(int codigoArea, int codigoLocal) {
        this.codigoArea = codigoArea;
        this.codigoLocal = codigoLocal;
    }

    public int getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(int codigoArea) {
        this.codigoArea = codigoArea;
    }

    public int getCodigoLocal() {
        return codigoLocal;
    }

    public void setCodigoLocal(int codigoLocal) {
        this.codigoLocal = codigoLocal;
    }
}
