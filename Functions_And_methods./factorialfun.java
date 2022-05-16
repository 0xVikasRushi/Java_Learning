package Functions_and_methods;

import java.util.Scanner;

public class factorialfun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,fact=1;
        int number = input.nextInt();
        fact = factorial(number);
        System.out.println(fact);
    }
    static int factorial(int n){

        if(n==0){
            return 1;
        }

        else{

            return ( n * factorial(n-1));

        }

    }
}
