

public class Cuadrado extends Rectangle{

    public Cuadrado(int lados){
        super("cuadrado",lados,lados);
    }

    @Override
    public void setPerimetro(){
        this.perimetro = (this.base*2)+(this.altura*2);
    }

    @Override
    public void setArea(){
        this.area = this.base*this.altura;
    }

    public void imprimirResultadosCuadrado(){
        System.out.println("Nombre: "+this.nombre+" | Perimetro"+this.perimetro+" | Area: "+String.format("%.2f", this.area));
    }

}
