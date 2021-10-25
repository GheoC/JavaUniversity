package Laborator04.TaskCustomerAndInvoice;

public class Customer {
    private int id;
    private String name;
    private int discount;

    private Account account;


    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setAccount(Account account)
    {
        if (!account.getCustomerName().equals(this.name))
        {
            System.out.println("Not my account!");
            return;
        }

        this.account = account;
    }

    @Override
    public String toString() {
        return name + "(" + id + ")";
    }

    //for this method I've added an account to the customer
    // a customer has an account + an account is owned by a customer
    public void payInvoice(Invoice invoice)
    {
        if (!invoice.getCustomerName().equals(this.name))
        {
            System.out.println("Not my invoice to pay!");
            return;
        }

        if (invoice.getStatus()==true)
        {
            System.out.println("Invoice is already paid!");
            return;
        }

        if (account.getBalance()< invoice.getAmountAfterDiscount())
        {
            System.out.print("Transaction failed! Not enough money to pay this invoice! ");
            System.out.print("Balance is $" + account.getBalance()+" ");
            System.out.println("Invoice is "+invoice.getAmountAfterDiscount());
            return;
        }
        account.withdraw(invoice.getAmountAfterDiscount());
        invoice.payInvoice();

        System.out.println("Invoice ("+ invoice.getId()+") amount "+invoice.getAmountAfterDiscount()+" paid successfully! ");
        System.out.println("New balance: " + account.getBalance());
    }
}
