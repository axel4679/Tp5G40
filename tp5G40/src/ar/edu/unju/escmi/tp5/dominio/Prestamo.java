package ar.edu.unju.escmi.tp5.dominio;

import java.time.LocalDate;

public class Prestamo {
    private int id;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Libro libro;
    private Usuario usuario;

    public Prestamo(int id, LocalDate fechaPrestamo, Libro libro, Usuario usuario) {
        this.id = id;
        this.fechaPrestamo = fechaPrestamo;
        this.libro = libro;
        this.usuario = usuario;
        this.fechaDevolucion = null; // Null hasta que se devuelva el libro
    }

    public void registrarDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
        libro.setEstado(true); // El libro está disponible nuevamente
    }

    public void mostrarDatos() {
        System.out.println("ID Préstamo: " + id + ", Fecha Préstamo: " + fechaPrestamo);
        if (fechaDevolucion != null) {
            System.out.println("Fecha Devolución: " + fechaDevolucion);
        } else {
            System.out.println("Aún no devuelto");
        }
        System.out.println("Libro prestado:");
        libro.mostrarDatos();
        System.out.println("Usuario que realizó el préstamo:");
        usuario.mostrarDatos();
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

}
