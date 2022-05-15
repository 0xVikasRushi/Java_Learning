package Functions_and_methods;

import java.util.Scanner;

public class addfunc {

    public static void main(String[] args) {
        add();

    }
    static void add(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = input.nextInt();
        System.out.print("Enter the number : ");
        int b = input.nextInt();
        int sum = a+b;
        System.out.println(sum);

    }
}


