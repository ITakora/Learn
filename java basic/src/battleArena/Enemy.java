package battleArena;

public class Enemy {
   private String typeOfEnemy;
    private int healthPoints = 10 ;
    private int attackDamage = 1;

    // This is called Encapsulation
    public void setTypeOfEnemy (String typeOfEnemy){
        this.typeOfEnemy = typeOfEnemy;
    }

    public void setHealthPoints (int healthPoints){
        this.healthPoints = healthPoints;
    }

    public void setAttackDamage (int damage){
        this.attackDamage = damage;
    }

    public String getTypeOfEnemy () {
        return typeOfEnemy;
    }

    public int getHealthPoints () {
        return healthPoints;
    }

    public int getAttackDamage () {
        return attackDamage;
    }
    /////////

    public void talk () {
        System.out.println("I am a " + typeOfEnemy + " be prepared to fight!");
    }

    public void walkForward () {
        System.out.println(typeOfEnemy + " moves closer to you");
    }

    public void  attack () {
        System.out.println(typeOfEnemy + " attacks for " + attackDamage + " attack");
    }
}
