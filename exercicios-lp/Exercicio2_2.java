// A imobiliária IMOV vende apenas terrenos
// retangulares. Faça um programa em Java para ler
// as dimensões de um terreno e depois exibir a área
// do mesmo. Para calcular a área de um retângulo
// use a fórmula: área = b * h

// Aula2;
import java.util.Scanner;

public class Exercicio2_2 {
    public static void main(String[]argis){
        clear.limpar();
        
        float area, largura, profundidade;
        Scanner ent = new Scanner(System.in);

        System.out.print(" Informe a largura do terreno: ");
        largura = ent.nextFloat();

        System.out.print(" Informe a profundidade do terreno: ");
        profundidade = ent.nextFloat();

        area = (largura*profundidade);

        System.out.println(" A área do terreno é: " + area);

        ent.close();

    }
    
}
