import java.io.IOException;

public class clear {
    public static void limpar() {
        try {
            // Executa o comando clear (via bash, que costuma ser mais confiável)
            new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}