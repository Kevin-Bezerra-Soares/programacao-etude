// Um programa que lê a quantidade de computadores da empresa e diz se é par ou impar;
// Aula 2;

import java.util.Scanner;

public class Exercicio6_2 {
    public static void main (String args []){
        int n;

        Scanner entrada = new Scanner(System.in);

        System.out.print(" Informe a quantidade de computadores: ");
        n = entrada.nextInt();

        if (n%2 == 0){
            System.out.println(" A quantidade de computadores é par! ");
        }

        else {
            System.out.println(" A quantidade de computadores é impar! ");
        }
        entrada.close();
    }
}
