public class Player {
    private static double health;
    private static int attack;
    private static int defense;
    private static int magicMeter;
    private static int ultimateMeter;
    private static int level;
    private static int experience;
    private static int charChoice2; // same as original just one that bypasses stuff
    private static double tempHealth;
    private static int tempDefense;
    private static int tempAttack;
    private static boolean isSnowballDead;
    private static int counter;
    private static boolean isImpen;
    private static int turnCounter;
    private static int turnCounter2;

    Player(int charChoice){
        this.level = 1;
        this.experience = 0;
        this.charChoice2 = charChoice;
        this.tempHealth = tempHealth;
        this.isSnowballDead = false;
        this.counter = 0;
        this.tempDefense = tempDefense;
        this.tempAttack = tempAttack;
        this.isImpen = false;
        this.turnCounter = 0;
        this.turnCounter2 = 0;

        if (charChoice == 1) { //Computer Science
            this.health = 60;
            this.attack = 10;
            this.defense = 7;
            this.magicMeter = 50;

        }
        else if (charChoice == 2) { // Mechanic
            this.health = 70;
            this.attack = 15;
            this.defense = 10;
            this.magicMeter = 10;
        }
        else if (charChoice == 3) { // Aviator
            this.health = 80;
            this.attack = 5;
            this.defense = 13;
            this.magicMeter = 10;

        }
    }

    double getHealth() {
        return this.health;
    }

    int getAttack() {
        return this.attack;
    }

    int getDefense() {
        return this.defense;
    }

    int getMagicMeter() {
        return this.magicMeter;
    }

    int getLevel() {
        return this.level;
    }

    int getExperience() {
        return this.experience;
    }

    int getcharChoice2() {
        return this.charChoice2;
    }

    double getTempHealth() {
        return this.tempHealth;
    }

    boolean getIsSnowballDead() {
        return isSnowballDead;
    }

    boolean getIsImpen() {
        return this.isImpen;
    }

    int getTempDefense(){
        return this.tempDefense;
    }

    int getCounter() {
        return this.counter;
    }

    int getTurnCounter2() {
        return this.turnCounter2;
    }

    int getTempAttack() {
        return this.tempAttack;
    }

    void setExperience(int newExperience) {
        this.experience = newExperience;
    }

    void setTempHealth(double newTempHealth) {
        this.tempHealth = newTempHealth;
    }

    void setIsSnowballDeadToTrue() {
        this.isSnowballDead = true;
    }

    void setCounter(int newCounter) {
        this.counter = newCounter;
    }

    void setTempDefense(int newTempDefense) {
        this.tempDefense = newTempDefense;
    }

    void setIsImpen(boolean newIsImpen) {
        this.isImpen = newIsImpen;
    }
    void setTempAttack(int newTempAttack) {
        this.tempAttack = newTempAttack;
    }

    int getTurnCounter() {
        return this.turnCounter;
    }
    void setTurnCounter2(int newTurnCounter2) {
        this.turnCounter2 = newTurnCounter2;
    }

    void setTurnCounter(int newTurnCounter) {
        this.turnCounter = newTurnCounter;
    }
    void checkLevelUp(int charChoice) {
        double experienceRequirement = level * 1.5 * 50;

        while (experience >= experienceRequirement) {
            level++;

            //May add random stat changes later
            if(charChoice == 1) {
                this.health += 10;
                this.attack += 5;
                this.defense += 2;
                this.magicMeter += 10;
            }
            else if (charChoice == 2) {
                this.health += 12;
                this.attack += 10;
                this.defense += 5;
                this.magicMeter += 5;
            }
            else if (charChoice == 3) {
                this.health += 15;
                this.attack += 3;
                this.defense += 8;
                this.magicMeter += 5;
            }
            System.out.println("Nice job, Dunsmore, you leveled up!\nYour level is now " + this.level);
            experienceRequirement = level * 1.5 * 100;


        }
    }

    boolean isDead() {
        if (this.tempHealth <= 0) {
            return true;
        }
        return false;
    } //Should probably be in combat




}
