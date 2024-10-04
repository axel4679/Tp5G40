package ar.edu.unju.escmi.tp5.dominio;

public class Alumno extends Usuario {
    private String curso;
    private String numeroLibreta;

    public Alumno(int id, String nombre, String apellido, String email, String curso, String numeroLibreta) {
        super(id, nombre, apellido, email);
        this.curso = curso;
        this.numeroLibreta = numeroLibreta;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + " " + apellido + ", Email: " + email);
        System.out.println("Curso: " + curso + ", Nº Libreta: " + numeroLibreta);
    }
}
