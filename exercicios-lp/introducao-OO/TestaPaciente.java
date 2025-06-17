import java.util.Scanner;

public class TestaPaciente{
    static int opt;
    static Paciente p1 = new Paciente();
    static Scanner input = new Scanner(System.in);

    public static void main (String args []){
        Scanner input = new Scanner(System.in);
        clear.limpar();
        

        Paciente p1 = new Paciente();
        
        while (true){
            
            System.out.println("\n Informe seu nome: ");
            p1.setNome(input.nextLine());
            clear.limpar();

            Menu();
        }
    }

    public static void Menu(){
        
        System.out.println("\n\t Boa tarde paciente "+ p1.getNome() +", selecione o que você deseja: ");
        System.out.println("\n [1]- Informar idade;\n [2]- calcular IMC;\n [4]- Sair;");
        opt = input.nextInt();
        input.nextLine();

        if (opt == 1){
            Idade();
        } 
        if (opt == 2){
                
            IMC();
                
        }

        if (opt == 4) {
            System.exit(0);
        }

    }

    public static void Idade(){
        Paciente p1 = new Paciente();
        System.out.println("\n Informe seu ano de nascimento: ");
        p1.setAnoNascimento(input.nextInt());
        p1.imprimirIdade();
        System.out.println("\n\n Deseja sair? [4]\n Clique qualquer tecla para voltar ao menu.");
        Sair(input.nextInt());

    }
    
    public static void IMC(){
        
        System.out.println("\n Informe a sua altura: ");
        p1.setAltura(input.nextDouble());
        System.out.println("\n Informe seu peso: ");
        p1.setPeso(input.nextDouble());
        p1.calcularIMC();
        p1.imprimirIMC();

        System.out.println("\n\n Deseja sair? [4]");
        Sair(input.nextInt());

    }

    public static void Sair(int opt){
        if (opt == 4){
            System.exit(0);
        } 
        else {
            clear.limpar();
            Menu();
        }
    }
}
