package Functions_and_methods;

import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check whether its prime or not");
        int k = input.nextInt();
        primeornot(k);
    }
    static void primeornot(int n){
        int count = 0;
        for(int i = 1 ; i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
            if(count ==2){
                System.out.println("Prime number");
            }
            else {
                System.out.println("Not Prime Number");
            }


    }
}
