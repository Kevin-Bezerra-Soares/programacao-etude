/// Crie um algoritmo para calcular a soma de um
/// número com o valor 100. Mostrar o total da soma
/// ao final.

/// Aula 1

import java.util.Scanner;

public class Exercicio3_1 {
    public static void main (String[] args){
        clear.limpar();
        int numero, soma;
        Scanner entrada = new Scanner(System.in);

        System.out.print (" Digite um valor para somar com 100: ");
        numero = entrada.nextInt();

        soma = numero + 100;
        System.out.println (" O resultado da soma é: "+ soma);

        entrada.close();
    }
}
