

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private String email;
    private String contraseña;
    private List<Tarea> tareas; // Lista de tareas asignadas al usuario

    // Constructor
    public Usuario(int idUsuario, String nombre, String email, String contraseña) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.tareas = new ArrayList<>();
    }

    // Métodos de acceso (Getters y Setters)
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void agregarTarea(Tarea tarea) {
        this.tareas.add(tarea);
    }

    public void eliminarTarea(Tarea tarea) {
        this.tareas.remove(tarea);
    }

    // Métodos para iniciar y cerrar sesión
    public void iniciarSesion() {
        // Lógica de inicio de sesión
        System.out.println(nombre + " ha iniciado sesión.");
    }

    public void cerrarSesion() {
        // Lógica de cierre de sesión
        System.out.println(nombre + " ha cerrado sesión.");
    }

    // Método para ver las tareas
    public void verTareas() {
        for (Tarea tarea : tareas) {
            System.out.println(tarea);
        }
    }
}