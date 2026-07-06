package cl.llanquihuetour.ui;

import cl.llanquihuetour.data.GestorServicios;
import cl.llanquihuetour.model.ServicioTuristico;

public class Main {

    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();

        System.out.println("=== SERVICIOS TURÍSTICOS LLANQUIHUE TOUR ===");
        System.out.println();

        for (ServicioTuristico servicio : gestor.getServicios()) {

            servicio.mostrarInformacion();
            System.out.println();

        }
    }
}