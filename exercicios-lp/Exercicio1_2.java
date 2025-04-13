/// Programa que lê a quantidade de anos, meses e dias do usuário e retorna em dias;
/// Aula2;

import java.util.Scanner;

public class Exercicio1_2 {
    public static void main(String[] args) {
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