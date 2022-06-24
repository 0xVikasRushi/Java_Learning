package recursion.arrays;

import java.util.Scanner;

public class The_Great_Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int max = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
            }
            int[] ans = new int[n-1];


            for (int i = 0; i < ans.length; i++) {
                ans[i] = arraysum(arr,max,0,i,i+max);
            }
            System.out.println(maxelement(ans));
        }
    }
// recursive solution but not running codechef due to TLE
    static int  maxelement(int[] arr) {
        int tempmax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>tempmax){
                tempmax = arr[i];

            }
        }
        return tempmax;
    }

    static int arraysum(int[] arr, int max, int sum, int i, int j) {
        if(i==j){
            return sum;
        }
        return sum = arr[i] + arraysum(arr,max,sum,i+1,j);
    }


    }
