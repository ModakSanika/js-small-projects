package assignment9;
public class Enemy {
    // Enemy class representing an enemy character {
    private String name;
    private int attackDamage;

    public Enemy(String name, int attackDamage) {
        this.name = name;
        this.attackDamage = attackDamage;
    }
    public void attack(Player player) {
        try {
            player.receiveAttack(attackDamage);
        } catch (AttackBlockedException e) {
            System.out.println("Attack by " + name + " was blocked!");
        } catch (AttackMissedException e) {
            System.out.println("Attack by " + name + " missed!");
        }
    }

}


