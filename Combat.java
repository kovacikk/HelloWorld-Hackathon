import java.util.*;

public class Combat {

    Scanner scan = new Scanner(System.in);
    Random ran = new Random();
    boolean Impen = false;
    boolean isDefense = false;
    boolean isDefenseAndAttack = false;

    void playeroptions(Enemy e, Player p) {
        System.out.println("What will you do:\n(1) Attack\n(2) Specials\n(3) Ultimates\n(4) Inspect Battlefield");
        Combat c = new Combat();


        int optionInput = scan.nextInt();
        if(optionInput == 1) {
            c.playerAttack(e, p);
        }
        else if (optionInput == 2) {
            c.playerSpecials(p.getcharChoice2(), p, e);
        }
        else if(optionInput == 3) {
            c.playerUltimates(p, e, p.getIsSnowballDead());
        }
        else if(optionInput == 4) {
            c.playerInspect(e, p);
        }
        else {
            System.out.println("You decide to stare at some leaves instead of focusing on the battle, losing you a turn");
        }
    }

    void playerUltimates(Player p, Enemy e, boolean isSnowballDead) {
        Combat c = new Combat();
        if (!isSnowballDead) {
            System.out.println("This isn't available to you yet!?!?!");
            return;
        }
        System.out.println("Pick Your Ultimate:\n(1) Java says no\n(2) Back");
        int ultimateInput = scan.nextInt();

        if(ultimateInput == 1) {
            System.out.println("With the power of your rage, you unleash your signature move, JAVA SAYS NO\nYelling at the top of your lungs, you slap " + e.getName() + "for massive damage");
            System.out.println("Dunsmore: IT TURNS OUT...\nJAVA\nSAYS\nNO!!!!!!!!!!!!!!!!!!\n!!!!!!!!!!!!!!!!!\n!!!!!!!!!!!!!!!!!!\n!!!!!!!!!!!!!!!!!!\n");
            e.setHealth(e.getHealth() - 99999999);
            System.out.println(e.getName() + "'s health: " + e.getHealth());
            System.out.println("\nThe Game Designers: Oh my god, Dunsmore that was a little overboard wasn't it?!?!!");
            ;
        }
        else if (ultimateInput == 2) {
            c.playeroptions(e, p);
        }
        else {
            System.out.println("You flounder about loosing a turn");
        }

    }

