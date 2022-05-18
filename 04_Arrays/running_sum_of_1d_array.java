//https://leetcode.com/problems/running-sum-of-1d-array/
package Arrays;

import java.util.Arrays;

public class running_sum_of_1d_array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] d = runningSum(nums);
        System.out.println(Arrays.toString(d));
    }
    public static int[] runningSum(int[] nums) {
        if(nums.length !=0){
            int[] sum = new int[nums.length];

            sum[0] = nums[0];
            for (int i = 1; i <= nums.length -1 ; i++) {
                sum[i] = nums[i] + sum[i-1];

            }
            return sum;


        }
        else{
            return new int[]{0};
        }

    }
}
