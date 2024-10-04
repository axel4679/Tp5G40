package ar.edu.unju.escmi.tp5.dominio;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private String isbn;
    private boolean estado; // true = disponible, false = no disponible

    public Libro(int id, String titulo, String autor, String isbn) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estado = true; // Disponible por defecto
    }

    public void mostrarDatos() {
        System.out.println("ID: " + id + ", Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn);
        System.out.println("Estado: " + (estado ? "Disponible" : "No disponible"));
    }

    public boolean isDisponible() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
