// Escreva um programa em Java que receba uma frase do teclado e informe 
// quantos espaços essa frase possui.

import java.util.Scanner;

public class ContaEspacos {
    public static void main(String[] args) {
        clear.limpar();
        Scanner input = new Scanner(System.in);
        char frase, letra = ' ';
        int i, cont=0;
        
        System.out.println("\n Digite alguma coisa: ");
        StringBuffer str = new StringBuffer(input.nextLine());

        for (i=0; i < str.length(); i++){
            frase = str.charAt(i);
            if (letra == frase){
                cont++;
            }
        }
        System.out.println("\n Quantidade de espaços: "+cont);
        input.close();
    }
}