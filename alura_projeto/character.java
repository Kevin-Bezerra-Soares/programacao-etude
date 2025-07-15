package alura_projeto;

import java.util.Random;

public class character {
    private String name;
    private int life;
    private int xp;
    private int atk;
    private int mana;
    private String specialPower;
    private int spPwManaCost;
    private String gender;
    private String type;
    private boolean live;
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(String specialPower) {
        this.specialPower = specialPower;
    }

    public int getSpPwManaCost() {
        return spPwManaCost;
    }

    public void setSpPwManaCost(int spPwManaCost) {
        this.spPwManaCost = spPwManaCost;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public void showStatus(){
        System.out.println("\n Personagem: "+ name);
        System.out.println(" Vida: "+ life);
        System.out.println(" XP: "+ xp);
        System.out.println(" Ataque: "+ atk);
        System.out.println(" Classe: "+ type);
        System.out.println(" Gênero: "+ gender);
        System.out.println(" Mana: "+ mana);
    }

    public int rollDie(){
        Random die = new Random();
        int range5die = 1 + die.nextInt(10);
        int damage = atk + range5die;
        return damage;
    }

    public void attack(character enemy, String specialPower,int spPwManaCost){ 
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

    public void attacked(character enemy){

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
