/// Projeto1 do curso Java: criando sua primeira aplicação ///
import java.util.Scanner;

public class aluraFahnrenheit {
    public static void main (String args[]){
        clear.limpar();
        Scanner input = new Scanner(System.in);

        System.out.println("\n Informe a temperatura em graus Celsius (C°): ");
        int resultado = converterFahrenheit(input.nextDouble());

        System.out.printf("\n São %d \n",resultado);
        input.close();
    }

    public static int converterFahrenheit (double temperatura){
        int celsius = 0;
        
        celsius = (int) (temperatura * 1.8) + 32;

        return celsius;
    }
}
