package battleArena;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Enemy enemy = new Enemy();

        enemy.setTypeOfEnemy("Zombie");
        enemy.setAttackDamage(1);
        enemy.setHealthPoints(20);

//        ArrayList<String> testing  = new ArrayList<String>();
//        testing.add("Zombie");
//        testing.add("Zombie");
//        testing.add("Zombie");
//
//        System.out.println(testing.getFirst());



        System.out.println(enemy.getTypeOfEnemy() + " has " + enemy.getHealthPoints() + " health points and can do attack of " + enemy.getAttackDamage());

        enemy.talk();
        enemy.walkForward();
        enemy.attack();

    }


}