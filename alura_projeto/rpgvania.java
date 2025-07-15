package alura_projeto;
import java.util.Scanner;

public class rpgvania {
    public static void main(String[] args) {
        clear.limpar();

        Scanner input = new Scanner(System.in);
        character hero = new character();
        hero.setName("Maga Li");
        hero.setGender("female");
        hero.setLife(25);
        hero.setAtk(2);
        hero.setXp(2);
        hero.setType("mage");
        hero.setMana(10);
        hero.setSpecialPower("You shall not pass!");
        hero.setSpPwManaCost(3);
        hero.setLive(true);
        

        character zombie = new character();
        zombie.setName("Zumbi");
        zombie.setLife(4);
        zombie.setAtk(1);
        zombie.setXp(1);
        zombie.setType("zombie");
        zombie.setLive(true);
        zombie.setSpecialPower("");
    
        character soldierZombie = new character();
        soldierZombie.setName("Soldado Zumbi");
        soldierZombie.setLife(10);
        soldierZombie.setAtk(2);
        soldierZombie.setXp(5);
        soldierZombie.setType("zombie");
        soldierZombie.setLive(true);
        soldierZombie.setSpecialPower("");

        hero.showStatus();
        hero.attacked(soldierZombie);
        hero.attack(soldierZombie,hero.getSpecialPower(),hero.getSpPwManaCost());
        hero.attack(soldierZombie,hero.getSpecialPower(),hero.getSpPwManaCost());
        hero.attack(soldierZombie,hero.getSpecialPower(),hero.getSpPwManaCost());
        hero.showStatus();
        soldierZombie.showStatus();

    }

}
