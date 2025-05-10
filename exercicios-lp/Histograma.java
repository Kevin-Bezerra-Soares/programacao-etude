// Escreva um programa em Java que receba uma frase, conte as vogais e apresente 
// o histograma da frequência de cada letra. Considere que a linha de texto não contém 
// acentuação.
import java.util.Scanner;

public class Histograma {
    public static void main(String[] args) {
        clear.limpar();
        Scanner input = new Scanner(System.in);
        int cont=0, i,j;
        char repet;
        System.out.println("\n Digite uma frase: ");    
        StringBuffer frase = new StringBuffer(input.nextLine());
        
        for (i=0; i < frase.length(); i++){
            char aterisc = frase.charAt(i);
            for (j=0; j < frase.length(); j++){
                repet = frase.charAt(j);
                if (repet == aterisc){
                    cont++;
                    
                }
            }
            System.out.print("*");
        }

        // criar um laço para uma letra da frase
        // criar outro laço para testar a repetção da letra no 
    }
}
