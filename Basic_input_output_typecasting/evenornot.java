import java.util.Scanner;

public class evenornot {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the any number ");
        int number = input.nextInt();
        if (number % 2 ==0){
            System.out.println("Number is even :  " + number);
        }
        else{
            System.out.println("Number is Odd :  " + number);
        }
    }
}
