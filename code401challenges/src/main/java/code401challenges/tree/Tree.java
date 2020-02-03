package code401challenges.tree;


import code401challenges.stacksandqueues.Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class Tree<T> {
    Node<T> root;

    public Tree() {
        this.root = null;
    }

    public void setRoot(Node<T> node) {
        this.root = node;
    }

    public Node<T> getRoot() {
        return this.root;
    }

    public boolean isEmpty() {
        return this.root == null;
    }


    //in order
    public List<T> traverseInOrder() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return traverseInOrder(this.root,
                new ArrayList<>());
    }

    private List<T> traverseInOrder(Node<T> current,
                                    List<T> returnedList) {
        if (current != null) {
            traverseInOrder(current.getLeft(),
                    returnedList);
            returnedList.add(current.getValue());
            traverseInOrder(current.getRight(),
                    returnedList);
        }
        return returnedList;

    }

    //pre-order
    public List<T> traversePreOrder(Node node) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return traversePreOrder(this.root,
                new ArrayList<>());
    }

    private List<T> traversePreOrder(Node<T> current,
                                     List<T> returnedList) {
        if (current != null) {
            returnedList.add(current.getValue());
            traversePreOrder(current.getLeft(),
                    returnedList);
            traversePreOrder(current.getRight(),
                    returnedList);
        }
        return returnedList;
    }

    //post-order
    public List<T> traversePostOrder() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return traversePostOrder(this.root,
                new ArrayList<>());
    }

    public List traversePostOrder(Node<T> current,
                                  List<T> returnedList) {
        if (current != null) {
            traversePostOrder(current.getLeft(),
                    returnedList);
            traversePostOrder(current.getRight(),
                    returnedList);
            returnedList.add(current.getValue());
        }
        return returnedList;
    }


    //insert node

    public Node insertNode(Node<Integer> current,
                           int value) {

        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = insertNode(current.left,
                    value);

        } else if (value > current.value) {
            current.right = insertNode(current.right,
                    value);

        }
        return current;

    }

    public boolean treeContains(Node<Integer> current,
                                int value) {
        if (current == null) {
            return false;
        }
        if (current.value == value) {
            return true;
        }

        return value < current.value
                ? treeContains(current.left,
                value)
                : treeContains(current.right,
                value);
    }

    public static <T> List<T> breadthFirst(Tree<T> tree) {
        if (tree.isEmpty()) {
            throw new NoSuchElementException();
        }

        List<T> response = new ArrayList<>();
        Queue<Node<T>> queue = new Queue<>();
        queue.enqueue(tree.getRoot());

        while (!queue.isEmpty()) {
            Node<T> current = queue.dequeue();
            response.add(current.getValue());
            if (current.getLeft() != null) {
                queue.enqueue(current.getLeft());
            }
            if (current.getRight() != null) {
                queue.enqueue(current.getRight());
            }

        }
        return response;

    }

    private boolean isTypeInteger(T nodeVal) {
        return nodeVal instanceof Integer;
    }

    public int findMaxValue() {
        if (this.isEmpty()){
            throw new NoSuchElementException();
        } else if (!TypeInteger(this.getRoot().getValue())) {
            throw new IllegalStateException("the tree can only contain numerical values");
        }
        List<T> traversedTree = this.traverseInOrder();
        int maxVal = (int) traversedTree.get(0);
        for (int i = 1; i < traversedTree.size(); i++){
            if (maxVal < (int) traversedTree.get(i)) {
                maxVal = (int) traversedTree.get(i);
            }
        }
        return maxVal;
    }

}
//modeled my methods from this source https://www.baeldung.com/java-binary-tree
//Nich Paro helped with breadth first