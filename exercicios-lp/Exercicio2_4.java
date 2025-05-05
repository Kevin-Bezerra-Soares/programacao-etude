///  Crie um programa para armazenar valores inteiros em
/// duas matrizes quadradas, denominadas A e B, de
/// ordem 2. Em seguida, gerar uma terceira matriz
/// chamada C que é obtida a partir da adição da matriz A
// e B.

import java.util.Scanner;

public class Exercicio2_4 {
    public static void main(String[] args) {
        clear.limpar();
        Scanner entrada = new Scanner(System.in);
        int A[][], B[][], C[][],i, j;
        A = new int [2][2];
        B = new int [2][2];
        C = new int [2][2];

        for (i=0; i<2; i++){
            for (j=0; j<2; j++){
                System.out.print(" Digite os valores da matriz nos índices ["+ (i+1) +"] ["+ (j+1)+"]:");
                A[i][j] = entrada.nextInt();
            }
        }

        for (i=0; i<2; i++){
            for (j=0; j<2; j++){
                System.out.print(" Digite os valores da matriz nos índices ["+ (i+1) +"] ["+ (j+1)+"]:");
                B[i][j] = entrada.nextInt();
                C[i][j] = (A[i][j])+(B[i][j]);
            }
        }

        System.out.println("\n\nConteúdo da matriz: ");

        for (i=0; i<2; i++){
            for (j=0; j<2; j++){
                System.out.print(C[i][j]+"|");
            }
            System.out.println(" ");
        }

    }
    
} 
