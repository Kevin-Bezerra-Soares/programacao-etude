package alura_projeto;

public class character {
    String name;
    int life;
    int xp;
    int atk;
    String gender;
    String type;

    void ShowStatus(){
        System.out.println("\n Personagem: "+ name);
        System.out.println(" Vida: "+ life);
        System.out.println(" XP: "+ xp);
        System.out.println(" Ataque: "+ atk);
        System.out.println(" Classe: "+ type);
        System.out.println(" Gênero: "+ gender);
    }

    void attack(character enemy){
        enemy.attacked(this);
        System.out.println("\n"+this.name+" atacou o "+enemy.name+", ele tomou "+this.atk+" de dano! ");
        if (enemy.life <= 0){
            this.xp += enemy.xp;
            System.out.println("\n"+this.name+" matou o "+enemy.name);
        }

    }
    void attacked(character enemy){
        this.life -= enemy.atk;
        System.out.println("\n"+this.name+" foi atacado pelo "+enemy.name+" tomou "+enemy.atk+" de dano! ");
    }

}
