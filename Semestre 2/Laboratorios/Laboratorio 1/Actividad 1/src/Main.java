//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {

        Coordenadas cordenadas = new Coordenadas();

        cordenadas.setCordenadas(0,1);

        cordenadas.setCuadrante(cordenadas.x, cordenadas.y);

        System.out.println("Tu cuadrante es el: "+cordenadas.cuadrante);
    }
}