// Crie um programa para ler um número como
// sendo a quantidade de computadores gerenciados
// por uma empresa. Verificar se o número
// (quantidade) de computadores é par ou ímpar.
// Obs: para o número ser par, o resto de sua divisão
// por dois deve ser igual a zero. Usar o operador %.
// ex: resto = N%2

// Aula 2;

import java.util.Scanner;

public class Exercicio6_2 {
    public static void main (String args []){
        clear.limpar();
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
