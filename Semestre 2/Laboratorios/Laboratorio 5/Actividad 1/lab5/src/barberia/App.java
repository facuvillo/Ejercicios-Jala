package barberia;


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entradaMenu = new Scanner(System.in);
        String opcionUsuario;
        Barberia barberia = new Barberia();

        do {
            System.out.println("================================================");
            System.out.println("\n1. Agregar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Mostrar clientes en espera");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcionUsuario = entradaMenu.nextLine();

            switch (opcionUsuario) {
                case "1":
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = entradaMenu.nextLine();
                    barberia.aniadirCliente(new Cliente(nombre));
                    break;
                case "2":
                    barberia.atenderCliente();
                    break;
                case "3":
                    barberia.mostrarClientesEnEspera();
                    break;
                case "4":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }

        }while(!opcionUsuario.equals("4"));

        barberia.aniadirCliente(new Cliente("Facundo"));

        barberia.mostrarClientesEnEspera();
        
    }
}
