
import java.util.Scanner;

public class Exercicio7_3 {
    public static void main(String[] args) {
        clear.limpar();
        Scanner sc = new Scanner(System.in);
        int A[], num = 0, cont = 0, i;
        A = new int[30];
        
        for (i=0; i<30; i++){
            
            System.out.println(" Informe um número inteiro divisível por 5.");
            num = sc.nextInt();

            while (num%5 != 0){

                System.out.println(" Não divisível por 5, escolha outro: ");
                num = sc.nextInt();
                cont++;
            }
                
        
            A[i] = num;
    

        }

        for (i=1; i<30; i++){
            System.out.println(" O vetor é " + i +":"+ A[i]);
            System.out.println(" Você digitou "+cont+" números não divisíveis por 5.");;
        }



    }
}
