package introducao_OO;


public class Pessoas{
    int id;
    String nome,endereco;

    public Pessoas(int ident, String name,String address){
        id = ident;
        nome = name;
        endereco = address;

    }

    public Pessoas(Pessoas p){
        id = p.id;
        nome = p.nome;
        endereco = p.endereco;

    }


    public void imprimirPessoas(){
        System.out.println("\n");
        System.out.println(" A identidade é: "+ this.id);
        System.out.println(" O nome é: "+ this.nome);
        System.out.println(" O endereço é: "+ this.endereco); 
    }
}
