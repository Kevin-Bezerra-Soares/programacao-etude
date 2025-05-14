import java.util.Scanner;

public class Histograma {
    public static void main(String[] args) {
        clear.limpar();
        Scanner input = new Scanner(System.in);
        int cont, i;
        char vogal, letra;

        System.out.println("\nDigite uma frase:");
        StringBuffer frase = new StringBuffer(input.nextLine().toLowerCase());

        // Percorrer todas as vogais explicitamente
        for (int v = 0; v < 5; v++) {
            cont = 0;
            vogal = "aeiou".charAt(v);
            System.out.print(vogal);

            for (i = 0; i < frase.length(); i++) {
                letra = frase.charAt(i);
                if (letra == vogal) {
                    cont++;
                    System.out.print("*");
                }
            }

            System.out.println("(" + cont + ")");
        }
    }
}
