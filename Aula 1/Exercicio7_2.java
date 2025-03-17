import java.io.IOException;

public class Exercicio7_2 {

    public static void main(String[] args) {
        int cont = 1, mtp;

        
        while (cont <= 100) {
            //Clear.limparTela();
            
            mtp = cont % 13;
            
            if (mtp == 0){
                System.out.println(" É múltiplo de 13: " + cont);
            }
            cont++;
            

        }
        //Clear.limparTela();

    }
}