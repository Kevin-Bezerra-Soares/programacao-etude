import java.util.Scanner;

public class MetodoDeJulia {
  
  public static void main (String[]args) {
    clear.limpar();
    int radicando, palpite, candidato, w, teste;
    Scanner entrada = new Scanner(System.in);

    System.out.println(" Digite o valor do radicando: ");
    radicando = entrada.nextInt();

    System.out.println(" Digite o palpite: ");
    palpite = entrada.nextInt();
    teste = 0;

    candidato = palpite + 1;
    w = palpite * palpite;

    while (teste != radicando){
      
      System.out.println("teste = " + teste);

      teste = w + palpite + candidato;
      if (teste == radicando){
        System.out.println(" A raiz é: " + candidato);
      }
      if (teste > radicando){
        System.out.println(" A raiz é irracional, paciência! ");
        break;
      }
      
      w = teste;
      palpite = candidato;
      candidato += 1;

    }
    entrada.close();
    
  }

}


