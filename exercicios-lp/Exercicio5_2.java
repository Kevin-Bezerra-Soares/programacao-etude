// Nesse ano ocorrerão as eleições para prefeitos,
// vices e vereadores. De acordo com o Tribunal
// Superior Eleitoral é considerada a idade da pessoa
// para que seja verificada a situação da pessoa, ou
// seja, se a mesma pode votar, ou se o seu voto é
// opcional, ou se a pessoa não pode votar. 
// Considerando a necessidade de verificar a situação
// de uma pessoa, crie um programa em Java que
// dada a idade de uma pessoa, determine sua
// condição de Eleitor.

// Aula2;


import java.util.Scanner;

public class Exercicio5_2 {

    public static void main (String args[]){
        clear.limpar();

        double idade;

        Scanner entra = new Scanner(System.in);

        System.out.print(" Digite a usa idade: ");
        idade = entra.nextDouble();
        
        if (idade>=18 && idade<=64) {
            System.out.println(" Seu voto é OBRIGATÓRIO! ");
        }

        if ((idade>=16 && idade<18) || (idade>=65)){
            System.out.println(" Seu voto é opcional. ");
        }

        if (idade < 16) {
            System.out.println(" Você não vota! ");
        }
        entra.close();

    }
    
}
