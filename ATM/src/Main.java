public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        BankAccount userAccount = new BankAccount(initialBalance);
        ATM atm = new ATM(userAccount);

        while (true) {
            atm.displayMenu();
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            if (choice == 4) {
                break;
            }
            System.out.print("Enter transaction amount: ");
            double amount = scanner.nextDouble();
            atm.performTransaction(choice, amount);
        }
        scanner.close();
    }
}