package ar.edu.unju.escmi.tp5.collections;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unju.escmi.tp5.dominio.Usuario;
import ar.edu.unju.escmi.tp5.exceptions.UsuarioNoRegistradoException;

public class CollectionUsuario {

    // La colección de usuarios es pública y estática
    public static List<Usuario> usuarios = new ArrayList<>();

    // Método para agregar un nuevo usuario a la colección
    public static void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario registrado con éxito.");
    }

    // Método para buscar un usuario por su ID
    public static Usuario buscarUsuarioPorId(int id) throws UsuarioNoRegistradoException {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        throw new UsuarioNoRegistradoException("Usuario con ID " + id + " no registrado.");
    }

    // Método para listar todos los usuarios
    public static void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
        } else {
            System.out.println("Lista de usuarios:");
            for (Usuario usuario : usuarios) {
                usuario.mostrarDatos();
            }
        }
    }
}
