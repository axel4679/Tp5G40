package ar.edu.unju.escmi.tp5.collections;
import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.escmi.tp5.dominio.Prestamo;
import ar.edu.unju.escmi.tp5.exceptions.LibroNoEncontradoException;

public class CollectionPrestamo {

    // La colección de préstamos es pública y estática
    public static List<Prestamo> prestamos = new ArrayList<>();

    // Método para agregar un nuevo préstamo a la colección
    public static void registrarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
        System.out.println("Préstamo registrado con éxito.");
    }

    // Método para buscar un préstamo por ID
    public static Prestamo buscarPrestamoPorId(int id) throws LibroNoEncontradoException {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getId() == id) {
                return prestamo;
            }
        }
        throw new LibroNoEncontradoException("Préstamo con ID " + id + " no encontrado.");
    }

    // Método para listar todos los préstamos
    public static void listarPrestamos() {
        if (prestamos.isEmpty()) {
            System.out.println("No hay préstamos registrados.");
        } else {
            System.out.println("Lista de préstamos:");
            for (Prestamo prestamo : prestamos) {
                prestamo.mostrarDatos();
            }
        }
    }
}