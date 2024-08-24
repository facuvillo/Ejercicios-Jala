import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

class Servidor {
    private PriorityQueue<Peticion> listaPrioridades;
    private LinkedList<Peticion> listaAuxiliar;
    private int tamanoPrioridades;

    public Servidor(int tamanoPrioridades) {
        this.tamanoPrioridades = tamanoPrioridades;
        this.listaPrioridades = new PriorityQueue<>(Comparator.comparingInt(p -> -p.prioridad));
        this.listaAuxiliar = new LinkedList<>();
    }

    public void recibirPeticion(Peticion peticion) {
        if (listaPrioridades.size() < tamanoPrioridades) {
            listaPrioridades.offer(peticion);
        } else {
            listaAuxiliar.addLast(peticion);
        }
    }

    public void imprimirListas() {
        System.out.println("Lista de prioridades:");
        listaPrioridades.forEach(System.out::println);

        System.out.println("\nLista auxiliar:");
        listaAuxiliar.forEach(System.out::println);
    }

    public void procesarPeticion() {
        System.out.println("-------------------------------------------------");
        if (!listaPrioridades.isEmpty()) {
            Peticion procesada = listaPrioridades.poll();
            System.out.println("Procesando: " + procesada);

            if (!listaAuxiliar.isEmpty()) {
                Peticion movida = listaAuxiliar.pollFirst();
                listaPrioridades.offer(movida);
                System.out.println("Petición "+movida+" movida de la lista auxiliar a la lista de prioridades.");
            }
        } else {
            System.out.println("No hay peticiones para procesar.");
        }
        System.out.println("-------------------------------------------------");
    }

    public void ejecutar() {
        imprimirListas();
        System.out.println("\n--- Empieza el procesamiento ---\n");
        while (!listaPrioridades.isEmpty() || !listaAuxiliar.isEmpty()) {
            procesarPeticion();
        }
        imprimirListas();
        System.out.println("\n--- Finaliza el procesamiento ---\n");
    }
}
