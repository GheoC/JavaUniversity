package Laborator05.TaskPredicate;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class NumberIsPrime<E> implements Predicate<Integer>, Consumer<Integer> {
    public int counter = 0;

    @Override
    public boolean test(Integer integer) {
        return checkForPrime(integer);
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

    private boolean checkForPrime(int inputNumber) {
        boolean isItPrime = true;

        if (inputNumber <= 1) {
            isItPrime = false;

            return isItPrime;
        } else {
            for (int i = 2; i <= inputNumber / 2; i++) {
                if ((inputNumber % i) == 0) {
                    isItPrime = false;

                    break;
                }
            }

            return isItPrime;
        }
    }
}
