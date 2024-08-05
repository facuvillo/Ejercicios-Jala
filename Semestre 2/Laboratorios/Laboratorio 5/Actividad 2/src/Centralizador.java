import java.util.HashSet;

public class Centralizador {
    private HashSet<Persona> personasCentralizadas;

    public Centralizador() {
        personasCentralizadas = new HashSet<>();
    }

    public void add(Estacion estacion) {
        personasCentralizadas.addAll(estacion.getPersonas());
    }

    public void iterate() {
        for (Persona persona : personasCentralizadas) {
            System.out.println(persona);
        }
    }
}
