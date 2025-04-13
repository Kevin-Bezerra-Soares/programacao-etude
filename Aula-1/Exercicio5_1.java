/// Programa que lê a indade e informa a quantidade de dis vividos; 
/// Aula 1

import java.util.Scanner;

public class Exercicio5_1 {
    public static void main (String args[]){
        int idade;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Informe sua idade: ");
        idade = sc.nextInt();

        System.out.println(" A quantidade de dias vividos é:" + (idade * 365));

        sc.close();
    }
}