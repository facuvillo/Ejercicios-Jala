


public class Circulo extends FigurasGeometricas {

    public float radio;

    public Circulo(String nombre, float radio){
        super(nombre);
        this.radio = radio;
        setArea();
        setPerimetro();
    }

    @Override
    public void setPerimetro(){
        this.perimetro = (this.radio*2)*Math.PI;
    }

    @Override
    public void setArea(){
        this.area = Math.PI * (Math.pow(this.radio, 2));
    }

    public void imprimirResultadosCirculo(){
        System.out.println("Nombre: "+this.nombre+" | Perimetro"+String.format("%.2f", this.perimetro)+" | Area: "+String.format("%.2f", this.area));
    }
}