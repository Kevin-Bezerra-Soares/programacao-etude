/// Programa que executa a soma de dois números;
/// Aula 1

import java.util.Scanner;

public class Exemplo {
    public static void main (String [] args) {
        int numero1, numero2, soma;
        Scanner entrada = new Scanner(System.in);

        System.out.print (" Digite um número: ");
        numero1 = entrada.nextInt();

        System.out.print (" Didgite outro número: ");
        numero2 = entrada.nextInt();

        soma = numero1 + numero2;
        System.out.println (" Total da soma: "+ soma);

        entrada.close();
    }
}
