

public class Rectangle extends FigurasGeometricas {

    public int base;
    public int altura;

    public Rectangle(String nombre, int base, int altura){
        super(nombre);
        this.altura = altura;
        this.base = base;
        setPerimetro();
        setArea();
    }

    @Override
    public void setPerimetro(){
        this.perimetro = (this.base*2)+(this.altura*2);
    }

    @Override
    public void setArea(){
        this.area = this.base*this.altura;
    }

    public void imprimirResultadosRectangulo(){
        System.out.println("Nombre: "+this.nombre+" | Perimetro"+this.perimetro+" | Area: "+String.format("%.2f", this.area));
    }

}
