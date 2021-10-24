package Laborator01.TaskAccount;

public class Account {
    private String id;
    private String name;
    private double balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double credit(double amount) {
        this.balance = this.balance + amount;
        return balance;
    }

    public double debit(double amount)
    {
        if (amount <= this.balance)
        {
            this.balance = this.balance -amount;
        } else
        {
            System.out.println("Transaction failed! Amount exceeded balance");
        }
        return this.balance;
    }

    public double transferTo(Account account, double amount)
    {
        if (amount<= this.balance)
        {
            this.balance = this.balance - amount;
            account.credit(amount);
        }else
        {
            System.out.println("Transaction failed! Amount exceeded balance");
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
