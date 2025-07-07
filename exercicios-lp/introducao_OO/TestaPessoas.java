package introducao_OO;


public class TestaPessoas {
    public static void main(String args[]){
        Pessoas p1 = new Pessoas(777, "Kevin","Rua dos Alfeneiros");
        Pessoas p2 = new Pessoas(p1);  

        p1.imprimirPessoas();
        p2.imprimirPessoas();
    
    }
}
