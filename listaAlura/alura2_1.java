package listaAlura;

import java.util.Random;

// Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número,
// em até 5 tentativas. A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

// Para gerar um número aleatório em Java: new Random().nextInt(100);
// Utilize o Scanner para obter os dados do usuário;
// Utilize uma variável para contar as tentativas;
// Utilize um loop para controlar as tentativas;
// Utilize a instrução break; para interromper o loop.

import java.util.Scanner;

public class alura2_1 {

    public static void main(String[] args) {
        clear.limpar();
        Scanner input = new Scanner(System.in);

        Random die = new Random();
        

        int num = 0;
        int sair = 1;

        while (sair != -1) {
            System.out.println("\n Informe um número de 0 a 100: ");
            num = input.nextInt();
            int rangedie = die.nextInt(100);

            if(num == rangedie){
                System.out.println("\n Você acertou! ");

            } else{
                System.out.println("\n Você errou, o valor é: "+ rangedie);
            }
        }

        input.close();
    }
}

