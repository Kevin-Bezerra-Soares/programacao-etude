//  Faça um programa que contenha um método
// chamado lerVetor. Dentro do método permita a
// leitura de 10 valores inteiros, armazene-os em um
// vetor, e imprime o maior e o menor deles

import java.util.Scanner;

public class Exercicio7_8 {
    public static void main(String[] args) {
        clear.limpar();
        Scanner input = new Scanner(System.in);
        int vet [],i;
        vet = new int[10];

        for (i=0; i<10;i++){
            System.out.println("\n Informe os valores do vetor: ");
            vet [i] = input.nextInt();
        }

        lerVetor(vet);
        input.close();

    }

    public static void lerVetor(int vet[]){
        
        int maior = vet[0],i;

        for (i=0; i<10; i++){
            if (vet[i] > maior){
                maior = vet[i];
            }
        }
        System.out.println(" O maior número é: " + maior);

        ///////
        
                
        int menor = vet[0];

        for (i=0; i<10; i++){
            if (vet[i] < menor){
                menor = vet[i];
            }
        }
        System.out.println(" O menor número é:" + menor);
        
    }
}
