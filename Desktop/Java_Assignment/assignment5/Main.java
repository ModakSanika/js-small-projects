

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount account = null; // Declare the account variable

        while (true) {
            System.out.println("Banking Transaction System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Account Details");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter account holder name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter initial balance: ");
                    double initialBalance = sc.nextDouble();
                    account = new SavingsAccount(name, initialBalance);
                    System.out.println("Account created successfully!");
                    break;

                case 2:
                    if (account != null) {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = sc.nextDouble();
                        account.deposit(depositAmount);
                        System.out.println("Deposit successful!");
                    } else {
                        System.out.println("No account found! Create an account first.");
                    }
                    break;

                case 3:
                    if (account != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = sc.nextDouble();
                        account.withdraw(withdrawAmount);
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("No account found! Create an account first.");
                    }
                    break;

                case 4:
                    if (account != null) {
                        account.printAccountDetails();
                    } else {
                        System.out.println("No account found! Create an account first.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
