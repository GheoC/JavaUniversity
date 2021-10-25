package Laborator05.TaskGenericStack;

public class Node<T extends Number>
{
    private T info;
    private Node previous;

    public Node()
    {
    }

    public Node(T info)
    {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
