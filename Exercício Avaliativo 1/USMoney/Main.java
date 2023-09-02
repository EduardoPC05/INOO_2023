/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        UsMoney x,y,z;
        System.out.printf("\nTESTE 01\n");
        x = new UsMoney(5,0);
        y = new UsMoney(1, 90);      

        z = x.plus(y);       
        
        System.out.println(z.getAll());

        System.out.printf("\nTESTE 02\n");
        x = new UsMoney(9, 2);
        y = new UsMoney(0, 9);

        z = x.plus(y);       

        System.out.println(z.getAll());

        System.out.printf("\nTESTE 03\n");
        x = new UsMoney(12, 28);
        y = new UsMoney(42, 94);

        z = x.plus(y);       

        System.out.println(y.getAll());

        System.out.printf("\nTESTE 04\n");
        x = new UsMoney(32, 44);
        y = new UsMoney(52, 94);

        z = x.plus(y);       

        System.out.println(y.getAll());
    }
}