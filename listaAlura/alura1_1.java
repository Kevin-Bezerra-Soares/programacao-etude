// Crie um programa que realize a média de duas notas decimais e exiba o resultado.

package listaAlura;
import java.util.Scanner;

public class alura1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        clear.limpar();

        System.out.println("\n Informe dois valores inteiros para calcular a média aritmética; ");
        int val1 = input.nextInt();
        int val2 = input.nextInt();
        mediaAritmetica(val1, val2);

        input.close();

    }

    public static void mediaAritmetica(int val1, int val2){
        System.out.println("A média é: "+((val1+val2)/2));
    }
}
