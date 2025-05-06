///  Crie um programa em Linguagem Java que armazene
/// dados inteiros em uma matriz de ordem 5. Em
/// seguida imprima apenas a diagonal principal. Depois
/// imprima a diagonal secundária.

import java.util.Scanner;

public class Exercicio4_4 {
    public static void main(String[] args) {
        clear.limpar();
        int matriz[][], i, j, n=4;

        Scanner entrada = new Scanner(System.in);
        matriz = new int [5][5];

        for (i=0; i<5; i++){
            for (j=0; j<5; j++){
                System.out.print(" Digite os valores da matriz nos índices ["+ (i+1) +"] ["+ (j+1)+"]:");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nMatriz completa:");
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t|");
            }
            System.out.println();
        }

        System.out.println("\n Diagonal principal: ");
        for (i=0;i<5;i++){
            for (j=0;j<5;j++){
                if (i == j){
                    System.out.print(matriz[i][j]+"|");
                }
            }
            System.err.println(" ");
        }

        System.out.println("\n Diagonal secundária: ");
        for (i=0;i<5;i++){
            for (j=0;j<5;j++){
                if (i + j == n){
                    System.out.print(matriz[i][j]+"|");
                }

            }
            System.err.println(" ");
        }


    }
    
}