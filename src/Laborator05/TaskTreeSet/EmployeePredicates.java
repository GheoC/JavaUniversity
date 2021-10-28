package Laborator05.TaskTreeSet;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicates
{
    public static Predicate<Employee> removeName(String name)
    {
        return employee -> !employee.getName().equals(name);
    }

    public static TreeSet<Employee> filterEmployee(Set<Employee> employees, Predicate<Employee> predicate)
    {
        return employees.stream().filter(predicate).collect(Collectors.toCollection(TreeSet::new));
    }
}
