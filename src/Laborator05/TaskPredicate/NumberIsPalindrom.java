package Laborator05.TaskPredicate;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class NumberIsPalindrom<E> implements Predicate<Integer>, Consumer<Integer> {
    private int counter = 0;

    @Override
    public boolean test(Integer integer)
    {
        return Math.abs(integer) == getReverseNumber(integer);
    }

    public Integer getReverseNumber(Integer integer) {
        int reverseNumber = 0;
        integer = Math.abs(integer);
        while (integer > 0) {
            reverseNumber = reverseNumber * 10 + integer % 10;
            integer = integer / 10;
        }
        return reverseNumber;
    }

    @Override
    public void accept(Integer integer) {
        counter++;
    }

    public void resetCounter() {
        counter = 0;
    }

    public int getCounter() {
        return counter;
    }
}
