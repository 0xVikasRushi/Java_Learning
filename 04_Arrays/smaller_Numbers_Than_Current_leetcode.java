
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
package Arrays;
import java.util.Arrays;

public class smaller_Numbers_Than_Current_leetcode {
    public static void main(String[] args) {
        int[] nums = {2,1,0,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int count;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((nums[i] > nums[j]) & (j !=i)) {

                    count++;

                }
            }

            ans[i] = count;
        }
        return ans;

    }
}