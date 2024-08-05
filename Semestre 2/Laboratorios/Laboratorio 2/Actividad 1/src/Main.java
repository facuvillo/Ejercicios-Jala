
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Date fechaVencimiento1 = new Date(System.currentTimeMillis() + 86400000); // 1 día a partir de ahora
        Date fechaVencimiento2 = new Date(System.currentTimeMillis() + 172800000); // 2 días a partir de ahora
        Date fechaVencimiento3 = new Date(System.currentTimeMillis() + 259200000); // 3 días a partir de ahora


        Usuario usuario1 = new Usuario(1, "Facundo", "facundo@gmail.com", "prueba1234");
        Usuario usuario2 = new Usuario(2, "Martin", "martin@gmail.com", "prueba1234");
        Usuario usuario3 = new Usuario(3, "Nayla", "nayla@gmail.com", "prueba1234");

        Tarea tarea1 = new Tarea(1,"Cocinar", "cocinar pizza", fechaVencimiento1, "media");
        Tarea tarea2 = new Tarea(2,"Trabajo Practico", "Hacer Trabajo de Historia", fechaVencimiento2, "alta");
        Tarea tarea3 = new Tarea(3,"Reordenar cajas", "Reordenar cajas de la cocina", fechaVencimiento3, "baja");

        Equipo equipo1 = new Equipo(1, "Equipo 1");

        // Agregando tareas a usuario 1
        usuario1.agregarTarea(tarea1);
        usuario1.agregarTarea(tarea2);

        // Agregando tarea a usuario 2
        usuario2.agregarTarea(tarea3);

        //Agregando tareas a usuario 3
        usuario3.agregarTarea(tarea1);
        usuario3.agregarTarea(tarea2);
        usuario3.agregarTarea(tarea3);

        //Agregando miembros del equipo
        equipo1.agregarUsuario(usuario1);
        equipo1.agregarUsuario(usuario2);
        equipo1.agregarUsuario(usuario3);

        // Crear dependencias
        Dependencia dependencia1 = new Dependencia(1,tarea1,tarea2);

        dependencia1.mostrarDependencia();

        //Crear NOtificación
        Notificacion notificacion1 = new Notificacion(1,"Hace la tarea", usuario1);

        notificacion1.enviarNotificacion();

        equipo1.mostrarDatos();

        //verificar tareas de un usuario
        usuario1.verTareas();
    }
}
