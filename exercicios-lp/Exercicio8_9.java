//  Faça um programa para armazenar 20 números reais em um
// vetor chamado Num. Em seguida, chamar um método
// denominado imprimirPos que recebe o vetor Num por
// parâmetro e imprime apenas os números positivos contidos
// no vetor.

import java.util.Scanner;

public class Exercicio8_9 {
    public static void main (String args []){
        clear.limpar();
        Scanner input = new Scanner(System.in);
        int Num [] = new int[20];

        for (int i=0;i<20;i++){
            System.out.println("\n Digite um número: ");
            Num [i] = input.nextInt();
        }

        imprimePos(Num);
    }

    public static void imprimePos(int Num[]) {
        for(int i=0; i<20;i++){
            if(Num[i]>0){
                System.out.println(i+" : "+Num[i]);
            }
        }
    }
}
