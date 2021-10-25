package Laborator05.TaskGenericStack;

public class MyStack<T extends Number> {
    private Node<T> top;
    private int size;

    public MyStack() {
        this.top = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void push(T element) {
        Node newNode = new Node(element);
        newNode.setPrevious(top);
        this.top = newNode;
        this.size++;
    }

    public void pop() {
        if (this.top != null) {
            this.top = this.top.getPrevious();
            this.size--;
        }
    }

    public boolean isEmpty() {
        if (this.top == null) {
            return true;
        }
        return false;
    }

    public T peek() {
        if (this.top != null) {
            return (T) this.top.getInfo();
        }
        return null;
    }

    //not sure what this suppose to do...
    public void isFull() {
    }

    public void clear() {
        while (this.top != null)
        {
            this.pop();
        }
    }


}
