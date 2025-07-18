package alura_projeto;

import java.util.Scanner;
import java.util.Random;

public class character {
    private String name;
    private int life;
    private int xp;
    private int atk;
    private int esforco;
    private String specialPower;
    private String gender;
    private String type;
    private boolean live;
    private int spPowerCost;
    

    public character (){

        this.name = "Maga";
        this.gender = "female";
        this.life = 25;
        this.atk = 2;
        this.xp = 2;
        this.type = "mage";
        this.esforco = 10;
        this.specialPower = "You shall not pass!";
        this.spPowerCost = 3;
        this.live = true;

    }

    public character (String name){
        this.name = name;

        switch (name) {
            case "Zumbi":
                this.life = 4;
                this.atk = 1;
                this.xp = 1;
                this.type = "zombie";
                this.live = true;
                this.specialPower="0";
                break;
            
            case "Soldado Zumbi":
                setLife(10);
                this.atk = 3;
                this.type = "zombie";
                this.xp = 3;
                this.live = true;
                this.specialPower="0";
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
                this.esforco = 15;
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
                this.esforco = 10;
                this.specialPower = "you shall not pass";
                this.spPowerCost = 3;
                this.live = true;
            break;
        }

        showStatus();

    }

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
        return esforco;
    }

    public void setMana(int mana) {
        this.esforco = mana;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(String specialPower) {
        this.specialPower = specialPower;
    }

    public int getSpPowerCost() {
        return spPowerCost;
    }

    public void setSpPowerCost(int spPowerCost) {
        this.spPowerCost = spPowerCost;
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
        System.out.println(" Mana: "+ esforco);
    }

    public int rollDie(){
        Random die = new Random();
        int range5die = 1 + die.nextInt(10);
        int damage = atk + range5die;
        return damage;
    }

    public void attack(character enemy, String specialPower,int spPowerCost){ 
        if (enemy.live){

            if (specialPower.length() == 0){
                enemy.attacked(this);
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
                this.esforco -= this.spPowerCost;
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

    public void attacked(character enemy){

        if (this.type == "mage" && this.esforco <= 0){
            System.out.println("\n Você está sem mana, perdeu esse turno, cuidado do para não ser atacado.");
        } else
        {
            if ("0".equalsIgnoreCase(enemy.specialPower)){
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
