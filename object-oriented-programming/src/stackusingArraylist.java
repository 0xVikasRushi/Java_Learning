import java.util.ArrayList;

class stackA{
    ArrayList stack;
    int top;
    stackA(){
        stack = new ArrayList();
        top  = -1;
    }
    public void push( int  i){
        stack.add(    top++,i);
    }
    public void pop(){
       stack.remove(top--);
    }
}
public class stackusingArraylist {
    public static void main(String[] args) {
      stackA v = new stackA();
      v.push(10);
      v.push(20);
      v.push(30);
      v.push(40);
      v.pop();

    }
}
