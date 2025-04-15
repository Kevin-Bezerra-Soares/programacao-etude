
/// Faça um programa em linguagem Java para ler a
/// idade de uma pessoa expressa em anos, meses e
/// dias e imprime essa idade apenas em dias. Dessa
/// forma, será necessário realizar a leitura de 3
/// valores inteiros. Obs: Para efetuar o cálculo
/// considere que 1 ano tem 365 dias, e 1 mês tem
/// 30 dias.

import java.util.Scanner;

public class Exercicio1_2 {
    public static void main(String[] args) {
        clear.limpar();
        int anos, meses, dias, resp;
        
        Scanner val = new Scanner(System.in);

        System.out.print (" Informe quantos anos você tem: ");
        anos = val.nextInt();

        System.out.print (" Informe quantos meses além da idade: ");
        meses = val.nextInt(); 

        System.out.print (" Informa quantos dias além dos anos e meses.");
        dias = val.nextInt();

        resp = ((anos * 365) + (meses * 30) + dias);
        
        System.out.println(" Sua idade em dias é: " + resp);

        val.close();

    }

}