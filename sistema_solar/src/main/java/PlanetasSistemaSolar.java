public class PlanetasSistemaSolar extends CuerpoCeleste implements Planeta {

    private static final double KM_POR_AU = 149_597_870.7;

    private double distanciaSol;
    private int numeroLunas;

    public PlanetasSistemaSolar(String nombre, double tamano, double distanciaSol,
                                int numeroLunas, double densidad, double gravedad,
                                boolean tieneAnillos) {
        super(nombre, tamano, densidad, gravedad, tieneAnillos);
        this.distanciaSol = distanciaSol;
        this.numeroLunas = numeroLunas;
    }

    @Override
    public double getDistanciaSol() {
        return distanciaSol;
    }

    @Override
    public int getNumeroLunas() {
        return numeroLunas;
    }

    @Override
    public String getTipo() {
        return "GASEOSO";
    }

    @Override
    public double getGravedad() {
        return gravedad;
    }
    @Override
    public double getDensidad() {
        return densidad;
    }

    @Override
    public boolean getTieneAnillos(){
        return tieneAnillos;
    }

    @Override
    public double calcularAnio() {
        double distanciaEnAU = distanciaSol / 149.6;

        return Math.pow(distanciaEnAU, 1.5);
    }

    @Override
    public int compararPorTamano(Planeta otro) {
        return Double.compare(this.getTamano(), otro.getTamano());
    }

    @Override
    public int compararPorDistancia(Planeta otro) {
        return Double.compare(this.getDistanciaSol(), otro.getDistanciaSol());
    }
    @Override
    public double compararPorGravedad(Planeta otro) {
        return Double.compare(this.gravedad, otro.getGravedad());
    }
    @Override
    public double compararPorDensidad(Planeta otro) {
        return Double.compare(this.densidad, otro.getDensidad());
    }
    @Override
    public double calcularVelocidadOrbital(){
        return 29.780 * Math.sqrt(
                149.6 / (distanciaSol));
    }
    @Override
    public String toString() {
        return super.toString()
                + ", distancia al Sol: " + String.format("%.0f", distanciaSol) + " km"
                + ", lunas: " + numeroLunas
                + ", tipo: " + getTipo()
                + ", densidad: " + getDensidad()
                + ", gravedad: " + getGravedad()
                + ", tiene anillos? : " + (getTieneAnillos() ? "Sí" : "No");
    }
}
