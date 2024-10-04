package ar.edu.unju.escmi.tp5.collections;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.escmi.tp5.dominio.Libro;
import ar.edu.unju.escmi.tp5.exceptions.LibroNoEncontradoException;

public class CollectionLibro {

    // La colección de libros es pública y estática
    public static List<Libro> libros = new ArrayList<>();

    // Método para agregar un nuevo libro a la colección
    public static void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro registrado con éxito.");
    }

    // Método para buscar un libro por su ID
    public static Libro buscarLibroPorId(int id) throws LibroNoEncontradoException {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        throw new LibroNoEncontradoException("Libro con ID " + id + " no encontrado.");
    }

    // Método para listar todos los libros
    public static void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
        } else {
            System.out.println("Lista de libros:");
            for (Libro libro : libros) {
                libro.mostrarDatos();
            }
        }
    }

    // Método para verificar si un libro está disponible
    public static boolean estaDisponible(int id) throws LibroNoEncontradoException {
        Libro libro = buscarLibroPorId(id);
        return libro.isDisponible();
    }
}
