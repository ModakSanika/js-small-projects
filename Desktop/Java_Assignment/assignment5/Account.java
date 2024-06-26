
public abstract class Account {
    private String accountHolder;
    private double balance;
    private final String accountNumber;

    Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = generateAccountNumber();
        Bank.incrementAccounts();
    }

    public abstract void printAccountDetails();

    private String generateAccountNumber() {
        return "ACC" + (int)(Math.random() * 1000000);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
