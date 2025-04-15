
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
