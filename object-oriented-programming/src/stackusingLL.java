import java.util.LinkedList;

class stackLL<T>{
    private LinkedList<T> list = new LinkedList<>();

    // push an element onto the stack
    public void push(T value) {
        list.addFirst(value);
    }

    // pop an element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.removeFirst();
    }

    // get the element at the top of the stack without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.getFirst();
    }

    // check if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // get the number of elements in the stack
    public int size() {
        return list.size();
    }
}
public class stackusingLL {
}
