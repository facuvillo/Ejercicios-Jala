class Tarea {
    private String nombre;
    private Estado estado;


    public Tarea(String nombre) {
        this.nombre = nombre;
        this.estado = Estado.PENDIENTE;
    }

    public String getNombre() {
        return nombre;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nombre + " - " + estado;
    }

    // Enumeración para los estados de la tarea
    public enum Estado {
        PENDIENTE, EN_CURSO, FINALIZADA
    }
}