// Crie um programa para armazenar os valores 0s e 1s
// em uma matriz quadrada de ordem 3. Em seguida
// verificar se a matriz é uma matriz identidade.
// Obs: uma matriz identidade é aquela em que os
// elementos da diagonal principal são iguais a 1 e os
// demais elementos são iguais a zero.
import java.util.Scanner;

public class Exercicio6_4 {
    public static void main(String[] args) {
        clear.limpar();
        Scanner entrada = new Scanner(System.in);

        int matriz[][], i, j;
        boolean teste=true;
        matriz = new int[3][3];

        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                System.out.print(" Insira o valor da matriz no índice ["+(i+1)+"] ["+(j+1)+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println(" \n Segue a matriz completa: ");
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                System.out.print(matriz[i][j]+"|");
            }
            System.err.println(" ");
        }
        
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                if (i==j && matriz[i][j]!=1){
                    teste=false;
    
                } else if (i!=j && matriz[i][j]!=0){
                    teste=false;
                }
            }
        }

        if (teste){
            System.out.println("\n É matriz identidade! ");

        } else {
            System.out.println("\n Não é uma matriz identidade! ");
        }
    }
}
