
package cl.llanquihuetour.model;

/**
 * Representa una ruta gastronómica.
 */
public class RutaGastronomica extends ServicioTuristico {

    private int numeroDeParadas;

    // Constructor vacío.
    public RutaGastronomica() {

    }

    // Constructor con parámetros.
    public RutaGastronomica(String nombre, int duracionHoras,
            int numeroDeParadas) {

        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    // Getter y Setter.
    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("=== RUTA GASTRONÓMICA ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Duración: " + getDuracionHoras() + " horas");
        System.out.println("Número de paradas: " + numeroDeParadas);
    }

    @Override
    public String toString() {

        return "RutaGastronomica{" +
                "nombre='" + getNombre() + '\'' +
                ", duracionHoras=" + getDuracionHoras() +
                ", numeroDeParadas=" + numeroDeParadas +
                '}';
    }
}