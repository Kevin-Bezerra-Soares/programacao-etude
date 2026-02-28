package estatisAplicada;
import java.util.Scanner;

import alura_projeto.clear;


public class distri_freq_classes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        clear.limpar();

        
        
        int elementos,Xmin,Xmax,i;
        Double classes,A;
        System.out.println(" Informe o número de elementos: ");
        elementos = input.nextInt();

        int vet[] = new int[elementos];

        classes = (Math.ceil(1+3.3*(Math.log10(elementos))));
        
        System.out.println("Núemro de classes: "+ classes);

        System.out.println("Informe o menor elemento: ");
        Xmin = input.nextInt();

        System.out.println("Informe o maior elemento: ");
        Xmax = input.nextInt();

        A = Math.floor((Xmax-Xmin)/classes);

        System.out.println(" Amplitude de classes: "+ A);

        for (i=0;i<elementos;i++){
            System.out.println(" Informe um elemento: ");
            int elmnt = input.nextInt();

            if (elmnt >= Xmin && elmnt <= Xmax){
                vet[i] = elmnt;
            } else{
                System.out.println(" Elemento fora do range!");
            }


        }

        for (i=0;i<elementos;i++){
            System.out.println(vet[i]);
        }

    }
    
}
