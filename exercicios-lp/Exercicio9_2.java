// Uma árvore (árvore 1) tem 1,50 m e cresce 2
// centímetros por ano. Uma outra árvore tem 1,10 m
// (árvore 2) e cresce 3 centímetros por ano. Construa
// um programa que calcule em quantos anos a
// árvore 2 será maior que árvore 1.


public class Exercicio9_2 {
    public static void main(String[] args) {
        clear.limpar();
        Double tree1=1.50, tree2=1.10;
        int ano=0;

        while (tree1 >= tree2){
            tree1 += 0.02;
            tree2 += 0.03;
            ano += 1;
        }
        System.out.printf("\n\t Levou: "+ano+" anos\n");

    }    
}
