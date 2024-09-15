package CodeSoftInternShip;

import java.util.Scanner;

 class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }
}


class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    System.out.println("Exiting. Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private void checkBalance() {
        System.out.printf("Your current balance is: $%.2f\n", account.getBalance());
    }

    private void deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.println("Deposit successful.");
    }


    private void withdraw(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed.");
        }
    }
}


public class ATMInterface {
        public static void main(String[] args) {
            BankAccount myAccount = new BankAccount(1000.00);

            ATM atm = new ATM(myAccount);

            atm.displayMenu();
        }
    }


