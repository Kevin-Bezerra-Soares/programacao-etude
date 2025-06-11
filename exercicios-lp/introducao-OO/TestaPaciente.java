import java.util.Scanner;

public class TestaPaciente{
    public static void main (String args []){
        Scanner input = new Scanner(System.in);
        clear.limpar();
        int opt;

        Paciente p1 = new Paciente();
        
        while (true){
            
            System.out.println("\n Informe seu nome: ");
            p1.setNome(input.nextLine());
            clear.limpar();

            System.out.println("\n\t Boa tarde paciente "+ p1.getNome() +", selecione o que você deseja: ");
            System.out.println("\n [1]- Informar idade;\n [2]- calcular IMC;\n [4]- Sair;");
            opt = input.nextInt();
            input.nextLine();

            if (opt == 1){

                System.out.println("\n Informe seu ano de nascimento: ");
                p1.setAnoNascimento(input.nextInt());
                p1.imprimirIdade();
                System.out.println("\n\n Deseja sair? [4]");
                opt = input.nextInt();
                if (opt == 4){
                    break;
                }
            } 
            if (opt == 2){
                
                System.out.println("\n Informe a sua altura: ");
                p1.setAltura(input.nextDouble());
                System.out.println("\n Informe seu peso: ");
                p1.setPeso(input.nextDouble());
                p1.calcularIMC();
                p1.imprimirIMC();

                System.out.println("\n\n Deseja sair? [4]");
                opt = input.nextInt();
                if (opt == 1){
                    break;
                }
                
            }

            else {
                break;
            }
        }
    }
}
