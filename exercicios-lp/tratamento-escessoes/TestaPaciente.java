import java.util.Scanner;
import java.util.InputMismatchException;


public class TestaPaciente{
    static int opt;
    static Paciente p1 = new Paciente();
    static Scanner input = new Scanner(System.in);
    static boolean continua = true;

    public static void main (String args []){
        Scanner input = new Scanner(System.in);
        clear.limpar();
        
        
        
        do{
            
            try{
                clear.limpar();
                //input.nextLine();
                System.out.println(" Informe seu nome: ");
                p1.setNome(input.nextLine());
                input.nextLine();
                clear.limpar();

                System.out.println(" Boa tarde paciente "+ p1.getNome() +", selecione o que você deseja: ");
                System.out.println(" [1]- Informar idade; [2]- calcular IMC; [4]- Sair;");
                opt = input.nextInt();
                //input.nextLine();

                if (opt == 1){
                    Idade();
                }   
                if (opt == 2){
                    IMC();
                
                }
                if (opt == 4) {
                    System.exit(0);
                }

            
            } catch(InputMismatchException erro1){
                System.err.println(" Digite apenas números inteiros: ");
                //input.nextLine();
                
            }
        } while(continua);
    }


    public static void Idade() throws InputMismatchException{

        System.out.println(" Informe seu ano de nascimento: ");
        p1.setAnoNascimento(input.nextInt());
        p1.imprimirIdade();
        System.out.println(" Deseja sair? [4] Clique qualquer tecla para voltar ao menu.");
        Sair(input.nextInt());
        

    }
    
    public static void IMC() throws InputMismatchException{
        
        System.out.println(" Informe a sua altura: ");
        p1.setAltura(input.nextDouble());
        //input.nextLine();
        System.out.println(" Informe seu peso: ");
        p1.setPeso(input.nextDouble());
        p1.calcularIMC();
        p1.imprimirIMC();

        System.out.println("\n\n Deseja sair? [4] \n Clique qualquer tecla para voltar ao menu.");
        Sair(input.nextInt());
        //input.nextLine();

    }

    public static void Sair(int opt) throws InputMismatchException{
        if (opt == 4){
            //input.nextLine();
            continua = false;
        } 
        else {
            //input.nextLine();
        }
    }
}
