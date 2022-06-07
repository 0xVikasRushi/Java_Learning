package recursion;

public class n_printing_using_recursion {
    public static void main(String[] args) {
        int n = 4;
        printing(n);
        System.out.println();
        revprinting(n);

    }
    static void printing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
       printing(n-1);
    }
    static void revprinting(int n){
        if(n==0){
            return;
        }
        revprinting(n-1);
        System.out.println(n);
    }
}
