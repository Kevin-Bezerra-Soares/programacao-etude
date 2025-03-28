import java.util.Scanner;

public class parNum {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.print(" Digite o valor inteiro: ");
        num = entrada.nextInt();
        testPar(num);
    }
}

public static void testPar (int num) {
    //Scanner entrada = new Scanner(System.in);
    if (num%2 == 0){
        System.out.println("Valor par");
    }
    else {
        System.out.println("Valor impar");
    }
    return;
}