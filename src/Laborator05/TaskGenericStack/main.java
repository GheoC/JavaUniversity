package Laborator05.TaskGenericStack;

public class main {
    public static void main(String[] args) {

        //testing Integer Stack
        System.out.println("\n*** Integer Stack ***");
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(50);
        myStack.push(70);
        myStack.push(90);

        while (!myStack.isEmpty()) {
            System.out.print("Top was: " + myStack.peek());
            myStack.pop();
            System.out.println(",  Size left is: " + myStack.getSize());
        }

        //testing Double Stack
        System.out.println("\n*** Double Stack ***");
        MyStack<Double> myDoubleStack = new MyStack<>();
        myDoubleStack.push(5.5);
        myDoubleStack.push(0.5);
        myDoubleStack.push(15.6666);
        myDoubleStack.push(25.00);

        while (!myDoubleStack.isEmpty()) {
            System.out.print("Top was: " + myDoubleStack.peek());
            myDoubleStack.pop();
            System.out.println(",  Size left is: " + myDoubleStack.getSize());
        }

        //testing Number Stack
        System.out.println("\n*** Number Stack ***");
        MyStack<Number> myNumberStack = new MyStack<>();

        myNumberStack.push(5.5);
        myNumberStack.push(6);
        myNumberStack.push(10);
        myNumberStack.push(7.7777);

        System.out.println("Top of my number stack " + myNumberStack.peek());
        System.out.println("The size is: " + myNumberStack.getSize());

        System.out.println("Calling clear");
        myNumberStack.clear();
        System.out.println("... and the new size is: " + myNumberStack.getSize());
    }
}
