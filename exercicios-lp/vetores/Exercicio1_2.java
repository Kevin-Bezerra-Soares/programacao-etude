// Crie um programa em Java para ler e armazenar 15
// números inteiros em um vetor e montar outro vetor com
// os valores do primeiro multiplicados por 3.

package vetores;
import java.util.Scanner;

public class Exercicio1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        clear.limpar();

        int vet1[];
        int vet2[];

        vet1 = new int [15];
        vet2 = new int [15];

        int i,j;

        for (i=0;i<=14;i++){
            System.out.println(" Insira o valor do índice "+i);
            vet1[i] = input.nextInt();
            vet2[i]=vet1[i]*3;

        }

        for (j=0;j<=14;j++){
            System.out.println("Índice "+j+" x3:"+vet2[j]);
        }
        
    }
    
}
