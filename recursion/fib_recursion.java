
public class fib_recursion {
    public static void main(String[] args) {
       int  n =5;
        System.out.println(fib(4));
        System.out.println(total(n));
    }

    static int fib(int n) {
        if (n < 2) {
            return n;
         }
        return fib(n - 1) + fib(n - 2);
    }
    static int total(int n ){
        if(n==1){
            return 1;
        }
        return n + total(n-1);
    }
}
