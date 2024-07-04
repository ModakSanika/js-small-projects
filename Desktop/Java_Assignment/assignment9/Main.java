package assignment9;
public class Main {
    public static void main(String[] args) {
        // Create a player and an enemy
        Player player = new Player("Hero", 100);
        Enemy enemy = new Enemy("Goblin", 20);

        // Simulate multiple attacks
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nRound " + i + ":");
            enemy.attack(player);
            if (player.getHealthPoints() <= 0) {
                System.out.println("Player " + player.getName() + " has been defeated!");
                break;
            }
        }

        // Print final player's HP
        System.out.println("\nFinal HP of Player " + player.getName() + ": " + player.getHealthPoints());
    }
}
