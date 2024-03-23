import java.util.Scanner;

public class SimpleBankingApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static double balance = 0;

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Thank you for using our banking application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
        scanner.close();
    }

    private static void createAccount() {
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        balance = initialBalance;
        System.out.println("Account created successfully.");
    }

    private static void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
            return;
        }
        balance += amount;
        System.out.println("Deposit successful. Current balance: " + balance);
    }

    private static void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid amount or insufficient balance.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Current balance: " + balance);
    }

    private static void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }
}
