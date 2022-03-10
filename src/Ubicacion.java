class Ubicacion {
    private int latitud;
    private int longitud;

    public Ubicacion() {
    }

    public Ubicacion(int latitud, int longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return  "Longitud: " + longitud + " Latitud: " + latitud;
    }
    
}
