// O programa lê o custo de fábrica de um automóvel e retorna a soma da porcentagem do distribuidor e impostos;
// Aula 2;

import java.util.Scanner;

public class Exercicio3_2 {
    public static void main (String[] args){
        float vfabrica, vdist, vimposto, fazoL;
        Scanner entr = new Scanner(System.in);

        System.out.print(" Informe o custo de fábrica do veículo: ");
        vfabrica = entr.nextFloat();
        
        float fazoL = (vfabrica * 0.32);
               
        
    }
        
}
