package Week7;

public class Bank {
    private int routingNumber;

    public Bank(int routingNumber) {
        this.routingNumber = routingNumber;
    }

    public int getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(int routingNumber) {
        this.routingNumber = routingNumber;
    }

    public Customer createNewCustomer(String firstName, String lastName, int accountNumber, double initialBalance, double minimumBalance, double overdraftFee) {
        Account account = new Account(accountNumber, initialBalance, minimumBalance, overdraftFee);
        Customer customer = new Customer(firstName, lastName, account);
        return customer;
    }

    public static void main(String[] args) {
        Bank bank = new Bank(123456789); // Replace with an actual routing number

        Customer customer = bank.createNewCustomer("John", "Doe", 1001, 1000.0, 500.0, 30.0);

        customer.getAccount().depositFunds(500.0);
        customer.getAccount().withdrawFunds(200.0);

        customer.getAccount().displayAccountInfo();
    }
}

