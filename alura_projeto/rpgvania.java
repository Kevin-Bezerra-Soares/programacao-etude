package alura_projeto;

public class rpgvania {
    public static void main(String[] args) {
        clear.limpar();

        character hero = new character();
        //hero.name = "Kevin";
        //hero.gender = "male";
        //hero.life = 25;
        //hero.atk = 2;
        //hero.xp = 1;
        //hero.type = "mage";
        //hero.mana = 5;
        //hero.specialPower = "'You shall not pass!'";
        //hero.spPwManaCost = 4;
        //hero.live = true;
        

        character zombie = new character();
        //zombie.name = "Zumbi";
        //zombie. life = 4;
        //zombie.atk = 1;
        //zombie.xp = 1;
        //zombie.type = "zombie";
        //zombie.live = true;
        //zombie.specialPower = "";

        character soldierZombie = new character();
        //soldierZombie.name = "Soldier Zumbi";
        //soldierZombie. life = 10;
        //soldierZombie.atk = 10;
        //soldierZombie.xp = 5;
        //soldierZombie.type = "zombie";
        //soldierZombie.live = true;
        //soldierZombie.specialPower = "";

        hero.showStatus();
        hero.attacked(soldierZombie);
        hero.attack(soldierZombie,hero.specialPower,hero.spPwManaCost);
        hero.attack(soldierZombie,hero.specialPower,hero.spPwManaCost);
        hero.attack(soldierZombie,hero.specialPower,hero.spPwManaCost);
        hero.showStatus();
        soldierZombie.showStatus();

    }
}
