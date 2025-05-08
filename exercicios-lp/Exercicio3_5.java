// Escreva um programa que leia uma string e substitua
// todos os caracteres ‘a’ da string lida por ‘*’. Informe na tela
// quantos caracteres foram retirados.

import java.util.Scanner;

public class Exercicio3_5 {
    public static void main(String[] args) {
        clear.limpar();
        Scanner input = new Scanner(System.in);
        char frase, letra = 'a';
        int i, cont=0;
        
        System.out.println("\n Digite alguma coisa: ");
        StringBuffer str = new StringBuffer(input.nextLine());

        for (i=0; i < str.length(); i++){
            frase = str.charAt(i);
            if (letra == frase){
                str.setCharAt(i, '*');
                cont++;
            }
        }
        System.out.println(str+"\n Quantidade de caracteres substituídos: "+cont);
        input.close();
    }
}
