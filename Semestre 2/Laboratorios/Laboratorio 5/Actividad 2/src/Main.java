import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Setear estación 1
        Estacion c1 = new Estacion();
        c1.add(new Persona("Juan", 1252, 18));
        c1.add(new Persona("Raul", 2252, 18));
        c1.add(new Persona("Janeth", 1587, 18));
        c1.add(new Persona("Janeth", 1587, 18));

        // setear estación 2
        Estacion c2 = new Estacion();
        c2.add(new Persona("Juan", 1252, 18));
        c2.add(new Persona("Mery", 3225, 21));
        c2.add(new Persona("Jenny", 2557, 18));
        c2.add(new Persona("Janeth", 1587, 18));

        // setear estacion 2
        Estacion c3 = new Estacion();
        c3.add(new Persona("Julio", 2222, 18));
        c3.add(new Persona("Alex", 2558, 18));
        c3.add(new Persona("Janeth", 1587, 18));

        // Centralizar los datos
        Centralizador cent = new Centralizador();
        cent.add(c1);
        cent.add(c2);
        cent.add(c3);

        //Mostrar las lista de personas de las distintas estaciones y la centralizada


        System.out.println("Datos de C1:");
        c1.mostrarPersonas();
        System.out.println("");
        System.out.println("Datos de C2:");
        c2.mostrarPersonas();
        System.out.println("");
        System.out.println("Datos de C3:");
        c3.mostrarPersonas();
        System.out.println("");

        System.out.println("Datos procesados:");
        cent.iterate();

    }
}