    void playerSpecials(int charChoice, Player p, Enemy e) { //Still need to actually implement the specials
        Combat c = new Combat();
        if (charChoice == 1) {
            if (p.getLevel() < 5) {
                System.out.println("Which Special:\n(1) Attack.java\n(2) Back");
                int specialInput = scan.nextInt();
                if (specialInput == 1) {
                    System.out.println("You quickly code together a small attack.java file in order to damage the enemy");
                    System.out.println("It does 20 damage flat, ignores defense\n");
                    e.setHealth(e.getHealth() - 20);
                    System.out.println(e.getName() + "'s health is: " + e.getHealth());
                }
                else if(specialInput == 2) {
                    c.playeroptions(e, p);
                }
                else {
                    System.out.println("You flounder about and end up wasting a turn");
                }

            }
            else if (p.getLevel() < 10) {
                System.out.println("Which Special:\n(1) Attack.java\n(2) Heal.java\n(3) Back");
                int specialInput = scan.nextInt();
                if (specialInput == 1) {
                    System.out.println("You quickly code together a small attack.java file in order to damage the enemy");
                    System.out.println("It does 20 damage flat, ignores defense\n");
                    e.setHealth(e.getHealth() - 20);
                    System.out.println(e.getName() + "'s health is: " + e.getHealth());
                }
                else if(specialInput == 2) {
                    System.out.println("You whip up a nic soothing Heal.java file in order to soothe your wounds during the battle");
                    System.out.println("It heals 30%\n");
                    if ((p.getTempHealth() + (p.getHealth() * 0.30)) >= p.getHealth()) {
                        p.setTempHealth(p.getHealth());
                    } else {

                        p.setTempHealth(p.getTempHealth() + (p.getHealth() * 0.30));
                     }
                    System.out.println("Your Health: " + p.getTempHealth());
                }
                else if(specialInput == 3) {
                    c.playeroptions(e, p);
                }
                else {
                    System.out.println("You flounder about and end up wasting a turn");
                }

            }
            else if (p.getLevel() >= 10) {
                System.out.println("Which Special:\n(1) Attack.java\n(2) Heal.java\n(3) PalindromeAttack.java\n(4) Back");
                int specialInput = scan.nextInt();
                if (specialInput == 1) {
                    System.out.println("You quickly code together a small attack.java file in order to damage the enemy");
                    System.out.println("It does 20 damage flat, ignores defense\n");
                    e.setHealth(e.getHealth() - 20);
                    System.out.println(e.getName() + "'s health is: " + e.getHealth());
                }
                else if (specialInput == 2) {
                    System.out.println("You whip up a nic soothing Heal.java file in order to soothe your wounds during the battle");
                    System.out.println("It heals 30%\n");
                    if ((p.getTempHealth() + (p.getHealth()*0.30)) >= p.getHealth()) {
                        p.setTempHealth(p.getHealth());
                    }
                    else {
                        p.setTempHealth(p.getTempHealth() + (p.getHealth() * 0.30));
                    }
                    System.out.println("Your Health: " + p.getTempHealth());
                }
                else if (specialInput == 3) {
                    System.out.println("You gather together all of your intense knowledge on palindromes and unleash it on the enemy as a true veteran");
                    System.out.println("IT DOES 50 FIXED DAMAGE!!!");
                    e.setHealth((e.getHealth() - 50));
                    System.out.println(e.getName() + "'s health is " + e.getHealth());
                }
                else if(specialInput == 4) {
                    c.playeroptions(e, p);
                }
                else {
                    System.out.println("You flounder about and end up wasting a turn");
                }
            }
        }
        else if (charChoice == 2) {
            if (p.getLevel() < 5) {
                System.out.println("Which Special:\n(1) MiniRobot.java\n(2) Back");
                int specialInput = scan.nextInt();
                if (specialInput == 1) {
                    System.out.println("Dunsmore using the materials from his enemies produces a MiniRobot.java that attacks");
                    System.out.println("The Mini Robot runs in for an attempt to do good damage!!!");
                    int minibotDamage =  15 * ran.nextInt(3);
                    System.out.println("MiniRobot.java does " + minibotDamage + "!");
                    if (minibotDamage == 0) {
                        System.out.println("Ooooh, that was a miss...");
                    }
                    e.setHealth(e.getHealth() - minibotDamage);
                }
                else if(specialInput == 2) {
                    c.playeroptions(e, p);
                }
                else {
                    System.out.println("You flounder about and end up wasting a turn");
                }
            }
            else if (p.getLevel() < 10) {
                System.out.println("Which Special:\n(1) MiniRobot.java\n(2) Bridge.class\n(3) Back");
                int specialInput = scan.nextInt();
                if (specialInput == 1) {
                    System.out.println("Dunsmore using the materials from his enemies produces a MiniRobot.java that attacks");
                    System.out.println("The Mini Robot runs in for an attempt to do good damage!!!");
                    int minibotDamage =  15 * ran.nextInt(3);
                    System.out.println("MiniRobot.java does " + minibotDamage + "!");
                    if (minibotDamage == 0) {
                        System.out.println("Ooooh, that was a miss...");
                    }
                    e.setHealth(e.getHealth() - minibotDamage);
                }
                else if (specialInput == 2) {
                    System.out.println("Dunsmore quickly assembles a Bridge.class and positions it in order to defend himself");
                    System.out.println("Gives Dunsmore + 15 defense");
                    if (p.getTurnCounter() == 0) {
                        isDefense = true;
                    }
                    else if (p.getTurnCounter() > 0) {
                        System.out.println("You are already buffed...");
                    }
                    System.out.println("Defense is now " + p.getTempDefense());
                }
                else if(specialInput == 3) {
                    c.playeroptions(e, p);
                }
                else {
                    System.out.println("You flounder about and end up wasting a turn");
                }

            }
            else if (p.getLevel() >= 10) {
                System.out.println("Which Special:\n(1) MiniRobot.java\n(2) Bridge.class\n(3) BuffBoi.java\n(4) Back");
                int specialInput = scan.nextInt();
                if (specialInput == 1) {
                    System.out.println("Dunsmore using the materials from his enemies produces a MiniRobot.java that attacks");
                    System.out.println("The Mini Robot runs in for an attempt to do good damage!!!");
                    int minibotDamage =  15 * ran.nextInt(3);
                    System.out.println("MiniRobot.java does " + minibotDamage + "!");
                    if (minibotDamage == 0) {
                        System.out.println("Ooooh, that was a miss...");
                    }
                    e.setHealth(e.getHealth() - minibotDamage);
                }
                else if (specialInput == 2) {
                    System.out.println("Dunsmore quickly assembles a Bridge.class and positions it in order to defend himself");
                    System.out.println("Gives Dunsmore + 15 defense");
                    if (p.getTurnCounter() == 0) {
                        isDefense = true;
                    }
                    else if (p.getTurnCounter() > 0) {
                        System.out.println("You are already buffed...");
                    }
                    System.out.println("Defense is now " + p.getTempDefense());

                }
                else if (specialInput == 3) {
                    System.out.println("Dunsmore decides he wants to write a program in order to increase his attack and defense!!!");
                    System.out.println("Gives Dunsmore +10 defense AND +5 attack");
                    if (p.getTurnCounter2() == 0) {
                        isDefenseAndAttack = true;
                    }
                    else if (p.getTurnCounter2() > 0) {
                        System.out.println("You are already buffed...");
                    }
                    System.out.println("Attack is now " + p.getTempAttack());
                    System.out.println("Defense is now " + p.getTempDefense());

                }
                else if(specialInput == 4) {
                    c.playeroptions(e, p);
                }
                else {
                    System.out.println("You flounder about and end up wasting a turn");
                }
            }
        }
        else if (charChoice ==3) {
            if (p.getLevel() < 5) {
                System.out.println("Which Special:\n(1) HeftyHeal.java\n(2) Back");
                int specialInput = scan.nextInt();
                if (specialInput == 1) {
                    System.out.println("Dunsmore crafts the HeftyHeal.java to heal.\nDon't tell him, but it's actually not that hefty");
                    System.out.println("He heals for a static 30 health");

                    if ((p.getTempHealth() + 30) >= p.getHealth()) {
                        p.setTempHealth(p.getHealth());
                    }
                    else {
                        p.setTempHealth(p.getTempHealth() + 30);
                    }
                    System.out.println("Your Health: " + p.getTempHealth());
                }
                else if(specialInput == 2) {
                    c.playeroptions(e, p);
                }
                else {
                    System.out.println("You flounder about and end up wasting a turn");
                }

            }
            else if (p.getLevel() < 10) {
                System.out.println("Which Special:\n(1) HeftyHeal.java\n(2) PlanePounder.java\n(3) Back");
                int specialInput = scan.nextInt();
                if (specialInput == 1) {
                    System.out.println("Dunsmore crafts the HeftyHeal.java to heal.\nDon't tell him, but it's actually not that hefty");
                    System.out.println("He heals for a static 30 health");

                    if ((p.getTempHealth() + 30) >= p.getHealth()) {
                        p.setTempHealth(p.getHealth());
                    }
                    else {
                        p.setTempHealth(p.getTempHealth() + 30);
                    }
                    System.out.println("Your Health: " + p.getTempHealth());
                }
                else if (specialInput == 2) {
                    System.out.println("Dunsmore charges up his well-known, PlanePounder.java, and sicks it on the enemy");
                    System.out.println("Does moderate chance damage");
                    int planedamage = 30 * ran.nextInt(3);
                    System.out.println("Your PlanePounder.java does " + planedamage + "!!!");
                    if (planedamage == 0){
                        System.out.println("Ouch, that was a miss");
                    }
                    e.setHealth(e.getHealth() - planedamage);
                    System.out.println(e.getName() + "'s health is " + e.getHealth());
                }
                else if(specialInput == 3) {
                    c.playeroptions(e, p);
                }
                else {
                    System.out.println("You flounder about and end up wasting a turn");
                }

            }
            else if (p.getLevel() >= 10) {
                System.out.println("Which Special:\n(1) HeftyHeal.java\n(2) PlanePounder.java\n(3) ImpenitrableIndex.java\n(4) Back");
                int specialInput = scan.nextInt();
                if (specialInput == 1) {
                    System.out.println("Dunsmore crafts the HeftyHeal.java to heal.\nDon't tell him, but it's actually not that hefty");
                    System.out.println("He heals for a static 30 health");

                    if ((p.getTempHealth() + 30) >= p.getHealth()) {
                        p.setTempHealth(p.getHealth());
                    }
                    else {
                        p.setTempHealth(p.getTempHealth() + 30);
                    }
                        System.out.println("Your Health: " + p.getTempHealth());
                }
                else if (specialInput == 2) {
                    System.out.println("Dunsmore charges up his well-known, PlanePounder.java, and sicks it on the enemy");
                    System.out.println("Does moderate chance damage");
                    int planedamage = 30 * ran.nextInt(3);
                    System.out.println("Your PlanePounder.java does " + planedamage + "!!!");
                    if (planedamage == 0){
                        System.out.println("Ouch, that was a miss");
                    }
                    e.setHealth(e.getHealth() - planedamage);
                    System.out.println(e.getName() + "'s health is " + e.getHealth());
                }
                else if (specialInput == 3) {
                    System.out.println("Using ImpenitrableIndex.java, Dunsmore is able to absorb and then reflect all damage back on the enemy");
                    p.setIsImpen(true);
                }
                else if(specialInput == 4) {
                    c.playeroptions(e, p);
                }
                else {
                    System.out.println("You flounder about and end up wasting a turn");
                }
            }
        }
    }

