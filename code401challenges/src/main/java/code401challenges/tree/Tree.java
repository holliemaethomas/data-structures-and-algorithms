package code401challenges.tree;


import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class Tree<T> {
    Node<T> root;

    public Tree() {this.root = null;}

    public void setRoot(Node<T> node) {this.root = node;}

    public Node<T> getRoot(){return this.root;}

    public boolean isEmpty(){return this.root == null;}


//in order
    public List<T> traverseInOrder() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return traverseInOrder(this.root, new ArrayList<>());
    }

    private List<T> traverseInOrder (Node<T> current, List<T> returnedList){
        if (current != null) {
            traverseInOrder(current.getLeft(), returnedList);
            returnedList.add(current.getValue());
            traverseInOrder(current.getRight(), returnedList);
        }
        return returnedList;

    }

//pre-order
    public List<T> traversePreOrder(Node node) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return traversePreOrder(this.root, new ArrayList<>());
    }

       private List<T> traversePreOrder(Node<T> current, List<T> returnedList) {
        if(current != null){
            returnedList.add(current.getValue());
            traversePreOrder(current.getLeft(), returnedList);
            traversePreOrder(current.getRight(), returnedList);
        }
        return returnedList;
    }

//post-order
public List<T> traversePostOrder() {
    if (isEmpty()) {
        throw new NoSuchElementException();
    }
    return traversePostOrder(this.root, new ArrayList<>());
}

    public List traversePostOrder(Node<T> current, List<T> returnedList) {
        if (current != null) {
            traversePostOrder(current.getLeft(), returnedList);
            traversePostOrder(current.getRight(), returnedList);
            returnedList.add(current.getValue());
        }
        return returnedList;
    }


    //insert node

    public Node insertNode(Node<Integer> current, int value){

        if (current == null){
            return new Node(value);
        }

        if (value < current.value){
            current.left = insertNode(current.left, value);

        } else if (value > current.value) {
            current.right = insertNode(current.right, value);

        } return current;

    }

    public boolean treeContains (Node<Integer> current, int value) {
        if (current == null) { return false;}
        if (current.value == value) {return true;}

        return value < current.value
                ? treeContains(current.left, value)
                : treeContains(current.right, value);
    }


//    public Tree fizzbuzz(Tree tree) {
//        fizzbuzzRecursively(tree.root);
//        return tree;
//
//    }
//    private void fizzbuzzRecursively(Node me){
//        String val = me.value;
//        int intyVal = Integer.parseInt(val);
//        if (intyVal % 15 == 0)
//
//    }

}
//modeled my methods from this source https://www.baeldung.com/java-binary-tree