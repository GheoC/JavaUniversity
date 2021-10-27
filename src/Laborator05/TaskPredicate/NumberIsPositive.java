package Laborator05.TaskPredicate;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class NumberIsPositive<E> implements Predicate<Integer>, Consumer<Integer>
{
    private int counter = 0;

    @Override
    public boolean test(Integer integer) {
        return integer>=0;
    }


    @Override
    public void accept(Integer integer)
    {
        counter++;
    }

    public void resetCounter()
    {
        counter =0;
    }

    public int getCounter()
    {
        return counter;
    }
}
