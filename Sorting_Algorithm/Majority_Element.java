package Sorting_Algorithm;

import java.util.Arrays;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        System.out.println((bubble_sort(nums)));

    }
    public static int bubble_sort(int[] nums){
int n = nums.length;
        for (int i = 0; i < nums.length-1 ; i++) {
            for (int j = 0; j <nums.length-1-i ; j++) {
                if(nums[j]>nums[j+1]){
                    int temp =nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }

        }
//        if(nums.length%2==0){
//           return nums[n-1];
//        }
//        else{
//            return nums[n/2];
//        }
        return nums[n/2];
    }
}
