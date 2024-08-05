package barberia;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Barberia {
    private int numeroMaximo = 10;
    private Queue<Cliente> listaClientes;
    private Cliente clienteActual;
    private List<Cliente> listaServidos;

    public Barberia() {
        this.listaClientes = new LinkedList<>();
        this.clienteActual = new Cliente(null);
        this.listaServidos = new ArrayList<>();
    }

    public void aniadirCliente(Cliente cliente){
        if (listaClientes.size() <= numeroMaximo) {
            listaClientes.add(cliente);
        } else {
            System.out.println("No hay lugar, por favor espere");
        }
    }

    public void atenderCliente(){
        if (!listaClientes.isEmpty()) {
            this.clienteActual = listaClientes.poll();
            clienteActual.setEstado("atendiendo");
            this.clienteActual.setEstado("Servido");
            this.listaServidos.add(this.clienteActual);
        } else {
            System.out.println("La lista está vacia");
        }
    }

    public void mostrarClientesEnEspera() {
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        if (listaClientes.isEmpty()) {
            System.out.println("No hay clientes en espera.");
        } else {
            System.out.println("Cliente servidos hoy:");
            for (Cliente cliente : listaServidos) {
                System.out.println(cliente.getNombre() + " " + cliente.getEstado());
            }
            System.out.println("Clientes en espera:");
            for (Cliente cliente : listaClientes) {
                System.out.println(cliente.getNombre() + " " + cliente.getEstado());
            }
        }
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
    }
}
