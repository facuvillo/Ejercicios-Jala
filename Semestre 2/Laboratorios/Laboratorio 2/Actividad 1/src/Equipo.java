
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private int idEquipo;
    private String nombre;
    private List<Usuario> miembros; // Lista de usuarios en el equipo

    // Constructor
    public Equipo(int idEquipo, String nombre) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.miembros = new ArrayList<>();
    }

    // Métodos de acceso (Getters y Setters)
    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Usuario> getMiembros() {
        return miembros;
    }

    // Métodos para gestionar miembros del equipo
    public void agregarUsuario(Usuario usuario) {
        this.miembros.add(usuario);
    }

    public void eliminarUsuario(Usuario usuario) {
        this.miembros.remove(usuario);
    }

    public void verMiembros() {
        for (Usuario miembro : miembros) {
            System.out.println(miembro.getNombre());
        }
    }

    public void mostrarDatos(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "idEquipo=" + idEquipo +
                ", nombre='" + nombre + '\'' +
                ", miembros=" + miembros.size() +
                '}';
    }
}

