package Act3;

import java.util.LinkedList;
import java.util.Queue;


enum Materia {
    MATEMATICAS,
    CIENCIA,
    MUSICA,
    GIMNASIA
}


abstract class Profesor {
    protected Materia materiaActual;

    public abstract void ensenhar();
}


class Titular extends Profesor {
    public Titular(Materia materia) {
        this.materiaActual = materia;
    }

    @Override
    public void ensenhar() {
        if (materiaActual != null) {
            System.out.println("Dictando " + materiaActual.toString().toLowerCase());
        } else {
            System.out.println("No hay materia asignada.");
        }
    }
}


class Suplente extends Profesor {
    private Queue<Materia> materiasAsignadas;

    public Suplente() {
        this.materiasAsignadas = new LinkedList<>();
    }

    public void asignar(Materia materia) {
        materiasAsignadas.offer(materia);
    }

    @Override
    public void ensenhar() {
        if (!materiasAsignadas.isEmpty()) {
            materiaActual = materiasAsignadas.poll();
            System.out.println("Dictando " + materiaActual.toString().toLowerCase());
        } else {
            System.out.println("No hay materias asignadas.");
        }
    }
}


public class SistemaEducativo {
    public static void main(String[] args) {
        
        Titular profesorTitular = new Titular(Materia.CIENCIA);
        profesorTitular.ensenhar(); 
        
        Suplente profesorSuplente = new Suplente();
        profesorSuplente.asignar(Materia.CIENCIA);
        profesorSuplente.asignar(Materia.GIMNASIA);
        profesorSuplente.asignar(Materia.MUSICA);

        profesorSuplente.ensenhar(); 
        profesorSuplente.ensenhar(); 
        profesorSuplente.ensenhar(); 
    }
}
