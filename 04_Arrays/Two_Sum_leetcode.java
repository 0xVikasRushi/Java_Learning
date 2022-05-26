
//https://leetcode.com/problems/two-sum/

package Arrays;

import java.util.Arrays;

public class Two_Sum_leetcode {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int target = 5;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

// brute force approach

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] == target - nums[i]){
                   return new int[]{i,j};

                }
            }
        }

        return new int[]{0};
    }

}
