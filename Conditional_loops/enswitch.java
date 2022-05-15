package Conditional_loops;

import java.util.Scanner;

public class enswitch {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.next();


        switch (s) {
            case "Apple" -> System.out.println("it's apple");
            case "Mango" -> System.out.println("it's mango");
            default -> System.out.println("Doesn't match");
        }

    }
}
