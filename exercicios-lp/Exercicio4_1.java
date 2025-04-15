/// Crie um algoritmo para efetuar o produto
/// (multiplicação) de dois números e mostrar o
/// resultado logo em seguida.

///  Aula 1

import java.util.Scanner;

public class Exercicio4_1 {
    public static void main (String args[]){
        clear.limpar();
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