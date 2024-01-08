public class ATM {
    private BankAccount bankAccount;
    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    public void displayMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
    public void performTransaction(int choice, double amount) {
        switch (choice) {
            case 1:
                System.out.println("Current Balance: " + bankAccount.getBalance());
                break;
            case 2:
                bankAccount.deposit(amount);
                System.out.println("Deposit successful. New balance: " + bankAccount.getBalance());
                break;
            case 3:
                if (bankAccount.withdraw(amount)) {
                    System.out.println("Withdrawal successful. New balance: " + bankAccount.getBalance());
                }
                break;
            case 4:
                System.out.println("Exiting. Thank you!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
    }
    }
}