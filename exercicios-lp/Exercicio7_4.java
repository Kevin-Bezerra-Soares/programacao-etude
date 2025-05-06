// Criar um programa em java para para inserir e imprimir dados inteiros de um array de 3 dimensões.

import java.util.Scanner;

public class Exercicio7_4 {
    public static void main(String[] args) {
        clear.limpar();
        int matriz[][][], i, j, z;
        Scanner entrada = new Scanner(System.in);
        matriz = new int [3][3][3];

        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                for (z=0;z<3;z++){
                    System.out.println(" Informe um número para o índice ["+(i+1)+"] ["+(j+1)+"] ["+(z+1)+"]");
                    matriz [i][j][z] = entrada.nextInt();
                }
            }
        }

        System.out.println(" Valores do cubo: ");
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                for (z=0;z<3;z++){
                    System.out.print("["+i+"] ["+j+"] ["+z+"]="+matriz[i][j][z]+" |\t");
                }
                System.out.println(" ");
            }
            System.out.println(" \n");
        }
    
    }
    
}