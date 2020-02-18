package code401challenges.linkedList;

public class Node<T, V> {
    private T value;
    private Node<T, V> next;
    private Node<T, V> previous;

    Node (T value, Node<T, V> next) {
        this.value = value;
        this.next = next;
    }

    Node(T value, Node<T, V> next, Node<T, V> previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public T getValue() {
        return this.value;
    }

  void setNext(Node<T, V> node) {
        this.next = node;
  }

  public Node<T, V> getNext() {
        return this.next;
  }

  void setPrevious(Node<T, V> node) {
        this.previous = node;
  }

  public Node<T, V> getPrevious() {
        return this.previous;
  }


}