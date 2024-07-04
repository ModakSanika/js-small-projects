import java.util.*;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int totalSamples = 0; // Changed variable name to follow camelCase convention
        int rounds = 0; // Changed variable name to follow camelCase convention
        
        while (totalSamples < 30) {
            System.out.print("Enter the number of leaf samples collected in round " + (rounds + 1) + ": ");
            int samplesInRound = sc.nextInt(); // Changed variable name to follow camelCase convention
            totalSamples += samplesInRound;
            rounds++;
        }
        
        System.out.println("\nTotal leaf samples collected: " + totalSamples);
        System.out.println("Number of rounds taken: " + rounds);
        
        sc.close();
    }
}
