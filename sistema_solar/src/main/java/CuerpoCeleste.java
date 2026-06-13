public abstract class CuerpoCeleste {

    protected String nombre;
    protected double tamano;
    protected double gravedad;
    protected double densidad;
    protected boolean tieneAnillos;

    protected CuerpoCeleste(String nombre, double tamano, double densidad, double gravedad, boolean tieneAnillos) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.densidad = densidad;
        this.gravedad = gravedad;
        this.tieneAnillos = tieneAnillos;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTamano() {
        return tamano;
    }

    public double getGravedad() {return gravedad;}

    public double getDensidad() {return densidad;}
    public boolean getTieneAnillos(){return tieneAnillos;}

    @Override
    public String toString() {
        return nombre + " (radio: " + String.format("%.0f", tamano) + " km)";
    }


}
