package code401challenges.stacksandqueues;


public class Node<T> {
     public T value;
   public  Node<T> next;
    Node() {};

    Node(T value) {
        this.value = value;
    }

    Node (T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}
