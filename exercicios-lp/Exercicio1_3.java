// Crie um programa em Java para ler e armazenar 20
// números inteiros em um vetor, em seguida imprimir
// esses números na ordem inversa da leitura, ou seja, o
// último número lido deve ser o primeiro a ser exibido.

import java.util.Scanner;

public class Exercicio1_3 {
    public static void main(String[] args) {
        clear.limpar();
        
        int [] num;
        num = new int [6];
        int i;
        Scanner sc = new Scanner(System.in);

        for (i=0; i<=5; i++){

            System.out.println(" Digite este caraio de número: ");
            num [i] = sc.nextInt();

        }

        for (i=5;i>=0; i--){

            System.out.println("\n|"+num[i]);
            
        }
        
    }
}
