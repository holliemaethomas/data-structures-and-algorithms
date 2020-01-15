package code401challenges.linkedList;


public class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void setHead(T value){
        this.head = new Node<>(value, null);
    }

    public Node<T> getHead() {
        return this.head;
    }

    public void prepend(T value) {
        Node<T> temp = this.head;
        this.head = new Node<>(value, temp);
    }

    public boolean includes (T valueToCheck) {
        Node<T> current = this.head;
        while (current != null) {
            if (current.getValue().equals(valueToCheck)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public void append(T value) {
        Node<T> current = this.head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        Node<T> newNode = new Node<>(value, null);
        current.setNext(newNode);
    }


    public void insertBefore(T value, T newValue) {
        if (this.head == null) {
            return;
        }
        Node<T> current = this.head;
        if (current.getValue().equals(value)) {
            prepend(newValue);
            return;
        }
        while (current !=  null) {
            if (current.getNext() == null) {
                return;
            }
            Node<T> newNode = new Node<>(newValue, current.getNext());
            current.setNext(newNode);
        }
    }

    public void insertAfter(T value, T newValue) {
        if (this.head == null) {
            return;
        }
        Node<T> current = this.head;
      while (current != null) {
          if (current.getValue().equals(value)){
              break;
          }
          current = current.getNext();
      }
      if (current == null) {
          return;
      }
        Node<T> newNode = new Node<>(newValue, current.getNext());
      current.setNext(newNode);
    }

    public String kthFromEnd(int k) {
        int listLength = 0;
        Node<T> current = this.head;
        while (current != null) {
            listLength++;
            current = current.getNext();
        }
        current = this.head;
        for (int j = 1; j <= listLength; j++) {
            if (j == listLength - k) {
                return current.getValue().toString();
            }
            current = current.getNext();
        }
        throw new IndexOutOfBoundsException();
    }

    }



//got help from my buddy Nich.