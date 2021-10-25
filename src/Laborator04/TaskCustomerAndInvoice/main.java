package Laborator04.TaskCustomerAndInvoice;

public class main {
    public static void main(String[] args) {

        Customer customer1 = new Customer(1, "John", 20);
        Customer customer2 = new Customer(2, "Vasile", 10);

        Invoice invoice1 = new Invoice(1, customer1, 100);
        Invoice invoice2 = new Invoice(2, customer2, 200);

        System.out.print(customer1.toString() + " discounted invoice is: ");
        System.out.println(invoice1.getAmountAfterDiscount());

        System.out.print(customer2.toString() + " discounted invoice is: ");
        System.out.println(invoice2.getAmountAfterDiscount());

        Account account1 = new Account(1, customer1, 150);
        Account account2 = new Account(2, customer2, 170);

        //testing the withdraw method for the invoice discounted amount
        account1.withdraw(invoice1.getAmountAfterDiscount());
        System.out.println(account1);
        account2.withdraw(invoice2.getAmountAfterDiscount());

        //extra features
        // Customer has an Account and a payInvoice method. Invoice has a status
        customer1.setAccount(account1);
        customer2.setAccount(account2);

        Invoice invoice3 = new Invoice(2, customer2, 140);

        System.out.println("***********************");
        System.out.println("John attempts to pay Vasile's invoice");
        customer1.payInvoice(invoice3);
        System.out.println("***********************");
        System.out.println("Vasile doesn't have enough money to pay his invoice");
        customer2.payInvoice(invoice2);

        System.out.println("***********************");
        System.out.println("Invoice 3 status: " + invoice3.getStatus());
        System.out.println("Vasile pays his invoice successfully");
        customer2.payInvoice(invoice3);
        System.out.println("Invoice 3 status: " + invoice3.getStatus());

        customer2.payInvoice(invoice3);
    }
}
