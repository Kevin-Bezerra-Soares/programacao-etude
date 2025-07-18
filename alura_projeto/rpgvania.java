package alura_projeto;
import java.util.Scanner;

public class rpgvania {
    public static void main(String[] args) {
        clear.limpar();

        Scanner input = new Scanner(System.in);

        System.out.println("\n Informe o nome do personagem: ");
        String name = input.next();

        System.out.println("\n Informe o tipo do personagem: ");
        System.out.println("\n [1] - Guerreiro(a) \n [2] - Mago(a)");
        int type = input.nextInt();

        System.out.println("\n Informe o gênero do personagem: ");
        System.out.println("\n [H] - Homem \n [M] - Mulher");
        String gender = input.next();

        if (gender.equalsIgnoreCase("h")){
            gender = "homem";
        } else if (gender.equalsIgnoreCase("m")){
            gender = "mulher";
        } else {
            System.out.println("\n Opção indisponível! ");
        }

        character hero = new character(type,gender,name);

        //hero.setName("Maga Li");
        //hero.setGender("female");
        //hero.setLife(25);
        //hero.setAtk(2);
        //hero.setXp(2);
        //hero.setType("mage");
        //hero.setMana(10);
        //hero.setSpecialPower("You shall not pass!");
        //hero.setSpPwManaCost(3);
        //hero.setLive(true);
        

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
        hero.attack(soldierZombie,hero.getSpecialPower(),hero.getSpPowerCost());
        hero.attack(soldierZombie,hero.getSpecialPower(),hero.getSpPowerCost());
        hero.attack(soldierZombie,hero.getSpecialPower(),hero.getSpPowerCost());
        hero.showStatus();
        soldierZombie.showStatus();

        input.close();
    }

}
