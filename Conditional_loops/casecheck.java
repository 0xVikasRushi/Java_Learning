package Conditional_loops;

import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        if (ch >= 'a' && ch <='z'){
            System.out.println("IT IS AN Alphabet : " + ch);
        }
        else {
            System.out.println("not  Alphabet : " + ch);
        }
        }


    }
