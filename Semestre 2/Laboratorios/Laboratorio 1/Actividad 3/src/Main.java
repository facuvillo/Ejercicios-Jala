

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------");
        Circulo circulo = new Circulo("circulo", 5);
        circulo.imprimirResultadosCirculo();

        System.out.println("---------------------------------------------------");

        Rectangle rectangulo = new Rectangle("rectangulo", 15, 7);
        rectangulo.imprimirResultadosRectangulo();

        System.out.println("---------------------------------------------------");

        Cuadrado cuadrado = new Cuadrado(2);
        cuadrado.imprimirResultadosCuadrado();

        System.out.println("---------------------------------------------------");

        IsoscelesEquilatero equilatero = new IsoscelesEquilatero("Equilatero", 4, 4);
        equilatero.imprimirResultadosTriangulo();
    }
}
