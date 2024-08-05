import java.util.ArrayList;
import java.util.List;
import java.util.random.*;

public class Juego <T extends Pieza> {
    private int idJuego;
    private List<T> listaPiezas;
    private char tipoOrdenamiento;
    private int velociadad;

    public Juego(List<T> listaPiezas, int idJuego, char tipoOrdenamiento, int velociadad) {
        this.listaPiezas = new ArrayList<>();
        this.idJuego = idJuego;
        this.tipoOrdenamiento = tipoOrdenamiento;
        this.velociadad = velociadad;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public List<T> getListaPiezas() {
        return listaPiezas;
    }

    public void setListaPiezas(List<T> listaPiezas) {
        this.listaPiezas = listaPiezas;
    }

    public char getTipoOrdenamiento() {
        return tipoOrdenamiento;
    }

    public void setTipoOrdenamiento(char tipoOrdenamiento) {
        this.tipoOrdenamiento = tipoOrdenamiento;
    }

    public int getVelociadad() {
        return velociadad;
    }

    public void setVelociadad(int velociadad) {
        this.velociadad = velociadad;
    }

    private void generarPieza(){}

    public void agregarPieza(){}

    public void mostrarPantalla(){}

    
}
