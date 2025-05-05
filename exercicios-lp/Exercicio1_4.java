import java.util.Scanner;

public class Exercicio1_4 {
    public static void main(String[] args) {
        clear.limpar();
        Scanner entrada = new Scanner(System.in);
        int matriz[][],i, j, soma=0;
        matriz = new int [4][4];

        for (i=0; i<4; i++){
            for (j=0; j<4; j++){
                System.out.print(" Digite os valores da matriz nos índices ["+ (i+1) +"] ["+ (j+1)+"]:");
                matriz [i][j] = entrada.nextInt();
                soma += matriz[i][j];
            }
        }

        System.out.println("\n\nConteúdo da matriz: ");

        for (i=0; i<4; i++){
            for (j=0; j<4; j++){
                System.out.print(matriz[i][j]+"|");
            }
            System.out.println(" ");
        }
        System.out.println("\n O total, da matriz é: "+ soma);
    }
    
}
