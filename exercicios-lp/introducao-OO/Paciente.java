import java.util.Calendar;

public class Paciente{
    private String codNome = "nome";
    private double codAltura;
    private double codPeso = 75.00;
    Calendar calend = Calendar.getInstance();
    private int codAno = calend.get(Calendar.YEAR);
    private int anoNascimento = 1999;
    private Double IMC;

    public String getNome (){
        return codNome;
    }

    public void setNome(String nome){
        codNome = nome;
    }
    
    public double getAltura(){
        return codAltura;
    }

    public void setAltura(Double altura){
        codAltura = altura;
    }

    public double getPeso(){
        return codPeso;
    }

    public void setPeso(Double peso){
        codPeso = peso;
    }

    public int getAnoNascimento(){
        return anoNascimento;
    }

    public void setAnoNascimento(int ano){
        anoNascimento = ano;
    }
        
    
    public void imprimirIdade(){
        
        int idade = codAno - anoNascimento;
        System.out.println("\n Sua idade: "+idade);
        
    }

    public void calcularIMC(){
        
        this.IMC = codPeso / (codAltura*2);
    }

    public void imprimirIMC(){
        if (this.IMC >= 40.00){
            System.out.println("\n "+this.IMC+" = obesidade grau III (mórbida).");
        }
        if (this.IMC <= 39.99 && this.IMC >= 35.00){
            System.out.println("\n "+this.IMC+" = obesidade grau II (severa).");
        } 
        if (this.IMC <= 34.99 && this.IMC >= 30.00){
            System.out.println("\n "+this.IMC+" = obesidade grau I.");
        } 
        if (this.IMC <= 29.9 && this.IMC >= 25.0){
            System.out.println("\n "+this.IMC+" = sobrepeso.");
        }
        if (this.IMC <= 24.9 && this.IMC >= 18.5){
            System.out.println("\n "+this.IMC+" = peso normal.");
        } 
        if (this.IMC < 18.5){
            System.out.println("\n "+this.IMC+" = abaixo do peso ideal.");
        }
    }
    
    public void imprimirInformacoes(){
        
    }

    
}
