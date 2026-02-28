// Crie um programa, usando o conceito de vetores, para
// ler e armazenar um conjunto de 50 números inteiros.
// Encontrar e exibir o maior
// número.

package vetores;
import java.util.Scanner;

public class Exercicio1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        clear.limpar();

        int vet[];
        vet = new int[100];
        int i,soma=0;

        for (i=0;i<100;i++){
            System.out.println(" Insira o valor do índice "+i);
            vet[i] = input.nextInt();
        }

        for (i=0;i<100;i++){
            if (vet[i]%2 != 0){
                soma+=vet[i];
            }
        }

        System.out.println(" A soma dos ímpares: "+ soma);


    }

    
}
