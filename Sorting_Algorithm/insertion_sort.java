package Sorting_Algorithm;

import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        System.out.print((Arrays.toString(min_element(nums))));
    }
    public static int[] min_element(int[] nums ){
       int tempmin;
       int j;
        for (int i = 0; i <nums.length-1; i++) {
            tempmin = i;
            for (j = i+1; j < nums.length; j++) {
                if(nums[tempmin] > nums[j]){
                    tempmin = j;
                }
            }
            int temp= nums[j];
            nums[tempmin] = nums[i];
            nums[i] = temp;





        }
        return nums;
    }
}


