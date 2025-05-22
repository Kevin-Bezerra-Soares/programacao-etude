// Faça um programa que possua um método
// chamado verificarTempo que recebe por parâmetro 
// tempo de duração de uma fábrica expressa em
// segundos. O método deve efetuar cálculos a fim de
// imprimir a equivalência do tempo recebido em
// horas, minutos e segundos.
import java.util.Scanner;

public class Exercicio4_8 {
    public static void main(String[] args) {
        clear.limpar();
        Scanner input = new Scanner(System.in);
        Double segundos;
        

        System.out.println("\n Informe o valor em segundos: ");
        segundos = input.nextDouble();
        verificarTempo(segundos);
        
    }

    public static void verificarTempo(Double segundos){
        
        int horas=0, minutos=0;
        while (segundos >= 3600.00) {
            segundos -= 3600.00;
            horas++;
        }
        while (segundos >= 60){
            segundos -= 60;
            minutos++;
        }
        System.out.println("Horas: "+horas+"\nMinutos: " + minutos+"\nSegundos: "+ segundos);
    }
    
}
