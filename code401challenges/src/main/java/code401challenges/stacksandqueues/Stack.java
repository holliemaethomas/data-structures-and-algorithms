package code401challenges.stacksandqueues;

import java.util.NoSuchElementException;

public class Stack<T> {
    public Node <T> top;
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

    public Boolean isEmpty() {
        return top == null;
    }

    public T peek() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return top.value;
        }
    }

    @Override
    public String toString() {
        return "top -> " + setToString(this.top) ;
    }

    private String setToString(Node<T> node) {
        if (node == null) {
            return "null";
        } else {
            return node.value + " -> " + setToString(node.next);
        }
    }

}


