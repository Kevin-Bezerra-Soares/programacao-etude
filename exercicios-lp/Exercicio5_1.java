/// Crie um algoritmo para ler um valor que representa
/// a idade de uma pessoa. Imprima o total de dias
/// vividos. Obs: considere que um ano tem 365 dias.

/// Aula 1

import java.util.Scanner;

public class Exercicio5_1 {
    public static void main (String args[]){
        clear.limpar();
        int idade;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Informe sua idade: ");
        idade = sc.nextInt();

        System.out.println(" A quantidade de dias vividos é:" + (idade * 365));

        sc.close();
    }
}