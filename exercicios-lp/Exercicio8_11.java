// Faça um programa para armazenar 100 números inteiros
// em um vetor chamado Numeros. Em seguida chamar um
// método denominado somarPares que:
//  - recebe o vetor Numeros por parâmetro;
//  - soma os números pares; e
//  - retorna o total da soma para a função principal a fim de
// imprimir esse total.

//import java.util.Scanner;
import java.util.Random;

public class Exercicio8_11 {

    public static void main(String[] args) {
        clear.limpar();
        //Scanner input = new Scanner(System.in); 
        Random rand = new Random();
        int Numeros [] = new int [100];

        for (int i=0; i<100; i++){
            Numeros[i] = rand.nextInt(100); 
        }
        int resultado = somarPares(Numeros);
        System.out.println("\n A soma dos números pares do vetor é: "+resultado);
    }

    public static int somarPares(int Numeros[]){
        int pares=0;

        for (int i=0; i<100;i++){
            if((Numeros[i] > 0)&&(Numeros[i]%2 == 0)){
                pares+= Numeros[i];
                System.out.println(Numeros[i]);
            }
        }

        return pares;
    }
    
}
