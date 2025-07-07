package alura_projeto;

import java.util.Random;

public class character {
    String name;
    int life;
    int xp;
    int atk;
    int mana;
    String specialPower;
    int spPwManaCost;
    String gender;
    String type;
    boolean live;
    
    

    void character(String name, int life, int xp, int atk, int mana, String specialPower, int spPwManaCost,
            String gender, String type, boolean live) {
        this.name = name;
        this.life = life;
        this.xp = xp;
        this.atk = atk;
        this.mana = mana;
        this.specialPower = specialPower;
        this.spPwManaCost = spPwManaCost;
        this.gender = gender;
        this.type = type;
        this.live = live;
    }

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
        int damage = this.atk + range5die;
        return damage;
    }

    void attack(character enemy, String specialPower,int spPwManaCost){ 
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
                enemy.attacked(this);
                int damage = rollDie();
                enemy.life -= damage;
                this.mana -= this.spPwManaCost;
                if (enemy.life <= 0){
                    this.xp += enemy.xp;
                    enemy.live = false;
                    System.out.format("\n %s matou o %s com o ataque especial %s.\n O dano foi de %d e custou %d de magia!",this.name, enemy.name,this.specialPower,damage,this.spPwManaCost);
                } 
                else {
                    System.out.format("\n %s atacou o %s com o ataque especial %s.\n O dano foi de %d e custou %d de magia!",this.name, enemy.name,this.specialPower, damage,this.spPwManaCost);
                }
                
            }
            
        } else{
            System.out.println("\n Você já matou esse cara, não vai conseguir mais XP inssistindo!");
        }
    }
    void attacked(character enemy){

        if (this.type == "mage" && this.mana <= 0){
            System.out.println("\n Você está sem mana, perdeu esse turno, cuidado do para não ser atacado.");
        } else
        {
            if (enemy.specialPower.length()==0){
                this.life -= enemy.atk;
                System.out.println("\n"+this.name+" foi atacado pelo "+enemy.name+", tomou "+enemy.atk+" de dano! ");

            } 
            else{
                int damage = rollDie();
                this.life -= damage;
                System.out.println("\n"+this.name+" foi atacado pelo "+enemy.name+" tomou "+damage+" de dano! ");
                System.out.println();
            }
        }
        
    }

}
