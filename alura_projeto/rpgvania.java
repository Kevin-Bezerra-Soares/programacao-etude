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


        character zombie = new character("Zumbi");
   
    
        character soldierZombie = new character("Soldado Zumbi");
      
        soldierZombie.showStatus();
        soldierZombie.attack(hero);
        hero.attack(soldierZombie);
        hero.attack(soldierZombie);
        hero.attack(soldierZombie);
        hero.showStatus();
        soldierZombie.showStatus();

        input.close();
    }

}
