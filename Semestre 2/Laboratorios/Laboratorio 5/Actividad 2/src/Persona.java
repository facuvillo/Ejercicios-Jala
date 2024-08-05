import java.util.Objects;

public class Persona {
    private String nombre;
    private int identificacion;
    private int edad;

    public Persona(String nombre, int identificacion, int edad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(identificacion, persona.identificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificacion);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", edad=" + edad +
                '}';
    }
}
