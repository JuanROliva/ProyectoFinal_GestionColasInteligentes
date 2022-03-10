public class TipoTransaccion {
    private String tipoTransaccion;

    public TipoTransaccion() {
    }

    public TipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    @Override
    public String toString() {
        return tipoTransaccion;
    }
}
