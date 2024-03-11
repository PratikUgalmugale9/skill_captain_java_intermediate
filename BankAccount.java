public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.accountBalance += amount;
            System.out.println("Deposited " + amount + " into account " + this.accountNumber + ".");
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.accountBalance) {
            this.accountBalance -= amount;
            System.out.println("Withdrew " + amount + " from account " + this.accountNumber + ".");
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }

    public void displayInfo() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder Name: " + this.accountHolderName);
        System.out.println("Account Balance: " + this.accountBalance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456789", "John Doe", 1000);
        account1.displayInfo();
        System.out.println();

        account1.deposit(500);
        account1.displayInfo();
        System.out.println();

        account1.withdraw(200);
        account1.displayInfo();
        System.out.println();

        account1.withdraw(2000);
    }
}
