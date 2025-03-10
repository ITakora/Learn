package battleArena;

public class Enemy {
   private String typeOfEnemy;
    private int healthPoints  ;
    private int attackDamage;


    public Enemy(String typeOfEnemy, int healthPoints, int attackDamage) {
        this.typeOfEnemy = typeOfEnemy;
        this.healthPoints = healthPoints;
        this.attackDamage = attackDamage;
    }

    // This is called Encapsulation or Setter and Getter
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
    // This is called Abstraction
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
