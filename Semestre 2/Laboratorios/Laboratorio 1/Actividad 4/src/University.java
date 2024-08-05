
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class University {

    private List<Alumno> alumnos;

    public University() {
        this.alumnos = new ArrayList<>();
    }

    public void addAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public void asignarCurso(int indexAlumno, String curso){
        if (indexAlumno < alumnos.size() && indexAlumno >= 0){
            alumnos.get(indexAlumno).addCurso(curso);
        }else {
            System.out.println("No es un indice valido");
        }
    }

    public void promoverCurso(int indexAlumno, int nuevoGrado){
        if (indexAlumno < alumnos.size() && indexAlumno >= 0){
            alumnos.get(indexAlumno).setGrado(nuevoGrado);
        }else {
            System.out.println("No es un indice valido");
        }
    }

    public void listarAlumnosCurso(String curso){
        //System.out.println(alumnos.stream().filter(alumno -> alumno.getCursos().contains(curso)).map(Alumno::getNombre).collect(Collectors.toList()));
    }

    public void mostrarAlumnos(){
        for (Alumno alumno : alumnos){
            alumno.mostrarDatosAlumno();
        }
    }

}
