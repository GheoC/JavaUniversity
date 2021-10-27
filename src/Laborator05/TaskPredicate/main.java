package Laborator05.TaskPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class main
{
    public static void main(String[] args)
    {

        List<Integer> integers = new ArrayList<>();

        integers.add(-15);
        integers.add(101);
        integers.add(80);
        integers.add(63536);
        integers.add(-54);
        integers.add(13);
        integers.add(746);

        NumberIsEven<Integer> numberIsEven = new NumberIsEven<>();
        NumberIsPositive<Integer> numberIsPositive = new NumberIsPositive<>();
        NumberIsPalindrom<Integer> numberIsPalindrom = new NumberIsPalindrom<>();
        NumberIsPrime<Integer> numberIsPrime = new NumberIsPrime<>();

        integers.stream().filter(numberIsEven).forEach(numberIsEven);
        System.out.println("Number of even numbers in the given list is: "+numberIsEven.getCounter());

        integers.stream().filter(numberIsPositive).forEach(numberIsPositive);
        System.out.println("Number of positive numbers in the given list is: "+numberIsPositive.getCounter());

        integers.stream().filter(numberIsPalindrom).forEach(numberIsPalindrom);
        System.out.println("Number of palindrom numbers in the given list is: "+numberIsPalindrom.getCounter());

        integers.stream().filter(numberIsPrime).forEach(numberIsPrime);
        System.out.println("Number of prime numbers in the given list is: "+numberIsPalindrom.getCounter());

    }

}
