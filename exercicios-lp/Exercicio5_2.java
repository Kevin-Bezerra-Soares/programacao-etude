// Um programa que decide, com base na idade, se o voto da pessoa é obrigatório, opcional ou se não vota;
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
