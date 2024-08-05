

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String name;
    private int grade;
    private List<String> courses;

    public Alumno(String name, int grade, String[] courses) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
        for (String course : courses) {
            this.courses.add(course.toLowerCase()); // Convertimos a minúsculas para consistencia
        }
    }

    // Setters y Getters del nombre
    public void setNombre(String nuevoNombre){
        this.name = nuevoNombre;
    }

    public String getNombre(){
        return name;
    }

    // Setters y Getters del grado
    public void setGrado(int grado){
        this.grade = grado;
    }

    public int getGrado(){
        return grade;
    }

    // Método para agregar un curso
    public void addCurso(String curso) {
        courses.add(curso);
    }

    public List<String> getCursos() {
        return courses;
    }

    public void mostrarDatosAlumno(){
        System.out.println("Nombre: "+this.name+", Grado: "+this.grade+", cursos: "+String.join(", ", courses));
    }
}
