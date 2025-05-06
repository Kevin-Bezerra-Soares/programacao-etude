// Crie um programa em Linguagem Java que armazene
// dados inteiros em uma matriz de ordem 5 e imprima
// todos os elementos que se encontram em posições
// cuja linha mais coluna formam um número par.

import java.util.Scanner;

public class Exercicio5_4 {
    public static void main(String[] args) {
        clear.limpar();
        Scanner entrada = new Scanner(System.in);

        int matriz[][], i, j;
        matriz = new int [5][5];

        for (i=0;i<5;i++){
            for (j=0;j<5;j++){
                
                System.out.println(" Preencha a matriz nos índices: ["+(i+1)+"] ["+(j+1)+"]");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.err.println("\n A matriz completa: ");
        for (i=0;i<5;i++){
            for (j=0;j<5;j++){
                System.out.print(matriz[i][j]+"|");
            }
            System.out.println(" ");
        }

        System.out.println("\n\n Os números onde a soma dos índices da coluna e linha são par: ");
        for (i=0;i<5;i++){
            for (j=0;j<5;j++){
                if ((i+j)%2 == 0){
                    System.out.print(matriz[i][j]+"|");
                } else{
                    System.out.print("  |");
                }
            }

            System.out.println(" ");
        }

    }
}
