
// Escreva um programa em linguagem Java que permita a leitura de um número inteiro N. O 
//programa deve conter três métodos chamados metodo1, metodo2, e metodo3. Obs: será 
//necessário validar o valor de N com um loop, ou seja, N só pode receber ou o valor 1, ou o valor 
//2, ou o valor 3. Para outros valores imprimir a mensagem: “Valor invalido. Digite novamente”.
//Se o usuário digitar o valor um (1) o programa irá executar o metodo1. Dentro do método 
//devem ser adicionadas instruções que permitirá que o usuário digite 20 números inteiros e os
//armazene em um vetor denominado VetA. Além disso, nesse método será realizado o cálculo da 
//soma dos números pares e divisíveis por 3 contidos no vetor, retornando e imprimindo o valor 
//dessa soma no método main.
//Se o usuário digitar o valor dois (2) o programa irá executar o metodo2. Dentro do método 
//será necessário inserir 15 valores inteiros em um vetor chamado A. O método deve gerar um outro 
//vetor denominado B em que cada elemento será gerado a partir dos valores de A (considerando 
//uma somatória). A somatória deve seguir a lógica apresentada nos exemplos a seguir: 
//- Para o valor 4 (considere o valor 4 como o primeiro elemento do vetor A) será necessário 
//somar 1+2+3+4= 10, ou seja, somar os valores de 1 até 4. 
//- Para o valor 1 (considere o valor 1 como o segundo elemento do vetor A) será necessário 
//somar apenas o valor 1, ou seja, o novo elemento será o valor 1. 
//- para o valor 0 (considere o valor 0 como o terceiro elemento do vetor A) será necessário
//somar apenas o valor 0, ou seja, o novo elemento será o valor 0. 
//- Para o valor 5 (considere o valor 5 como o quarto elemento do vetor A) será necessário 
//somar 1+2+3+4+5=15, ou seja, somar os valores de 1 até 5. 
//- E assim sucessivamente.
//A 4 | 1 | 0 | 5 ...
//B 10 | 1 | 0 | 15 ...
//Se o usuário digitar o valor três (3) o metodo3 deve permitir que o usuário insira valores 
//em uma matriz quadrada de ordem 4 de inteiros e devolve um char ‘V’ se ela é uma matriz 
//triangular superior, ou ‘F’, caso contrário. Obs: imprimir o resultado no método main. Uma matriz
//triangular superior pode ser observada na figura a seguir:


import java.util.Scanner;

public class Aula_9_3 {
    

    public static void main(String[] args) {
        
        clear.limpar();
        Scanner input = new Scanner(System.in);



        boolean teste = true;
        do{
            System.out.println("\n Informe uma opção: \n[1]\n[2]\n[3]");
            int opt = input.nextInt();
            switch (opt) {
                case 1:
                    int resultado = metodo1();
                    clear.limpar();
                    System.out.println("\n Soma de números pares e divisíveis por 3 digitados no vetor: "+resultado);
                    teste = false;
                    break;
            
                case 2:

                    metodo2();
                    teste = false;
                    break;

                case 3:

                    break;
            }
        } while(teste);
        
    }

    public static int metodo1 (){

        clear.limpar();

        int VetA [];
        VetA = new int [20];

        for (int i=0; i < 20; i++){
            Scanner input = new Scanner(System.in);
            
            System.err.println("\n Informe um valor para o vetor: ");
            VetA[i] = input.nextInt();
        }

        int soma = 0;
        for (int i=0; i<20; i++){
            if (VetA[i]%2 == 0 && VetA[i]%3 == 0){
                soma += VetA[i];
            }
        }
        
        return soma;
    }

    public static void metodo2(){
        clear.limpar();
        Scanner input = new Scanner(System.in);

        int A[], B[];
        A = new int[15];
        B = new int[15];

        for (int i=0; i<15; i++){
            System.out.println("\n Informe um número para o vetor A: ");
            A [i] = input.nextInt();
        }


        for (int i=0; i<15; i++){
            int soma = 0;
            for (int j=1; j<=A[i];j++){
                soma += j;
            }
            B[i] = soma;
            System.out.println(soma);
        }
    

    }
}
