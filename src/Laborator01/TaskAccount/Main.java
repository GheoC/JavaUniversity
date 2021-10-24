package Laborator01.TaskAccount;

public class Main
{
    public static void main(String[] args)
    {
        Account account1 = new Account("111", "Popescu Ion");
        account1.credit(100);
        Account account2 = new Account("222", "Ionescu Vasile",50);
        account2.debit(3);

        System.out.println(account1);
        System.out.println(account2);

        account1.transferTo(account2,5);
        System.out.println();
        System.out.println(account1);
        System.out.println(account2);

        //testing transaction failure
        System.out.println();
        System.out.println(account1.transferTo(account2, 96));
    }
}
