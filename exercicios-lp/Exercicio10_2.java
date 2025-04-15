// Escrever um programa (usando a estrutura for)
// para ler 20 valores, um de cada vez, para a variável
// X. Contar quantos destes valores são negativos,
// mostrando os mesmos e escrevendo esta a
// quantidade ao final

import java.util.Scanner;

public class Exercicio10_2 {

    public static void main(String[] args) {
        clear.limpar();
        
        int num,cont=0;
        Scanner entrada = new Scanner(System.in);

        for (int i=0; i<20; i++){
            System.out.print(" Informe um número inteiro: ");
            num = entrada.nextInt();
            if (num < 0){
                cont++;
                System.out.println(" Negativo: "+num);
            }
        }
        System.out.println(" Quantidade de negativos: "+cont);
        entrada.close();

    }
    
}
