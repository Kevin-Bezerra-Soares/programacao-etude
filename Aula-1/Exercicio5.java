import java.util.Scanner;

public class Exercicio5 {
    public static void main (String args[]){
        int idade;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Informe sua idade: ");
        idade = sc.nextInt();

        System.out.println(" A quantidade de dias vividos é:" + (idade * 365));

    }
}