


public class Main {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();


        gestor.agregarTarea(new Tarea("Tutoría - clase1"));
        gestor.agregarTarea(new Tarea("Formación - resolver quiz"));
        gestor.agregarTarea(new Tarea("Soporte - Atender cliente"));
        gestor.agregarTarea(new Tarea("Evaluación - Atender entrevista"));



        gestor.marcarComoEnCursoFInalizar();


        gestor.mostrarTareas();
    }
}