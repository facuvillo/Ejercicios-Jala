

public class Coordenadas {
    public int x;
    public int y;
    public int cuadrante;

    public void setCordenadas(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setCuadrante(int x, int y){


        if ( x < 0 && y > 0){
            this.cuadrante = 1;
        }else{
            if (x > 0 && y > 0){
                this.cuadrante = 2;
            }else {
                if (x<0 && y<0){
                    this.cuadrante = 3;
                }else {
                    this.cuadrante = 4;
                }
            }
        }
    }
}
