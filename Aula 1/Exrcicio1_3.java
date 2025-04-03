import java.util.Scanner;

public class Exrcicio1_3 {
    public static void main(String[] args) {
        
        int [] num;
        num = new int [20];
        int i;
        Scanner sc = new Scanner(System.in);

        for (i=0; i<20; i++){

            System.out.println(" Digite este caraio de número: ");
            num [i] = sc.nextInt();

        }

        sc.close();
    }
}
