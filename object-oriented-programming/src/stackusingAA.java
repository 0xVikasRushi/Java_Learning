import java.util.ArrayList;

public class stackusingAA{
    public static void main(String[] args) {
        stackimpl<String> stk = new stackimpl<>();
        stk.push("s");
        stk.push("1");
        stk.push("2");
        stk.push("3");
        stk.push("4");
        stk.pop();
        stk.pop();
        stk.pop();
    }
}
class stackimpl <T> {
    ArrayList<T> stack;
    int top;
    stackimpl(){
        stack = new ArrayList<>();
        top = -1;
    }
    void push(T item){
        stack.add(++top,item);
    }
    void pop(){
        System.out.println(stack.get(top));
        stack.remove(top--);
    }


}
