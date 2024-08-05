
import java.util.Date;

public class Notificacion {
    private int idNotificacion;
    private String mensaje;
    private Date fecha;
    private Usuario usuario; // Usuario que recibe la notificación

    // Constructor
    public Notificacion(int idNotificacion, String mensaje, Usuario usuario) {
        this.idNotificacion = idNotificacion;
        this.mensaje = mensaje;
        this.fecha = new Date(); // Fecha actual
        this.usuario = usuario;
    }

    // Métodos de acceso (Getters y Setters)
    public int getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(int idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // Método para enviar notificación
    public void enviarNotificacion() {
        // Lógica para enviar notificación
        System.out.println("Notificación enviada a " + usuario.getNombre() + ": " + mensaje);
    }

    @Override
    public String toString() {
        return "Notificacion{" +
                "idNotificacion=" + idNotificacion +
                ", mensaje='" + mensaje + '\'' +
                ", fecha=" + fecha +
                ", usuario=" + usuario.getNombre() +
                '}';
    }
}
