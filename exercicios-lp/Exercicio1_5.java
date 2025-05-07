// Escreva um programa que leia duas strings (dois nomes) e as imprima na tela.
// Imprima também a segunda letra de cada string.

import java.util.Scanner;

public class Exercicio1_5 {
  public static void main(String args[]) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.println(" Informe um nome: ");
    String nome1 = entrada.nextLine();
    System.out.println(" Informe outro nome: ");
    String nome2 = entrada.nextLine();

    System.out.println(" O segundo caractre do primeiro nome é: "+ nome1.charAt(1));
    System.out.println(" O segundo caractre do segundo nome é: "+ nome2.charAt(1));
    
  }
}
