package alura_projeto;

public class rpgvania {
    public static void main(String[] args) {
        clear.limpar();

        character hero = new character();
        hero.name = "Kevin";
        hero.gender = "male";
        hero.life = 25;
        hero.atk = 2;
        hero.xp = 1;
        hero.type = "mage";
        hero.mana = 5;
        hero.specialPower = "'You shall not pass!'\n [atk + 5] [mp - 4]\n";
        hero.live = true;
        

        character zombie = new character();
        zombie.name = "Zumbi";
        zombie. life = 4;
        zombie.atk = 1;
        zombie.xp = 1;
        zombie.type = "zombie";
        zombie.live = true;

        hero.showStatus();
        hero.attacked(zombie);
        hero.attack(zombie,hero.specialPower);
        hero.attack(zombie,hero.specialPower);
        //hero.attack(zombie,hero.specialPower);
        hero.showStatus();
        zombie.showStatus();

    }
}
