public interface Planeta {

    String getNombre();

    double getTamano();

    double getDistanciaSol();

    int getNumeroLunas();
    double getDensidad();
    double getGravedad();
    boolean getTieneAnillos();

    String getTipo();

    double calcularAnio();

    int compararPorTamano(Planeta otro);

    int compararPorDistancia(Planeta otro);
    double compararPorGravedad(Planeta otro);
    double compararPorDensidad(Planeta otro);
    double calcularVelocidadOrbital();
}
