import java.util.Scanner;

public class atm_bancario {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        clear.limpar();

        String nome = "Kevin Wittelsbach";
        boolean stay = true;
        double deposito;
        double saldo= 1599.99;
        String conta = "corrente";


        do {

            System.out.println("\n|**************************************|");
            System.out.println(" Dados iniciais do cliente: \n");
            System.out.printf("\n Nome: %s",nome);
            System.out.printf("\n Tipo de conta: %s",conta);
            System.out.printf("\n Saldo inicial: R$ %.2f\n\n",saldo);
            System.out.println("|**************************************|");

            //clear.limpar();

            System.out.println("\n\n\n Operações\n\n\n");
        
            System.out.println(" 1 - Consultar saldos.");
            System.out.println(" 2 - Depositar valor. ");
            System.out.println(" 3 - Transferir valor. ");
            System.out.println(" 4 - Sair. ");

            System.out.println("\n Digite a operação desejada: \n");
            int opt = input.nextInt();
            
            switch (opt) {
                case 1:
                    
                    clear.limpar();
                    System.out.printf("\n O seu saldo atual é: %.2f\n\n\n",saldo);
                    

                    break;
                case 2:

                    clear.limpar();
                    System.out.println("\n Informe o valor que você quer depositar na conta: ");
                    deposito = input.nextDouble();
                    saldo += deposito;

                    break;

                case 3: 

                    clear.limpar();
                    System.out.println("\n Informe o valor quer você quer transferir: ");
                    deposito = input.nextDouble();
                    
                    if (deposito > saldo){
                        System.out.println("\n O saldo é insuficiente para concluir a transação. ");
                        System.out.println("\n Saldo atual: "+saldo);
                    } else {
                        saldo -= deposito;
                        System.out.println("\n Saldo atual: "+saldo);
                    }
                    break;

                case 4:
                    
                    stay = false;

                    break;
            }
            

        } while (stay); 

    }
}
