/// Programa que soma 100 a qualquer número;
/// Aula 1

import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args){
        int numero, soma;
        Scanner entrada = new Scanner(System.in);

        System.out.print (" Digite um valor para somar com 100: ");
        numero = entrada.nextInt();

        soma = numero + 100;
        System.out.println (" O resultado da soma é: "+ soma);


    }
}
