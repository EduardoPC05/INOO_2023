import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1,n2,n3;
        Triangulo teste;

        for(int i = 0; i < 5; i++){
            System.out.println("DIGITE 1 NUMERO:");
            n1 = entrada.nextInt();
            System.out.println("DIGITE 2 NUMERO:");
            n2 = entrada.nextInt();
            System.out.println("DIGITE 3 NUMERO:");
            n3 = entrada.nextInt();
            teste = new Triangulo(n1,n2,n3);
            System.out.println(teste.verifica());
        }      

        
    }
}