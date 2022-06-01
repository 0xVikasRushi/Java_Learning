package Sorting_Algorithm;

import java.util.Arrays;

public class missing_number {
    public static void main(String args[]) {
        int[] nums = {5,4,3,2,1};

        System.out.print(((missingNumber(nums))));

    }

    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i]< arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
        for(int j =0 ;j<arr.length;j++){
            if(j!=arr[j]){
                return j;
            }
        }
        return arr.length;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
