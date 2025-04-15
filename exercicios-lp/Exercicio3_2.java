// Considere a descrição a seguir:
// “O custo de um carro novo para o consumidor é a
// soma do custo de fábrica com a percentagem do
// distribuidor (em cima do custo de fábrica) e dos
// impostos (também aplicados ao custo de fábrica)”.
// Supondo que a percentagem do distribuidor
// seja de 32% e os impostos de 41%, escrever um
// programa em linguagem Java para ler o custo de
// fábrica de um carro e imprimir o custo ao
// consumidor.

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
