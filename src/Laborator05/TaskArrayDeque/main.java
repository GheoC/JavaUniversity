package Laborator05.TaskArrayDeque;

import java.util.*;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please insert the total number of integers: ");
        int totalNumberOfIntegers = input.nextInt();
        System.out.print("Please insert the size of the subarray: ");
        int subarraySize = input.nextInt();

        if (subarraySize > totalNumberOfIntegers) {
            System.out.println("Wrong inputs!");
            return;
        }

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        List<String> stringList = new ArrayList<>();
        int number = input.nextInt();
        int maxUniqueIntegers = 1;
        arrayDeque.add(number);

        for (int i = 0; i < totalNumberOfIntegers-1; i++) {
            int num = input.nextInt();
            if (i == 0) {
                arrayDeque.add(num);
                maxUniqueIntegers++;
            } else {
                if (arrayDeque.size() == subarraySize)
                {
                    stringList.add(arrayDeque + " Max unique integers is: "+maxUniqueIntegers);
                    int firstNumber = arrayDeque.peekFirst();
                    arrayDeque.removeFirst();
                    if (!arrayDeque.contains(firstNumber))
                    {
                        maxUniqueIntegers--;
                    }
                }

                if (!arrayDeque.contains(num) && maxUniqueIntegers < subarraySize) {
                    maxUniqueIntegers++;
                }
                arrayDeque.add(num);
            }
        }
        stringList.add(arrayDeque + " Max unique integers is: "+maxUniqueIntegers);

        for (int i = 0; i < stringList.size(); i++)
        {
            System.out.println(stringList.get(i));
        }
    }
}
