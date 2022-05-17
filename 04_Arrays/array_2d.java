package Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class array_2d {

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        for (int rows = 0; rows < arr.length ; rows++) {
            for (int col = 0; col < arr[rows].length; col++) {
                arr[rows][col] = in.nextInt();
            }
        }
//        for (int rows = 0; rows < arr.length ; rows++) {
//            for (int col = 0; col < arr[rows].length; col++) {
//                System.out.print(arr[rows][col]+ " ");
//            }
//            System.out.println();
//        }
        for ( int a[]:arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
