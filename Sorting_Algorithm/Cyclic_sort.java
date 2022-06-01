package Sorting_Algorithm;

import java.util.Arrays;



public class Cyclic_sort {
    public static void main(String[] args) {
    int[] nums = {5,4,3,2,1};
    sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swaping(arr, i , correct);
            } else {
                i++;
            }
        }
    }

    static void swaping(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
