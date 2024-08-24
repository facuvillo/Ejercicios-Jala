
import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class Main {

    public static double calcularCostoTotal(double costoHabitacion) {
        return costoHabitacion;
    }

    public static void main(String[] args) {
        List<String> clientes = new ArrayList(List.of(new String[]{"Juan Pérez", "Ana López"}));
        List<Double> costosHabitaciones = new ArrayList(List.of(new Double[]{100.0, 150.0}));

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("1. Nuevo cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Editar costo de habitación");
            System.out.println("4. Ver cliente");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1: {
                    System.out.print("Ingresa el nombre del cliente: ");
                    String nombre = sc.nextLine();
                    clientes.add(nombre);
                    costosHabitaciones.add(0.0);
                    break;
                }
                case 2: {
                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println("Nombre: " + clientes.get(i) + ", Costo de Habitación: " + costosHabitaciones.get(i));
                    }
                    break;
                }
                case 3: {
                    System.out.print("Ingresa el índice del cliente: ");
                    int indice = Integer.parseInt(sc.nextLine());
                    System.out.print("Ingresa el nuevo costo de la habitación: ");
                    double costo = Double.parseDouble(sc.nextLine());
                    costosHabitaciones.set(indice, costo);
                    break;
                }
                case 4: {
                    System.out.print("Ingresa el índice del cliente: ");
                    int indice = Integer.parseInt(sc.nextLine());
                    System.out.println("Nombre: " + clientes.get(indice));
                    System.out.println("Costo de Habitación: " + costosHabitaciones.get(indice));
                    break;
                }
                default:
                    break;
            }
        }
    }
}