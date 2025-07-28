package introducao_OO;
import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador L1,Lutador L2){
        if (L1.getCategoria().equals(L2.getCategoria()) && L1 != L2){
            this.aprovada = true;
            this.desafiado = L1;
            this.desafiante = L2;

        } else{
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
            
        }

    }

    public void lutar(){
        if (this.aprovada){
            System.out.println("\n |||| DESAFIADO ||||");
            this.desafiado.apresentar();

            System.out.println("\n |||| DESAFIANTE ||||");
            this.desafiante.apresentar();

            Random rand = new Random();
            int vencedor = rand.nextInt(3);
            
            switch (vencedor) {

                case 0:
                    System.out.println("\n Foi um empate! ");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break; 

                case 1:
                    System.out.println("\n O vencedor foi: "+ this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();    
                    break;

                case 2:
                    System.out.println("\n O vencedor foi: "+this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }


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
