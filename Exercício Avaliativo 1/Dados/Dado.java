import java.util.Random;
public class Dado {
    private int lados;

    public Dado(int lados){
        if(lados > 0){
            this.lados = lados;
        }
    }
    public int lancar(){
        Random teste;
        int retorno;
        teste = new Random();

        retorno = teste.nextInt(lados) + 1;

        return retorno;
    }
}
