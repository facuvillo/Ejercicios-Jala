

public class Dependencia {
    private int idDependencia;
    private Tarea tareaBase; // Tarea que debe completarse
    private Tarea tareaDependiente; // Tarea que depende de la tarea base

    // Constructor
    public Dependencia(int idDependencia, Tarea tareaBase, Tarea tareaDependiente) {
        this.idDependencia = idDependencia;
        this.tareaBase = tareaBase;
        this.tareaDependiente = tareaDependiente;
    }

    // Métodos de acceso (Getters y Setters)
    public int getIdDependencia() {
        return idDependencia;
    }

    public void setIdDependencia(int idDependencia) {
        this.idDependencia = idDependencia;
    }

    public Tarea getTareaBase() {
        return tareaBase;
    }

    public void setTareaBase(Tarea tareaBase) {
        this.tareaBase = tareaBase;
    }

    public Tarea getTareaDependiente() {
        return tareaDependiente;
    }

    public void setTareaDependiente(Tarea tareaDependiente) {
        this.tareaDependiente = tareaDependiente;
    }

    // Método para mostrar la relación de dependencia
    public void mostrarDependencia() {
        System.out.println("La tarea '" + tareaDependiente.getTitulo() +
                "' depende de la tarea '" + tareaBase.getTitulo() + "'");
    }

    @Override
    public String toString() {
        return "Dependencia{" +
                "idDependencia=" + idDependencia +
                ", tareaBase=" + tareaBase.getTitulo() +
                ", tareaDependiente=" + tareaDependiente.getTitulo() +
                '}';
    }
}
