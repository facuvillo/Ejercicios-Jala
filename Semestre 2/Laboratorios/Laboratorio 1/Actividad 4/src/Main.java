

public class Main {
    public static void main(String[] args) {

        University universidad = new University();

        Alumno estudiante1 = new Alumno("Fernado", 1,  new String[]{"induction"});
        Alumno estudiante2 = new Alumno("Facundo", 1,  new String[]{"matematicas"});
        Alumno estudiante3 = new Alumno("Flor", 1,  new String[]{"induction"});


        universidad.addAlumno(estudiante1);
        universidad.addAlumno(estudiante2);
        universidad.addAlumno(estudiante3);

        System.out.println("--------------------------------------------------------------");

        //Metodo de asignar un nuevo curso
        System.out.println(estudiante3.getCursos());
        universidad.asignarCurso(2,"sciance");
        System.out.println(estudiante3.getCursos());

        System.out.println("--------------------------------------------------------------");

        //Metodo para promover un grado a un alumno
        System.out.println(estudiante2.getGrado());
        universidad.promoverCurso(1,2);
        System.out.println(estudiante2.getGrado());

        System.out.println("--------------------------------------------------------------");

        //Metodo para filtar por materia
        universidad.listarAlumnosCurso("induction");

        System.out.println("--------------------------------------------------------------");

        //Metodo para mostrar todos los alumnos
        universidad.mostrarAlumnos();

    }
}
