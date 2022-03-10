
class Transaccion {
    private String nombreTransaccion;
    private int tiempoPromedio;
    private TipoTransaccion tipoTransaccion;

    public Transaccion() {
    }

    public Transaccion(String nombreTransaccion, int tiempoPromedio, TipoTransaccion tipoTransaccion) {
        this.nombreTransaccion = nombreTransaccion;
        this.tiempoPromedio = tiempoPromedio;
        this.tipoTransaccion = tipoTransaccion;
    }

    public String getNombreTransaccion() {
        return nombreTransaccion;
    }

    public void setNombreTransaccion(String nombreTransaccion) {
        this.nombreTransaccion = nombreTransaccion;
    }

    public int getTiempoPromedio() {
        return tiempoPromedio;
    }

    public void setTiempoPromedio(int tiempoPromedio) {
        this.tiempoPromedio = tiempoPromedio;
    }

    public TipoTransaccion getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(TipoTransaccion tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    @Override
    public String toString() {
        return nombreTransaccion;
    }
    
}
