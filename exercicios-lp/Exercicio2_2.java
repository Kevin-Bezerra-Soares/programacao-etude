// Ler dimensõs de um terreno e calcular área;
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
