package code401challenges.stacksandqueues;


import java.util.NoSuchElementException;

public class PseudoQueue<T> {

    private Stack<T> stack1;
    private Stack<T> stack2;


    //    sets the empty stacks
    PseudoQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    //method to push into stack one
    public void enqueue(T value) {
        this.stack1.push(value);

    }

    //    method to swap between the two
    public T dequeue() {
        if (this.isEmpty()){

            throw new NoSuchElementException();
        } else {
            stackHopper(this.stack1,
                    this.stack2);
            T front = this.stack2.pop();
            stackHopper(this.stack2,
                    this.stack1);
            return front;
        }
    }



    //method to hop from one stack to another
    private void stackHopper(Stack<T> stackHop1, Stack<T> stackHop2) {
        while (stackHop1.isEmpty()) {
            stackHop2.push(stackHop1.pop());
        }
    }

//    need better specificty with isEmpty() method from Stack.Java
public boolean isEmpty() {
    return this.stack1.getTop() == null && this.stack2.getTop() == null;
}

}
