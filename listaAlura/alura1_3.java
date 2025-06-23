// Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
package listaAlura;
import java.util.Scanner;

public class alura1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        clear.limpar();

        System.out.println("\n Digite H se for homem ou M se for mulher: ");
        String teste = input.next();
        testaHomemMulher(teste);

        input.close();
    }

    public static void testaHomemMulher(String teste){
        char homem = 'o';
        char mulher = 'a';

        if(teste.equals("M")){
            System.out.printf(String.format("\n Seja bem vind%s ao hotel!\n",mulher));
        }else if(teste.equals("H")){
            System.out.printf(String.format("\n Seja bem vind%s ao hotel!\n",homem));
        }
        
    }

}
