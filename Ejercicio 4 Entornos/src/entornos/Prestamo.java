package entornos;

import java.util.List;

public class Prestamo {
    static List<Prestamo> prestamos;
    public static void recorrerPrestamo(List<Prestamo> prestamos) {
        for (Prestamo p: Prestamo.prestamos) {
            System.out.println(p);
        }
    }
}
