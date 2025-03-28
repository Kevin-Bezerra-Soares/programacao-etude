import java.util.Scanner;

public class notaConceito {
    public static void main (String args []){
        Scanner entrada = new Scanner(System.in);
        Double nota;
		char conceito;
        System.out.print(" Digite a nota do aluno: ");
		nota = entrada.nextDouble();
		
		emitirConceito(nota);

    }
	
	public static char emitirConceito(Double nota){
		if (nota >= 0.0 && nota <= 4.9){
			return 'D';
		}
		if (nota >= 5.0 && nota <= 6.9){
			System.out.println(" Conceito: C ");
		}
		if (nota >= 7.0 && nota <= 8.9){
			System.out.println(" Conceito: B ");
		}
		if (nota >= 9.0){
			System.out.println(" Parabéns, conceito: A ");
		}
			
		
	}
}