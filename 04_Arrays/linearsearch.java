package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Size of array : ");
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        System.out.print("Enter the element you wanna search");
        int search = in.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == search){
                System.out.println("Element found in index of " + i);
            }
        }
        System.out.print(Arrays.toString(a));
    }
}
