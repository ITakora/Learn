package battleArena;



public class Main {
    public static void main(String[] args) {

        Enemy enemy = new Enemy("dafa",  10, 10);

        enemy.setTypeOfEnemy("Zombie");
        enemy.setAttackDamage(1);
        enemy.setHealthPoints(20);




        System.out.println(enemy.getTypeOfEnemy() + " has " + enemy.getHealthPoints() + " health points and can do attack of " + enemy.getAttackDamage());

        enemy.talk();
        enemy.walkForward();
        enemy.attack();

    }


}