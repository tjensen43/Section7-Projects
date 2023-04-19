public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = balance;

    }

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;

    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("You cannot deposit a negative or zero amount");
        }
        else {
            balance += amount;
        }
    }
    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        }
        if (amount <= 0) {
            System.out.println("Invalid amount");
        }
        else {
            balance -= amount;
        }
    }

    public String getOwner() {
        return owner;

    }

    public int getBalance() {
        return balance;

    }
}
