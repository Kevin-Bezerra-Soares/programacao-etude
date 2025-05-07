// Faça um programa que crie uma matriz 3x3x3 onde cada elemento da matriz será igual a soma de seus índices.
//      Por exemplo: M[1][2][1]= 1 + 2 + 1 = 4
// Assim, obteha a soma de todos os elementos da matriz e obtenha a soma dos elementos cujos valores são pares 
// e a soma dos elementos cujos valores são ímpares.
// Imprimir a matriz, e em seguida as somas obtidas.

public class Exercicio8_4 {
  public static void main(String args[]) {
    clear.limpar();
    int M[][][], i, j, z,soma=0,pares=0,impares=0;
    M = new int [3][3][3];

    for (i=0;i<3;i++){
      for (j=0;j<3;j++){
        for (z=0;z<3;z++){
          M[i][j][z] = i + j + z;
          soma += M[i][j][z];
          
          if ((i+j+z)%2 == 0){
            pares += M[i][j][z];
          } else{
            impares += M[i][j][z];
          }

          System.out.print("["+i+"] ["+j+"] ["+z+"]= "+ M[i][j][z]+" |\t");
        }
        System.out.println(" ");
      }
      System.out.println(" \n");
    }
    
    System.out.println(" A soma de todos os elementos da matriz é: "+soma);
    System.out.println(" A soma dos elementos pares é: "+pares);
    System.out.println(" A soma dos elementos ímpares: "+impares);
      
  }
}
