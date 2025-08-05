import java.util.Scanner;

public class Aula_9_1 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        clear.limpar();
        
        int A [];
        A = new int [4];

        int B [];
        B = new int [2];



        for (int i=0; i<4;i++){
            System.out.println(" Informe um número do primeiro vetor");
            A [i] = input.nextInt();
        } 

        System.out.println(" Informe um número do segundo vetor");
        B[0] = input.nextInt();

        System.out.println(" Informe outro número do segundo vetor");
        B[1] = input.nextInt();


        if ((A[2] == B[0] && A[3] == B[1])){

            System.out.println("\n Encaixa!\n");
            
            System.out.println("\n");
            for (int i=0; i<4;i++){
                System.out.print(A[i]);
            } 
            
            System.out.printf("\t %d%d",B[0],B[1]);

        } else {
            System.out.println("\n Não encaixa:");

            System.out.println("\n");
            for (int i=0; i<4;i++){
                System.out.print(A[i]);
            } 
            
            System.out.printf("\t %d%d",B[0],B[1]);

        }
    }
}

//public void encaixarValores (int A[], )