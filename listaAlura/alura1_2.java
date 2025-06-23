// Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.

package listaAlura;
import java.util.Scanner;

public class alura1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        clear.limpar();

        System.out.println("\n Informe um número real: ");
        double numReal = input.nextDouble();

        int numInteiro = (int) numReal;
        System.out.printf("\n O número convertido para inteiro fica: %d \n", numInteiro);

        input.close();
    }
}
