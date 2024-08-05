public class Pieza {

    private String tipoPieza;
    private String posicion;
    private char color;
    private char valorPieza;

    public Pieza(String tipoPieza, String posicion, char color, char valorPieza) {
        this.tipoPieza = tipoPieza;
        this.posicion = posicion;
        this.color = color;
        this.valorPieza = valorPieza;
    }

    public String getTipoPieza() {
        return tipoPieza;
    }

    public void setTipoPieza(String tipoPieza) {
        this.tipoPieza = tipoPieza;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public char getValorPieza() {
        return valorPieza;
    }

    public void setValorPieza(char valorPieza) {
        this.valorPieza = valorPieza;
    }
}
