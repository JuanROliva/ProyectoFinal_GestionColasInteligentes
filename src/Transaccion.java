
class Transaccion {
    private String nombreTransaccion;
    private int tiempoPromedio;

    public Transaccion() {
    }

    public Transaccion(String nombreTransaccion, int tiempoPromedio) {
        this.nombreTransaccion = nombreTransaccion;
        this.tiempoPromedio = tiempoPromedio;
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

    @Override
    public String toString() {
        return nombreTransaccion;
    }
    
}
