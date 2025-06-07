// Faça um programa que contenha um método que
// verifique se um valor é perfeito ou não. Um valor é
// dito perfeito quando ele é igual a soma dos seus
// divisores. (Ex: 6 é perfeito, 6 = 1 + 2 + 3, que são
// seus divisores).

import java.math.BigInteger;
import java.util.Scanner;

public class Exercício6_8 {
    public static void main(String[] args) {
        //clear.limpar();
        Scanner input = new Scanner(System.in);
        long value;

        System.out.println("\n Informe um valor para verificar se é perfeito: ");
        value = input.nextLong();

        numPerfeito(value);
        input.close();
        
    }

    public static void numPerfeito(long value){
        long i,perfect=0;

        for (i=value-1;i>0;i--){
            if (value%i == 0){
                perfect += i;
            } 
        }
        if (perfect == value){
            System.out.println("\n O valor "+value+" é um número perfeito! ");
        } else {
            System.out.println("\n O valor "+value+" não é um número perfeito! ");
        }

    }
    
}
