

public class Triangulos{

    public String nombre;
    public float base;
    public float ladoIzquierda;
    public float ladoDerecha;
    public double perimetro;
    public  double area;


    public Triangulos(String nombre, float base, float ladoIzquierda, float ladoDerecha) {
        this.nombre = nombre;
        this.base = base;
        this.ladoIzquierda = ladoIzquierda;
        this.ladoDerecha = ladoDerecha;
    }


}

class IsoscelesEquilatero extends Triangulos {

    public double altura;

    public IsoscelesEquilatero(String nombre, float base, float lados) {
        super(nombre, base, lados, lados);
        setAltura();
        setPerimetroTriangulo();
        setAreaTriangulo();
    }

    public void setAltura(){
        this.altura = Math.sqrt(Math.pow(base/2 , 2)+Math.pow(ladoDerecha,2));
    }

    public void setPerimetroTriangulo(){
        this.perimetro = this.base + this.ladoIzquierda + this.ladoDerecha;
    }

    public void setAreaTriangulo(){
        this.area = (this.base * this.altura)/2;
    }

    public void imprimirResultadosTriangulo(){
        System.out.println("Nombre: "+this.nombre+" | Perimetro"+this.perimetro+" | Area: "+String.format("%.2f", this.area));
    }
}

class Escaleno extends Triangulos{
    public double altura;

    public Escaleno(String nombre, float base, float ladoIzquierdo, float ladoDerecho, float altura) {
        super(nombre, base, ladoIzquierdo, ladoDerecho);
        this.altura = altura;
        setPerimetroTriangulo();
        setAreaTriangulo();
    }

    public void setPerimetroTriangulo(){
        this.perimetro = this.base + this.ladoIzquierda + this.ladoDerecha;
    }

    public void setAreaTriangulo(){
        this.area = (this.base * this.altura)/2;
    }

    public void imprimirResultadosTriangulo(){
        System.out.println("Nombre: "+this.nombre+" | Perimetro"+this.perimetro+" | Area: "+String.format("%.2f", this.area));
    }
}