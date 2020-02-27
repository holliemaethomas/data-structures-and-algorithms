package code401challenges.tree;



public class Node<T> {
    public T value;
    public Node<T> left;
    public Node<T> right;
    public int key;

    //    constructors
    public Node(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }


    public Node(T value, Node<T> left, Node<T> right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node() {
        int key;
        Node left, right;
    }
//setters

    public void setValue(T value) { this.value = value;}

    public void setLeft(Node<T> node){ this.left = node;}

    public void setRight(Node<T> node) { this.right = node; }

//    getters

    public T getValue() { return this.value;}

    public Node<T> getLeft() {
        return this.left;
    }

    public Node<T> getRight(){
        return this.right;
    }


    }


//https://www.baeldung.com/java-binary-tree as a resource to set up my build used generics
//instead of ints from the example because generics are easier to work with in the long-run