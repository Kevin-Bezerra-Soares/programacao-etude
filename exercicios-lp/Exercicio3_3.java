// Crie um programa, usando o conceito de vetores, para
// ler e armazenar um conjunto de 50 números inteiros.
// Encontrar e exibir o maior número.

import java.util.Scanner;

public class Exercicio3_3 {
    
    public static void main(String[] args) {
        clear.limpar();
        Scanner sc = new Scanner(System.in);
        int vet [],i;
        vet = new int [50];
        int maior = vet[0];

        for (i=0; i<50; i++){

            System.out.println("Digite um número: ");
            vet [i] = sc.nextInt();
            if (vet[i] > maior){
                maior = vet[i];
            }
        }
        System.out.println(" O maio número é:" + maior + " " + i);
        

    }
}
