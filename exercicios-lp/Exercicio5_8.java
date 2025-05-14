// Faça um programa que contenha um método
// chamado emitirConceito e que recebe a média final
// de um aluno por parâmetro e retorna o seu
// conceito, conforme a tabela:

import java.util.Scanner;

public class Exercicio5_8 {
    public static void main (String args []){
		clear.limpar();
        Scanner entrada = new Scanner(System.in);
        Double nota;
		char conceito;
        System.out.println(" Digite a nota do aluno: ");
		nota = entrada.nextDouble();
		
		conceito = emitirConceito(nota);
		System.out.println("\n Conceito: "+ conceito);
        entrada.close();

    }
	
	public static char emitirConceito(Double nota){
		if (nota >= 0.0 && nota <= 4.9){
			return 'D';
		}
		if (nota >= 5.0 && nota <= 6.9){
			return 'C';
		}
		if (nota >= 7.0 && nota <= 8.9){
			return 'B';
		}
		if (nota >= 9.0){
			return 'A';
		}
			
		return 'F';
	}
    
}


