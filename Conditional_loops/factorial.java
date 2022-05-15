package Conditional_loops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to find factorial : ");
        int n = input.nextInt();
        long factorial=1;

        for(int i=1;i<=n;i++){
            factorial = factorial*i;
        }
        System.out.println("Factorial : "+factorial);

    }
}


//5
//1*2*3*4*5
