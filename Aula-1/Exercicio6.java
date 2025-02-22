import java.util.Scanner;

public class Exercicio6 {
    public static void main (String args[]){
        float ordenado;
        Scanner sc = new Scanner(System.in);

        System.out.print(" Informe seu salário: ");
        ordenado = sc.nextFloat();

        System.out.println(" Com o aumento de 10% ficou: " + (ordenado * 1.10));
    }    
}
