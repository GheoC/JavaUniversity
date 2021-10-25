package Laborator04.TaskCustomerAndInvoice;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    //status = paid or not
    private Boolean status = false;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public Boolean getStatus() {
        return status;
    }

    public void payInvoice()
    {
        this.status = true;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public double getAmountAfterDiscount() {
        return amount - amount * customer.getDiscount()/100;
    }
}
