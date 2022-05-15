package Conditional_loops;

import java.util.Scanner;

public class fibn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0,b=1,c;
        System.out.print("Enter the nth term of fib sequence : ");
        int n = input.nextInt();
        System.out.print(a + " " + b);

        for(int i=0;i<=n;i++){
            c = a+b;
            System.out.print(" " +c );
            a=b;
            b=c;
        }

    }
}
