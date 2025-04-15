import java.util.Scanner;

public class Exercicio2_3 {

    public static void main(String[] args) {
        clear.limpar();

        int vet1 [], vet2 [],i;
        vet1 = new int [5];
        vet2 = new int [5];
        Scanner sc = new Scanner(System.in);

        for (i=0; i<5; i++){

            System.out.println(" Digite um número: ");
            vet1 [i] = sc.nextInt();

        }

        for (i=0; i<5; i++){

            vet2[i] = vet1[i] * 3;
            System.out.println("|"+vet2[i]);

        }
        sc.close();
    
    }
    
}
