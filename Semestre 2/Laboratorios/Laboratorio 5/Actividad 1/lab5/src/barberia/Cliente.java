package barberia;
public class Cliente {
    private String nombre;
    private String estado;

    public Cliente(String nombreCliente) {
        this.nombre = nombreCliente;
        this.estado = "En espera";
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getEstado() {
        return estado;
    }
    public String getNombre() {
        return nombre;
    }
}
