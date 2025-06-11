public class TestaProduto {
    public static void main(String[] args){
        clear.limpar();
        Produto p1 = new Produto();
        p1.codProd=123;
        p1.descricaoProd="Protetor Solar";
        p1.precoProd=79.9;
        p1.imprimirProduto();

        Produto p2 = new Produto();
        p2.codProd=111;
        p2.descricaoProd="Sabonete";
        p2.precoProd=2.5;
        p2.imprimirProduto();
    }
}
