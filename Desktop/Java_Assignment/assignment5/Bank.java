

public class Bank {
    static long totalAccounts = 0;

    public static long getTotalAccounts() {
        return totalAccounts;
    }

    public static void incrementAccounts() {
        totalAccounts++;
    }
}
