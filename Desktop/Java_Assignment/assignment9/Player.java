package assignment9;

// Player class representing a gaming character
public class Player {
   private String name;
   private int healthPoints; 

   public Player(String name, int healthPoints) {
    this.name = name;
    this.healthPoints = healthPoints;
}

  // Method to simulate the player being attacked
  public void receiveAttack(int damage)throws AttackBlockedException,AttackMissedException{
      // Simulate some conditions where attack might be blocked or missed
      double random = Math.random();
      if(random<0.3){
        throw new AttackBlockedException("Attack blocked");

      }else if(random<0.6){
        throw new AttackMissedException("Attack missed");

      }
      else{// 40% chance attack hits
        if(damage>=healthPoints){
            healthPoints=0;
            //player dies
        }
        else{
            healthPoints -= damage; // Reduce HP based on damage
        }
        System.out.println("Player " + name + " receives " + damage + " damage. Remaining HP: " + healthPoints);
    }
  }

  public int getHealthPoints() {
    return healthPoints;
}
public String getName() {
  return name;
}
}
