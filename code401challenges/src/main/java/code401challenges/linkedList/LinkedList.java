package code401challenges.linkedList;






//public class LinkedList<T> {
//    private Node<T, V> head;
//
//    public LinkedList() {
//        this.head = null;
//    }
//
//    public boolean isEmpty() {
//        return this.head == null;
//    }
//
//    public void setHead(T value){
//        this.head = new Node<>(value, null);
//    }
//
//    public Node<T, V> getHead() {
//        return this.head;
//    }
//
//    public void prepend(T value) {
//        Node<T, V> temp = this.head;
//        this.head = new Node<>(value, temp);
//    }
//
//    public boolean includes (T valueToCheck) {
//        Node<T, V> current = this.head;
//        while (current != null) {
//            if (current.getValue().equals(valueToCheck)) {
//                return true;
//            }
//            current = current.getNext();
//        }
//        return false;
//    }
//
//    public void append(T value) {
//        Node<T, V> current = this.head;
//        while (current.getNext() != null){
//            current = current.getNext();
//        }
//        Node<T, V> newNode = new Node<>(value, null);
//        current.setNext(newNode);
//    }
//
//
//    public void insertBefore(T value, T newValue) {
//        if (this.head == null) {
//            return;
//        }
//        Node<T, V> current = this.head;
//        if (current.getValue().equals(value)) {
//            prepend(newValue);
//            return;
//        }
//        while (current !=  null) {
//            if (current.getNext() == null) {
//                return;
//            }
//            Node<T, V> newNode = new Node<>(newValue, current.getNext());
//            current.setNext(newNode);
//        }
//    }
//
//    public void insertAfter(T value, T newValue) {
//        if (this.head == null) {
//            return;
//        }
//        Node<T, V> current = this.head;
//      while (current != null) {
//          if (current.getValue().equals(value)){
//              break;
//          }
//          current = current.getNext();
//      }
//      if (current == null) {
//          return;
//      }
//        Node<T, V> newNode = new Node<>(newValue, current.getNext());
//      current.setNext(newNode);
//    }
//
//    public String kthFromEnd(int k) {
//        int listLength = 0;
//        Node<T, V> current = this.head;
//        while (current != null) {
//            listLength++;
//            current = current.getNext();
//        }
//        current = this.head;
//        for (int j = 1; j <= listLength; j++) {
//            if (j == listLength - k) {
//                return current.getValue().toString();
//            }
//            current = current.getNext();
//        }
//        throw new IndexOutOfBoundsException();
//    }
//
//    @Override
//    public String toString() {
//        return setToString(this.head);
//    }
//
//    private String setToString(Node<T, V> node) {
//        if (node == null) {
//            return "null";
//        }
//        return node.getValue() + " " + setToString(node.getNext());
//    }
//
//    public static <F> LinkedList<F> mergeList(LinkedList<F> firstList, LinkedList<F> secondList) {
//        if (firstList.getHead() == null) {
//            return secondList;
//        } else if (secondList.getHead() == null) {
//            return firstList;
//        } else {
//            Node<F, V> currentFirst = firstList.getHead();
//            Node<F, V> currentSecond = secondList.getHead();
//            while (currentFirst != null && currentSecond != null) {
//                if (currentSecond.getValue() == null) {
//                    break;
//                } else if (currentFirst.getNext() == null && currentSecond.getValue() != null) {
//                    currentFirst.setNext(currentSecond);
//                    break;
//                } else {
//                    Node<F, V> tempFirst = currentFirst.getNext();
//                    Node<F, V> tempSecond = currentSecond.getNext();
//                    currentFirst.setNext(currentSecond);
//                    currentFirst.getNext().setNext(tempFirst);
//                    currentFirst = currentFirst.getNext().getNext();
//                    currentSecond = tempSecond;
//                }
//            }
//            return firstList;
//        }
//    }
//
//}

//    was able to get my merge method back, went ahead and copied it back in.





//got help from my buddy Nich.