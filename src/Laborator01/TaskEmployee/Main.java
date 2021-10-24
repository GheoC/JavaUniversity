package Laborator01.TaskEmployee;

public class Main
{
    public static void main(String[] args)
    {

        Employee employee1 = new Employee(1, "Ion","Ionescu", 3000);
        Employee employee2 = new Employee(2,"Vasile", "Popescu", 4000);

        System.out.println(employee1);
        System.out.println(employee2);

        employee1.raiseSalary(30);
        employee2.raiseSalary(50);
        System.out.println(employee1+". Annual salary: "+employee1.getAnnualSalary());
        System.out.println(employee2+". Annual salary: "+employee2.getAnnualSalary());

    }
}
