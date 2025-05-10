// Crie um programa para ler o primeiro nome de uma pessoa e contar quantas vogais possui.

import java.util.Scanner;

public class Exercicio2_5 {
    public static void main(String[] args) {
        clear.limpar();
        Scanner input = new Scanner(System.in);
        int i, j, vogal=0;
        char[] caracteres = {'a', 'e', 'i', 'o', 'u'};
        String nome;

        System.out.println("\n Informe seu primeiro nome: ");
        nome = input.next();
        
        //System.out.print(lengh)
        for (i=0; i<nome.length();i++){
            char letra = Character.toLowerCase(nome.charAt(i));
            for (j=0;j< caracteres.length;j++){
                //letraNome = nome.charAt(i);
                
                if (caracteres[j] == letra){
                    vogal++;
                }
            }
        }

        System.out.print("\n Seu nome tem "+vogal+" vogais!\n");
        input.close();

    }
}
