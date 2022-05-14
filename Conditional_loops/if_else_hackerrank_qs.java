package Conditional_loops;

import java.util.Scanner;

public class if_else_hackerrank_qs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number");
        int number = scanner.nextInt();
        if(number % 2 != 0 )
        {
            System.out.println("Weird");
        }
        if ( (number % 2 ==0 ) & (number>=2 && number<=5))
        {
            System.out.println("Not Weird");
        }
        if ((number % 2 ==0 ) & (number>=2 && number<=5))
        {
            System.out.println("Weird");
        }
        else if((number%2==0) & number > 20){
            System.out.println("Not Weird");
        }

    }
}
