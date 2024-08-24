public class ProcesadorOrdenes {
    public void procesarOrdenes(List<Orden> ordenes) {
        for (Orden orden : ordenes) {
            if (orden.getTipo().equals("Fisico")) {
                System.out.println("Procesando orden física.");
            } else if (orden.getTipo().equals("Digital")) {
                System.out.println("Procesando orden digital.");
            } else if (orden.getTipo().equals("Suscripcion")) {
                System.out.println("Procesando orden de suscripción.");
            }
        }
    }
}

class Orden {
    private String tipo;

    public Orden(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}