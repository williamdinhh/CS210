package Week7;

public class Account {
    private int accountNumber;
    private double balance;
    private double minimumBalance;
    private double overdraftFee;

        public Account(int accountNumber, double balance, double minimumBalance, double overdraftFee) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.minimumBalance = minimumBalance;
        this.overdraftFee = overdraftFee;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public double getOverdraftFee() {
        return overdraftFee;
    }

    public void setOverdraftFee(double overdraftFee) {
        this.overdraftFee = overdraftFee;
    }

    public void depositFunds(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdrawFunds(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
        else {
            double totalToWithdraw = amount + overdraftFee;
            System.out.println("Insufficient funds. Overdraft fee will be charged.");
            System.out.println("Total amount to be deducted: $" + totalToWithdraw);
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Minimum Balance: $" + minimumBalance);
        System.out.println("Overdraft Fee: $" + overdraftFee);
    }
}