    void playerInspect(Enemy e, Player p) {
        System.out.println("");
        if (p.getCounter() == 0) {
            System.out.println("-----------------");
            System.out.println("Enemy Name: " + e.getName());
            System.out.println("-----------------");
            System.out.println("Your Health: " + p.getTempHealth() + "\nYour Attack: " + p.getAttack() + "\nYour Defense: " + p.getDefense() + "\nYour Special Meter: " + p.getMagicMeter());
            System.out.println("-----------------");
        }
        else if (p.getCounter() == 1) {
            System.out.println("-----------------");
            System.out.println("Enemy Name: " + e.getName() + "\nEnemy Health: " + e.getHealth() + "\nEnemy Attack: " + e.getAttack() + "\nEnemy Defense: " + e.getDefense());
            System.out.println("-----------------");
            System.out.println("Your Health: " + p.getTempHealth() + "\nYour Attack: " + p.getAttack() + "\nYour Defense: " + p.getDefense() + "\nYour Special Meter: " + p.getMagicMeter());
            System.out.println("-----------------");
        }
        if (p.getCounter() == 2) {
            System.out.println("-----------------");
            System.out.println("Enemy Name: " + e.getName() + "\nEnemy Health: " + e.getHealth() + "\nEnemy Attack: " + e.getAttack() + "\nEnemy Defense: " + e.getDefense() + "\nEnemy Lore: " + e.getText());
            System.out.println("-----------------");
            System.out.println("Your Health: " + p.getTempHealth() + "\nYour Attack: " + p.getAttack() + "\nYour Defense: " + p.getDefense() + "\nYour Special Meter: " + p.getMagicMeter());
            System.out.println("-----------------");
        }
        p.setCounter(p.getCounter() + 1);
    }

