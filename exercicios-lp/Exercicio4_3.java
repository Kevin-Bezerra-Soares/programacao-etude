import java.util.Scanner;

public class Exercicio4_3 {
    public static void main(String[] args) {
        clear.limpar();
        Scanner sc = new Scanner(System.in);
        int vet[], i,impar=0,par=0;
        vet = new int[100];

        for (i=0; i<100; i++){

            System.out.println(" Informe os valores: ");
            vet [i] = sc.nextInt();

            if (i%2 == 0){
                par += vet[i];
            }
            else {
                impar += vet[i];
            }
        }
        System.out.println(" A soma nos índices pares e ímpares são: " + par + " e " + impar + " respectivamente");

    }
    
}
