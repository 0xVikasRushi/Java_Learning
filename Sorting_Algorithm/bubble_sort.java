package Sorting_Algorithm;

import java.util.Arrays;

public class bubble_sort {

    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        System.out.println(Arrays.toString(bubble_sort(nums)));
    }
    public static int[]  bubble_sort(int[] nums){

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-i-1 ; j++) {

                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
}
