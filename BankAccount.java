public class BankAccount {
    private String accountNumber;
    private double balance;
    
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than 0.");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Amount must be greater than 0.");
        } else {
            System.out.println("Insufficient balance for withdrawal from account " + accountNumber);
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("1234567890", 1000.0);
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);

        double currentBalance = myAccount.getBalance();
        System.out.println("Current balance in account " + myAccount.accountNumber + ": $" + currentBalance);
    }
}
