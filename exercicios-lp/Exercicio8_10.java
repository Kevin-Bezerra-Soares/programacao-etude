//  Faça um programa para armazenar 50 valores reais em um
// vetor chamados Valores. Em seguida, implemente os
// seguintes métodos para:
//  • mostrar os valores do vetor;
//  • calcular e mostrar a média dos valores do vetor; e
//  • encontrar e retornar para o método “main” o maior
// valor contido no vetor e imprimir o valor recebido.

import java.util.Scanner;

public class Exercicio8_10 {
    public static void main(String[] args) {
        clear.limpar();
        Scanner input = new Scanner(System.in);
        int Valores [] = new int[50];

        for (int i=0; i<50;i++){
            System.out.println("\n Informe um valor: ");
            Valores [i] = input.nextInt();
        }

        imprimirValores(Valores);
        mediaVetor(Valores);
        int maior = maiorValor(Valores);
        System.out.println("\n O maior valor do vetor é: "+maior);
        input.close();

    }   
    
    public static void imprimirValores(int Valores[]){
        for(int i=0; i<50; i++){
            System.out.println((i+1)+": "+Valores[i]);
        }
    }

    public static void mediaVetor (int Valores[]){
        int soma=0;

        for(int i=0; i<50; i++){
            soma += Valores[i];
        }
        System.out.println("\n A média do vetor é: "+(soma/50));
    }

    public static int maiorValor(int Valores[]){
        int maior=0,i;

        for (i=0; i<50; i++){
            if (Valores[i] > maior){
                maior = Valores[i];
            }
        }
        return maior;
    }
}
