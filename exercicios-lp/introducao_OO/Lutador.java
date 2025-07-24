package introducao_OO;

public class Lutador {
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public void apresentar(){
        System.out.println("\n\n Lutador: "+ getNome());
        System.out.println(" Origem: "+ getNacionalidade());
        System.out.println(" "+getIdade() +" anos. ");
        System.out.printf(" %.2f m de altura. ",getAltura());
        System.out.printf(" Pesando: %.2f Kg",getPeso());
        System.out.println(" Ganhou: "+getVitorias());
        System.out.println(" Perdeu: "+getDerrotas());
        System.out.println(" Empatou: "+getEmpates());

    }
    public void status(){
        System.out.println("\n\n"+getNome());
        System.out.println(" é um peso "+getCategoria());
        System.out.println(getVitorias()+" vitórias ");
        System.out.println(getDerrotas()+" derrotas ");
        System.out.println(getEmpates()+" empates ");

    }
    public void ganharLuta(){
        setVitorias(getVitorias() + 1);

    }
    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);

    }
    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso,
            int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if (peso < 52.2){
            categoria = "Inválido";
        } else if (peso <= 70.3){
            categoria = "Leve";
        } else if (peso <= 83.9){
            categoria = "Médio";
        } else if (peso <= 120.2){
            categoria = "Pesado";
        } else {
            categoria = "Inválido";
        }
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }

    
    
}
