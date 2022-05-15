package Conditional_loops;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Nth to find average : ");
        int N = input.nextInt();
        int sum = 0;
        for(int i=1 ; i <=N ; i++ ){
            sum = sum + i;
        }
        System.out.println("Sum of n intergers : " + sum);

    }
}
