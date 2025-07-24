package alura_projeto;

import java.util.Scanner;
import java.util.Random;

public class character implements personagem {
    private String name;
    private int life;
    private int xp;
    private int atk;
    private int maxEffort;
    private String specialPower;
    private String gender;
    private String type;
    private boolean live;
    private int spPowerCost;
    

    public character (){

        this.setName("Maga");
        this.setGender("Mulher");;
        this.setLife(25);
        this.setAtk(2);
        this.setXp(2);
        this.setType("mage");
        this.setMaxEffort(10);
        this.setSpecialPower("you shall not pass");
        this.setSpPowerCost(3);
        this.setLive(true);

    }

    public character (String name){
        this.name = name;

        switch (name) {
            case "Zumbi":
                this.setLife(4);
                this.setAtk(1);
                this.setXp(1);
                this.setType("Zumbi");
                this.setLive(true);
                this.setSpecialPower("");
                break;
            
            case "Soldado Zumbi":
                this.setLife(10);
                this.setAtk(3);
                this.setType("zombie"); 
                this.setXp(3); 
                this.setLive(true); 
                this.setSpecialPower("");
                break;
        }


    }
    
    public character (int opt, String gender, String name){
        

        switch (opt){
            case 1: // Guerreiro

                this.type = "warrior";
                this.gender = gender;
                this.name = name;

                this.life = 50;
                this.atk = 5;
                this.xp = 2;
                this.maxEffort = 15;
                this.specialPower = "faz o L";
                this.spPowerCost = 4;
                this.live = true;
            break;

            case 2: // Mago

                this.type = "mage";
                this.gender = gender;
                this.name = name;

                this.life = 25;
                this.atk = 2;
                this.xp = 2;
                this.maxEffort = 10;
                this.specialPower = "you shall not pass";
                this.spPowerCost = 3;
                this.live = true;
            break;
        }

        showStatus();

    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getLife() {
        return life;
    }

    private void setLife(int life) {
        this.life = life;
    }

    private int getXp() {
        return xp;
    }

    private void setXp(int xp) {
        this.xp = xp;
    }

    private int getAtk() {
        return atk;
    }

    private void setAtk(int atk) {
        this.atk = atk;
    }

    private int getMaxEffort() {
        return maxEffort;
    }

    private void setMaxEffort(int mana) {
        this.maxEffort = mana;
    }

    private String getSpecialPower() {
        return specialPower;
    }

    private void setSpecialPower(String specialPower) {
        this.specialPower = specialPower;
    }

    private int getSpPowerCost() {
        return spPowerCost;
    }

    private void setSpPowerCost(int spPowerCost) {
        this.spPowerCost = spPowerCost;
    }

    private String getGender() {
        return gender;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }

    private String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }

    private boolean getLive() {
        return live;
    }

    private void setLive(boolean live) {
        this.live = live;
    }

    @Override
    public void showStatus(){
        System.out.println("\n Personagem: "+ name);
        System.out.println(" Vida: "+ life);
        System.out.println(" XP: "+ xp);
        System.out.println(" Ataque: "+ atk);
        System.out.println(" Classe: "+ type);
        System.out.println(" Gênero: "+ gender);
        System.out.println(" Mana: "+ maxEffort);
    }

    @Override
    public int rollDie(){
        Random die = new Random();
        int range5die = 1 + die.nextInt(10);
        int damage = atk + range5die;
        return damage;
    }

    @Override
    public void attack(character enemy){ 
        if (enemy.live){

            if (this.getSpecialPower().length() == 0){
                
                enemy.life -= this.atk;

                if (enemy.life <= 0){
                    this.xp += enemy.atk;
                    enemy.live = false;
                    System.out.println("\n"+this.name+" matou o "+enemy.name+" o dano foi de "+this.atk);
                } else{
                    System.out.printf("\n O desgraçado ainda está vivo e tomou %d de dano. ", this.atk);
                }
            }
            else {
               
                int damage = rollDie();
                enemy.life -= damage;
                this.maxEffort -= this.spPowerCost;
                if (enemy.life <= 0){
                    this.xp += enemy.xp;
                    enemy.live = false;
                    System.out.format("\n %s matou o %s com o ataque especial %s.\n O dano foi de %d e custou %d de magia!",this.name, enemy.name,this.specialPower,damage,this.spPowerCost);
                } 
                else {
                    System.out.format("\n %s atacou o %s com o ataque especial %s.\n O dano foi de %d e custou %d de magia!",this.name, enemy.name,this.specialPower, damage,this.spPowerCost);
                }
                
            }
            
        } else{
            System.out.println("\n Você já matou esse cara, não vai conseguir mais XP inssistindo!");
        }
    }



    //@Override
    //public void attack() {
        // TODO Auto-generated method stub
    //    throw new UnsupportedOperationException("Unimplemented method 'attack'");
    //}

    //@Override
    //public void attacked() {
        // TODO Auto-generated method stub
    //    throw new UnsupportedOperationException("Unimplemented method 'attacked'");
    //}

}