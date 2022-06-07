package recursion;

public class no_of_digits_and_product {
    public static void main(String[] args) {
        int n =136;
        System.out.println(no_of_digits(n));
        System.out.println(product(n));
    }
    static int no_of_digits(int n){
        int r = n %10;
        n = n /10; // not stored temp var here n values changes
        if(r==0){
            return 0;
        }
        return r + no_of_digits(n);
//        return n%10 + no_of_digits(n/10);

    }
    static int product(int n){

        if(n%10==n){
            return n;
        }
        return n%10 * product(n/10);


    }
}
