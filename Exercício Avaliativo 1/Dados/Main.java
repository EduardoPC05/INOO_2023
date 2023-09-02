/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Dado d1,d2;

        for (int i = 0; i < 3; i++) {
            int soma = 0;
            d1 = new Dado(6);
            d2 = new Dado(6);

            soma += d1.lancar();
            soma += d2.lancar();

            System.out.printf("SOMA DOS DADOS[%d]: %d\n",i+1,soma); 
        }
        
    }
}