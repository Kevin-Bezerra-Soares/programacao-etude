
//Crie um programa em Linguagem Java, usando o conceito de métodos, para calcular o valor da 
//seguinte sequência:
//O método deve receber dois valores que são os valores de A e n, onde n representa o 
//número de termos da sequência e A representa um valor qualquer.
//Obs1: imprimir o valor da sequência no método main.
 


import java.util.Scanner;

public class Aula_9_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        clear.limpar();

        int A,n;

        System.out.println("\n Informe o valor de A:");
        A = input.nextInt();

        System.out.println("\n Informe a quantidade de interações das sequênca! ");
        n = input.nextInt();

        double resultado = sequenciaN(A,n);
        System.out.println(resultado);

    }

    public static double sequenciaN (int A, int n){
        int i;
        double resultado =0.0;
        
        for (i=1;i<=n; i++){
            resultado +=(1.0/(i*A));
            System.out.printf("Termo %d: %.4f\n", i, (1.0 / (i * A)));

        }
        return resultado;
    }

}
