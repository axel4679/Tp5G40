package ar.edu.unju.escmi.tp5.main;

import ar.edu.unju.escmi.tp5.collections.CollectionLibro;
import ar.edu.unju.escmi.tp5.dominio.Libro;
import ar.edu.unju.escmi.tp5.exceptions.LibroNoEncontradoException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Seleccione una opción:");
            System.out.println("1 - Registrar libro");
            System.out.println("2 - Registrar usuario");
            System.out.println("3 - Préstamo de libro");
            System.out.println("4 - Devolución de libro");
            System.out.println("5 - Listar libros");
            System.out.println("6 - Salir");

            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    // Opción 1: Registrar libro
                    System.out.println("Ingrese ID del libro:");
                    int id = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    System.out.println("Ingrese título del libro:");
                    String titulo = sc.nextLine();
                    System.out.println("Ingrese autor del libro:");
                    String autor = sc.nextLine();
                    System.out.println("Ingrese ISBN del libro:");
                    String isbn = sc.nextLine();
                    
                    Libro nuevoLibro = new Libro(id, titulo, autor, isbn);
                    CollectionLibro.agregarLibro(nuevoLibro);
                    break;

                case 5:
                    // Opción 5: Listar libros
                    CollectionLibro.listarLibros();
                    break;

                case 6:
                    // Opción 6: Salir
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }
}
