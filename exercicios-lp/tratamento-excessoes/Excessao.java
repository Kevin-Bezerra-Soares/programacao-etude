

public class Excessao {
    public static void main (String args[]) {
        clear.limpar();
        int numeros[] = {4,8,16,32,64,128};
        int denominador[] = {2,0,4,8,0};
        
        for (int i=0; i< numeros.length ; i++){
            System.out.println(numeros[i]+"/"+denominador[i]+" = "+(numeros[i]/denominador[i]));
        }

        //try{
            
            
            
        //} catch(ArrayIndexOutOfBoundsException exception){
        //    System.out.println("\n Gerou uma excessão na tentativa de acessar um index fora do tamanho do array! ");
        //}
    }
}
