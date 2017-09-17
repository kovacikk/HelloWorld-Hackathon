public class Enemy {
    private static int health;
    private static int attack;
    private static int defense;
    private static int level;
    private static String name;
    private static String text;

    Enemy(String name, int health, int attack, int defense, int level, String text) {
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.level = level;
        this.name = name;
        this.text = text;
    }

    int getHealth(){
        return this.health;
    }

    int getAttack() {
        return this.attack;
    }

    int getDefense() {
        return this.defense;
    }

    int getLevel() {
        return this.level;
    }

    String getName() {
        return this.name;
    }

    String getText() {
        return this.text;
    }

    void setHealth(int newHealth){
        this.health = newHealth;
    }

    void setDefense(int newDefense){
        this.health = newDefense;
    }

    void setAttack(int newAttack){
        this.health = newAttack;
    }



}
