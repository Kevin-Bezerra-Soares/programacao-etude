import java.util.Scanner;

public class Exercicio3_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        clear.limpar();
        Double nota1,nota2;
        String parametro;


        System.out.println("\n Informe a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.println("\n Informe a segunda: ");
        nota2 = input.nextDouble();
        System.out.println("\n Digite [A] para calcular média aritmética ou [B] para calcular média ponderada.");
        parametro = input.next();
        Double result = calcularMedia(nota1,nota2,parametro);
        System.out.println("\n A média é: "+ result);
        input.close();

    }

    public static Double calcularMedia (Double nota1, Double nota2, String parametro){
        Double media=0.0;
        

        if (parametro.equalsIgnoreCase("A")){
            media = (nota1+nota2)/2;
        } else if (parametro.equalsIgnoreCase("B")){
            media = ((nota1*7)+(nota2*3))/10;
        } else {
            System.out.println("\n Parâmetro inválido! ");
        }

        return media;
    }

}
