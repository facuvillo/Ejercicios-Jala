public class ServicioPago {
    private PagoPayPal procesadorPago = new PagoPayPal();

    public void procesarPago(double cantidad) {
        procesadorPago.realizarPago(cantidad);
    }
}

class PagoPayPal {
    public void realizarPago(double cantidad) {
        System.out.println("Procesando pago de $" + cantidad + " vía PayPal.");
    }
}