public class Produto{
    public int codProd;
    public String descricaoProd;
    public double precoProd;

    public void imprimirProduto(){
        System.out.println("\n");
        System.out.println(" Código do produto: "+ this.codProd);
        System.out.println(" Descricao de produto: "+ this.descricaoProd);
        System.out.println(" Preco do produto: "+ this.precoProd);

    }
}
