// Escreva um programa em Java que receba uma frase, conte as vogais e apresente 
// o histograma da frequência de cada letra. Considere que a linha de texto não contém 
// acentuação.
import java.util.Scanner;

public class Histograma1 {
    public static void main(String[] args) {
        clear.limpar();
        Scanner input = new Scanner(System.in);
        int cont=0, i,j;
        char repet, asterisc;
    
        System.out.println("\n Digite uma frase: ");    
        StringBuffer frase = new StringBuffer(input.nextLine().toLowerCase());
        
        for (i=0; i < frase.length(); i++){
            asterisc = frase.charAt(i);
            cont = 0;
            System.out.print(asterisc);
            for (j=0; j < frase.length(); j++){
                repet = frase.charAt(j);
                //System.out.print(asterisc);
                if (repet == asterisc){
                    cont++;
                    System.out.print("*");
                    
                }
                
            }
            
            System.out.println("("+ cont + ")");
            
        }
        
        
    }
}
