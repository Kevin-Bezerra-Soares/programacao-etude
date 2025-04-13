/// Programa que faz a multiplicação de 2 números;
///  Aula 1

import java.util.Scanner;

public class Exercicio4_1 {
    public static void main (String args[]){
        int numero1, numero2;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Digite um número: ");
        numero1 = sc.nextInt();

        System.out.print(" Digite outro número: ");
        numero2 = sc.nextInt();

        System.out.println(" O resultado da mutiplicação é: " + (numero1*numero2));

        sc.close();

    }
}