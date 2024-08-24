public interface Dispositivo {
    void imprimirDocumento();
    void escanearDocumento();
    void enviarFax();
    void copiarDocumento();
}

class ImpresoraBasica implements Dispositivo {
    @Override
    public void imprimirDocumento() {
        System.out.println("Imprimiendo documento.");
    }

    @Override
    public void escanearDocumento() {
        throw new UnsupportedOperationException("Escaneo no soportado.");
    }

    @Override
    public void enviarFax() {
        throw new UnsupportedOperationException("Fax no soportado.");
    }

    @Override
    public void copiarDocumento() {
        throw new UnsupportedOperationException("Copia no soportada.");
    }
}