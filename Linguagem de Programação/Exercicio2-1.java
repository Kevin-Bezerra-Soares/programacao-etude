/// Programa que calcula a média artimética de 3 números;
/// Aula 1

import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args) {
        int num1, num2, num3, soma;
        Scanner entrada = new Scanner(System.in);

        System.out.print (" Digite um número inteiro: ");
        num1 = entrada.nextInt();

        System.out.print (" Digite outro número inteiro: ");
        num2 = entrada.nextInt();

        System.out.print (" Digite o último número inteiro: ");
        num3 = entrada.nextInt();

        soma = ((num1 + num2 + num3) / 3);
        System.out.println (" A média aritmética é: "+ soma);

    }
    
}
