// Escreva um programa para armazenar 50 números
// inteiros em um vetor. Ao final mostrar apenas os
// números positivos contidos no vetor.


import java.util.Scanner;

public class Exercicio5_3 {
    public static void main(String[] args) {
        clear.limpar();
        Scanner sc = new Scanner(System.in);

        int vet[], i;
        vet = new int[50];

        for (i=1; i<50; i++){
            System.out.println(" Informe um número inteiro: ");
            vet [i] = sc.nextInt();
        }

        for (i=1; i<50; i++){

            if (vet[i] > 0){
                System.out.println(" Os valores positivos são:" + vet[i]);
            }
        }

    }

}
