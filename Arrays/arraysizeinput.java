package Arrays;

import java.rmi.UnexpectedException;
import java.util.Scanner;

public class arraysizeinput {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i<a.length;i++ ){
            a[i] = input.nextInt();
        }
        for(int i = 0 ; i<a.length;i++ ){
            System.out.println(a[i]);
        }
    }
}
