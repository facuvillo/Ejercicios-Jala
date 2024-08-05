import java.util.HashSet;

public class Estacion {
    private HashSet<Persona> personas;

    public Estacion() {
        personas = new HashSet<>();
    }

    public void add(Persona persona) {
        personas.add(persona);
    }

    public HashSet<Persona> getPersonas() {
        return personas;
    }

    public void mostrarPersonas(){
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
