// Escreva um programa para armazenar 50 números
// inteiros em um vetor. Ao final mostrar apenas os
// números positivos contidos no vetor.


package vetores;

import java.util.Scanner;

import java.util.Scanner;

public class Exercicio1_5 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        clear.limpar();

        int vet[];
        vet = new int[50];
        int i;

        for (i=0;i<50;i++){
            System.out.println(" Insira o valor: ");
            vet[i] = input.nextInt();
        }

        for (i=0;i<50;i++){
            if (vet[i] > 0){
                System.out.println(vet[i]);
            }
        }

    }
}
