// Crie um programa que lê dois números e envia
// esses números para um método chamado
// calcularSoma. O método calcularSoma, após
// receber esses valores, deverá realizar uma soma e
// imprimir o resultado obtido dentro do método.
import java.util.Scanner;

public class Exercicio2_8 {
    public static void main(String[] args) {
        clear.limpar();
        Scanner input = new Scanner(System.in);
        Double a, b;
        System.out.println("\n Informe um número: ");
        a = input.nextDouble();
        System.out.println("\n Informe outro número para somar: ");
        b = input.nextDouble();

        clear.limpar();
        calcularSoma(a,b);
        
    }

    public static void calcularSoma(Double a,Double b){
        System.out.println("\n Resultado: "+ (a+b));
    }
    
}
