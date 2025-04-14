import java.util.Scanner;

public class Exercicio1_3 {
    public static void main(String[] args) {
        
        int [] num;
        num = new int [6];
        int i;
        Scanner sc = new Scanner(System.in);

        for (i=0; i<=5; i++){

            System.out.println(" Digite este caraio de número: ");
            num [i] = sc.nextInt();

        }

        for (i=5;i>=0; i--){

            System.out.println("\n|"+num[i]);
            
        }
        
    }
}