    void enemyAttack(Enemy e, Player p) {
        int baseattack = 12 * ran.nextInt(3);

        if (baseattack == 24) {
            System.out.println(e.getName() + " scores his critical hit!!!");
        }

        int damageThisTurn = baseattack - p.getTempDefense() + e.getAttack();
        if (damageThisTurn <= 0) {
            damageThisTurn = 0;
            System.out.println("Wow, this enemy is pretty pathetic");
        }
        p.setTempHealth(p.getTempHealth() - damageThisTurn); // Make sure they dont add health
        System.out.println(e.getName() + " attacks you in some way!");
        System.out.println(e.getName() + " deals " + (damageThisTurn) + " to you!!!");
        if (!(p.getTempHealth() <= 0)) {
            System.out.println("Your health is " + p.getTempHealth());
        }
    }

    void playerAttack(Enemy e, Player p) {

        System.out.println("[Insert flavor text about the attack]");
        int baseAttack = 15 * ran.nextInt(3);
        if (baseAttack == 45) {
            System.out.println("Dunsmore focuses his coding mind in order to score a critcal");
        }
        int damageThisTurn = baseAttack - e.getDefense() + p.getTempAttack();
        if (damageThisTurn <= 0) {
            System.out.println("The gods of code feel sorry for your attack and momentarily buff it");
            baseAttack += baseAttack * (ran.nextInt(2) + 1);
            damageThisTurn = baseAttack - e.getDefense() + p.getTempAttack();
            if (damageThisTurn <= 0) {
                System.out.println("Seems like even the gods couldn't help you...");
                damageThisTurn = 0;
            }
        }

        e.setHealth(e.getHealth() - damageThisTurn);
        System.out.println("You dealt " + (damageThisTurn) + " to " + e.getName() + "!");
        if (!(e.getHealth() <= 0)) {
            System.out.println(e.getName() + "'s health is: " + e.getHealth());
        }

    }

