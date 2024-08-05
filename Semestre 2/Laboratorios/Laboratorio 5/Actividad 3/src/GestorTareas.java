import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class GestorTareas {
    private Queue<Tarea> tareas;
    private List<Tarea> listaCompletadas;
    private Tarea tareaActual;

    public GestorTareas() {
        tareas = new LinkedList<>();
        listaCompletadas = new ArrayList<>();
        tareaActual = new Tarea(null);
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void marcarComoEnCursoFInalizar() {
        if (!tareas.isEmpty()) {
            tareaActual = tareas.poll();
            tareaActual.setEstado(Tarea.Estado.EN_CURSO);

            listaCompletadas.add(tareaActual);
            mostrarTareas();
            tareaActual.setEstado(Tarea.Estado.FINALIZADA);

        }
    }

    public void mostrarTareas() {
        System.out.println("");
        System.out.println("Completadas o en curso:");
        for (Tarea tarea : listaCompletadas) {
            System.out.println(tarea);
        }
        System.out.println("");
        System.out.println("Restantes");
        for (Tarea tarea : tareas) {
            System.out.println(tarea);
        }
    }
}
