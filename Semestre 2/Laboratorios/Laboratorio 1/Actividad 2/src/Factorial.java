

public class Factorial {

    public int numEntrada;
    public int resultado = 1;

    public void setEntrada(int entrada){
        this.numEntrada = entrada;
    }

    public void calcularFactorial(){

        for(int i=numEntrada; i>1 ; i--){
            this.resultado += resultado * (i-1);
            System.out.println(this.resultado);
        }

    }
}
