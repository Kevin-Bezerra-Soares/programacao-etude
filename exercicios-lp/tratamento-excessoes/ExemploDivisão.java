import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploDivisão{
    public static int calculaQuociente(int numerador, int denominador)
              throws ArithmeticException{
        return numerador / denominador;

    }


    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        boolean continua = true;
    
        do{
            try{
                System.out.println("\n Numerador: ");
                int numerador = input.nextInt();

                System.out.println("\n Denominador: ");
                int denominador = input.nextInt();

                int resultado = calculaQuociente(numerador, denominador);
                System.out.println("\n Resultado: "+ resultado);

                continua = false;
            } catch (InputMismatchException erro1){
                System.err.println("\n\t Não digite letras, informe apenas números inteiros! ");
                input.nextLine();
            } catch (ArithmeticException erro2){
                System.err.println("\n\t O número do divisor deve ser diferente de 0! ");
            } finally {
                System.out.println("\n Execução do finally. ");
            }
        } while (continua);
    }
}
