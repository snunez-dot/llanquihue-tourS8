
package cl.llanquihuetour.model;

/**
 * Representa una excursión cultural.
 */
public class ExcursionCultural extends ServicioTuristico {

    private String lugarHistorico;

    // Constructor vacío.
    public ExcursionCultural() {

    }

    // Constructor con parámetros.
    public ExcursionCultural(String nombre, int duracionHoras,
            String lugarHistorico) {

        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    // Getter y Setter.
    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("=== EXCURSIÓN CULTURAL ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Duración: " + getDuracionHoras() + " horas");
        System.out.println("Lugar histórico: " + lugarHistorico);
    }

    @Override
    public String toString() {

        return "ExcursionCultural{" +
                "nombre='" + getNombre() + '\'' +
                ", duracionHoras=" + getDuracionHoras() +
                ", lugarHistorico='" + lugarHistorico + '\'' +
                '}';
    }
}