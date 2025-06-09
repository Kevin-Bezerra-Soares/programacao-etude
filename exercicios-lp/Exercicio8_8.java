//  Faça um método chamado mostrarTabuadas e que
// recebe, por parâmetro, um valor inteiro N. Calcular
// e imprimir as tabuadas dos números de 1 até N, ou
// seja, se o usuário digitou o valor 3 deve imprimir a
// tabuada do 1, a tabuada do 2 e a tabuada do 3.
// Exibir as tabuadas, dentro do método,
// considerando os cálculos de 1 a 10. Dessa forma,
// método não deve retornar nada.

import java.util.Scanner;

public class Exercicio8_8 {
    public static void main(String[] args) {
        clear.limpar();
        Scanner input = new Scanner(System.in);
        int N;

        System.out.println("\n Informe até qual número você quer ver a tabuada: ");
        N = input.nextInt();

        mostrarTabuadas(N);
        input.close();
        
    }

    public static void mostrarTabuadas(int N){
        int cont = 1,i,result;

        while (cont <=N){

            System.out.println("\n A tabuada de "+cont);
            for (i=1;i<11;i++){
                result = i * cont;
                System.out.println(" "+i+"*"+cont+" = "+result);
                
            }
            cont ++;
        }
    }
    
}
