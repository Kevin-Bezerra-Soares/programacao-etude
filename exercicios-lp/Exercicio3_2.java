// O programa lê o custo de fábrica de um automóvel e retorna a soma da porcentagem do distribuidor e impostos;
// Aula 2;

import java.util.Scanner;

public class Exercicio3_2 {
    public static void main (String[] args){
        clear.limpar();
        float vfabrica, vdist, vimposto, fazoL;
        Scanner entr = new Scanner(System.in);

        System.out.print(" Informe o custo de fábrica do veículo: ");
        vfabrica = entr.nextFloat();
        
        vdist = (vfabrica + (vfabrica * 32 / 100)); // Porcentafem do distribuidor é 32%;
        vimposto = (vfabrica + (vfabrica * 41 / 100)); // Parcentagem de impostos é 41%;
        fazoL = (vdist + vimposto);

        System.out.println(" Seu carro custa: " + fazoL);
        
        entr.close();
    }
        
}
