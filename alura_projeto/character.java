package alura_projeto;

import java.util.Random;

public class character {
    String name;
    int life;
    int xp;
    int atk;
    int mana;
    String specialPower;
    String gender;
    String type;
    boolean live;
    

    void showStatus(){
        System.out.println("\n Personagem: "+ name);
        System.out.println(" Vida: "+ life);
        System.out.println(" XP: "+ xp);
        System.out.println(" Ataque: "+ atk);
        System.out.println(" Classe: "+ type);
        System.out.println(" Gênero: "+ gender);
        System.out.println(" Mana: "+ mana);
    }

    int rollDie(){
        Random die = new Random();
        int range5die = 1 + die.nextInt(10);
        return range5die;
    }

    void attack(character enemy, String specialPower){
        
        if (enemy.live){

            if (specialPower.length() == 0){
                enemy.attacked(this);
                this.mana--;
                if (enemy.life <= 0){
                    this.xp += enemy.xp;
                    enemy.live = false;
                    System.out.println("\n"+this.name+" matou o "+enemy.name);
                }
            }
            else {
                enemy.life -= 5;
                this.mana -= 4;
                if (enemy.life <= 0){
                    this.xp += enemy.xp;
                    enemy.live = false;
                    System.out.format("\n %s matou o %s com o ataque especial %s!",this.name, enemy.name,this.specialPower);
                } 
                else {
                    System.out.format("\n %s atacou o %s com o ataque especial %s!",this.name, enemy.name,this.specialPower);
                }
                
            }
            
        } else{
            System.out.println("\n Você já matou esse cara, não vai conseguir mais XP inssistindo!");
        }
    }
    void attacked(character enemy){
        this.life -= enemy.atk;
        System.out.println("\n"+this.name+" foi atacado pelo "+enemy.name+" tomou "+enemy.atk+" de dano! ");
    }

}
