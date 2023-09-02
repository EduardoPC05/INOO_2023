public class Triangulo {
    private int a;
    private int b;
    private int c;
    private boolean valido;

    // private ehisoceles
    // private ehequilatero
    // private ehescaleno

    public Triangulo(int a, int b, int c) {
        this.valido = false;
        if (a > 0 && b > 0 && c > 0) {
            if ((a + b) > c) {
                if ((b + c) > a) {
                    if ((c + a) > b) {
                        this.a = a;
                        this.b = b;
                        this.c = c;
                        this.valido = true;
                    }
                }
            }
        }

    }
    public String verifica(){
        String mensagem = "NUMEROS INVALIDOS";
        if(this.valido){
            if(ehEscaleno()){
                mensagem = "ESCALENO";
            }
            if(ehIsoceles()){
                mensagem = "ISOCELES";
            }
            if(ehEquilatero()){
                mensagem = "EQUILÁTERO";
            }
        }

        return mensagem;
    }
    private boolean ehEquilatero() {
        boolean retorno = false; 
        if (this.valido) {
            if (a == b) {
                if (b == c) {
                    retorno = true;
                }
            }
        }

        return retorno;
    }
    private boolean ehIsoceles() {
        boolean retorno = false; 
        if (this.valido) {
           if(a == b || a == c || b == c){
                retorno = true;
           }
        }

        return retorno;
    }

    private boolean ehEscaleno() {
        boolean retorno = false;
        if(this.valido){
            if (a != b && b != c) {
                retorno = true;
            }
        }
        return retorno;
    }
}
