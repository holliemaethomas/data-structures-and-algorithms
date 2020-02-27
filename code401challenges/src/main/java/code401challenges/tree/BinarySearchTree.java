package code401challenges.tree;

import java.util.NoSuchElementException;

public class BinarySearchTree <T extends Comparable<T>> extends Tree<T>

{
    public BinarySearchTree() {
        super();
    }

    public void add(T value) {
        this.root = add(this.root,
                value);
    }

    private Node<T> add(Node<T> current, T value) {
        if (current == null) {
            return new Node<>(value);
        } if (value.compareTo(current.getValue()) < 0) {
            current.setLeft(add(current.getLeft(),
                    value));
        } else if (value.compareTo(current.getValue()) > 0) {
            current.setRight(add(current.getRight(),
                    value));
        }
        return current;
    }


    public boolean contains(T value) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return contains(this.root, value);
        }
    private boolean contains(Node<T> current, T value) {
        if (current == null) {
            return false;
        }
        if (value.compareTo(current.getValue()) == 0) {
            return true;
        }
        return value.compareTo(current.getValue()) < 0 ?
                contains(current.getLeft(), value) :
                contains(current.getRight(), value);
    }
}

//this lab is a frankstein of what I learned from the article I
// sited in Tree.java and some help from Nich. I copy pasted a large
// chunk from Tree.java then refactored

//    This is an example of sub class inheritance.
//        extends keyword is used to inherit a class;
// while implements keyword is used to inherit
//         the interfaces. A class can extend only one class; b
//        ut can implement any number of interfaces.
//        A subclass that extends a superclass may override some
//        of the methods from superclass.
//        I believe that by using extends in this case I am covering the techniques learned
//        in lab 07, inheritance 2. which I was unable to complete at the time. Futhermore,
//        testing of this structure should also count for lab 07.
//        still working
//        Hollie M. Thomas, Jan 15 at 2:34pm
//        Let me know when you push code up! :-)
//        Sarah, Jan 17 at 12:32pm


