// Crie um programa, usando o conceito de vetores, para
// ler e armazenar um conjunto de 50 números inteiros.
// Encontrar e exibir o maior
// número.

package vetores;
import java.util.Scanner;

public class Exercicio1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        clear.limpar();

        int vet[];
        vet = new int[50];
        int i, maior=0,test=0;

        for (i=0;i<=49;i++){
            System.out.println(" Insira o valor do índice "+i+": ");
            vet[i] = input.nextInt();
            if (maior < vet[i]){
                maior = vet[i];
            }
        }

        System.out.println(" O maior número do vetor é "+maior);

    }
}
