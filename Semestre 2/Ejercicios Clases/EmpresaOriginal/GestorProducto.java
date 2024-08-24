public class GestorProducto {
    private String nombreProducto;
    private double precio;
    private String correo;

    public GestorProducto(String nombreProducto, double precio, String correo) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.correo = correo;
    }

    public void actualizarDetallesProducto(String nuevoNombreProducto, double nuevoPrecio) {
        this.nombreProducto = nuevoNombreProducto;
        this.precio = nuevoPrecio;
        System.out.println("Detalles del producto actualizados.");
    }

    public double calcularPrecioDescuento(double porcentajeDescuento) {
        return precio - (precio * porcentajeDescuento / 100);
    }

    public void enviarNotificacionProducto(String mensaje) {
        System.out.println("Enviando correo a: " + correo + " con el mensaje: " + mensaje);
    }
}