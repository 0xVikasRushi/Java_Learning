import java.util.ArrayList;

public class Stacks<T> {
    ArrayList<T> stack;
    int top;

    public Stacks() {
        stack = new ArrayList<T>();
        top = -1;
    }

    public void push(T item) {
        stack.add(++top, item);
    }

    public T pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return stack.remove(top--);
        }
    }

    public T peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return stack.get(top);
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
