package Laborator05.TaskTreeSet;

import java.util.*;

public class main
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee(1, "Leonardo");
        Employee employee2 = new Employee(2, "Raffaello");
        Employee employee3 = new Employee(3, "Michelangelo");
        Employee employee4 = new Employee(4, "Carlos");
        Employee employee5 = new Employee(5, "Donatello");

        //Display all of them sorted according with the compareTo() method of the Employee class
        TreeSet<Employee> employees = new TreeSet<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        System.out.println(employees);
        System.out.println();

        //Provide a custom Comparator that compares the employees based on their Name( hint: comparing)
        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getName);
        Set<Employee> employees2 = new TreeSet<>(employeeComparator);
        employees2.add(employee1);
        employees2.add(employee2);
        employees2.add(employee3);
        employees2.add(employee4);
        employees2.add(employee5);
        System.out.println(employees2);
        System.out.println();

        //Using a predicate, remove employee with name “Carlos”(if necessary). Display all employees.
        System.out.println(EmployeePredicates.filterEmployee(employees2, EmployeePredicates.removeName("Carlos")));

    }
}
