// Crie um programa em Java para ler e armazenar 20
// números inteiros em um vetor, em seguida imprimir
// esses números na ordem inversa da leitura, ou seja, o
// último número lido deve ser o primeiro a ser exibido.

package vetores;
import java.util.Scanner;


public class Exercicio1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        clear.limpar();

        int[] vet;
        vet = new int[20];
        int i;

        for (i=0;i<=19;i++){
            System.out.println(" Insira o "+i+"o valor do vetor: ");
            vet[i] = input.nextInt();
        }

        for (i=19;i>=0;i--){
            System.out.println("N: "+vet[i]);
        }


    }
    
}
