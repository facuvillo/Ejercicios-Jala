

public class ArchivoAdjunto {
    private int idArchivo;
    private String nombre;
    private String tipo; // Tipo de archivo (ej. .jpg, .pdf)
    private long tamaño; // Tamaño en bytes
    private Tarea tarea; // Tarea asociada al archivo

    // Constructor
    public ArchivoAdjunto(int idArchivo, String nombre, String tipo, long tamaño, Tarea tarea) {
        this.idArchivo = idArchivo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.tarea = tarea;
    }

    // Métodos de acceso (Getters y Setters)
    public int getIdArchivo() {
        return idArchivo;
    }

    public void setIdArchivo(int idArchivo) {
        this.idArchivo = idArchivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public long getTamaño() {
        return tamaño;
    }

    public void setTamaño(long tamaño) {
        this.tamaño = tamaño;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    @Override
    public String toString() {
        return "ArchivoAdjunto{" +
                "idArchivo=" + idArchivo +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tamaño=" + tamaño +
                " bytes, tarea=" + (tarea != null ? tarea.getTitulo() : "No asignada") +
                '}';
    }
}
