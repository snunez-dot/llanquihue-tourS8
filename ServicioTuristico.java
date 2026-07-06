
package cl.llanquihuetour.model;

/**
 * Representa un servicio turístico.
 */
public class ServicioTuristico {

    private String nombre;
    private int duracionHoras;

    // Constructor vacío.
    public ServicioTuristico() {

    }

    // Constructor con parámetros.
    public ServicioTuristico(String nombre, int duracionHoras) {

        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    // Getter y Setter.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    // Muestra la información del servicio.
    public void mostrarInformacion() {

        System.out.println("=== SERVICIO TURÍSTICO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Duración: " + duracionHoras + " horas");
    }

    @Override
    public String toString() {

        return "ServicioTuristico{" +
                "nombre='" + nombre + '\'' +
                ", duracionHoras=" + duracionHoras +
                '}';
    }
}