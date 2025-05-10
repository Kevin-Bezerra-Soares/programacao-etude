// Escreva um programa em Java que receba uma frase do teclado e informe
// quantas letras maiúsculas essa frase possui.

import java.util.Scanner;

public class ContaMaiusculas {
    public static void main(String[] args) {
        clear.limpar();
        Scanner input = new Scanner(System.in);
        char frase;
        int i, cont=0;

        System.out.println("\n Digite alguma frase: ");
        String fraseNormal = input.nextLine();
        

        for (i=0; i< fraseNormal.length();i++){
            frase = fraseNormal.charAt(i);
            if (Character.isUpperCase(frase)){
                cont++;
            }

        }
        System.out.println("\n A quantidade de letras maiúsculas é: "+cont);
    }
}
