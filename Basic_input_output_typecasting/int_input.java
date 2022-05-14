import java.util.Scanner;

public class int_input {
    public static void main(String[] args) {

        int age;
        System.out.print("Enter your age : ");
        Scanner input =  new Scanner(System.in);
        age = input.nextInt();

        System.out.println("Your age is " + age );

    }
}
