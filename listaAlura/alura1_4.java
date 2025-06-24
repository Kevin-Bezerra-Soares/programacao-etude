// Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

package listaAlura;
import java.util.Scanner;

public class alura1_4 {
    public static void main(String[] args) {
        clear.limpar();
        Scanner input = new Scanner(System.in);

        System.out.println("\n Informe o preço do produto: ");
        double precoProduto = input.nextDouble();

        System.out.println("\n Informe a quantidade que deseja comprar: ");
        int quantidade = input.nextInt();

        System.out.println("\n O valor final é: "+(quantidade*precoProduto));
        input.close();
    }
    
}
