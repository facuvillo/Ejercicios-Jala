

import java.util.*;

public class Tarea {
    private int idTarea;
    private String titulo;
    private String descripcion;
    private Date fechaCreacion;
    private Date fechaVencimiento;
    private String prioridad; // baja, media, alta
    private String estado; // pendiente, en progreso, completada
    private Usuario asignado; // Usuario asignado a la tarea

    // Constructor
    public Tarea(int idTarea, String titulo, String descripcion, Date fechaVencimiento, String prioridad) {
        this.idTarea = idTarea;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = new Date(); // Fecha actual
        this.fechaVencimiento = fechaVencimiento;
        this.prioridad = prioridad;
        this.estado = "pendiente"; // Estado inicial
    }

    // Métodos de acceso (Getters y Setters)
    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getAsignado() {
        return asignado;
    }

    public void setAsignado(Usuario asignado) {
        this.asignado = asignado;
    }

    // Métodos para gestionar la tarea
    public void actualizarTarea(String titulo, String descripcion, Date fechaVencimiento, String prioridad) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaVencimiento = fechaVencimiento;
        this.prioridad = prioridad;
    }

    public void completarTarea() {
        this.estado = "completada";
    }

    public void mostrarDatos(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "idTarea=" + idTarea +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaVencimiento=" + fechaVencimiento +
                ", prioridad='" + prioridad + '\'' +
                ", estado='" + estado + '\'' +
                ", asignado=" + (asignado != null ? asignado.getNombre() : "No asignado") +
                '}';
    }
}
