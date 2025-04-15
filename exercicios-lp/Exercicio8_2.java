// Criar um programa usando a estrutura while para
// ler 100 números inteiros e somar apenas os
// números pares. Ao final mostrar o total da soma.

public class Exercicio8_2 {
    
    public static void main (String args []){
        clear.limpar();

        int i=0,som=0;


        while (i<=100){
            if (i%2 == 0){

                som += i;
                
            }
            
            i++;
        }

        System.out.printf("\n"+som+"\n");
    }
    
}