    boolean isEnemyDead(Enemy e) {
        if (e.getHealth() <= 0) {
            return true;
        }
        return false;
    }

    void battle(Enemy e, Player p) {
        Combat c = new Combat();
        int counter = 0;
        System.out.println("You encounter " + e.getName() + "!!!!!!!!");
        p.setTempHealth(p.getHealth());
        p.setTempDefense(p.getDefense());
        p.setTempAttack(p.getAttack());
        while (!isEnemyDead(e)) {
            c.playeroptions(e, p);
            if (isDefense) {
                p.setTurnCounter(p.getTurnCounter() + 1);
                p.setTempDefense(p.getTempDefense() + 10);
                if (p.getTurnCounter() == 3) {
                    p.setTurnCounter(0);
                    p.setTempDefense(p.getTempDefense() - 10);
                    System.out.println("Your Bridge.class wears off");
                }
            }
            if(isDefenseAndAttack) {
                p.setTurnCounter2(p.getTurnCounter2() + 1);
                p.setTempDefense(p.getTempDefense() + 10);
                p.setTempAttack(p.getTempAttack() + 5);
                if (p.getTurnCounter2() == 3) {
                    p.setTurnCounter2(0);
                    p.setTempDefense(p.getTempDefense() - 10);
                    p.setTempAttack(p.getTempAttack() - 5);
                    System.out.println("Your BuffBoi.java wears off");
                }
            }

            if(isEnemyDead(e)) {
                System.out.println("You defeated " + e.getName());
                p.setExperience(p.getExperience() + e.getLevel() * 20); // The experience gain is the level of enemy times 20
                p.checkLevelUp(p.getcharChoice2());
                p.setCounter(0);
                p.setTurnCounter(0);
                return;
            }
            System.out.println("");
            if (!p.getIsImpen()) {
                c.enemyAttack(e, p);
                if (p.isDead()) {
                    System.out.println("\nGame Over, You Died\nYou're Dunsfore");
                    System.exit(0);
                }
            }
            else {
                int baseattack = 12 * ran.nextInt(3);
                int damageThisTurn = baseattack - e.getDefense() + e.getAttack();
                System.out.println("Dunsmore reflects " + damageThisTurn + " back towards the enemy!!!");
                e.setHealth(e.getHealth() - damageThisTurn);
                System.out.println(e.getName() + "'s health is " + e.getHealth());
                p.setIsImpen(false);
            }
            System.out.println("");
        }
    }
}
