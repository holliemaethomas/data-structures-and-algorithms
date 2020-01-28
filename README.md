# data-structures-and-algorithms 401

## Reverse an Array
### Challenge
write a method to reverse an array

### Approach & Efficiency
My partner and I took the nested for-loop approach. I belive there is probably a more efficent method, but we went this way because we know it would work

### Solution
![solution](./images/arrayReverse.jpg)




## Shift an Array
### Challenge
write a method to add an elment into an array of integers

### Approach & Efficiency
My partner and I took the approach of dividing the array by length to determine the middle and insert the new element

### Solution
![solution](./images/chalwmicah.jpg)

## Binary Search an Array
### Challenge
write a method to binary search an array

### Approach & Efficiency
My partner and I took the approach of dividing the array by its length and repeating until the the search number was found

### Solution
![solution](./images/401chal2.jpg)

## Insert Node at Kth
### Challenge
write a method to insert a node in the "kth" position from the end of a linked list

### Approach & Efficiency
I took the approach of determining the length of the node, using a counter, and inserting the new node at the end minus the given number. 

### Solution
![solution](./images/chal07.jpg)

#Code Challenge 15
## Tree and Binary Search Tree

### Challenge
Create a class `Tree` which has `preOrder()`, `inOrder()`, and `postOrder()` traversal methods.

Create a class `BinarySearchTree` which has `add(int value)` and `contains(int value)` methods.

### Resources
* [Binary Tree](https://www.baeldung.com/java-binary-tree)
* [Comparing Generic Types](https://stackoverflow.com/questions/20793082/java-comparing-generic-types)

### Files
* src/main/tree
  * [BinarySearchTree.java](../code401challenges/src/main/java/tree/BinarySearchTree.java)
  * [Node.java](../code401challenges/src/main/java/tree/Node.java)
  * [Tree.java](../code401challenges/src/main/java/tree/Tree.java)
* src/test/tree
  * [TreeTest.java](../code401challenges/src/test/java/tree/TreeTest.java)

### Approach and Efficiency
* Approach: Create a test driven Class which follows best practices and has optimized time and space.
* Time and Space:
  * Tree:
    * `public boolean isEmpty()`
      * T: O(1)
      * S: O(1)
    * `public List<T> preOrder()`
      * T: O(n)
      * S: O(n)
    * `private List<T> preOrder(Node<T> current, List<T> response)`
      * T: O(n)
      * S: O(n)
    * `public List<T> inOrder()`
      * T: O(n)
      * S: O(n)
    * `private List<T> inOrder(Node<T> current, List<T> response)`
      * T: O(n)
      * S: O(n)
    * `public List<T> postOrder()`
      * T: O(n)
      * S: O(n)
    * `private List<T> postOrder(Node<T> current, List<T> response)`
      * T: O(n)
      * S: O(n)
  * BinarySearchTree:
    * `public void add(int value)`
      * T: O(n)
      * S: O(n)
    * `public Node<Integer> add(Node<Integer> current, int value)`
      * T: O(n)
      * S: O(n)
    * `public void contains(int value)`
      * T: O(n)
      * S: O(n)
    * `public Node<Integer> contains(Node<Integer> current, int value)`
      * T: O(n)
      * S: O(n)


* **Tree<T>**
  * Variables:
    * `Node<T> root`
  * Methods:
    * `public boolean isEmpty()`
      * returns if the tree is empty
    * `public List<T> preOrder()`
      * returns the list produced from the private `preOrder` method
    * `private List<T> preOrder(Node<T> current, List<T> response)`
      * recursively adds the tree elements to a response list
      * order: "me - left - right"
    * `public List<T> inOrder()`
      * returns the list produced from the private `inOrder` method
    * `private List<T> inOrder(Node<T> current, List<T> response)`
      * recursively adds the tree elements to a response list
      * order: "left - me - right"
    * `public List<T> postOrder()`
      * returns the list produced form the private `postOrder` method
    * `private List<T> postOrder(Node<T> current, List<T> response)`
      * recursively adds the tree elements to a response list
      * order: "left - right - me"

* **BinarySearchTree extends Tree<Integer>**
  * Constructor:
    * calls `super()` on Tree
  * Methods:
    * `public void add(int value)`
      * recursively calls the private `add` method to build the tree
    * `private Node<Integer> add(Node<Integer> current, int value)`
      * traverses down the levels of the tree by comparing the value to the current node
      * if node is null then return a new node with the value
      * if less than value continue down left branch
        * recursively call add
      * if greater than vlaue continue down right branch
        * recursively call add
      * if equal return current value (no duplicates)
      return the current
    * `public boolean contains(int value)`
      * recursively calls private `contains`
    * `private boolean contains(Node<Integer> current, int value)`
      * checks if current is null and returns false
      * checks if current is the value and returns true
      * final return is a recursive call to either left or right to traverse down proper branch
