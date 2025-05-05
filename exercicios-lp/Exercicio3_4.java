public class Exercicio3_4 {
    public static void main(String[] args) {
        clear.limpar();
        int matrix[][], i, j;
        matrix = new int [8][8];

        for (i=0; i<8;i++){
            for (j=0; j<8;j++){
                if (j <= i){
                    matrix[i][j] = 1;
                } else{
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println("\n\n A matriz: ");
        for (i=0; i<8; i++){
            for (j=0; j<8; j++){
                System.out.print(matrix[i][j]+"|");
            }
            System.out.println(" ");
        }

    }
    
}
