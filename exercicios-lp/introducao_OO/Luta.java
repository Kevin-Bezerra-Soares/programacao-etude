package introducao_OO;
import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador L1,Lutador L2){
        if (L1.getCategoria() == L2.getCategoria() && L1 != L2){
            aprovada = true;
            desafiado = L1;
            desafiante = L2;

        } else{
            aprovada = false;
            desafiante = null;
            desafiado = null;
            
        }

    }

    public void lutar(){
        if (aprovada){
            desafiado.apresentar();
            desafiante.apresentar();

            //int vencedor = new Random(2);
            
        } else {
            System.out.println("\n Luta inválida! \n Os lutadores precisam ser da mesma categoria e não podem ser a mesma pessoa.\n");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    
}
