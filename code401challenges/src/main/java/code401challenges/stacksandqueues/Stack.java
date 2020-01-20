package code401challenges.stacksandqueues;

import java.util.NoSuchElementException;

public class Stack<T> {
    private Node <T> top;
        private int length = 0;

    public Node<T> getTop() {
        return this.top;
    }

    public int length() {
        return this.length;
    }

    public void push( T value) {
        this.top = new Node<>(value, this.top);
        this.length++;
    }

    public T pop() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            Node<T> poppedNode = this.top;
            this.top = poppedNode.next;
            poppedNode.next = null;
            this.length--;
            return poppedNode.value;
        }
    }

    public T peek() {

    }

}
