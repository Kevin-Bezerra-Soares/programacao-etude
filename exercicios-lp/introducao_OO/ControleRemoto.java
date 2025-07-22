package introducao_OO;

public class ControleRemoto implements controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {

        this.volume = 50;
        this.ligado = false;
        this.tocando = false;

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void abrirMenu() {
        System.out.println("\n Está ligado? "+this.getLigado());
        System.out.println("\n Está tocando? "+this.getTocando());
        System.out.println("\n Volume: "+ this.getVolume());

        for (int i = 0; i <= this.getVolume();i+=5){
            System.out.print("|");

        }
        System.out.println("");
  
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(30);
        }
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("\n Fechando menu...");
        
    }

    @Override
    public void ligar() {
        this.setLigado(true);
        
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
        
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 1);
        }
        
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() -1);
        }
        
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
        
    }

    @Override
    public void play() {
        if (this.getLigado() && !this.getTocando()){
            this.setTocando(true);
        }
        
    }

    

    


}
