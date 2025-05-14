// Crie um programa que contenha um método
// denominado verificarValor. O método
// verificarValor recebe um parâmetro que é um
// valor inteiro e verifica se esse valor é par ou
// ímpar. Imprimir a mensagem dentro do método.
import java.util.Scanner;

public class Exercicio1_8 {
    public static void main(String[] args) {
        clear.limpar();
        Scanner input = new Scanner(System.in);
        System.out.print("\n Informe o valor: ");
        Double n = input.nextDouble();

        verificarValor(n);
        
    }

    public static void verificarValor(Double n){
        if (n%2 == 0){
            System.out.println("\n O número é par: ");
        } else{
            System.out.println("\n O número é ímpar:");
        }
    }

    
}
