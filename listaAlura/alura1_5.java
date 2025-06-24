// Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. 
// Considere que o valor de 1 dólar é equivalente a 4.94 reais.
//  Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
package listaAlura;
import java.util.Scanner;

public class alura1_5 {
    public static void main(String[] args) {
        clear.limpar();
        Scanner input = new Scanner(System.in);

        System.out.println("\n Quantos dólares você tem em conta? ");
        double dollars = input.nextDouble();

        System.out.println("\n Você tem: "+(dollars*4.94)+" reais. ");
        input.close();
    }
}
